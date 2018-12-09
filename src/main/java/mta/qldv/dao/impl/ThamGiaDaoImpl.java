package mta.qldv.dao.impl;

import mta.qldv.dao.ThamGiaDao;
import mta.qldv.entity.ThamGia;
import mta.qldv.utils.HibernateUtil;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ThamGiaDaoImpl implements ThamGiaDao {
    @Autowired
    private HibernateUtil hibernateUtil;

    @Override
    public Boolean addThamGia(ThamGia thamGia) {
        return null;
    }

    @Override
    public Boolean updateThamGia(ThamGia thamGia) {
        return null;
    }

    @Override
    public Boolean deleteThamGia(Long id) {
        return null;
    }

    @Override
    public List<ThamGia> getList() {
        Session session = hibernateUtil.getCurrentSession();
        String sql ="from ThamGia";
        try {
            List<ThamGia> listThamGia = session.createQuery(sql).list();
            return listThamGia;
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
}
