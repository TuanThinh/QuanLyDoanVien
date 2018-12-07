package mta.qldv.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

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
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", locale = "vi-VN", timezone = "Asia/Ho_Chi_Minh")
	@Temporal(TemporalType.DATE)
	private Date ngayLap;

	@Column(name = "kichhoat")
	private Boolean kichHoat;

	@Column(name= "truycaplancuoi")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm", locale = "vi-VN", timezone = "Asia/Ho_Chi_Minh")
	private Date truyCapLanCuoi;

	@ManyToMany(cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
	@JoinTable(
			name = "taikhoan_quyen",
			joinColumns = { @JoinColumn(name = "id_taikhoan") },
			inverseJoinColumns = { @JoinColumn(name = "id_quyen") }
	)
	private List<Quyen> listQuyen = new ArrayList<>();

//	@OneToOne(fetch = FetchType.EAGER, mappedBy = "taiKhoan")
//	@JsonIgnoreProperties("taiKhoan")
//	private HoSo hoSo;

//	@OneToOne(mappedBy = "taiKhoan")
//    private HoSo hoSo;

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

	public Date getTruyCapLanCuoi() {
		return truyCapLanCuoi;
	}

	public void setTruyCapLanCuoi(Date truyCapLanCuoi) {
		this.truyCapLanCuoi = truyCapLanCuoi;
	}

}
