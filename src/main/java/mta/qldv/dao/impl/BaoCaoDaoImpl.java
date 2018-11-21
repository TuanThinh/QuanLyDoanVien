package mta.qldv.dao.impl;

import mta.qldv.dao.BaoCaoDao;
import mta.qldv.entity.BaoCao;
import mta.qldv.utils.HibernateUtil;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BaoCaoDaoImpl implements BaoCaoDao {
    @Autowired
    private HibernateUtil hibernateUtil;

    public List<BaoCao> getList() {
        Session session = hibernateUtil.getCurrentSession();
        String sql = "from BaoCao";
        try {
            List<BaoCao> listBaoCao = session.createQuery(sql).list();
            return listBaoCao;
        } catch (Exception ex){

        }
        return null;
    }
}
