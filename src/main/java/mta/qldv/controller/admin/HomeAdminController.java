package mta.qldv.controller.admin;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import mta.qldv.dao.QuyenDao;
import mta.qldv.dao.TaiKhoanDao;
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
	
	@GetMapping
	public String homeAdmin() {
		return "home-admin";
	}
	
	@GetMapping("/tai-khoan/them")
	public String themTaiKhoanAdmin(@RequestParam(name="operation", required=false) String operation, ModelMap map) {
		TaiKhoan taiKhoan = new TaiKhoan();
		taiKhoan.setKichHoat(true);
		taiKhoan.setTruyCapLanCuoi(null);		

		long millis = System.currentTimeMillis();
		Date date = new Date(millis);
		taiKhoan.setNgayLap(date);

		map.addAttribute("taiKhoan", taiKhoan);

		List<Quyen> quyen = quyenDao.getList();
		map.addAttribute("quyen", quyen);
		
		if(operation != null) {
			if(operation.equals("taiKhoan")) {
				map.addAttribute("message", "Success");
			}
		}
		return "them-tai-khoan";
	}
	
	@PostMapping("tai-khoan/them")
	public String themTaiKhoanAdminSubmit(@ModelAttribute("taiKhoan") TaiKhoan taiKhoan) {
		taiKhoanDao.createAccount(taiKhoan);
		return "redirect:/admin/tai-khoan/them?operation=taiKhoan";
	}
	
	@GetMapping("/tai-khoan/danh-sach")
	public String taiKhoanAdmin() {
		return "danh-sach-tai-khoan";
	}
	
	@GetMapping("/doan-co-so/them")
	public String themDoanCoSoAdmin() {
		return "them-doan-co-so";
	}
	
	@GetMapping("/doan-co-so/danh-sach")
	public String doanCoSoAdmin() {
		return "danh-sach-doan-co-so";
	}
	
	@GetMapping("/tb-cs/them")
	public String themThongBaoChinhSachAdmin() {
		return "them-tb-cs";
	}
	
	@GetMapping("/tb-cs/danh-sach")
	public String thongBaoChinhSachAdmin() {
		return "danh-sach-tb-cs";
	}
	
	@GetMapping("hoat-dong/them")
	public String themHoatDongAdmin(ModelMap map) {
		HoatDong hoatDong = new HoatDong();
		hoatDong.setDvToChuc("Ban Thanh niÃªn");
		hoatDong.setTrangThai("Ä�Ã£ duyá»‡t");

		map.addAttribute("hoatDong", hoatDong);
		return "them-hd";
	}
	
	@GetMapping("hoat-dong/danh-sach-duoc-duyet")
	public String hoatDongDuocDuyetAdmin(ModelMap map) {
		map.addAttribute("loaiHoatDong", 2);
		return "danh-sach-hd-duyet";
	}
	
	@GetMapping("hoat-dong/danh-sach-de-xuat")
	public String hoatDongDeXuatAdmin(ModelMap map) {
		map.addAttribute("loaiHoatDong", 1);
		return "danh-sach-hd-de-xuat";
	}
	
	@GetMapping("hoat-dong/danh-sach-hd-huy")
	public String hoatDongHuyBoAdmin(ModelMap map) {
		map.addAttribute("loaiHoatDong", 3);
		return "danh-sach-hd-huy";
	}
}
