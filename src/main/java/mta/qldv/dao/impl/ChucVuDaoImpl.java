package mta.qldv.dao.impl;

import mta.qldv.dao.ChucVuDao;
import mta.qldv.entity.ChucVu;
import mta.qldv.utils.HibernateUtil;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ChucVuDaoImpl implements ChucVuDao {
    @Autowired
    private HibernateUtil hibernateUtil;

    public List<ChucVu> getList() {
        Session session = hibernateUtil.getCurrentSession();
        String sql = "from ChucVu";
        List<ChucVu> listChucVu = session.createQuery(sql).list();
        return listChucVu;
    }
}
