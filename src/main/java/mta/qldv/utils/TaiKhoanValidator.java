package mta.qldv.utils;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import mta.qldv.dto.TaiKhoanDkyDto;

public class TaiKhoanValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return TaiKhoanDkyDto.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		TaiKhoanDkyDto taiKhoanDto = (TaiKhoanDkyDto) target;
		if(!taiKhoanDto.getMatKhau().equals(taiKhoanDto.getNhapLaiMatKhau())) {
			errors.rejectValue("nhapLaiMatKhau", null, "Mật khẩu nhập lại không trùng khớp!");
			return;
		}
	}

}
