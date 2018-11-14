package mta.qldv.dao.impl;

import mta.qldv.dao.HoatDongDao;
import mta.qldv.entity.HoatDong;
import mta.qldv.utils.HibernateUtil;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class HoatDongDaoImpl implements HoatDongDao {
    @Autowired
    private HibernateUtil hibernateUtil;

	@SuppressWarnings("unchecked")
	@Override
    public List<HoatDong> getList() {
        Session session = hibernateUtil.getCurrentSession();
        String sql = "from HoatDong";
        List<HoatDong> listHoatDong = session.createQuery(sql).list();
        return listHoatDong;
    }

	@Override
	public boolean addHoatDong(HoatDong newHoatDong) {
		try {
			hibernateUtil.getCurrentSession().persist(newHoatDong);
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean updateHoatDong(HoatDong newHoatDong) {
		try {
			hibernateUtil.getCurrentSession().update(newHoatDong);
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean deleteHoatDong(HoatDong hoatDong) {
		try {
			hibernateUtil.getCurrentSession().delete(hoatDong);
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<HoatDong> getPendingList() {
		try {
			String query = "from HoatDong where trangThai = 'Chờ duyệt'";
			return hibernateUtil.getCurrentSession().createQuery(query).list();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<HoatDong> getApprovedList() {
		try {
			String query = "from HoatDong where trangThai = 'Chấp nhận'";
			return hibernateUtil.getCurrentSession().createQuery(query).list();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<HoatDong> getDeniedList() {
		try {
			String query = "from HoatDong where trangThai = 'Hủy bỏ'";
			return hibernateUtil.getCurrentSession().createQuery(query).list();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public HoatDong getHoatDongById(int id) {
		try {
			String query = "from HoatDong where id = " + id;
			return (HoatDong) hibernateUtil.getCurrentSession().createQuery(query);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
