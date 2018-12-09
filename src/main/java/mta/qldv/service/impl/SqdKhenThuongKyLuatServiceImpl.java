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

    @Override
    public Boolean addSqdKhenThuongKyLuat(SqdKhenThuongKyLuat sqdKhenThuongKyLuat) {
        return null;
    }

    @Override
    public Boolean updateSqdKhenThuongKyLuat(SqdKhenThuongKyLuat sqdKhenThuongKyLuat) {
        return null;
    }

    @Override
    public Boolean deleteSqdKhenThuongKyLuat(Long id) {
        return null;
    }

    @Override
    public List<SqdKhenThuongKyLuat> getList() {
        return sqdKhenThuongKyLuatDao.getList();
    }

    @Override
    public SqdKhenThuongKyLuat getById(Long id) {
        return null;
    }
}
