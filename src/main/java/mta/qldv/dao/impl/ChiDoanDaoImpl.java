package mta.qldv.dao.impl;

import mta.qldv.dao.ChiDoanDao;
import mta.qldv.entity.ChiDoan;
import mta.qldv.entity.DonVi;
import mta.qldv.utils.HibernateUtil;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ChiDoanDaoImpl implements ChiDoanDao {
	@Autowired
	private HibernateUtil hibernateUtil;

	@Override
	public List<ChiDoan> getList() {
		Session session = hibernateUtil.getCurrentSession();
		String sql = "from ChiDoan";
		try {
			List<ChiDoan> listChiDoan = session.createQuery(sql).list();
			return listChiDoan;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}


	@Override
	public ChiDoan getChiDoanById(Long id) {
//		String query = "from ChiDoan where id = " + id;
		try {
			return (ChiDoan) hibernateUtil.getCurrentSession().get(ChiDoan.class, id);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

    @Override
    public DonVi getDonVi(Long idChiDoan) {
	    String sql = "select cd.donVi from ChiDoan cd where cd.id = :idChiDoan";
	    try {
	        DonVi donVi = (DonVi) hibernateUtil.getCurrentSession().createQuery(sql)
                    .setParameter("idChiDoan", idChiDoan)
                    .uniqueResult();
	        return donVi;
        } catch (Exception ex){
	        ex.printStackTrace();
        }
        return null;
    }

    @Override
	public boolean addChiDoan(ChiDoan newChiDoan) {
		try {
			hibernateUtil.getCurrentSession().save(newChiDoan);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean updateChiDoan(ChiDoan newChiDoan) {
		try {
			hibernateUtil.getCurrentSession().update(newChiDoan);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean deleteChiDoan(Long id) {
		Session session = hibernateUtil.getCurrentSession();
		try {
			ChiDoan chiDoan = (ChiDoan) session.byId(ChiDoan.class).load(id);
			session.delete(chiDoan);
			session.flush();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
