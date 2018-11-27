package mta.qldv.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "tai_khoan")
public class TaiKhoan implements Serializable {
	//private static final long serialVersionUID = 1L;

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

	@Column(name = "kichhoat")
	private Boolean kichHoat;

	@Column(name= "truycaplancuoi")
	@DateTimeFormat(pattern = "yyyy/MM/dd HH:mm")
	private LocalDateTime truyCapLanCuoi;

	@ManyToMany(cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
	@JoinTable(
			name = "taikhoan_quyen",
			joinColumns = { @JoinColumn(name = "id_taikhoan") },
			inverseJoinColumns = { @JoinColumn(name = "id_quyen") }
	)
	private List<Quyen> listQuyen = new ArrayList<>();

	/*@OneToOne(mappedBy = "taiKhoan")
    private HoSo hoSo;

    public HoSo getHoSo() {
        return hoSo;
    }

    public void setHoSo(HoSo hoSo) {
        this.hoSo = hoSo;
    }*/

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

	public List<Quyen> getListQuyen() {
		return listQuyen;
	}

	public void setListQuyen(List<Quyen> listQuyen) {
		this.listQuyen = listQuyen;
	}

	public Boolean getKichHoat() {
		return kichHoat;
	}

	public void setKichHoat(Boolean kichHoat) {
		this.kichHoat = kichHoat;
	}

	public LocalDateTime getTruyCapLanCuoi() {
		return truyCapLanCuoi;
	}

	public void setTruyCapLanCuoi(LocalDateTime truyCapLanCuoi) {
		this.truyCapLanCuoi = truyCapLanCuoi;
	}
}
