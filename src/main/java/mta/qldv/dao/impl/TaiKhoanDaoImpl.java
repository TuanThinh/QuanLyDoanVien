package mta.qldv.dao.impl;

import mta.qldv.dao.TaiKhoanDao;
import mta.qldv.entity.TaiKhoan;
import mta.qldv.utils.HibernateUtil;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

@Repository()
public class TaiKhoanDaoImpl implements TaiKhoanDao {

    @Autowired
    private HibernateUtil hibernateUtil;

    @SuppressWarnings("unchecked")
    @Override
	public List<TaiKhoan> getList() {
        String sql = "from TaiKhoan";
        try {
            List<TaiKhoan> listTaiKhoan = hibernateUtil.getCurrentSession().createQuery(sql).list();
            return listTaiKhoan;
        } catch (Exception ex){

        }
        return null;
    }

	@Override
	public Long createAccount(TaiKhoan taiKhoan) {
		try {
			return (Long) hibernateUtil.getCurrentSession().save(taiKhoan);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

    @Override
    public TaiKhoan findByUserName(String username) {
        Session session = hibernateUtil.getCurrentSession();
        String sql = "from TaiKhoan tk where tk.tenTaiKhoan = :tenTaiKhoan";
        Query query = session.createQuery(sql).setParameter("tenTaiKhoan", username);
        TaiKhoan taiKhoan = (TaiKhoan) query.uniqueResult();
        if (taiKhoan == null) {
            return null;
        }
        return taiKhoan;
    }
}
