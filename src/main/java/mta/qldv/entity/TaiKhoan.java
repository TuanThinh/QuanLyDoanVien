package mta.qldv.entity;

import java.time.LocalDate;

public class TaiKhoan {
	private int id;
	private String tenTaiKhoan;
	private String matKhau;
	private LocalDate ngayLap;
	private int idQuyen;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public LocalDate getNgayLap() {
		return ngayLap;
	}
	public void setNgayLap(LocalDate ngayLap) {
		this.ngayLap = ngayLap;
	}
	public int getIdQuyen() {
		return idQuyen;
	}
	public void setIdQuyen(int idQuyen) {
		this.idQuyen = idQuyen;
	}
	
}
