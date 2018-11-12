package mta.qldv.dao.impl;

import mta.qldv.dao.TaiKhoanDao;
import mta.qldv.entity.TaiKhoan;
import mta.qldv.utils.HibernateUtil;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TaiKhoanDaoImpl implements TaiKhoanDao {
    @Autowired
    private HibernateUtil hibernateUtil;

    public List<TaiKhoan> getList() {
        Session session = hibernateUtil.getCurrentSession();
        String sql = "from TaiKhoan";
        List<TaiKhoan> listTaiKhoan = session.createQuery(sql).list();
        return listTaiKhoan;
    }
}
