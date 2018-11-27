package mta.qldv.dao.impl;

import mta.qldv.dao.ChiDoanDao;
import mta.qldv.entity.ChiDoan;
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

<<<<<<< HEAD
	@Override
	public List<ChiDoan> getList() {
		Session session = hibernateUtil.getCurrentSession();
		String sql = "select hs.chiDoan.tenChiDoan, hs.hoTen, hs.chiDoan.donVi.tenDonVi, hs.chiDoan.id "
				+ "from HoSo hs where hs.chucVu.tenChucVu = :tenChucVu "
				+ "order by hs.chiDoan.tenChiDoan";
		try {
			List<ChiDoan> listChiDoan = session.createQuery(sql).setParameter("tenChucVu", "Bí thư chi đoàn").list();
			return listChiDoan;
		} catch (Exception ex) {

		}
		return null;
	}
=======
    @Override
    public List<ChiDoan> getList() {
        Session session = hibernateUtil.getCurrentSession();
        String sql = "from ChiDoan cd order by cd.tenChiDoan";
        try {
            List<ChiDoan> listChiDoan = session.createQuery(sql).list();
            return listChiDoan;
        } catch (Exception ex){
			ex.printStackTrace();
        }
        return null;
    }
>>>>>>> refs/remotes/origin/tuanthinh

	@Override
	public boolean addChiDoan(ChiDoan newChiDoan) {
		try {
			hibernateUtil.getCurrentSession().persist(newChiDoan);
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
	public boolean deleteChiDoan(ChiDoan chiDoan) {
		try {
			hibernateUtil.getCurrentSession().delete(chiDoan);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public List<ChiDoan> getListById(int id) {
		String query = "from ChiDoan where id = " + id;
		try {
			return hibernateUtil.getCurrentSession().createQuery(query).list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
