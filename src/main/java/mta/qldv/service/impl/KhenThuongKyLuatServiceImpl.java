package mta.qldv.service.impl;

import mta.qldv.dao.KhenThuongKyLuatDao;
import mta.qldv.entity.KhenThuongKyLuat;
import mta.qldv.service.KhenThuongKyLuatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KhenThuongKyLuatServiceImpl implements KhenThuongKyLuatService {
    @Autowired
    private KhenThuongKyLuatDao khenThuongKyLuatDao;

    public List<KhenThuongKyLuat> getList() {
        return khenThuongKyLuatDao.getList();
    }
}
