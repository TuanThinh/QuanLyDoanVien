package mta.qldv.service.impl;

import mta.qldv.dao.HoatDongDao;
import mta.qldv.entity.HoatDong;
import mta.qldv.service.HoatDongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HoatDongServiceImpl implements HoatDongService {
    @Autowired
    private HoatDongDao hoatDongDao;

    public List<HoatDong> getList() {
        return hoatDongDao.getList();
    }
}
