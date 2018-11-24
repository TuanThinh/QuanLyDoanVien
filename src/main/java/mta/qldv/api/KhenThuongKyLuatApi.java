package mta.qldv.api;

import mta.qldv.dto.KhenThuongKyLuatDto;
import mta.qldv.entity.KhenThuongKyLuat;
import mta.qldv.service.KhenThuongKyLuatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/khen-thuong-ky-luat")
public class KhenThuongKyLuatApi {
    @Autowired
    private KhenThuongKyLuatService khenThuongKyLuatService;

    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
    public List<KhenThuongKyLuat> getList(){
        List<KhenThuongKyLuat> listKtkl = khenThuongKyLuatService.getList();
        return listKtkl;
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
    public List<KhenThuongKyLuatDto> findAll(){
        List<KhenThuongKyLuatDto> listKtkl = khenThuongKyLuatService.findAll();
        return listKtkl;
    }
}
