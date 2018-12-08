package mta.qldv.dao.impl;

import mta.qldv.dao.DiemDao;
import mta.qldv.dto.DiemHoSoDto;
import mta.qldv.entity.Diem;
import mta.qldv.utils.HibernateUtil;
import mta.qldv.utils.Paging;
import org.hibernate.Session;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DiemDaoImpl implements DiemDao {
    @Autowired
    private HibernateUtil hibernateUtil;

    @Override
    public Boolean addDiem(Diem d) {
        return null;
    }

    @Override
    public Boolean updateDiem(Diem d) {
        return null;
    }

    @Override
    public Boolean deleteDiem(Long id) {
        return null;
    }

    @Override
    public int totalRecord(String parameter) {
        return 0;
    }

    @Override
    public List<DiemHoSoDto> getList(Paging paging) {
        return null;
    }
}
