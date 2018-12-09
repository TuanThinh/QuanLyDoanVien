package mta.qldv.api;

import mta.qldv.entity.BaoCao;
import mta.qldv.service.BaoCaoService;
import mta.qldv.utils.Paging;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bao-cao")
public class BaoCaoApi {
    @Autowired
    private BaoCaoService baoCaoService;

    @PostMapping(value = "/add", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Boolean addBaoCao(@RequestBody BaoCao baoCao){
        return baoCaoService.addBaoCao(baoCao);
    }

    @PostMapping(value = "/delete", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Boolean deleteBaoCao(@RequestParam Long id){
        return baoCaoService.deleteBaoCao(id);
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public String getList(@RequestBody Paging paging){
        return baoCaoService.getList(paging).toString();
    }
}
