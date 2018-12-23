package mta.qldv.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import mta.qldv.dto.HoatDongDto;

public class HoatDongValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return HoatDongDto.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		HoatDongDto hoatDongDto = (HoatDongDto) target;
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String presentDay = formatter.format(new Date());
		if(hoatDongDto.getThoiGian().compareTo(presentDay) <= 0) {
			errors.rejectValue("thoiGian", null, "Vui lòng nhập thời gian trong tương lai!");
			return;
		}

	}

}
