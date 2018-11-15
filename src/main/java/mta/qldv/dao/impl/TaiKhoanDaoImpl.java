package mta.qldv.dao.impl;

import mta.qldv.dao.TaiKhoanDao;
import mta.qldv.entity.TaiKhoan;
import mta.qldv.utils.HibernateUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("taiKhoanDao")
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
	public boolean createAccount(TaiKhoan newAccount) {
		try {
			hibernateUtil.getCurrentSession().persist(newAccount);
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
