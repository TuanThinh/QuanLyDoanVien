package mta.qldv.api;

import mta.qldv.dto.DiemHoSoDto;
import mta.qldv.entity.Diem;
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
    public Boolean addDiem(@RequestBody Diem diem){
        return diemService.addDiem(diem);
    }

    @PutMapping(value = "/update", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Boolean updateDiem(@RequestBody Diem diem){
        return diemService.updateDiem(diem);
    }

    @PostMapping(value = "/delete", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Boolean deleteDiem(@RequestParam Long id){
        return diemService.deleteDiem(id);
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public String getList(@RequestBody Paging paging){
        return diemService.getList(paging).toString();
    }

}
