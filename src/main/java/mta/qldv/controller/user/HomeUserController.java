package mta.qldv.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping("/user")
public class HomeUserController {
	@GetMapping
	public String home() {
		return "home";
	}
	
	@GetMapping("/danh-sach-ho-so")
	public String danhSachHoSo() {
		return "danhsachhoso";
	}

	@GetMapping("/ho-so-ca-nhan")
	public String hoSoCaNhan() {
		return "hosocanhan";
	}
	
	@GetMapping("/cap-nhat-ho-so")
	public String capNhatHoSo() {
		return "capnhathoso";
	}

	@GetMapping("/hoat-dong")
	public String hoatDong() {
		return "hoatdong";
	}

	@GetMapping("/hoat-dong-da-qua")
	public String hoatDongDaQua() {
		return "hoatdongdaqua";
	}

	@GetMapping("/hoat-dong-sap-toi")
	public String hoatDongSapToi() {
		return "hoatdongsaptoi";
	}

	@GetMapping("/hoat-dong-da-tham-gia")
	public String hoatDongDaThamGia() {
		return "hoatdongdathamgia";
	}

	@GetMapping("/de-xuat-hoat-dong")
	public String hoatDongDeXuat() {
		return "dexuathoatdong";
	}

	@GetMapping("/chinh-sach-va-thong-bao")
	public String chinhSachVaThongBao() {
		return "chinhsachvathongbao";
	}
	
	@GetMapping("/dong-gop-va-phan-hoi")
	public String dongGopVaPhanHoi() {
		return "donggopvaphanhoi";
	}
	@GetMapping("/diem")
	public String diem() {
		return "diem";
	}
	
	@GetMapping("/khen-thuong-ky-luat")
	public String khenthong_kyluat() {
		return "khenthuongkyluat";

	}

	@GetMapping("/thong-tin-khen-thuong-ky-luat")
	public String sdk_kt_kl() {
		return "sqdkhenthuongkyluat";

	}

	@GetMapping("/soan-bao-cao")
	public String soanbaocao() {
		return "soanbaocao";
	}

	@GetMapping("/bao-cao-da-gui")
	public String baocaodagui() {
		return "baocaodagui";
	}

	@GetMapping("/bao-cao-da-xoa")
	public String baocaodaxoa() {
		return "baocaodaxoa";
	}
}
