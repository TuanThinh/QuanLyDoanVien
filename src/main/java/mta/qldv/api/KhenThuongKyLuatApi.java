package mta.qldv.api;

import mta.qldv.dto.KhenThuongKyLuatDto;
import mta.qldv.entity.KhenThuongKyLuat;
import mta.qldv.service.KhenThuongKyLuatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/khen-thuong-ky-luat")
public class KhenThuongKyLuatApi {
    @Autowired
    private KhenThuongKyLuatService khenThuongKyLuatService;

    @PostMapping(value = "/add", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Boolean addKhenThuongKyLuat(@RequestBody KhenThuongKyLuat khenThuongKyLuat){
        return khenThuongKyLuatService.addKhenThuongKyLuat(khenThuongKyLuat);
    }

    @PutMapping(value = "/update", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Boolean updateKhenThuongKyLuat(@RequestBody KhenThuongKyLuat khenThuongKyLuat){
        return khenThuongKyLuatService.updateKhenThuongKyLuat(khenThuongKyLuat);
    }

    @PostMapping(value = "/delete", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Boolean deleteKhenThuongKyLuat(@RequestParam Long id){
        return khenThuongKyLuatService.deleteKhenThuongKyLuat(id);
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
    public List<KhenThuongKyLuat> getList(){
        List<KhenThuongKyLuat> listKtkl = khenThuongKyLuatService.getList();
        return listKtkl;
    }

//    @RequestMapping(value = "/all", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
//    public List<KhenThuongKyLuatDto> findAll(){
//        List<KhenThuongKyLuatDto> listKtkl = khenThuongKyLuatService.findAll();
//        return listKtkl;
//    }
}
