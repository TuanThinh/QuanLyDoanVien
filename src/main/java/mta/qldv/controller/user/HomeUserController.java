package mta.qldv.controller.user;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping("/user")
public class HomeUserController {

    @GetMapping
    public String home() {
        return "user-home";
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

//    Đoàn cơ sở

    @GetMapping("/dcs/danh-sach-ho-so")
    public String danhSachHoSo() {
        return "danhsachhoso";
    }

    @GetMapping("/dcs/thong-tin-khen-thuong-ky-luat")
    public String sdk_kt_kl() {
        return "sqdkhenthuongkyluat";

    }

    @GetMapping("/dcs/thong-ke")
    public String thongke() {
        return "thongke";
    }

    @GetMapping("/dcs/soan-bao-cao")
    public String soanbaocao() {
        return "soanbaocao";
    }

    @GetMapping("/dcs/bao-cao-da-gui")
    public String baocaodagui() {
        return "baocaodagui";
    }

//    @GetMapping("/dcs/bao-cao-da-xoa")
//    public String baocaodaxoa() {
//        return "baocaodaxoa";
//    }
}
