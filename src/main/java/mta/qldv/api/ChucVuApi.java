package mta.qldv.api;

import mta.qldv.entity.ChucVu;
import mta.qldv.service.ChucVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/chuc-vu")
public class ChucVuApi {
    @Autowired
    private ChucVuService chucVuService;

    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<ChucVu> getList(){
        List<ChucVu> listChucVu = chucVuService.getList();
        return listChucVu;
    }

}
