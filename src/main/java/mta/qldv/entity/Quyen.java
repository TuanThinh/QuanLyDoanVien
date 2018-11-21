package mta.qldv.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

//	@ManyToMany(mappedBy = "listQuyen", fetch = FetchType.LAZY)
//	private List<TaiKhoan> listTaiKhoan = new ArrayList<>();

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

}
