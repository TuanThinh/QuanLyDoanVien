package mta.qldv.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "quyen")
public class Quyen implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(name = "ten")
	private String tenQuyen;

	@Column(name = "chuc_nang")
	private String chucNang;

//	@OneToMany(mappedBy = "quyen", fetch = FetchType.LAZY)
//	private List<TaiKhoan> listTaiKhoan = new ArrayList<TaiKhoan>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTenQuyen() {
		return tenQuyen;
	}

	public void setTenQuyen(String tenQuyen) {
		this.tenQuyen = tenQuyen;
	}

	public String getChucNang() {
		return chucNang;
	}

	public void setChucNang(String chucNang) {
		this.chucNang = chucNang;
	}

//	public List<TaiKhoan> getListTaiKhoan() {
//		return listTaiKhoan;
//	}
//
//	public void setListTaiKhoan(List<TaiKhoan> listTaiKhoan) {
//		this.listTaiKhoan = listTaiKhoan;
//	}
}
