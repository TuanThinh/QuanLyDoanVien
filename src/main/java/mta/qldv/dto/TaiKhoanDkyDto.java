package mta.qldv.dto;

import javax.validation.constraints.NotBlank;

public class TaiKhoanDkyDto {
	public Long idHoSo;

	@NotBlank(message = "Vui lòng nhập tên đăng nhập!")
	public String tenTaiKhoan;

	@NotBlank(message = "Vui lòng nhập mật khẩu!")
	public String matKhau;

	@NotBlank(message = "Vui lòng nhập lại mật khẩu!")
	public String nhapLaiMatKhau;

	public boolean kichHoat;

	@NotBlank(message = "Vui lòng chọn quyền!")
	public String quyen;
	
	public Long getIdHoSo() {
		return idHoSo;
	}
	public void setIdHoSo(Long idHoSo) {
		this.idHoSo = idHoSo;
	}
	public String getTenTaiKhoan() {
		return tenTaiKhoan;
	}
	public void setTenTaiKhoan(String tenTaiKhoan) {
		this.tenTaiKhoan = tenTaiKhoan;
	}
	public String getMatKhau() {
		return matKhau;
	}
	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}
	public String getNhapLaiMatKhau() {
		return nhapLaiMatKhau;
	}
	public void setNhapLaiMatKhau(String nhapLaiMatKhau) {
		this.nhapLaiMatKhau = nhapLaiMatKhau;
	}
	public boolean getKichHoat() {
		return kichHoat;
	}
	public void setKichHoat(boolean kichHoat) {
		this.kichHoat = kichHoat;
	}
	public String getQuyen() {
		return quyen;
	}
	public void setQuyen(String quyen) {
		this.quyen = quyen;
	}
}
