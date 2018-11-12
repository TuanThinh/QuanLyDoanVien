package mta.qldv.api;

import mta.qldv.entity.HoSo;
import mta.qldv.service.HoSoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ho-so")
public class HoSoApi {

    @Autowired
    private HoSoService hoSoService;

    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
    public List<HoSo> getList(){
        List<HoSo> listHoSo = hoSoService.getList();
        return listHoSo;
    }
}
