package mta.qldv.service.impl;

import mta.qldv.dao.PhanHoiDao;
import mta.qldv.entity.PhanHoi;
import mta.qldv.service.PhanHoiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PhanHoiServiceImpl implements PhanHoiService {
    @Autowired
    private PhanHoiDao phanHoiDao;

    public List<PhanHoi> getList() {
        return phanHoiDao.getList();
    }

    @Override
    public Boolean addPhanHoi(PhanHoi phanHoi) {
        return null;
    }

    @Override
    public Boolean deletePhanHoi(Long id) {
        return null;
    }
}
