package mta.qldv.dao.impl;

import mta.qldv.dao.HoSoDao;
import mta.qldv.entity.HoSo;
import mta.qldv.utils.HibernateUtil;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class HoSoDaoImpl implements HoSoDao {
    @Autowired
    private HibernateUtil hibernateUtil;


    public List<HoSo> getList() {
        Session session = hibernateUtil.getCurrentSession();
        String sql = "from HoSo";
        try {
            List<HoSo> listHoSo = session.createQuery(sql).list();
            return listHoSo;
        } catch (Exception ex){

        }
        return null;
    }
}
