package mta.qldv.api;

import mta.qldv.entity.TaiKhoan;
import mta.qldv.service.TaiKhoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tai-khoan")
public class TaiKhoanApi {
    @Autowired
    private TaiKhoanService taiKhoanService;

    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
    public List<TaiKhoan> getList(){
        List<TaiKhoan> listTaiKhoan = taiKhoanService.getList();
        return listTaiKhoan;
    }
    
    @PostMapping(value = "/tao-tai-khoan", consumes = { MediaType.APPLICATION_JSON_VALUE })
    public boolean createAccount(@RequestBody TaiKhoan newAccount) {
    	return taiKhoanService.createAccount(newAccount);
    }
}
