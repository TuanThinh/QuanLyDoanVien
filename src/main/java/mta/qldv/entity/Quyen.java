package mta.qldv.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "quyen")
public class Quyen {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private int id;

	@Column(name = "ten")
	private String tenQuyen;

	@Column(name = "chuc_nang")
	private String chucNang;

	@OneToMany(mappedBy = "quyen")
	private List<Quyen> listQuyen = new ArrayList<Quyen>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public List<Quyen> getListQuyen() {
		return listQuyen;
	}

	public void setListQuyen(List<Quyen> listQuyen) {
		this.listQuyen = listQuyen;
	}
}
