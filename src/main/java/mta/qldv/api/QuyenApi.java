package mta.qldv.api;

import mta.qldv.entity.Quyen;
import mta.qldv.service.QuyenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/quyen")
public class QuyenApi {
    @Autowired
    private QuyenService quyenService;

    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
    public List<Quyen> getList(){
        List<Quyen> listQuyen = quyenService.getList();
        return listQuyen;
    }
    
    @GetMapping(value = "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE })
    public Quyen getById(@PathVariable Long id) {
    	Quyen quyen = quyenService.getById(id);
    	return quyen;
    }
}
