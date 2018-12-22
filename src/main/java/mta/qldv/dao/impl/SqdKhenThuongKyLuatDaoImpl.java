package mta.qldv.dao.impl;

import mta.qldv.dao.SqdKhenThuongKyLuatDao;
import mta.qldv.entity.SqdKhenThuongKyLuat;
import mta.qldv.utils.HibernateUtil;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SqdKhenThuongKyLuatDaoImpl implements SqdKhenThuongKyLuatDao {
    @Autowired
    private HibernateUtil hibernateUtil;

    @Override
    public Boolean addSqdKhenThuongKyLuat(SqdKhenThuongKyLuat sqdKhenThuongKyLuat) {
        Session session = hibernateUtil.getCurrentSession();
        try {
            session.save(sqdKhenThuongKyLuat);
            session.flush();
            return true;
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public Boolean updateSqdKhenThuongKyLuat(SqdKhenThuongKyLuat sqdKhenThuongKyLuat) {
        Session session = hibernateUtil.getCurrentSession();
        try {
            session.update(sqdKhenThuongKyLuat);
            session.flush();
            return true;
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public Boolean deleteSqdKhenThuongKyLuat(Long id) {
        Session session = hibernateUtil.getCurrentSession();
        try {
            SqdKhenThuongKyLuat sqdKhenThuongKyLuat = (SqdKhenThuongKyLuat) session.byId(SqdKhenThuongKyLuat.class).load(id);
            session.delete(sqdKhenThuongKyLuat);
            session.flush();
            return true;
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public List<SqdKhenThuongKyLuat> getList() {
        Session session = hibernateUtil.getCurrentSession();
        String sql = "from SqdKhenThuongKyLuat";
        try {
            List<SqdKhenThuongKyLuat> listSqd = session.createQuery(sql).list();
            return listSqd;
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public SqdKhenThuongKyLuat getById(Long id) {
        try {
            SqdKhenThuongKyLuat sqdKhenThuongKyLuat = (SqdKhenThuongKyLuat) hibernateUtil.getCurrentSession().get(SqdKhenThuongKyLuat.class, id);
            return sqdKhenThuongKyLuat;
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
}
