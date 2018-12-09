package mta.qldv.api;

import mta.qldv.entity.DonVi;
import mta.qldv.service.DonViService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/don-vi")
public class DonViApi {
    @Autowired
    private DonViService donViService;

    @PostMapping(value = "/add", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Boolean addDonVi(@RequestBody DonVi donVi){
        return donViService.addDonVi(donVi);
    }

    @PutMapping(value = "/update", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Boolean updateDonVi(@RequestBody DonVi donVi){
        return donViService.updateDonVi(donVi);
    }

    @PostMapping(value = "/delete", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Boolean deleteDonVi(@RequestParam Long id){
        return donViService.deleteDonVi(id);
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
    public List<DonVi> getList(){
        List<DonVi> listDonVi = donViService.getList();
        return listDonVi;
    }

    @RequestMapping(value = "/id/{id}", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
    public DonVi getById(@PathVariable Long id){
        return donViService.getById(id);
    }
}
