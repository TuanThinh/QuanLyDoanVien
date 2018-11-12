package mta.qldv.service.impl;

import mta.qldv.dao.ThongBaoChinhSachDao;
import mta.qldv.entity.ThongBaoChinhSach;
import mta.qldv.service.ThongBaoChinhSachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThongBaoChinhSachServiceImpl implements ThongBaoChinhSachService {
    @Autowired
    private ThongBaoChinhSachDao thongBaoChinhSachDao;

    public List<ThongBaoChinhSach> getList() {
        return thongBaoChinhSachDao.getList();
    }
}
