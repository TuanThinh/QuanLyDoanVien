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

    @Override
    public List<PhanHoi> getList() {
        Session session = hibernateUtil.getCurrentSession();
        String sql = "from PhanHoi";
        try {
            List<PhanHoi> listPhanHoi = session.createQuery(sql).list();
            return listPhanHoi;
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public Boolean addPhanHoi(PhanHoi phanHoi) {
        try {
            hibernateUtil.getCurrentSession().save(phanHoi);
            return true;
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public Boolean deletePhanHoi(Long id) {
        return null;
    }
}
