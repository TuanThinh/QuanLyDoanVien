package mta.qldv.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

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

	@GetMapping("/user/ho-so-ca-nhan")
	public String hoSoCaNhan() {
		return "hosocanhan";
	}
	
	@GetMapping("/user/cap-nhat-ho-so")
	public String capNhatHoSo() {
		return "capnhathoso";
	}

	@GetMapping("/user/hoat-dong")
	public String hoatDong() {
		return "hoatdong";
	}

	@GetMapping("/user/hoat-dong-da-qua")
	public String hoatDongDaQua() {
		return "hoatdongdaqua";
	}

	@GetMapping("/user/hoat-dong-sap-toi")
	public String hoatDongSapToi() {
		return "hoatdongsaptoi";
	}

	@GetMapping("/user/hoat-dong-da-tham-gia")
	public String hoatDongDaThamGia() {
		return "hoatdongdathamgia";
	}

	@GetMapping("/user/de-xuat-hoat-dong")
	public String hoatDongDeXuat() {
		return "dexuathoatdong";
	}

	@GetMapping("/user/chinh-sach-va-thong-bao")
	public String chinhSachVaThongBao() {
		return "chinhsachvathongbao";
	}
	
	@GetMapping("/user/dong-gop-va-phan-hoi")
	public String dongGopVaPhanHoi() {
		return "donggopvaphanhoi";
	}
	@GetMapping("/user/diem")
	public String diem() {
		return "diem";
	}
	
	@GetMapping("/user/khen-thuong-ky-luat")
	public String khenthong_kyluat() {
		return "khenthuongkyluat";

	}

	@GetMapping("/user/thong-tin-khen-thuong-ky-luat")
	public String sdk_kt_kl() {
		return "sqdkhenthuongkyluat";

	}

	@GetMapping("/user/soan-bao-cao")
	public String soanbaocao() {
		return "soanbaocao";
	}

	@GetMapping("/user/bao-cao-da-gui")
	public String baocaodagui() {
		return "baocaodagui";
	}

	@GetMapping("/user/bao-cao-da-xoa")
	public String baocaodaxoa() {
		return "baocaodaxoa";
	}
}
