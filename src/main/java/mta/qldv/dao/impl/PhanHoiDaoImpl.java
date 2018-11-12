package mta.qldv.dao.impl;

import mta.qldv.dao.PhanHoiDao;
import mta.qldv.entity.PhanHoi;
import mta.qldv.utils.HibernateUtil;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PhanHoiDaoImpl implements PhanHoiDao {
    @Autowired
    private HibernateUtil hibernateUtil;

    public List<PhanHoi> getList() {
        Session session = hibernateUtil.getCurrentSession();
        String sql = "from PhanHoi";
        List<PhanHoi> listPhanHoi = session.createQuery(sql).list();
        return listPhanHoi;
    }
}
