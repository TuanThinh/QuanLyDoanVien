package mta.qldv.dao.impl;

import mta.qldv.dao.BaoCaoDao;
import mta.qldv.entity.BaoCao;
import mta.qldv.utils.HibernateUtil;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BaoCaoDaoImpl implements BaoCaoDao {
    @Autowired
    private HibernateUtil hibernateUtil;

    @Override
    public Boolean addBaoCao(BaoCao baoCao) {
        return null;
    }

    @Override
    public Boolean deleteBaoCao(Long id) {
        return null;
    }

    @Override
    public List<BaoCao> getList() {
        return null;
    }
}
