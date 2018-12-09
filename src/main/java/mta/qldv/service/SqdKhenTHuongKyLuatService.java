package mta.qldv.service;

import mta.qldv.entity.SqdKhenThuongKyLuat;

import java.util.List;

public interface SqdKhenTHuongKyLuatService {
    Boolean addSqdKhenThuongKyLuat(SqdKhenThuongKyLuat sqdKhenThuongKyLuat);
    Boolean updateSqdKhenThuongKyLuat(SqdKhenThuongKyLuat sqdKhenThuongKyLuat);
    Boolean deleteSqdKhenThuongKyLuat(Long id);

    List<SqdKhenThuongKyLuat> getList();
    SqdKhenThuongKyLuat getById(Long id);
}
