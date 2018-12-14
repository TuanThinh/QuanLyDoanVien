package mta.qldv.service;

import mta.qldv.entity.TaiKhoan;

import java.util.List;

public interface TaiKhoanService {
    List<TaiKhoan> getList();
    Long createAccount(TaiKhoan taiKhoan);
}
