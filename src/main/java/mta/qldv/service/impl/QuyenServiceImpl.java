package mta.qldv.service.impl;

import mta.qldv.dao.QuyenDao;
import mta.qldv.entity.Quyen;
import mta.qldv.service.QuyenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuyenServiceImpl implements QuyenService {
    @Autowired
    private QuyenDao quyenDao;

    public List<Quyen> getList() {
        return quyenDao.getList();
    }
}