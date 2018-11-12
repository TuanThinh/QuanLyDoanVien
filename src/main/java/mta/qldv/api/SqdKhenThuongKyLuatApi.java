package mta.qldv.api;

import mta.qldv.entity.SqdKhenThuongKyLuat;
import mta.qldv.service.SqdKhenTHuongKyLuatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sqd-khen-thuong-ky-luat")
public class SqdKhenThuongKyLuatApi {
    @Autowired
    private SqdKhenTHuongKyLuatService sqdKhenTHuongKyLuatService;

    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
    public List<SqdKhenThuongKyLuat> getList(){
        List<SqdKhenThuongKyLuat> listSqdKhenThuongKyLuat = sqdKhenTHuongKyLuatService.getList();
        return listSqdKhenThuongKyLuat;
    }
}
