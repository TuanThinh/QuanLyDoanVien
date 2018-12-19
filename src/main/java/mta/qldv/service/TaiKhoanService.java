package mta.qldv.service;

import mta.qldv.entity.TaiKhoan;
import mta.qldv.form.DoiMatKhauForm;

import java.util.List;

public interface TaiKhoanService {
    List<TaiKhoan> getList();
    TaiKhoan getById(Long id);
    Long createAccount(TaiKhoan taiKhoan);
    TaiKhoan findByUserName(String username);
    Boolean doiMatKhau(DoiMatKhauForm doiMatKhauForm);
}
