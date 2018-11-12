package mta.qldv.service.impl;

import mta.qldv.dao.ChiDoanDao;
import mta.qldv.entity.ChiDoan;
import mta.qldv.service.ChiDoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChiDoanServiceImpl implements ChiDoanService {
    @Autowired
    private ChiDoanDao chiDoanDao;

    public List<ChiDoan> getList() {
        return chiDoanDao.getList();
    }
}
