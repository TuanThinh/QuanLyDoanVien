package mta.qldv.controller.admin;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import mta.qldv.dao.ChiDoanDao;
import mta.qldv.dao.DonViDao;
import mta.qldv.dao.HoatDongDao;
import mta.qldv.dao.QuyenDao;
import mta.qldv.dao.TaiKhoanDao;
import mta.qldv.dto.ChiDoanDto;
import mta.qldv.dto.HoatDongDto;
import mta.qldv.dto.TaiKhoanDkyDto;
import mta.qldv.dto.ThongBaoChinhSachDto;
import mta.qldv.entity.ChiDoan;
import mta.qldv.entity.DonVi;
import mta.qldv.entity.HoatDong;
import mta.qldv.entity.Quyen;
import mta.qldv.entity.TaiKhoan;

@Controller
@RequestMapping("/admin")
public class HomeAdminController {
	@Autowired
	private QuyenDao quyenDao;
	
	@Autowired
	private TaiKhoanDao taiKhoanDao;
	
	@Autowired
	private HoatDongDao hoatDongDao;
	
	@Autowired
	private ChiDoanDao chiDoanDao;

	@Autowired
	private DonViDao donViDao;

	@GetMapping
	public String homeAdmin() {
		return "home-admin";
	}
	
	@GetMapping("/tai-khoan/them/{ho-so}")
	public String themTaiKhoanAdmin(@PathVariable(name="ho-so") Long idHoSo, @RequestParam(name="result", required=false) String result, ModelMap map) {
		TaiKhoanDkyDto taiKhoanDto = new TaiKhoanDkyDto();
		taiKhoanDto.setKichHoat(true);
		taiKhoanDto.setIdHoSo(idHoSo);

		map.addAttribute("taiKhoanDto", taiKhoanDto);
		
		if(result != null) {
			if(result.equals("true")) {
				map.addAttribute("message", "Success!");
			} else {
				map.addAttribute("message", "Failed!");
			}
		}
		return "them-tai-khoan";
	}

	@GetMapping("/chi-doan/{id}/danh-sach")
	public String danhSachDoanVienChiDoanAdmin(@PathVariable(name = "id") Long idChiDoan, ModelMap map) {
		map.addAttribute("idChiDoan", idChiDoan);
		return "danh-sach-doan-vien";
	}
	
	@GetMapping("/doan-co-so/them")
	public String themDoanCoSoAdmin(@RequestParam(name="result", required=false) String result, ModelMap map) {
		ChiDoanDto doanCoSoDto = new ChiDoanDto();
		map.addAttribute("doanCoSoDto", doanCoSoDto);
		
		if(result != null) {
			if(result.equals("true")) {
				map.addAttribute("message", "Success!");
			}
		}
		return "them-doan-co-so";
	}

//	@PostMapping("/doan-co-so/them")
//	public String themDoanCoSoAdminSubmit(@Valid @ModelAttribute("doanCoSoDto") DoanCoSoHoSoDto doanCoSoDto,
//			BindingResult results, ModelMap map) {
//		if(results.hasErrors()) {
//			return "them-doan-co-so";
//		}
//		ChiDoan chiDoan = new ChiDoan();
//		chiDoan.setTenChiDoan(doanCoSoDto.getTenChiDoan());
//		chiDoan.setDonVi(donViDao.getListById(doanCoSoDto.getDonVi()).get(0));
//		
//		return "redirect:/admin/doan-co-so/them?result=" + chiDoanDao.addChiDoan(chiDoan);
//	}
	
	@GetMapping("/doan-co-so/danh-sach")
	public String doanCoSoAdmin() {
		return "danh-sach-doan-co-so";
	}
	
	@GetMapping("/tb-cs/them")
	public String themThongBaoChinhSachAdmin(@RequestParam(name="result", required=false) String result, ModelMap map) {
		ThongBaoChinhSachDto tbcsDto = new ThongBaoChinhSachDto();
		map.addAttribute("tbcsDto", tbcsDto);

		if(result != null) {
			if(result.equals("true")) {
				map.addAttribute("message", "Success!");
			} else {
				map.addAttribute("message", "Failed!");
			}
		}
		return "them-tb-cs";
	}
	
	@GetMapping("/tb-cs/danh-sach")
	public String thongBaoChinhSachAdmin() {
		return "danh-sach-tb-cs";
	}
	
	@GetMapping("/hoat-dong/them")
	public String themHoatDongAdmin(@RequestParam(name="result", required=false) String result, ModelMap map) {
		HoatDongDto hoatDongDto = new HoatDongDto();
		hoatDongDto.setDvToChuc("Ban Thanh nien");
		hoatDongDto.setTrangThai("Da duyet");

		map.addAttribute("hoatDongDto", hoatDongDto);
		
		if(result != null) {
			if(result.equals("true")) {
				map.addAttribute("message", "Success!");
			} else {
				map.addAttribute("message", "Failed!");
			}
		}
		return "them-hd";
	}

//	@PostMapping("/hoat-dong/them")
//	public String themHoatDongAdminSubmit(@ModelAttribute("hoatDong") HoatDong hoatDong) {
//		hoatDongDao.addHoatDong(hoatDong);
//		return "redirect:/admin/hoat-dong/them?operation=hoatDong";
//	}

	@GetMapping("/hoat-dong/danh-sach-duoc-duyet")
	public String hoatDongDuocDuyetAdmin(ModelMap map) {
		map.addAttribute("loaiHoatDong", 2);
		return "danh-sach-hd-duyet";
	}
	
	@GetMapping("/hoat-dong/danh-sach-de-xuat")
	public String hoatDongDeXuatAdmin(ModelMap map) {
		map.addAttribute("loaiHoatDong", 1);
		return "danh-sach-hd-de-xuat";
	}
	
	@GetMapping("/hoat-dong/danh-sach-hd-huy")
	public String hoatDongHuyBoAdmin(ModelMap map) {
		map.addAttribute("loaiHoatDong", 3);
		return "danh-sach-hd-huy";
	}
	
	@ModelAttribute("quyen")
	public List<Quyen> getListQuyen() {
		return quyenDao.getList();
	}

	@ModelAttribute("khoa")
	public List<DonVi> getListKhoa() {
		return donViDao.getList();
	}
}
