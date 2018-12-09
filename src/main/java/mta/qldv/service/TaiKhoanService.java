package mta.qldv.service;

import mta.qldv.entity.TaiKhoan;

import java.util.List;

public interface TaiKhoanService {
    List<TaiKhoan> getList();
    TaiKhoan getById(Long id);
    Long createAccount(TaiKhoan taiKhoan);
    TaiKhoan findByUserName(String username);
}
