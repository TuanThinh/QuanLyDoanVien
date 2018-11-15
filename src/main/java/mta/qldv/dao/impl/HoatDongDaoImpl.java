package mta.qldv.dao.impl;

import mta.qldv.dao.HoatDongDao;
import mta.qldv.entity.HoatDong;
import mta.qldv.utils.HibernateUtil;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class HoatDongDaoImpl implements HoatDongDao {
    @Autowired
    private HibernateUtil hibernateUtil;

    public List<HoatDong> getList() {
        Session session = hibernateUtil.getCurrentSession();
        String sql = "from HoatDong";
        try {
            List<HoatDong> listHoatDong = session.createQuery(sql).list();
            return listHoatDong;
        } catch (Exception ex){

        }
        return null;
    }
}
