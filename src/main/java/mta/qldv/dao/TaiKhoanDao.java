package mta.qldv.dao;

import mta.qldv.entity.TaiKhoan;

import java.util.List;

public interface TaiKhoanDao {
    List<TaiKhoan> getList();
    TaiKhoan getById(Long id);
    Long createAccount(TaiKhoan taiKhoan);
    TaiKhoan findByUserName(String username);
    Boolean updateTaiKhoan(TaiKhoan tk);
}
