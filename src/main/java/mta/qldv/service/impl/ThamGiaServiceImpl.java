package mta.qldv.service.impl;

import mta.qldv.dao.ThamGiaDao;
import mta.qldv.entity.ThamGia;
import mta.qldv.service.ThamGiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThamGiaServiceImpl implements ThamGiaService {
    @Autowired
    private ThamGiaDao thamGiaDao;

    public List<ThamGia> getList() {
        return thamGiaDao.getList();
    }
}
