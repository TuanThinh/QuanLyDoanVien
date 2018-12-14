package mta.qldv.dto;

import javax.validation.constraints.NotBlank;

public class ChiDoanDto {
	@NotBlank(message="please")
	private String tenChiDoan;

	private int donVi;

	public String getTenChiDoan() {
		return tenChiDoan;
	}

	public void setTenChiDoan(String tenChiDoan) {
		this.tenChiDoan = tenChiDoan;
	}

	public int getDonVi() {
		return donVi;
	}

	public void setDonVi(int donVi) {
		this.donVi = donVi;
	}

	
}
