package mta.qldv.dao.impl;

import mta.qldv.dao.DonViDao;
import mta.qldv.entity.ChiDoan;
import mta.qldv.entity.DonVi;
import mta.qldv.utils.HibernateUtil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DonViDaoImpl implements DonViDao {

    @Autowired
    private SessionFactory sessionFactory;
    @Autowired
	private HibernateUtil hibernateUtil;

    public List<DonVi> getList() {
        Session session = sessionFactory.getCurrentSession();
        String sql = "from DonVi dv order by dv.tenDonVi";
        List<DonVi> listDonVis = session.createQuery(sql).list();
        try {
            List<DonVi> listDonVi = session.createQuery(sql).list();
            return listDonVi;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    @Override
	public List<DonVi> getListById(int id) {
		String query = "from ChiDoan where id = " + id;
		try {
			return hibernateUtil.getCurrentSession().createQuery(query).list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
