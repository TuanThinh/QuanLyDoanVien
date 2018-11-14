package mta.qldv.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mta.qldv.entity.ThongBaoChinhSach;
import mta.qldv.service.ThongBaoChinhSachService;

@RestController
@RequestMapping("/thong-bao-chinh-sach")
public class ThongBaoChinhSachApi {
	@Autowired
	private ThongBaoChinhSachService thongBaoChinhSachService;

	@RequestMapping(value = "/list", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
	public List<ThongBaoChinhSach> getList() {
		List<ThongBaoChinhSach> listThongBaoChinhSach = thongBaoChinhSachService.getList();
		return listThongBaoChinhSach;
	}

	@PostMapping(value = "/add/{tbcs}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public boolean addThongBaoChinhSach(@PathVariable ThongBaoChinhSach newTBCS) {
		return thongBaoChinhSachService.addThongBaoChinhSach(newTBCS);
	}

	@PutMapping(value = "/update/{tbcs}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public boolean updateThongBaoChinhSach(@PathVariable ThongBaoChinhSach newTBCS) {
		return thongBaoChinhSachService.updateThongBaoChinhSach(newTBCS);
	}

	@DeleteMapping(value = "/delete/{tbcs}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public boolean deleteThongBaoChinhSach(@PathVariable ThongBaoChinhSach tBCS) {
		return thongBaoChinhSachService.deleteThongBaoChinhSach(tBCS);
	}
}
