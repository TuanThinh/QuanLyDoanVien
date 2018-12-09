package mta.qldv.api;

import mta.qldv.entity.PhanHoi;
import mta.qldv.service.PhanHoiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/phan-hoi")
public class PhanHoiApi {
    @Autowired
    private PhanHoiService phanHoiService;

    @PostMapping(value = "/add", produces = { MediaType.APPLICATION_JSON_VALUE })
    public Boolean addPhanHoi(@RequestBody PhanHoi phanHoi){
        return phanHoiService.addPhanHoi(phanHoi);
    }

    @PostMapping(value = "/delete", produces = { MediaType.APPLICATION_JSON_VALUE })
    public Boolean deletePhanHoi(@RequestParam Long id){
        return phanHoiService.deletePhanHoi(id);
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
    public List<PhanHoi> getList(){
        List<PhanHoi> listPhanHoi = phanHoiService.getList();
        return listPhanHoi;
    }
}
