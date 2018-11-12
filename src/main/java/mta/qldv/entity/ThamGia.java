package mta.qldv.entity;

import javax.persistence.*;
import java.io.Serializable;

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

	@Column(name = "trang_thai")
	private Boolean trangThai;

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

	public Boolean getTrangThai() {
		return trangThai;
	}

	public void setTrangThai(Boolean trangThai) {
		this.trangThai = trangThai;
	}
}
