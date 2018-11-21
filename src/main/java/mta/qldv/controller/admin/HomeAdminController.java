package mta.qldv.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class HomeAdminController {
	@GetMapping
	public String homeAdmin() {
		return "home-admin";
	}
	
	@GetMapping("/tai-khoan/them")
	public String themTaiKhoanAdmin() {
		return "them-tai-khoan";
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
	public String themHoatDongAdmin() {
		return "them-hd";
	}
	
	@GetMapping("hoat-dong/danh-sach-duoc-duyet")
	public String hoatDongDuocDuyetAdmin() {
		return "danh-sach-hd-duyet";
	}
	
	@GetMapping("hoat-dong/danh-sach-de-xuat")
	public String hoatDongDeXuatAdmin() {
		return "danh-sach-hd-de-xuat";
	}
	
	@GetMapping("hoat-dong/danh-sach-hd-huy")
	public String hoatDongHuyBoAdmin() {
		return "danh-sach-hd-huy";
	}
}
