package mta.qldv.entity;

import java.time.LocalDate;

public class PhanHoi {
	private int id;
	private int idHoSo;
	private String tieuDe;
	private String noiDung;
	private LocalDate thoiGian;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdHoSo() {
		return idHoSo;
	}
	public void setIdHoSo(int idHoSo) {
		this.idHoSo = idHoSo;
	}
	public String getTieuDe() {
		return tieuDe;
	}
	public void setTieuDe(String tieuDe) {
		this.tieuDe = tieuDe;
	}
	public String getNoiDung() {
		return noiDung;
	}
	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}
	public LocalDate getThoiGian() {
		return thoiGian;
	}
	public void setThoiGian(LocalDate thoiGian) {
		this.thoiGian = thoiGian;
	}
	
}
