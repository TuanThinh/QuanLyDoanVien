package mta.qldv.entity;

import java.time.LocalDate;

public class KhenThuongKyLuat {
	private int idHoSo;
	private int sqdKhenThuongyLuat;
	private LocalDate thoiGian;
	public int getIdHoSo() {
		return idHoSo;
	}
	public void setIdHoSo(int idHoSo) {
		this.idHoSo = idHoSo;
	}
	public int getSqdKhenThuongyLuat() {
		return sqdKhenThuongyLuat;
	}
	public void setSqdKhenThuongyLuat(int sqdKhenThuongyLuat) {
		this.sqdKhenThuongyLuat = sqdKhenThuongyLuat;
	}
	public LocalDate getThoiGian() {
		return thoiGian;
	}
	public void setThoiGian(LocalDate thoiGian) {
		this.thoiGian = thoiGian;
	}
	
}
