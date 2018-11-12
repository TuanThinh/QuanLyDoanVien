package mta.qldv.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "tai_khoan")
public class TaiKhoan implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(name = "ten_tk", unique = true)
	private String tenTaiKhoan;

	@Column(name = "mat_khau")
	private String matKhau;

	@Column(name = "ngay_lap")
	private Date ngayLap;

	@ManyToOne
	@JoinColumn(name = "id_quyen")
	private Quyen quyen;

//	@OneToOne(mappedBy = "taiKhoan")
//    private HoSo hoSo;

//    public HoSo getHoSo() {
//        return hoSo;
//    }
//
//    public void setHoSo(HoSo hoSo) {
//        this.hoSo = hoSo;
//    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public Date getNgayLap() {
		return ngayLap;
	}

	public void setNgayLap(Date ngayLap) {
		this.ngayLap = ngayLap;
	}

	public Quyen getQuyen() {
		return quyen;
	}

	public void setQuyen(Quyen quyen) {
		this.quyen = quyen;
	}
}
