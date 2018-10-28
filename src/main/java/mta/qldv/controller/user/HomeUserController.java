package mta.qldv.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
