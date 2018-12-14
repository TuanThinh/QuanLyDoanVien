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

import mta.qldv.dto.ChiDoanDto;
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

    @GetMapping(value = "/id/{id}", produces = { MediaType.APPLICATION_JSON_VALUE })
    @ResponseBody
    public ChiDoan getChiDoanById(@PathVariable Long id){
    	return chiDoanService.getChiDoanById(id);
    }
    
    @PostMapping(value = "/add", produces = { MediaType.APPLICATION_JSON_VALUE })
    public String addChiDoan(@Valid @ModelAttribute("doanCoSoDto") ChiDoanDto chiDoanDto,
			BindingResult results, ModelMap map) {
    	if(results.hasErrors()) {
			return "them-doan-co-so";
		}
		ChiDoan chiDoan = new ChiDoan();
		chiDoan.setTenChiDoan(chiDoanDto.getTenChiDoan());
//		chiDoan.setDonVi(donViDao.getListById(chiDoanDto.getDonVi()).get(0));
		return "redirect:/admin/doan-co-so/them?result=" + chiDoanService.addChiDoan(chiDoan);
    }
    
    @PutMapping(value = "/update", produces = { MediaType.APPLICATION_JSON_VALUE })
    public boolean updateChiDoan(@PathVariable("chidoan") ChiDoanDto chiDoanDto) {
    	ChiDoan chiDoan = new ChiDoan();
    	return chiDoanService.updateChiDoan(chiDoan);
    }
    
    @DeleteMapping(value = "/delete/{chiDoan}", produces = { MediaType.APPLICATION_JSON_VALUE })
    public boolean deleteChiDoan(@PathVariable("chidoan") ChiDoan chiDoan) {
    	return chiDoanService.deleteChiDoan(chiDoan);
    }
}
