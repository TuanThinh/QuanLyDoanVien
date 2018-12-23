package mta.qldv.controller.admin;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
import org.springframework.web.bind.annotation.PutMapping;
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
import mta.qldv.entity.BaoCao;
import mta.qldv.entity.ChiDoan;
import mta.qldv.entity.DonVi;
import mta.qldv.entity.HoSo;
import mta.qldv.entity.HoatDong;
import mta.qldv.entity.Quyen;
import mta.qldv.entity.TaiKhoan;
import mta.qldv.entity.ThongBaoChinhSach;
import mta.qldv.service.BaoCaoService;
import mta.qldv.service.DonViService;
import mta.qldv.service.HoSoService;
import mta.qldv.service.HoatDongService;
import mta.qldv.service.QuyenService;
import mta.qldv.service.ThongBaoChinhSachService;

@Controller
@RequestMapping("/admin")
public class HomeAdminController {
	@Autowired
	private QuyenService quyenService;
	
	@Autowired
	private HoSoService hoSoService;

	@Autowired
	private DonViService donViService;
	
	@Autowired
	private HoatDongService hoatDongService;
	
	@Autowired
	private ThongBaoChinhSachService tbcsService;
	
	@Autowired
	private BaoCaoService baoCaoService;

	@GetMapping
	public String homeAdmin() {
		return "home-admin";
	}
	
	@GetMapping("/tai-khoan/them/{id}")
	public String themTaiKhoanAdmin(@PathVariable(name="id") Long idHoSo, ModelMap map) {
		HoSo hoSo = hoSoService.getHoSoById(idHoSo);
		TaiKhoanDkyDto taiKhoanDto = new TaiKhoanDkyDto();
		if(hoSo.getTaiKhoan() == null) {		
			taiKhoanDto.setKichHoat(true);
			taiKhoanDto.setIdHoSo(idHoSo);
			map.addAttribute("taiKhoanDto", taiKhoanDto);
			
			map.addAttribute("listQuyen", quyenService.getList());
			return "them-tai-khoan";
		} else {
			return "redirect:/admin/chi-doan/" + hoSo.getChiDoan().getId() + "/danh-sach?result=exist";
		}
		
	}

	@GetMapping("/chi-doan/{id}/danh-sach")
	public String danhSachDoanVienChiDoanAdmin(@PathVariable(name = "id") Long idChiDoan,
			@RequestParam(name="result", required=false) String result, ModelMap map) {
		map.addAttribute("idChiDoan", idChiDoan);
		if(result != null) {
			if(result.equals("true")) {
				map.addAttribute("message", "Thành công!");
			} else if(result.equals("false")){
				map.addAttribute("message", "Thất bại!");
			} else {
				map.addAttribute("message", "Đoàn viên đã có tài khoản!");
			}
		}
		return "danh-sach-doan-vien";
	}
	
