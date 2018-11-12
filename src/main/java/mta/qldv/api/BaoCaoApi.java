package mta.qldv.api;

import mta.qldv.entity.BaoCao;
import mta.qldv.service.BaoCaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bao-cao")
public class BaoCaoApi {
    @Autowired
    private BaoCaoService baoCaoService;

    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<BaoCao> getList(){
        List<BaoCao> listBaoCao = baoCaoService.getList();
        return listBaoCao;
    }
}
