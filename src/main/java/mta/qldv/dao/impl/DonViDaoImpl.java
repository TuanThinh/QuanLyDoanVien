package mta.qldv.dao.impl;

import mta.qldv.dao.DonViDao;
import mta.qldv.entity.DonVi;
import mta.qldv.utils.HibernateUtil;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DonViDaoImpl implements DonViDao {

    @Autowired
    private HibernateUtil hibernateUtil;

        public List<DonVi> getList() {
        Session session = hibernateUtil.getCurrentSession();
        String sql = "from DonVi";
        List<DonVi> listDonVi = session.createQuery(sql).list();
        return listDonVi;
    }
}
