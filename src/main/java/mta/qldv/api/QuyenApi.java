package mta.qldv.api;

import mta.qldv.entity.Quyen;
import mta.qldv.service.QuyenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quyen")
public class QuyenApi {
    @Autowired
    private QuyenService quyenService;

    @PostMapping(value = "/add", produces = { MediaType.APPLICATION_JSON_VALUE })
    public Boolean addQuyen(@RequestBody Quyen quyen){
        return quyenService.addQuyen(quyen);
    }

    @PutMapping(value = "/update", produces = { MediaType.APPLICATION_JSON_VALUE })
    public Boolean updateQuyen(@RequestBody Quyen quyen){
        return quyenService.updateQuyen(quyen);
    }

    @PostMapping(value = "/delete", produces = { MediaType.APPLICATION_JSON_VALUE })
    public Boolean deleteQuyen(@RequestParam Long id){
        return quyenService.deleteQuyen(id);
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
    public List<Quyen> getList(){
        List<Quyen> listQuyen = quyenService.getList();
        return listQuyen;
    }

    @RequestMapping(value = "/id", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
    public Quyen getById(@RequestParam Long id){
        return quyenService.getById(id);
    }
}
