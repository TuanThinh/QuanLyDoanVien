package mta.qldv.service.impl;

import mta.qldv.dao.BaoCaoDao;
import mta.qldv.entity.BaoCao;
import mta.qldv.service.BaoCaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaoCaoServiceImpl implements BaoCaoService {
    @Autowired
    private BaoCaoDao baoCaoDao;

    public List<BaoCao> getList() {
        return baoCaoDao.getList();
    }
}
