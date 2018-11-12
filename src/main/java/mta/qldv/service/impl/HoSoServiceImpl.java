package mta.qldv.service.impl;

import mta.qldv.dao.HoSoDao;
import mta.qldv.entity.HoSo;
import mta.qldv.service.HoSoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HoSoServiceImpl implements HoSoService {

    @Autowired
    private HoSoDao hoSoDao;

    public List<HoSo> getList() {
        return hoSoDao.getList();
    }
}
