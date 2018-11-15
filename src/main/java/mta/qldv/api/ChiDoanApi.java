package mta.qldv.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mta.qldv.entity.ChiDoan;
import mta.qldv.service.ChiDoanService;

@RestController
@RequestMapping("/chi-doan")
public class ChiDoanApi {
    @Autowired
    private ChiDoanService chiDoanService;

    @GetMapping(value = "/list", produces = { MediaType.APPLICATION_JSON_VALUE })
    public List<ChiDoan> getList(){
        List<ChiDoan> listChiDoan = chiDoanService.getList();
        return listChiDoan;
    }
    
    @GetMapping(value = "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE })
    public List<ChiDoan> getListById(@PathVariable int id){
    	return chiDoanService.getListById(id);
    }
    
    @PostMapping(value = "/add/{chiDoan}", produces = { MediaType.APPLICATION_JSON_VALUE })
    public boolean addChiDoan(@PathVariable("chidoan") ChiDoan newChiDoan) {
    	return chiDoanService.addChiDoan(newChiDoan);
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
