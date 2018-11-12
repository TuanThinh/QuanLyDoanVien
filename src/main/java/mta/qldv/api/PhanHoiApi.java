package mta.qldv.api;

import mta.qldv.entity.PhanHoi;
import mta.qldv.service.PhanHoiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/phan-hoi")
public class PhanHoiApi {
    @Autowired
    private PhanHoiService phanHoiService;

    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
    public List<PhanHoi> getList(){
        List<PhanHoi> listPhanHoi = phanHoiService.getList();
        return listPhanHoi;
    }
}
