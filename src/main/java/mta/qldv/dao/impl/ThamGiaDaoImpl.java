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

    public List<ThamGia> getList() {
        Session session = hibernateUtil.getCurrentSession();
        String sql ="from ThamGia";
        List<ThamGia> listThamGia = session.createQuery(sql).list();
        return listThamGia;
    }
}
