package mta.qldv.dao.impl;

import mta.qldv.dao.DiemDao;
import mta.qldv.entity.Diem;
import mta.qldv.utils.HibernateUtil;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DiemDaoImpl implements DiemDao {
    @Autowired
    private HibernateUtil hibernateUtil;

    public List<Diem> getList() {
        Session session = hibernateUtil.getCurrentSession();
        String sql = "from Diem";
        List<Diem> listDiem = session.createQuery(sql).list();
        return listDiem;
    }
}
