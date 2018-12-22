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
        Session session = hibernateUtil.getCurrentSession();
        try {
            session.save(thamGia);
            session.flush();
            return true;
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public Boolean updateThamGia(ThamGia thamGia) {
        Session session = hibernateUtil.getCurrentSession();
        try {
            session.update(thamGia);
            session.flush();
            return true;
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public Boolean deleteThamGia(Long id) {
        Session session = hibernateUtil.getCurrentSession();
        try {
            ThamGia thamGia = (ThamGia) session.byId(ThamGia.class).load(id);
            session.delete(thamGia);
            session.flush();
            return true;
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public ThamGia getById(Long id) {
        try {
            return (ThamGia) hibernateUtil.getCurrentSession().get(ThamGia.class, id);
        } catch (Exception ex){
            ex.printStackTrace();
        }
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
