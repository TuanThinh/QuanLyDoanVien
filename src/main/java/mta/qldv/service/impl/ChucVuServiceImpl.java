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

    @Override
    public Boolean addChucVu(ChucVu chucVu) {
        return null;
    }

    @Override
    public Boolean updateChucVu(ChucVu chucVu) {
        return null;
    }

    @Override
    public Boolean deleteChucVu(Long id) {
        return null;
    }

    public List<ChucVu> getList() {
        return chucVuDao.getList();
    }

    @Override
    public ChucVu getById(Long id) {
        return chucVuDao.getById(id);
    }
}
