package mta.qldv.api;

import mta.qldv.entity.ThamGia;
import mta.qldv.service.ThamGiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tham-gia")
public class ThamGiaApi {
    @Autowired
    private ThamGiaService thamGiaService;

    @PostMapping(value = "/add", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Boolean addThamGia(@RequestBody ThamGia thamGia){
        return thamGiaService.addThamGia(thamGia);
    }

    @PutMapping(value = "/update", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Boolean updateThamGia(@RequestBody ThamGia thamGia){
        return thamGiaService.updateThamGia(thamGia);
    }

    @PostMapping(value = "/delete", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Boolean deleteThamGia(@RequestParam Long id){
        return thamGiaService.deleteThamGia(id);
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
    public List<ThamGia> getList(){
        List<ThamGia> listThamGia = thamGiaService.getList();
        return listThamGia;
    }
}
