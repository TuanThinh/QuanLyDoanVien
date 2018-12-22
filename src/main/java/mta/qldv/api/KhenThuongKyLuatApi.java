package mta.qldv.api;

import mta.qldv.dto.KhenThuongKyLuatDto;
import mta.qldv.entity.KhenThuongKyLuat;
import mta.qldv.form.KhenThuongKyLuatForm;
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
    public Boolean addKhenThuongKyLuat(@RequestBody KhenThuongKyLuatForm khenThuongKyLuatForm){
        return khenThuongKyLuatService.addKhenThuongKyLuat(khenThuongKyLuatForm);
    }

    @PutMapping(value = "/update", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Boolean updateKhenThuongKyLuat(@RequestBody KhenThuongKyLuatForm khenThuongKyLuatForm){
        return khenThuongKyLuatService.updateKhenThuongKyLuat(khenThuongKyLuatForm);
    }

    @PostMapping(value = "/delete", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Boolean deleteKhenThuongKyLuat(@RequestParam Long id){
        return khenThuongKyLuatService.deleteKhenThuongKyLuat(id);
    }

    @RequestMapping(value = "/id", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
    public KhenThuongKyLuat getById(@RequestParam Long id){
        return khenThuongKyLuatService.getById(id);
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
    public List<KhenThuongKyLuat> getList(){
        List<KhenThuongKyLuat> listKtkl = khenThuongKyLuatService.getList();
        return listKtkl;
    }
}
