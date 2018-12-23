package mta.qldv.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "hoat_dong")
public class HoatDong implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(name = "ten_hd")
	private String tenHoatDong;

	@Column(name = "dia_diem")
	private String diaDiem;

	@Column(name = "thoi_gian")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", locale = "vi-VN", timezone = "Asia/Ho_Chi_Minh")
	private Date thoiGian;

	@Column(name = "dv_to_chuc")
	private String dvToChuc;

	@Column(name = "doi_tuong_tham_gia")
	private String doiTuongThamGia;

	@Column(name = "trang_thai")
	private String trangThai;

//	@OneToMany(mappedBy = "hoatDong")
//    private List<ThamGia> listThamGia = new ArrayList<ThamGia>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTenHoatDong() {
		return tenHoatDong;
	}

	public void setTenHoatDong(String tenHoatDong) {
		this.tenHoatDong = tenHoatDong;
	}

	public String getDiaDiem() {
		return diaDiem;
	}

	public void setDiaDiem(String diaDiem) {
		this.diaDiem = diaDiem;
	}

	public Date getThoiGian() {
		return thoiGian;
	}

	public void setThoiGian(Date thoiGian) {
		this.thoiGian = thoiGian;
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
