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
}
