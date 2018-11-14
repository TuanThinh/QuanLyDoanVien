package mta.qldv.api;

import mta.qldv.entity.HoatDong;
import mta.qldv.service.HoatDongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hoat-dong")
public class HoatDongApi {
	@Autowired
	private HoatDongService hoatDongService;

	@RequestMapping(value = "/list", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
	public List<HoatDong> getList() {
		List<HoatDong> listHoatDong = hoatDongService.getList();
		return listHoatDong;
	}

	@GetMapping(value = "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public HoatDong getHoatDongById(@PathVariable int id) {
		return hoatDongService.getHoatDongById(id);
	}

	@PostMapping(value = "/add/{hoatDong}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public boolean addHoatDong(@PathVariable HoatDong newHoatDong) {
		return hoatDongService.addHoatDong(newHoatDong);
	}

	@PutMapping(value = "/update/{hoatDong}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public boolean updateHoatDong(@PathVariable HoatDong newHoatDong) {
		return hoatDongService.updateHoatDong(newHoatDong);
	}

	@DeleteMapping(value = "/delete/{hoatDong}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public boolean deleteHoatDongById(@PathVariable HoatDong hoatDong) {
		return hoatDongService.deleteHoatDongById(hoatDong);
	}

	@GetMapping(value = "/list/pending", produces = { MediaType.APPLICATION_JSON_VALUE })
	public List<HoatDong> getPendingList() {
		return hoatDongService.getPendingList();
	}

	@GetMapping(value = "/list/approved", produces = { MediaType.APPLICATION_JSON_VALUE })
	public List<HoatDong> getApprovedList() {
		return hoatDongService.getApprovedList();
	}

	@GetMapping(value = "/list/denied", produces = { MediaType.APPLICATION_JSON_VALUE })
	public List<HoatDong> getDeniedList() {
		return hoatDongService.getDeniedList();
	}
}
