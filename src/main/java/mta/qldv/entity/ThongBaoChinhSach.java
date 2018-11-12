package mta.qldv.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "thongbao_chinhsach")
public class ThongBaoChinhSach implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@Column(name = "ten")
	private String tenThongBaoChinhSach;

	@Column(name = "noi_dung")
	private String noiDung;

	@Column(name = "nguoi_gui")
	private String nguoiGui;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTenThongBaoChinhSach() {
		return tenThongBaoChinhSach;
	}

	public void setTenThongBaoChinhSach(String tenThongBaoChinhSach) {
		this.tenThongBaoChinhSach = tenThongBaoChinhSach;
	}

	public String getNoiDung() {
		return noiDung;
	}

	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}

	public String getNguoiGui() {
		return nguoiGui;
	}

	public void setNguoiGui(String nguoiGui) {
		this.nguoiGui = nguoiGui;
	}
}
