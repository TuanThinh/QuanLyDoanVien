package mta.qldv.dao.impl;

import mta.qldv.dao.DiemDao;
import mta.qldv.dto.DiemHoSoDto;
import mta.qldv.entity.Diem;
import mta.qldv.utils.HibernateUtil;
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
    public List<Diem> getList() {
        Session session = hibernateUtil.getCurrentSession();
        String sql = "from Diem";
        try {
            List<Diem> listDiem = session.createQuery(sql).list();
            return listDiem;
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public List<DiemHoSoDto> findAll() {
        Session session = hibernateUtil.getCurrentSession();
        String sql = "select hs.ma_sv as maSv, hs.ho_ten as hoTen, hs.ngay_sinh as ngaySinh, l.ten_lop as chiDoan, k.ten_khoa as donVi, d.diem as diem, d.thoi_gian as thoiGian, d.ghi_chu as ghiChu " +
                "from ho_so hs inner join lop l on hs.id_lop = l.id " +
                "inner join khoa k on k.id = l.id_khoa " +
                "left join diem_ren_luyen d on d.id_hs = hs.id";
        try {
            List<DiemHoSoDto> listDiem = session.createSQLQuery(sql)
                    .addScalar("maSv")
                    .addScalar("hoTen")
                    .addScalar("ngaySinh")
                    .addScalar("chiDoan")
                    .addScalar("donVi")
                    .addScalar("diem")
                    .addScalar("thoiGian")
                    .addScalar("ghiChu")
                    .setResultTransformer(Transformers.aliasToBean(DiemHoSoDto.class))
                    .list();
            return listDiem;
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
}
