package mta.qldv.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mta.qldv.dao.TaiKhoanQuyenDao;
import mta.qldv.entity.TaiKhoanQuyen;
import mta.qldv.utils.HibernateUtil;

@Repository
public class TaiKhoanQuyenDaoImpl implements TaiKhoanQuyenDao{
	@Autowired
	private HibernateUtil hibernateUtil;
	
	@Override
	public Long addTaiKhoanQuyen(TaiKhoanQuyen taiKhoanQuyen) {
		try {
			return (Long) hibernateUtil.getCurrentSession().save(taiKhoanQuyen);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
