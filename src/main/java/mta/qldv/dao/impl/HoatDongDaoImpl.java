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
        try {
            List<HoatDong> listHoatDong = session.createQuery(sql).list();
            return listHoatDong;
        } catch (Exception ex){
			ex.printStackTrace();
        }
        return null;
    }

	@Override
	public boolean addHoatDong(HoatDong newHoatDong) {
		try {
			hibernateUtil.getCurrentSession().save(newHoatDong);
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean updateHoatDong(HoatDong newHoatDong) {
		try {
			Session session = hibernateUtil.getCurrentSession();
			session.update(newHoatDong);
			session.flush();
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
			String query = "from HoatDong where trangThai = 'Đã duyệt'";
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
	public HoatDong getById(Long id) {
		try {
			return (HoatDong) hibernateUtil.getCurrentSession().get(HoatDong.class, id);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
