package mta.qldv.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeUserController {
	@GetMapping("/user")
	public String home() {
		return "home";
	}
	
	@GetMapping("/user/danh-sach-ho-so")
	public String danhSachHoSo() {
		return "danhsachhoso";
	}
	
	@GetMapping("/user/diem")
	public String diem() {
		return "diem";
	}
	
	@GetMapping("/user/khen-thuong-ky-luat")
	public String khenthong_kyluat() {
		return "khenthuongkyluat";
	}
}
