package mta.qldv.api;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import mta.qldv.dto.DoanCoSoHoSoDto;
import mta.qldv.entity.ChiDoan;
import mta.qldv.service.ChiDoanService;

@Controller
@RequestMapping("/chi-doan")
public class ChiDoanApi {
    @Autowired
    private ChiDoanService chiDoanService;

    @GetMapping(value = "/list", produces = { MediaType.APPLICATION_JSON_VALUE })
    @ResponseBody
    public List<ChiDoan> getList(){
        List<ChiDoan> listChiDoan = chiDoanService.getList();
        return listChiDoan;
    }
    
    @GetMapping(value = "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE })
    @ResponseBody
    public List<ChiDoan> getListById(@PathVariable int id){
    	return chiDoanService.getListById(id);
    }
    
    @PostMapping(value = "/add", produces = { MediaType.APPLICATION_JSON_VALUE })
    public String addChiDoan(@Valid @ModelAttribute("doanCoSoDto") DoanCoSoHoSoDto doanCoSoDto,
			BindingResult results, ModelMap map) {
    	if(results.hasErrors()) {
			return "them-doan-co-so";
		}
		ChiDoan chiDoan = new ChiDoan();
		chiDoan.setTenChiDoan(doanCoSoDto.getTenChiDoan());
//		chiDoan.setDonVi(donViDao.getListById(doanCoSoDto.getDonVi()).get(0));
		return "redirect:/admin/doan-co-so/them?result=" + chiDoanService.addChiDoan(chiDoan);
    }
    
    @PutMapping(value = "/update/{chiDoan}", produces = { MediaType.APPLICATION_JSON_VALUE })
    public boolean updateChiDoan(@PathVariable("chidoan") ChiDoan newChiDoan) {
    	return chiDoanService.updateChiDoan(newChiDoan);
    }
    
    @DeleteMapping(value = "/delete/{chiDoan}", produces = { MediaType.APPLICATION_JSON_VALUE })
    public boolean deleteChiDoan(@PathVariable("chidoan") ChiDoan chiDoan) {
    	return chiDoanService.deleteChiDoan(chiDoan);
    }
}