	@GetMapping("/doan-co-so/them")
	public String themDoanCoSoAdmin(@RequestParam(name="result", required=false) String result, ModelMap map) {
		ChiDoanDto doanCoSoDto = new ChiDoanDto();
		map.addAttribute("doanCoSoDto", doanCoSoDto);
		map.addAttribute("khoa", donViService.getList());
		if(result != null) {
			if(result.equals("true")) {
				map.addAttribute("message", "Thành công!");
			} else {
				map.addAttribute("message", "Thất bại!");
			}
		}
		return "them-doan-co-so";
	}
	
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
				map.addAttribute("message", "Thành công!");
			} else {
				map.addAttribute("message", "Thất bại");
			}
		}
		return "them-tb-cs";
	}
	
	@GetMapping("/tb-cs/update/{id}")
	public String suaThongBaoChinhSachAdmin(@PathVariable(name = "id") Long idTBCS,
			@RequestParam(name="result", required=false) String result, ModelMap map) {
		ThongBaoChinhSach tbcs = tbcsService.getById(idTBCS);
		map.addAttribute("tbcs", tbcs);
		
		ThongBaoChinhSachDto tbcsDto = new ThongBaoChinhSachDto();
		tbcsDto.setId(idTBCS);
		tbcsDto.setTenThongBaoChinhSach(tbcs.getTenThongBaoChinhSach());
		tbcsDto.setNoiDung(tbcs.getNoiDung());
		tbcsDto.setNguoiGui(tbcs.getNguoiGui());
		map.addAttribute("tbcsDto", tbcsDto);
		return "sua-tb-cs";
	}
	
	@GetMapping("/tb-cs/{id}/chi-tiet")
	public String chiTietThongBaoChinhSachAdmin(@PathVariable(name = "id") Long idTBCS, ModelMap map) {
		map.addAttribute("tbcs", tbcsService.getById(idTBCS));
		return "chi-tiet-tb-cs";
	}
	
	@GetMapping("/tb-cs/danh-sach")
	public String thongBaoChinhSachAdmin(@RequestParam(name="result", required=false) String result,
			ModelMap map) {
		if(result != null) {
			if(result.equals("true")) {
				map.addAttribute("message", "Thành công!");
			} else {
				map.addAttribute("message", "Thất bại!");
			}
		}
		return "danh-sach-tb-cs";
	}
	
	@GetMapping("/hoat-dong/them")
	public String themHoatDongAdmin(@RequestParam(name="result", required=false) String result, ModelMap map) {
		HoatDongDto hoatDongDto = new HoatDongDto();
		hoatDongDto.setDvToChuc("Ban Thanh niên");
		hoatDongDto.setTrangThai("Đã duyệt");
		map.addAttribute("hoatDongDto", hoatDongDto);
		
		if(result != null) {
			if(result.equals("true")) {
				map.addAttribute("message", "Thành công!");
			} else {
				map.addAttribute("message", "Thất bại!");
			}
		}
		return "them-hd";
	}
	
	@GetMapping("/hoat-dong/update/{id}")
	public String suaHoatDongAdmin(@PathVariable(name = "id") Long idHoatDong,
			@RequestParam(name="result", required=false) String result, ModelMap map) {
		HoatDong hoatDong = hoatDongService.getById(idHoatDong);
		map.addAttribute("hoatDong", hoatDong);
		
		HoatDongDto hoatDongDto = new HoatDongDto();
		hoatDongDto.setDvToChuc(hoatDong.getDvToChuc());
		hoatDongDto.setId(hoatDong.getId());
		map.addAttribute("hoatDongDto", hoatDongDto);
		
		List<String> listTrangThai = new ArrayList<>();
		listTrangThai.add("Đã duyệt");
		listTrangThai.add("Chờ duyệt");
		listTrangThai.add("Hủy bỏ");
		map.addAttribute("listTrangThai", listTrangThai);
		
		return "sua-hd";
	}
	
	@GetMapping("/hoat-dong/{id}/phe-duyet")
	public String pheDuyetHoatDongAdmin(@PathVariable(name = "id") Long idHoatDong) {
		HoatDong hoatDong = hoatDongService.getById(idHoatDong);
		hoatDong.setTrangThai("Đã duyệt");
		return "redirect:/admin/hoat-dong/danh-sach-duoc-duyet?result=" + hoatDongService.updateHoatDong(hoatDong);
	}
	
	@GetMapping("/hoat-dong/{id}/huy-bo")
	public String huyBoHoatDongAdmin(@PathVariable(name = "id") Long idHoatDong) {
		HoatDong hoatDong = hoatDongService.getById(idHoatDong);
		hoatDong.setTrangThai("Hủy bỏ");
		return "redirect:/admin/hoat-dong/danh-sach-hd-huy?result=" + hoatDongService.updateHoatDong(hoatDong);
	}

	@GetMapping("/hoat-dong/danh-sach-duoc-duyet")
	public String hoatDongDuocDuyetAdmin(@RequestParam(name="result", required=false) String result, ModelMap map) {
		map.addAttribute("loaiHoatDong", 2);
		if(result != null) {
			if(result.equals("true")) {
				map.addAttribute("message", "Thành công!");
			} else {
				map.addAttribute("message", "Thất bại!");
			}
		}
		return "danh-sach-hd-duyet";
	}
	
	@GetMapping("/hoat-dong/danh-sach-de-xuat")
	public String hoatDongDeXuatAdmin(ModelMap map) {
		map.addAttribute("loaiHoatDong", 1);
		return "danh-sach-hd-de-xuat";
	}
	
	@GetMapping("/hoat-dong/danh-sach-hd-huy")
	public String hoatDongHuyBoAdmin(@RequestParam(name="result", required=false) String result, ModelMap map) {
		map.addAttribute("loaiHoatDong", 3);
		if(result != null) {
			if(result.equals("true")) {
				map.addAttribute("message", "Thành công!");
			} else {
				map.addAttribute("message", "Thất bại!");
			}
		}
		return "danh-sach-hd-huy";
	}
	
	@GetMapping("/bao-cao/danh-sach")
	public String baoCaoAdmin() {
		return "danh-sach-bao-cao";
	}
	
	@GetMapping("/bao-cao/{id}/chi-tiet")
	public String chiTietBaoCao(@PathVariable(name = "id") Long idBaoCao, ModelMap map) {
		BaoCao baoCao = baoCaoService.getById(idBaoCao);
		HoSo nguoiGui = baoCao.getHoSo();
		map.addAttribute("baoCao", baoCao);
		map.addAttribute("nguoiGui", nguoiGui.getHoTen());
		return "chi-tiet-bao-cao";
	}
}
