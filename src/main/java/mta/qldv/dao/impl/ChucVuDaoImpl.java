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

    @Override
    public Boolean addChucVu(ChucVu chucVu) {
        return null;
    }

    @Override
    public Boolean updateChucVu(ChucVu chucVu) {
        return null;
    }

    @Override
    public Boolean deleteChucVu(Long id) {
        return null;
    }

    @Override
    public List<ChucVu> getList() {
        Session session = hibernateUtil.getCurrentSession();
        String sql = "from ChucVu";
        try {
            List<ChucVu> listChucVu = session.createQuery(sql).list();
            return listChucVu;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public ChucVu getById(Long id) {
        try {
            return (ChucVu) hibernateUtil.getCurrentSession().get(ChucVu.class, id);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
}
