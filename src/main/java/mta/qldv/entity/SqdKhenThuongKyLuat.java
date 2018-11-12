package mta.qldv.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "sqd_kt_kl")
public class SqdKhenThuongKyLuat implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(name = "tieu_de")
	private String tieuDe;

	@Column(name = "noi_dung")
	private String noiDung;

//	@OneToMany(mappedBy = "sqdKhenThuongKyLuat")
//	private List<KhenThuongKyLuat> listKtkl = new ArrayList<KhenThuongKyLuat>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

//	public List<KhenThuongKyLuat> getListKtkl() {
//		return listKtkl;
//	}
//
//	public void setListKtkl(List<KhenThuongKyLuat> listKtkl) {
//		this.listKtkl = listKtkl;
//	}
}
