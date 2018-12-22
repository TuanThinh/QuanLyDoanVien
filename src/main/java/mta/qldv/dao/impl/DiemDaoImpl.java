package mta.qldv.dao.impl;

import mta.qldv.dao.DiemDao;
import mta.qldv.dto.DiemHoSoDto;
import mta.qldv.entity.Diem;
import mta.qldv.utils.HibernateUtil;
import mta.qldv.utils.Paging;
import org.hibernate.Session;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DiemDaoImpl implements DiemDao {
    @Autowired
    private HibernateUtil hibernateUtil;

    @Override
    public Boolean addDiem(Diem diem) {
        Session session = hibernateUtil.getCurrentSession();
        try {
            session.save(diem);
            session.flush();
            return true;
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public Boolean updateDiem(Diem diem) {
        Session session = hibernateUtil.getCurrentSession();
        try {
            session.update(diem);
            session.flush();
            return true;
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public Boolean deleteDiem(Long id) {
        Session session = hibernateUtil.getCurrentSession();
        try {
            Diem diem = (Diem) session.byId(Diem.class).load(id);
            session.delete(diem);
            session.flush();
            return true;
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public Diem getById(Long id) {
        try {
            Diem diem = (Diem) hibernateUtil.getCurrentSession().get(Diem.class, id);
            return diem;
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public List<DiemHoSoDto> getList() {
        return null;
    }
}
