package mta.qldv.dao.impl;

import mta.qldv.dao.KhenThuongKyLuatDao;
import mta.qldv.entity.KhenThuongKyLuat;
import mta.qldv.utils.HibernateUtil;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class KhenThuongKyLuatDaoImpl implements KhenThuongKyLuatDao {
    @Autowired
    private HibernateUtil hibernateUtil;

    public List<KhenThuongKyLuat> getList() {
        Session session = hibernateUtil.getCurrentSession();
        String sql = "from KhenThuongKyLuat";
        try {
            List<KhenThuongKyLuat> listKtkl = session.createQuery(sql).list();
            return listKtkl;
        } catch (Exception ex){

        }
        return null;
    }
}
