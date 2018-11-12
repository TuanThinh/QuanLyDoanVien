package mta.qldv.api;

import mta.qldv.entity.HoatDong;
import mta.qldv.service.HoatDongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hoat-dong")
public class HoatDongApi {
    @Autowired
    private HoatDongService hoatDongService;

    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<HoatDong> getList(){
        List<HoatDong> listHoatDong = hoatDongService.getList();
        return listHoatDong;
    }
}
