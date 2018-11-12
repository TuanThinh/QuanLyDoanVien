package mta.qldv.api;

import mta.qldv.entity.ChiDoan;
import mta.qldv.service.ChiDoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/chi-doan")
public class ChiDoanApi {
    @Autowired
    private ChiDoanService chiDoanService;

    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
    public List<ChiDoan> getList(){
        List<ChiDoan> listChiDoan = chiDoanService.getList();
        return listChiDoan;
    }
}
