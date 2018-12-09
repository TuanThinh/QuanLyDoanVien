package mta.qldv.api;

import mta.qldv.entity.SqdKhenThuongKyLuat;
import mta.qldv.service.SqdKhenTHuongKyLuatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sqd-khen-thuong-ky-luat")
public class SqdKhenThuongKyLuatApi {
    @Autowired
    private SqdKhenTHuongKyLuatService sqdKhenTHuongKyLuatService;

    @PostMapping(value = "/add", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Boolean addSqdKhenThuongKyLuat(@RequestBody SqdKhenThuongKyLuat sqdKhenThuongKyLuat){
        return sqdKhenTHuongKyLuatService.addSqdKhenThuongKyLuat(sqdKhenThuongKyLuat);
    }

    @PutMapping(value = "/update", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Boolean updateSqdKhenThuongKyLuat(@RequestBody SqdKhenThuongKyLuat sqdKhenThuongKyLuat){
        return sqdKhenTHuongKyLuatService.updateSqdKhenThuongKyLuat(sqdKhenThuongKyLuat);
    }

    @PostMapping(value = "/delete", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Boolean deleteSqdKhenThuongKyLuat(@RequestParam Long id){
        return sqdKhenTHuongKyLuatService.deleteSqdKhenThuongKyLuat(id);
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
    public List<SqdKhenThuongKyLuat> getList(){
        List<SqdKhenThuongKyLuat> listSqdKhenThuongKyLuat = sqdKhenTHuongKyLuatService.getList();
        return listSqdKhenThuongKyLuat;
    }

    @RequestMapping(value = "/id", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
    public SqdKhenThuongKyLuat getById(@RequestParam Long id){
        return sqdKhenTHuongKyLuatService.getById(id);
    }
}
