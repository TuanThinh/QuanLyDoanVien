package mta.qldv.api;

import mta.qldv.dto.DiemHoSoDto;
import mta.qldv.entity.Diem;
import mta.qldv.service.DiemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/diem")
public class DiemApi {
    @Autowired
    private DiemService diemService;

//    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
//    public List<Diem> getList(){
//        List<Diem> listDiem = diemService.getList();
//        return listDiem;
//    }
//
//    @RequestMapping(value = "/all", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
//    public List<DiemHoSoDto> findAll(){
//        List<DiemHoSoDto> listDiem = diemService.findAll();
//        return listDiem;
//    }
}
