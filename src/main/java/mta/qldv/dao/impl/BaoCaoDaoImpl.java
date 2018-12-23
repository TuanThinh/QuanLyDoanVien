package mta.qldv.dao.impl;

import mta.qldv.dao.BaoCaoDao;
import mta.qldv.dao.HoSoDao;
import mta.qldv.entity.BaoCao;
import mta.qldv.security.CustomUserDetail;
import mta.qldv.utils.HibernateUtil;
import mta.qldv.utils.Paging;
import mta.qldv.utils.SecurityUtil;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BaoCaoDaoImpl implements BaoCaoDao {
    @Autowired
    private HibernateUtil hibernateUtil;
    @Autowired
    private HoSoDao hoSoDao;

    @Override
    public Boolean addBaoCao(BaoCao baoCao) {
        Session session = hibernateUtil.getCurrentSession();
        try {
            session.save(baoCao);
            session.flush();
            return true;
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public Boolean deleteBaoCao(Long id) {
        Session session = hibernateUtil.getCurrentSession();
        try {
            BaoCao baoCao = (BaoCao) session.byId(BaoCao.class).load(id);
            session.delete(baoCao);
            session.flush();
            return true;
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public int totalRecord(String parameter) {
        return 0;
    }

    @Override
    public List<BaoCao> getList(Long idHoSo) {
        if(idHoSo == -1){
            CustomUserDetail userDetail = SecurityUtil.getCurrentUser();
            idHoSo = hoSoDao.getCurrentIdHoSo(userDetail.getUsername());
        }
        String sql = "from BaoCao as bc where bc.hoSo.id = :idHoSo";
        try {
            List<BaoCao> listBaoCao = hibernateUtil.getCurrentSession().createQuery(sql)
                    .setParameter("idHoSo", idHoSo)
                    .list();
            return listBaoCao;
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public BaoCao getById(Long id) {
        try {
            return (BaoCao) hibernateUtil.getCurrentSession().get(BaoCao.class, id);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
}
