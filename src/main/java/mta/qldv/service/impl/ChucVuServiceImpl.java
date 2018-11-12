package mta.qldv.service.impl;

import mta.qldv.dao.ChucVuDao;
import mta.qldv.entity.ChucVu;
import mta.qldv.service.ChucVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChucVuServiceImpl implements ChucVuService {
    @Autowired
    private ChucVuDao chucVuDao;

    public List<ChucVu> getList() {
        return chucVuDao.getList();
    }
}
