package mta.qldv.api;

import mta.qldv.entity.DonVi;
import mta.qldv.service.DonViService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/don-vi")
public class DonViApi {
    @Autowired
    private DonViService donViService;

    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
    public List<DonVi> getList(){
        List<DonVi> listDonVi = donViService.getList();
        return listDonVi;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
    public List<DonVi> getListById(@PathVariable int id){
        List<DonVi> listDonVi = donViService.getListById(id);
        return listDonVi;
    }
}
