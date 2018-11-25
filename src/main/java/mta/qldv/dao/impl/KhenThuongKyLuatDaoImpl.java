package mta.qldv.dao.impl;

import mta.qldv.dao.KhenThuongKyLuatDao;
import mta.qldv.dto.KhenThuongKyLuatDto;
import mta.qldv.entity.KhenThuongKyLuat;
import mta.qldv.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class KhenThuongKyLuatDaoImpl implements KhenThuongKyLuatDao {
    @Autowired
    private HibernateUtil hibernateUtil;

    @Override
    public List<KhenThuongKyLuat> getList() {
        Session session = hibernateUtil.getCurrentSession();
        String sql = "from KhenThuongKyLuat";
        try {
            List<KhenThuongKyLuat> listKtkl = session.createQuery(sql).list();
            return listKtkl;
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public List<KhenThuongKyLuatDto> findAll(){
        Session session = hibernateUtil.getCurrentSession();
        String sql = "select hs.ma_sv as maSv, hs.ho_ten as hoTen, hs.ngay_sinh as ngaySinh, l.ten_lop as chiDoan, k.ten_khoa as donVi, sqd.tieu_de as tieuDe, sqd.noi_dung as noiDung, kt.thoi_gian as thoiGian " +
                "from ho_so hs inner join lop l on hs.id_lop = l.id " +
                "inner join khoa k on k.id = l.id_khoa " +
                "inner join kt_kl kt on kt.id_hs = hs.id " +
                "inner join sqd_kt_kl sqd on sqd.id = kt.id_sqd";
        try {
            List<KhenThuongKyLuatDto> listKtkl = session.createSQLQuery(sql)
                    .addScalar("maSv")
                    .addScalar("hoTen")
                    .addScalar("ngaySinh")
                    .addScalar("chiDoan")
                    .addScalar("donVi")
                    .addScalar("tieuDe")
                    .addScalar("noiDung")
                    .addScalar("thoiGian")
                    .setFirstResult(0)
                    .setMaxResults(20)
                    .setResultTransformer(Transformers.aliasToBean(KhenThuongKyLuatDto.class))
                    .list();
            return listKtkl;
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
}