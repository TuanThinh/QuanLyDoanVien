package mta.qldv.api;

import mta.qldv.entity.ThongBaoChinhSach;
import mta.qldv.service.ThongBaoChinhSachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/thong-bao-chinh-sach")
public class ThongBaoChinhSachApi {
    @Autowired
    private ThongBaoChinhSachService thongBaoChinhSachService;

    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
    public List<ThongBaoChinhSach> getList(){
        List<ThongBaoChinhSach> listThongBaoChinhSach = thongBaoChinhSachService.getList();
        return listThongBaoChinhSach;
    }
}
