package mta.qldv.api;

import mta.qldv.entity.ThamGia;
import mta.qldv.service.ThamGiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tham-gia")
public class ThamGiaApi {
    @Autowired
    private ThamGiaService thamGiaService;

    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
    public List<ThamGia> getList(){
        List<ThamGia> listThamGia = thamGiaService.getList();
        return listThamGia;
    }
}
