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
	
	@GetMapping("/tai-khoan")
	public String taiKhoanAdmin() {
		return "tai-khoan-admin";
	}
	
	@GetMapping("/doan-co-so")
	public String doanCoSoAdmin() {
		return "doan-co-so-admin";
	}
	
	@GetMapping("/tb-cs")
	public String thongBaoChinhSachAdmin() {
		return "tb-cs-admin";
	}
	
	@GetMapping("/hd-duyet")
	public String hoatDongDuocDuyetAdmin() {
		return "hd-duyet-admin";
	}
	
	@GetMapping("/hd-de-xuat")
	public String hoatDongDeXuatAdmin() {
		return "hd-de-xuat-admin";
	}
	
	@GetMapping("/hd-huy")
	public String hoatDongHuyBoAdmin() {
		return "hd-huy-admin";
	}
}
