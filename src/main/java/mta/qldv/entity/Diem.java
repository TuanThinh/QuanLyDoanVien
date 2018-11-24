package mta.qldv.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "diem_ren_luyen")
public class Diem implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "id_hs")
	private HoSo hoSo;

	@Column(name = "diem")
	private Double diem;

	@Column(name = "thoi_gian")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", locale = "vi-VN", timezone = "Asia/Ho_Chi_Minh")
	private Date thoiGian;

	@Column(name = "ghi_chu")
	private String ghiChu;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public HoSo getHoSo() {
		return hoSo;
	}

	public void setHoSo(HoSo hoSo) {
		this.hoSo = hoSo;
	}

	public Double getDiem() {
		return diem;
	}

	public void setDiem(Double diem) {
		this.diem = diem;
	}

	public Date getThoiGian() {
		return thoiGian;
	}

	public void setThoiGian(Date thoiGian) {
		this.thoiGian = thoiGian;
	}

	public String getGhiChu() {
		return ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}
}
