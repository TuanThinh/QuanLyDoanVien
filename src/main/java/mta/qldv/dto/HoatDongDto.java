package mta.qldv.dto;

import javax.validation.constraints.NotBlank;

public class HoatDongDto {
	@NotBlank(message="Vui lòng nhập tên hoạt động!")
	private String tenHoatDong;

	@NotBlank(message="Vui lòng nhập thời gian tổ chức!")
	private String thoiGian;

	@NotBlank(message="Vui lòng nhập địa điểm tổ chức!")
	private String diaDiem;

	private String dvToChuc;

	@NotBlank(message="Vui lòng nhập đối tượng tham gia!")
	private String doiTuongThamGia;

	private String trangThai;
	public String getTenHoatDong() {
		return tenHoatDong;
	}
	public void setTenHoatDong(String tenHoatDong) {
		this.tenHoatDong = tenHoatDong;
	}
	public String getThoiGian() {
		return thoiGian;
	}
	public void setThoiGian(String thoiGian) {
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
	public String getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}
}
