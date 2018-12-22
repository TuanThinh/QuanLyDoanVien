package mta.qldv.api;

import mta.qldv.dto.DiemHoSoDto;
import mta.qldv.entity.Diem;
import mta.qldv.form.DiemForm;
import mta.qldv.service.DiemService;
import mta.qldv.utils.Paging;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/diem")
public class DiemApi {
    @Autowired
    private DiemService diemService;

    @PostMapping(value = "/add", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Boolean addDiem(@RequestBody DiemForm diem){
        return diemService.addDiem(diem);
    }

    @PutMapping(value = "/update", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Boolean updateDiem(@RequestBody DiemForm diem){
        return diemService.updateDiem(diem);
    }

    @PostMapping(value = "/delete", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Boolean deleteDiem(@RequestParam Long id){
        return diemService.deleteDiem(id);
    }

    @RequestMapping(value = "/id", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public Diem getById(@RequestParam Long id){
        return diemService.getById(id);
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<Diem> getList(){
        return diemService.getList();
    }

}
