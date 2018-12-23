package mta.qldv.api;

import mta.qldv.dto.HoatDongDto;
import mta.qldv.entity.HoatDong;
import mta.qldv.service.HoatDongService;
import mta.qldv.utils.HoatDongValidator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

@Controller
@RequestMapping("/hoat-dong")
public class HoatDongApi {
	@Autowired
	private HoatDongService hoatDongService;

	@RequestMapping(value = "/list", method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public List<HoatDong> getList() {
		List<HoatDong> listHoatDong = hoatDongService.getList();
		return listHoatDong;
	}

	@GetMapping(value = "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public HoatDong getById(@PathVariable Long id) {
		return hoatDongService.getById(id);
	}

	@PostMapping(value = "/add", produces = MediaType.APPLICATION_JSON_VALUE + ";charset=utf-8")
	public String addHoatDong(@Valid @ModelAttribute("hoatDongDto") HoatDongDto hoatDongDto,
			BindingResult results) throws Exception {
		new HoatDongValidator().validate(hoatDongDto, results);
		if(results.hasErrors()) {
			return "them-hd";
		}
		HoatDong hoatDong = new HoatDong();
		hoatDong.setTenHoatDong(hoatDongDto.getTenHoatDong());
		hoatDong.setDiaDiem(hoatDongDto.getDiaDiem());
		hoatDong.setDoiTuongThamGia(hoatDongDto.getDoiTuongThamGia());

		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date thoiGianToChuc = formatter.parse(hoatDongDto.getThoiGian());
		hoatDong.setThoiGian(thoiGianToChuc);
		return "redirect:/admin/hoat-dong/them?result=" + hoatDongService.addHoatDong(hoatDong);
	}

	@PostMapping(value = "/update", produces = { MediaType.APPLICATION_JSON_VALUE })
	public String updateHoatDong(@Valid @ModelAttribute("hoatDongDto") HoatDongDto hoatDongDto,
			BindingResult results, ModelMap map) throws Exception {
		new HoatDongValidator().validate(hoatDongDto, results);
		if(results.hasErrors()) {
			List<String> listTrangThai = new ArrayList<>();
			listTrangThai.add("Đã duyệt");
			listTrangThai.add("Chờ duyệt");
			listTrangThai.add("Hủy bỏ");
			map.addAttribute("listTrangThai", listTrangThai);
			return "sua-hd";
		}
		HoatDong hoatDong = hoatDongService.getById(hoatDongDto.getId());
		hoatDong.setTenHoatDong(hoatDongDto.getTenHoatDong());
		hoatDong.setDiaDiem(hoatDongDto.getDiaDiem());
		hoatDong.setDoiTuongThamGia(hoatDongDto.getDoiTuongThamGia());
		hoatDong.setTrangThai(hoatDongDto.getTrangThai());
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date thoiGianToChuc = formatter.parse(hoatDongDto.getThoiGian());
		hoatDong.setThoiGian(thoiGianToChuc);
		return "redirect:/admin/hoat-dong/danh-sach-duoc-duyet?result=" + hoatDongService.updateHoatDong(hoatDong);
	}

//	@DeleteMapping(value = "/delete/{hoatDong}", produces = { MediaType.APPLICATION_JSON_VALUE })
//	public boolean deleteHoatDongById(@PathVariable HoatDong hoatDong) {
//		return hoatDongService.deleteHoatDongById(hoatDong);
//	}

	@GetMapping(value = "/list/pending", produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public List<HoatDong> getPendingList() {
		return hoatDongService.getPendingList();
	}

	@GetMapping(value = "/list/approved", produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public List<HoatDong> getApprovedList() {
		return hoatDongService.getApprovedList();
	}

	@GetMapping(value = "/list/denied", produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public List<HoatDong> getDeniedList() {
		return hoatDongService.getDeniedList();
	}
}
