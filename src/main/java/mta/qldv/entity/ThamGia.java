package mta.qldv.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "tham_gia")
public class ThamGia implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "id_hs")
	private HoSo hoSo;

	@ManyToOne
	@JoinColumn(name = "id_hd")
	private HoatDong hoatDong;

	@Column(name = "thoi_gian")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", locale = "vi-VN", timezone = "Asia/Ho_Chi_Minh")
	@Temporal(TemporalType.DATE)
	private Date thoiGian;

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

	public HoatDong getHoatDong() {
		return hoatDong;
	}

	public void setHoatDong(HoatDong hoatDong) {
		this.hoatDong = hoatDong;
	}

	public Date getThoiGian() {
		return thoiGian;
	}

	public void setThoiGian(Date thoiGian) {
		this.thoiGian = thoiGian;
	}
}
