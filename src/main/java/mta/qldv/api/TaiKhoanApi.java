package mta.qldv.api;

import mta.qldv.dto.TaiKhoanDkyDto;
import mta.qldv.entity.HoSo;
import mta.qldv.entity.TaiKhoan;
import mta.qldv.service.HoSoService;
import mta.qldv.service.TaiKhoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;

@Controller
@RequestMapping("/tai-khoan")
public class TaiKhoanApi {
    @Autowired
    private TaiKhoanService taiKhoanService;

    @Autowired
    private HoSoService hoSoService;

    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
    @ResponseBody
    public List<TaiKhoan> getList(){
        List<TaiKhoan> listTaiKhoan = taiKhoanService.getList();
        return listTaiKhoan;
    }

	@RequestMapping(value = "/id", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
	public TaiKhoan getById(@RequestParam Long id){
		return taiKhoanService.getById(id);
	}
    
    @PostMapping(value = "/add", produces = { MediaType.APPLICATION_JSON_VALUE })
    public String createAccount(@Valid @ModelAttribute("taiKhoanDto") TaiKhoanDkyDto taiKhoanDto,
			BindingResult results, ModelMap map) {
    	if(results.hasErrors()) {
			return "them-tai-khoan";
		}
		TaiKhoan taiKhoan = new TaiKhoan();
		taiKhoan.setTenTaiKhoan(taiKhoanDto.getTenTaiKhoan());
		taiKhoan.setMatKhau(taiKhoanDto.getMatKhau());
		taiKhoan.setKichHoat(taiKhoanDto.getKichHoat());
		taiKhoan.setNgayLap(new Date());

		Long lastId = taiKhoanService.createAccount(taiKhoan);
		HoSo hoSo = hoSoService.getHoSoById(taiKhoanDto.getIdHoSo());
		taiKhoan.setId(lastId);
		hoSo.setTaiKhoan(taiKhoan);
		hoSoService.updateTaiKhoan(hoSo);
		return "redirect:/admin/tai-khoan/them/" + taiKhoanDto.getIdHoSo() + "?result=";
    }
}
