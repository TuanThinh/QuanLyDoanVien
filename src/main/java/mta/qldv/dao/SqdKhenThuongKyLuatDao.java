package mta.qldv.dao;

import mta.qldv.entity.SqdKhenThuongKyLuat;

import java.util.List;

public interface SqdKhenThuongKyLuatDao {
    Boolean addSqdKhenThuongKyLuat(SqdKhenThuongKyLuat sqdKhenThuongKyLuat);
    Boolean updateSqdKhenThuongKyLuat(SqdKhenThuongKyLuat sqdKhenThuongKyLuat);
    Boolean deleteSqdKhenThuongKyLuat(Long id);

    List<SqdKhenThuongKyLuat> getList();
    SqdKhenThuongKyLuat getById(Long id);
}
