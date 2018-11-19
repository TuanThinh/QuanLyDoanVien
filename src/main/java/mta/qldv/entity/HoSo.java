package mta.qldv.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "ho_so")
public class HoSo implements Serializable {

	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "hinh_anh")
    private String hinhAnh;

	@Column(name = "ma_sv", unique = true, nullable = false)
	private String maSv;

	@Column(name = "ho_ten", nullable = false)
	private String hoTen;

	@Column(name = "ngay_sinh", nullable = false)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date ngaySinh;

	@Column(name = "gioi_tinh", nullable = false)
	private Boolean gioiTinh;

	@Column(name = "dia_chi", nullable = false)
	private String diaChi;

	@Column(name="sodienthoai")
	private String sdt;

	@Column(name = "email", unique = true)
	private String email;

	@Column(name = "quoc_tich")
	private String quocTich;

	@Column(name = "dan_toc")
	private String danToc;

	@Column(name = "ton_giao")
	private String tonGiao;

	@Column(name = "doi_tuong_chinh_sach")
	private String doiTuongChinhSach;

	@Column(name = "ngay_vao_doan")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date ngayVaoDoan;

	@Column(name = "ngay_vao_dang")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date ngayVaoDang;

	@Column(name = "id_nguoiquanly")
	private Long idQuanLy;

//	@OneToMany(mappedBy = "hoSo")
//	private List<BaoCao> listBaoCao = new ArrayList<BaoCao>();

	@ManyToOne
	@JoinColumn(name = "id_lop")
	private ChiDoan chiDoan;

	@ManyToOne
	@JoinColumn(name = "id_cv")
	private ChucVu chucVu;

//	@OneToMany(mappedBy = "hoSo")
//	private List<Diem> listDiem = new ArrayList<Diem>();

//	@OneToMany(mappedBy = "hoSo")
//    private List<KhenThuongKyLuat> listKtkl = new ArrayList<KhenThuongKyLuat>();
//
//	@OneToMany(mappedBy = "hoSo")
//    private List<PhanHoi> listPhanHoi = new ArrayList<PhanHoi>();
//
//	@OneToMany(mappedBy = "hoSo")
//    private List<ThamGia> listThamGia = new ArrayList<ThamGia>();

    @OneToOne
    @JoinColumn(name = "id_taikhoan")
    private TaiKhoan taiKhoan;


	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getHinhAnh() {
		return hinhAnh;
	}

	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}

	public String getMaSv() {
		return maSv;
	}

	public void setMaSv(String maSv) {
		this.maSv = maSv;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public Boolean getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(Boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getQuocTich() {
		return quocTich;
	}

	public void setQuocTich(String quocTich) {
		this.quocTich = quocTich;
	}

	public String getDanToc() {
		return danToc;
	}

	public void setDanToc(String danToc) {
		this.danToc = danToc;
	}

	public String getTonGiao() {
		return tonGiao;
	}

	public void setTonGiao(String tonGiao) {
		this.tonGiao = tonGiao;
	}

	public String getDoiTuongChinhSach() {
		return doiTuongChinhSach;
	}

	public void setDoiTuongChinhSach(String doiTuongChinhSach) {
		this.doiTuongChinhSach = doiTuongChinhSach;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public Date getNgayVaoDoan() {
		return ngayVaoDoan;
	}

	public void setNgayVaoDoan(Date ngayVaoDoan) {
		this.ngayVaoDoan = ngayVaoDoan;
	}

	public Date getNgayVaoDang() {
		return ngayVaoDang;
	}

	public void setNgayVaoDang(Date ngayVaoDang) {
		this.ngayVaoDang = ngayVaoDang;
	}

	public Long getIdQuanLy() {
		return idQuanLy;
	}

	public void setIdQuanLy(Long idQuanLy) {
		this.idQuanLy = idQuanLy;
	}

	public ChiDoan getChiDoan() {
		return chiDoan;
	}

	public void setChiDoan(ChiDoan chiDoan) {
		this.chiDoan = chiDoan;
	}

	public ChucVu getChucVu() {
		return chucVu;
	}

	public void setChucVu(ChucVu chucVu) {
		this.chucVu = chucVu;
	}

	public TaiKhoan getTaiKhoan() {
		return taiKhoan;
	}

	public void setTaiKhoan(TaiKhoan taiKhoan) {
		this.taiKhoan = taiKhoan;
	}
}
