package mta.qldv.dto;

import javax.validation.constraints.NotBlank;

public class ChiDoanDto {
	@NotBlank(message="Vui lòng nhập tên chi đoàn!")
	private String tenChiDoan;

	private Long donVi;

	public String getTenChiDoan() {
		return tenChiDoan;
	}

	public void setTenChiDoan(String tenChiDoan) {
		this.tenChiDoan = tenChiDoan;
	}

	public Long getDonVi() {
		return donVi;
	}

	public void setDonVi(Long donVi) {
		this.donVi = donVi;
	}

	
}
