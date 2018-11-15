package mta.qldv.dao.impl;

import mta.qldv.dao.ThongBaoChinhSachDao;
import mta.qldv.entity.ThongBaoChinhSach;
import mta.qldv.utils.HibernateUtil;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ThongBaoChinhSachDaoImpl implements ThongBaoChinhSachDao {
    @Autowired
    private HibernateUtil hibernateUtil;

    public List<ThongBaoChinhSach> getList() {
        Session session = hibernateUtil.getCurrentSession();
        String sql = "from ThongBaoChinhSach";
        try {
            List<ThongBaoChinhSach> listThongBaoChinhSach = session.createQuery(sql).list();
            return listThongBaoChinhSach;
        } catch (Exception ex){

        }
        return null;
    }
}
