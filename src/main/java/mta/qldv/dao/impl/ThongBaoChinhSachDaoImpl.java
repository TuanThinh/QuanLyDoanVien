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

    @Override
    public List<ThongBaoChinhSach> getList() {
        Session session = hibernateUtil.getCurrentSession();
        String sql = "from ThongBaoChinhSach";
        try {
            List<ThongBaoChinhSach> listThongBaoChinhSach = session.createQuery(sql).list();
            return listThongBaoChinhSach;
        } catch (Exception ex){
			ex.printStackTrace();
        }
        return null;
    }

	@Override
	public boolean addThongBaoChinhsSach(ThongBaoChinhSach newTBCS) {
		try {
			hibernateUtil.getCurrentSession().persist(newTBCS);
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean updateThongBaoChinhsSach(ThongBaoChinhSach newTBCS) {
		try {
			hibernateUtil.getCurrentSession().update(newTBCS);
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean deleteThongBaoChinhsSach(ThongBaoChinhSach tBCS) {
		try {
			hibernateUtil.getCurrentSession().delete(tBCS);
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public ThongBaoChinhSach getById(Long id) {
		try{
			ThongBaoChinhSach thongBaoChinhSach=(ThongBaoChinhSach) hibernateUtil.getCurrentSession().get(ThongBaoChinhSach.class,id);
			return thongBaoChinhSach ;
		}catch (Exception e){
			e.printStackTrace();
		}
		return null;
	}
}
