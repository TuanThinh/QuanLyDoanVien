package mta.qldv.dao.impl;

import mta.qldv.dao.ChiDoanDao;
import mta.qldv.entity.ChiDoan;
import mta.qldv.utils.HibernateUtil;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ChiDoanDaoImpl implements ChiDoanDao {
    @Autowired
    private HibernateUtil hibernateUtil;

    public List<ChiDoan> getList() {
        Session session = hibernateUtil.getCurrentSession();
        String sql = "from ChiDoan";
        List<ChiDoan> listChiDoan = session.createQuery(sql).list();
        return listChiDoan;
    }
}
