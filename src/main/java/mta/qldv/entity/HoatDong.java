package mta.qldv.entity;

import java.time.LocalDate;

public class HoatDong {
	private int id;
	private String tenHoatDong;
	private LocalDate thoiGian;
	private String diaDiem;
	private String dvToChuc;
	private String doiTuongThamGia;
	private boolean trangThai;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTenHoatDong() {
		return tenHoatDong;
	}
	public void setTenHoatDong(String tenHoatDong) {
		this.tenHoatDong = tenHoatDong;
	}
	public LocalDate getThoiGian() {
		return thoiGian;
	}
	public void setThoiGian(LocalDate thoiGian) {
		this.thoiGian = thoiGian;
	}
	public String getDiaDiem() {
		return diaDiem;
	}
	public void setDiaDiem(String diaDiem) {
		this.diaDiem = diaDiem;
	}
	public String getDvToChuc() {
		return dvToChuc;
	}
	public void setDvToChuc(String dvToChuc) {
		this.dvToChuc = dvToChuc;
	}
	public String getDoiTuongThamGia() {
		return doiTuongThamGia;
	}
	public void setDoiTuongThamGia(String doiTuongThamGia) {
		this.doiTuongThamGia = doiTuongThamGia;
	}
	public boolean isTrangThai() {
		return trangThai;
	}
	public void setTrangThai(boolean trangThai) {
		this.trangThai = trangThai;
	}
	
}
