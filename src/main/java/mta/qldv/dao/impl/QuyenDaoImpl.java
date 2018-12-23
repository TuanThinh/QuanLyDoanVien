package mta.qldv.dao.impl;

import mta.qldv.dao.QuyenDao;
import mta.qldv.entity.Quyen;
import mta.qldv.utils.HibernateUtil;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class QuyenDaoImpl implements QuyenDao {
    @Autowired
    private HibernateUtil hibernateUtil;

    public List<Quyen> getList() {
        Session session = hibernateUtil.getCurrentSession();
        String sql = "from Quyen";
        try {
            List<Quyen> listQuyen = session.createQuery(sql).list();
            return listQuyen;
        } catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

	@Override
	public Quyen getById(Long id) {
		try {
			return (Quyen) hibernateUtil.getCurrentSession().load(Quyen.class, id);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

    
}
