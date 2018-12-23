package mta.qldv.dto;

import javax.validation.constraints.NotBlank;

public class ThongBaoChinhSachDto {
	private Long id;

	@NotBlank(message="Vui lòng nhập tên thông báo chính sách!")
	private String tenThongBaoChinhSach;

	@NotBlank(message="Vui long nhập nội dung thông báo chính sách!")
	private String noiDung;

	@NotBlank(message="Vui lòng nhập người gửi thông báo chính sách!")
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
