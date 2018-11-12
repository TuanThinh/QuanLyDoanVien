package mta.qldv.service.impl;

import mta.qldv.dao.SqdKhenThuongKyLuatDao;
import mta.qldv.entity.SqdKhenThuongKyLuat;
import mta.qldv.service.SqdKhenTHuongKyLuatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SqdKhenThuongKyLuatServiceImpl implements SqdKhenTHuongKyLuatService {
    @Autowired
    private SqdKhenThuongKyLuatDao sqdKhenThuongKyLuatDao;

    public List<SqdKhenThuongKyLuat> getList() {
        return sqdKhenThuongKyLuatDao.getList();
    }
}
