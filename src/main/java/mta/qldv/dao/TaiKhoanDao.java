package mta.qldv.dao;

import mta.qldv.entity.TaiKhoan;

import java.util.List;

public interface TaiKhoanDao {
    List<TaiKhoan> getList();
    Long createAccount(TaiKhoan newAccount);
    TaiKhoan findByUserName(String username);
}
