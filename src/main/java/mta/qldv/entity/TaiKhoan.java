package mta.qldv.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tai_khoan")
public class TaiKhoan {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private int id;

	@Column(name = "ten_tk", unique = true)
	private String tenTaiKhoan;

	@Column(name = "mat_khau")
	private String matKhau;

	@Column(name = "ngay_lap")
	private LocalDate ngayLap;

	@ManyToOne
	@JoinColumn(name = "id_quyen")
	private Quyen quyen;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTenTaiKhoan() {
		return tenTaiKhoan;
	}

	public void setTenTaiKhoan(String tenTaiKhoan) {
		this.tenTaiKhoan = tenTaiKhoan;
	}

	public String getMatKhau() {
		return matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	public LocalDate getNgayLap() {
		return ngayLap;
	}

	public void setNgayLap(LocalDate ngayLap) {
		this.ngayLap = ngayLap;
	}

	public Quyen getQuyen() {
		return quyen;
	}

	public void setQuyen(Quyen quyen) {
		this.quyen = quyen;
	}
}
