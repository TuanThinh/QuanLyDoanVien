package mta.qldv.api;

import mta.qldv.entity.ChucVu;
import mta.qldv.service.ChucVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chuc-vu")
public class ChucVuApi {
    @Autowired
    private ChucVuService chucVuService;

    @PostMapping(value = "/add", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Boolean addChucVu(@RequestBody ChucVu chucVu){
        return chucVuService.addChucVu(chucVu);
    }

    @PutMapping(value = "/update", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Boolean updateChucVu(@RequestBody ChucVu chucVu){
        return chucVuService.updateChucVu(chucVu);
    }

    @PostMapping(value = "/delete", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Boolean deleteChucVu(@RequestParam Long id){
        return chucVuService.deleteChucVu(id);
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<ChucVu> getList(){
        List<ChucVu> listChucVu = chucVuService.getList();
        return listChucVu;
    }

    @RequestMapping(value = "/id/{id}", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ChucVu getById(@PathVariable Long id) {
        return chucVuService.getById(id);
    }
}
