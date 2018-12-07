package mta.qldv.dao.impl;

import mta.qldv.dao.HoSoDao;
import mta.qldv.dto.DiemHoSoDto;
import mta.qldv.dto.HoatDongHoSoDto;
import mta.qldv.entity.HoSo;
import mta.qldv.form.DiemHoSoForm;
import mta.qldv.form.HoatDongHoSoForm;
import mta.qldv.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

@Repository
public class HoSoDaoImpl implements HoSoDao {
    @Autowired
    private HibernateUtil hibernateUtil;


    public List<HoSo> getList() {
        Session session = hibernateUtil.getCurrentSession();
        String sql = "from HoSo";
        try {
            List<HoSo> listHoSo = session.createQuery(sql).list();
            return listHoSo;
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public List<HoSo> findAll() {
        Session session = hibernateUtil.getCurrentSession();
        String sql = "from HoSo";
        try {
            List<HoSo> listHoSo = session.createQuery(sql)
                    .setFirstResult(0)
                    .setMaxResults(20)
                    .list();
            return listHoSo;
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public HoSo getId(int id) {
        String sql = "from HoSo where id = :id";
        try {
            HoSo hoSo = (HoSo) hibernateUtil.getCurrentSession().createQuery(sql).setParameter("id", id).uniqueResult();
            return hoSo;
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public List<HoSo> getHoTen(String hoten) {
        String sql = "from HoSo where hoTen like :hoten";
        try {
            List<HoSo> listHoSo = hibernateUtil.getCurrentSession().createQuery(sql).setParameter("hoten", "%" + hoten + "%").list();
            return listHoSo;
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public List<HoSo> getDiaChi(String diachi) {
        String sql = "from HoSo where diaChi like :diaChi";
        try {
            List<HoSo> listHoSo = hibernateUtil.getCurrentSession().createQuery(sql).setParameter("diaChi", "%" + diachi + "%").list();
            return listHoSo;
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public List<HoSo> getChiDoan(String chidoan) {
        String sql = "from HoSo where chiDoan.tenChiDoan like :chiDoan";
        try {
            List<HoSo> listHoSo = hibernateUtil.getCurrentSession().createQuery(sql).setParameter("chiDoan", "%" + chidoan + "%").list();
            return listHoSo;
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public List<HoSo> getDonVi(String donvi) {
        String sql = "from HoSo where chiDoan.donVi.tenDonVi like :donvi";
        try {
            List<HoSo> listHoSo = hibernateUtil.getCurrentSession().createQuery(sql).setParameter("donvi", "%" + donvi + "%").list();
            return listHoSo;
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public List<HoSo> searchHoSo(HoSo hoSo) {
        return null;
    }

    @Override
    public Long getVaoDoan(int year) {
        String sql = "select count(id) from HoSo where year(ngayVaoDoan) = :year";
        try {
            Long count = (Long) hibernateUtil.getCurrentSession().createQuery(sql).setParameter("year", year).uniqueResult();
            return count;
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public Long getVaoDang(int year) {
        String sql = "select count(id) from HoSo where year(ngayVaoDang) = :year";
        try {
            Long count = (Long) hibernateUtil.getCurrentSession().createQuery(sql).setParameter("year", year).uniqueResult();
            return count;
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public BigInteger getAllChiDoan(int idChiDoan, int nam){
        String sql = "select count(hs.id) as count from ho_so hs " +
                "inner join lop l on hs.id_lop = l.id " +
                "inner join diem_ren_luyen d on hs.id = d.id_hs " +
                "where l.id = :idChiDoan and year(d.thoi_gian) = :year";
        try {
            BigInteger count = (BigInteger) hibernateUtil.getCurrentSession().createSQLQuery(sql)
                    .addScalar("count")
                    .setParameter("idChiDoan", idChiDoan)
                    .setParameter("year", nam)
                    .uniqueResult();
            return count;
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public BigInteger getChiDoanHlXuatSac(int idChiDoan, int nam) {
        String sql = "select count(hs.id) as count from ho_so hs " +
                "inner join lop l on hs.id_lop = l.id " +
                "inner join diem_ren_luyen d on hs.id = d.id_hs " +
                "where (d.diem between 3.6 and 4.0) and l.id = :idChiDoan and year(d.thoi_gian) = :year";
        try {
            BigInteger count = (BigInteger) hibernateUtil.getCurrentSession().createSQLQuery(sql)
                    .addScalar("count")
                    .setParameter("idChiDoan", idChiDoan)
                    .setParameter("year", nam)
                    .uniqueResult();
            return count;
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public BigInteger getChiDoanHlGioi(int idChiDoan, int nam) {
        String sql = "select count(hs.id) as count from ho_so hs " +
                "inner join lop l on hs.id_lop = l.id " +
                "inner join diem_ren_luyen d on hs.id = d.id_hs " +
                "where (d.diem between 3.20 and 3.59) and l.id = :idChiDoan and year(d.thoi_gian) = :year";
        try {
            BigInteger count = (BigInteger) hibernateUtil.getCurrentSession().createSQLQuery(sql)
                    .addScalar("count")
                    .setParameter("idChiDoan", idChiDoan)
                    .setParameter("year", nam)
                    .uniqueResult();
            return count;
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public BigInteger getChiDoanHlKha(int idChiDoan, int nam) {
        String sql = "select count(hs.id) as count from ho_so hs " +
                "inner join lop l on hs.id_lop = l.id " +
                "inner join diem_ren_luyen d on hs.id = d.id_hs " +
                "where (d.diem between 2.50 and 3.19) and l.id = :idChiDoan and year(d.thoi_gian) = :year";
        try {
            BigInteger count = (BigInteger) hibernateUtil.getCurrentSession().createSQLQuery(sql)
                    .addScalar("count")
                    .setParameter("idChiDoan", idChiDoan)
                    .setParameter("year", nam)
                    .uniqueResult();
            return count;
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public BigInteger getChiDoanHlTBKha(int idChiDoan, int nam) {
        String sql = "select count(hs.id) as count from ho_so hs " +
                "inner join lop l on hs.id_lop = l.id " +
                "inner join diem_ren_luyen d on hs.id = d.id_hs " +
                "where (d.diem between 2.3 and 2.49) and l.id = :idChiDoan and year(d.thoi_gian) = :year";
        try {
            BigInteger count = (BigInteger) hibernateUtil.getCurrentSession().createSQLQuery(sql)
                    .addScalar("count")
                    .setParameter("idChiDoan", idChiDoan)
                    .setParameter("year", nam)
                    .uniqueResult();
            return count;
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public BigInteger getChiDoanHlTrungBinh(int idChiDoan, int nam) {
        String sql = "select count(hs.id) as count from ho_so hs " +
                "inner join lop l on hs.id_lop = l.id " +
                "inner join diem_ren_luyen d on hs.id = d.id_hs " +
                "where (d.diem between 2.00 and 2.29) and l.id = :idChiDoan and year(d.thoi_gian) = :year";
        try {
            BigInteger count = (BigInteger) hibernateUtil.getCurrentSession().createSQLQuery(sql)
                    .addScalar("count")
                    .setParameter("idChiDoan", idChiDoan)
                    .setParameter("year", nam)
                    .uniqueResult();
            return count;
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public BigInteger getChiDoanHlTBYeu(int idChiDoan, int nam) {
        String sql = "select count(hs.id) as count from ho_so hs " +
                "inner join lop l on hs.id_lop = l.id " +
                "inner join diem_ren_luyen d on hs.id = d.id_hs " +
                "where (d.diem between 1.50 and 1.99) and l.id = :idChiDoan and year(d.thoi_gian) = :year";
        try {
            BigInteger count = (BigInteger) hibernateUtil.getCurrentSession().createSQLQuery(sql)
                    .addScalar("count")
                    .setParameter("idChiDoan", idChiDoan)
                    .setParameter("year", nam)
                    .uniqueResult();
            return count;
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public BigInteger getChiDoanHlYeu(int idChiDoan, int nam) {
        String sql = "select count(hs.id) as count from ho_so hs " +
                "inner join lop l on hs.id_lop = l.id " +
                "inner join diem_ren_luyen d on hs.id = d.id_hs " +
                "where (d.diem between 1.00 and 1.49) and l.id = :idChiDoan and year(d.thoi_gian) = :year";
        try {
            BigInteger count = (BigInteger) hibernateUtil.getCurrentSession().createSQLQuery(sql)
                    .addScalar("count")
                    .setParameter("idChiDoan", idChiDoan)
                    .setParameter("year", nam)
                    .uniqueResult();
            return count;
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public BigInteger getChiDoanHlKem(int idChiDoan, int nam) {
        String sql = "select count(hs.id) as count from ho_so hs " +
                "inner join lop l on hs.id_lop = l.id " +
                "inner join diem_ren_luyen d on hs.id = d.id_hs " +
                "where d.diem < 1.00 and l.id = :idChiDoan and year(d.thoi_gian) = :year";
        try {
            BigInteger count = (BigInteger) hibernateUtil.getCurrentSession().createSQLQuery(sql)
                    .addScalar("count")
                    .setParameter("idChiDoan", idChiDoan)
                    .setParameter("year", nam)
                    .uniqueResult();
            return count;
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public BigInteger getAllDonVi(int idDonVi, int nam){
        String sql = "select count(hs.id) as count from ho_so hs " +
                "inner join lop l on hs.id_lop = l.id " +
                "inner join khoa k on l.id_khoa = k.id " +
                "inner join diem_ren_luyen d on hs.id = d.id_hs " +
                "where k.id = :idDonVi and year(d.thoi_gian) = :year";
        try {
            BigInteger count = (BigInteger) hibernateUtil.getCurrentSession().createSQLQuery(sql)
                    .addScalar("count")
                    .setParameter("idDonVi", idDonVi)
                    .setParameter("year", nam)
                    .uniqueResult();
            return count;
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public BigInteger getDonViHlXuatSac(int idDonVi, int nam) {
        String sql = "select count(hs.id) as count from ho_so hs " +
                "inner join lop l on hs.id_lop = l.id " +
                "inner join khoa k on l.id_khoa = k.id " +
                "inner join diem_ren_luyen d on hs.id = d.id_hs " +
                "where (d.diem between 3.6 and 4.0) and k.id = :idDonVi and year(d.thoi_gian) = :year";
        try {
            BigInteger count = (BigInteger) hibernateUtil.getCurrentSession().createSQLQuery(sql)
                    .addScalar("count")
                    .setParameter("idDonVi", idDonVi)
                    .setParameter("year", nam)
                    .uniqueResult();
            return count;
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public BigInteger getDonViHlGioi(int idDonVi, int nam) {
        String sql = "select count(hs.id) as count from ho_so hs " +
                "inner join lop l on hs.id_lop = l.id " +
                "inner join khoa k on l.id_khoa = k.id " +
                "inner join diem_ren_luyen d on hs.id = d.id_hs " +
                "where (d.diem between 3.20 and 3.59) and k.id = :idDonVi and year(d.thoi_gian) = :year";
        try {
            BigInteger count = (BigInteger) hibernateUtil.getCurrentSession().createSQLQuery(sql)
                    .addScalar("count")
                    .setParameter("idDonVi", idDonVi)
                    .setParameter("year", nam)
                    .uniqueResult();
            return count;
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public BigInteger getDonViHlKha(int idDonVi, int nam) {
        String sql = "select count(hs.id) as count from ho_so hs " +
                "inner join lop l on hs.id_lop = l.id " +
                "inner join khoa k on l.id_khoa = k.id " +
                "inner join diem_ren_luyen d on hs.id = d.id_hs " +
                "where (d.diem between 2.50 and 3.19) and k.id = :idDonVi and year(d.thoi_gian) = :year";
        try {
            BigInteger count = (BigInteger) hibernateUtil.getCurrentSession().createSQLQuery(sql)
                    .addScalar("count")
                    .setParameter("idDonVi", idDonVi)
                    .setParameter("year", nam)
                    .uniqueResult();
            return count;
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public BigInteger getDonViHlTBKha(int idDonVi, int nam) {
        String sql = "select count(hs.id) as count from ho_so hs " +
                "inner join lop l on hs.id_lop = l.id " +
                "inner join khoa k on l.id_khoa = k.id " +
                "inner join diem_ren_luyen d on hs.id = d.id_hs " +
                "where (d.diem between 2.30 and 2.49) and k.id = :idDonVi and year(d.thoi_gian) = :year";
        try {
            BigInteger count = (BigInteger) hibernateUtil.getCurrentSession().createSQLQuery(sql)
                    .addScalar("count")
                    .setParameter("idDonVi", idDonVi)
                    .setParameter("year", nam)
                    .uniqueResult();
            return count;
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public BigInteger getDonViHlTrungBinh(int idDonVi, int nam) {
        String sql = "select count(hs.id) as count from ho_so hs " +
                "inner join lop l on hs.id_lop = l.id " +
                "inner join khoa k on l.id_khoa = k.id " +
                "inner join diem_ren_luyen d on hs.id = d.id_hs " +
                "where (d.diem between 2.00 and 2.29) and k.id = :idDonVi and year(d.thoi_gian) = :year";
        try {
            BigInteger count = (BigInteger) hibernateUtil.getCurrentSession().createSQLQuery(sql)
                    .addScalar("count")
                    .setParameter("idDonVi", idDonVi)
                    .setParameter("year", nam)
                    .uniqueResult();
            return count;
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public BigInteger getDonViHlTBYeu(int idDonVi, int nam) {
        String sql = "select count(hs.id) as count from ho_so hs " +
                "inner join lop l on hs.id_lop = l.id " +
                "inner join khoa k on l.id_khoa = k.id " +
                "inner join diem_ren_luyen d on hs.id = d.id_hs " +
                "where (d.diem between 1.50 and 1.99) and k.id = :idDonVi and year(d.thoi_gian) = :year";
        try {
            BigInteger count = (BigInteger) hibernateUtil.getCurrentSession().createSQLQuery(sql)
                    .addScalar("count")
                    .setParameter("idDonVi", idDonVi)
                    .setParameter("year", nam)
                    .uniqueResult();
            return count;
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public BigInteger getDonViHlYeu(int idDonVi, int nam) {
        String sql = "select count(hs.id) as count from ho_so hs " +
                "inner join lop l on hs.id_lop = l.id " +
                "inner join khoa k on l.id_khoa = k.id " +
                "inner join diem_ren_luyen d on hs.id = d.id_hs " +
                "where (d.diem between 1.00 and 1.49) and k.id = :idDonVi and year(d.thoi_gian) = :year";
        try {
            BigInteger count = (BigInteger) hibernateUtil.getCurrentSession().createSQLQuery(sql)
                    .addScalar("count")
                    .setParameter("idDonVi", idDonVi)
                    .setParameter("year", nam)
                    .uniqueResult();
            return count;
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public BigInteger getDonViHlKem(int idDonVi, int nam) {
        String sql = "select count(hs.id) as count from ho_so hs " +
                "inner join lop l on hs.id_lop = l.id " +
                "inner join khoa k on l.id_khoa = k.id " +
                "inner join diem_ren_luyen d on hs.id = d.id_hs " +
                "where d.diem < 1.00 and k.id = :idDonVi and year(d.thoi_gian) = :year";
        try {
            BigInteger count = (BigInteger) hibernateUtil.getCurrentSession().createSQLQuery(sql)
                    .addScalar("count")
                    .setParameter("idDonVi", idDonVi)
                    .setParameter("year", nam)
                    .uniqueResult();
            return count;
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    public List<DiemHoSoDto> getTkDanhSachDiem(DiemHoSoForm form){
        StringBuilder str = new StringBuilder();
        str.append("select hs.ma_sv as maSv, hs.ho_ten as hoTen, hs.ngay_sinh as ngaySinh, l.ten_lop as chiDoan, k.ten_khoa as donVi, d.diem as diem, d.thoi_gian as thoiGian, d.ghi_chu as ghiChu " +
                "from ho_so as hs inner join lop as l on l.id = hs.id_lop " +
                "inner join khoa as k on k.id = l.id_khoa " +
                "inner join diem_ren_luyen as d on d.id_hs = hs.id " +
                "where year(d.thoi_gian) = " + form.getThoiGian() + " ");
        if(!form.getHocLuc().equals("NaN")){
            if(form.getHocLuc().equals("XS")){
                str.append("and (d.diem between 3.6 and 4.0) ");
            } else if(form.getHocLuc().equals("G")){
                str.append("and (d.diem between 3.2 and 3.59) ");
            } else if(form.getHocLuc().equals("K")){
                str.append("and (d.diem between 2.5 and 3.19) ");
            } else if(form.getHocLuc().equals("TBK")){
                str.append("and (d.diem between 2.3 and 2.49) ");
            } else if(form.getHocLuc().equals("TB")){
                str.append("and (d.diem between 2.0 and 2.29) ");
            } else if(form.getHocLuc().equals("TBY")){
                str.append("and (d.diem between 1.5 and 1.99) ");
            } else if(form.getHocLuc().equals("Y")){
                str.append("and (d.diem between 1.0 and 1.49) ");
            } else {
                str.append("and d.diem < 1.0 ");
            }
        }

        if(form.getIdChiDoan() != -1){
            str.append("and l.id = " + form.getIdChiDoan() + " ");
        }

        if(form.getIdDonVi() != -1){
            str.append("and k.id = " + form.getIdDonVi() + " ");
        }
        str.append("order by d.diem desc");
        String sql = str.toString();
        try {
            List<DiemHoSoDto> listDs = hibernateUtil.getCurrentSession()
                    .createSQLQuery(sql)
                    .addScalar("maSv")
                    .addScalar("hoTen")
                    .addScalar("ngaySinh")
                    .addScalar("chiDoan")
                    .addScalar("donVi")
                    .addScalar("diem")
                    .addScalar("thoiGian")
                    .addScalar("ghiChu")
                    .setFirstResult(0)
                    .setMaxResults(form.getSoLuong())
                    .setResultTransformer(Transformers.aliasToBean(DiemHoSoDto.class))
                    .list();
            return listDs;
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    public List<HoatDongHoSoDto> getTkDanhSachHoatDong(HoatDongHoSoForm form){
        StringBuilder str = new StringBuilder();
        str.append("select hs.ma_sv as maSv, hs.ho_ten as hoTen, hs.ngay_sinh as ngaySinh, l.ten_lop as chiDoan, k.ten_khoa as donVi, year(hd.thoi_gian) as thoiGian, count(tg.id_hd) as soLuong " +
                "from ho_so as hs inner join lop as l on l.id = hs.id_lop " +
                "inner join khoa as k on k.id = l.id_khoa " +
                "inner join tham_gia as tg on tg.id_hs = hs.id " +
                "inner join hoat_dong as hd on hd.id = tg.id_hd " +
                "where year(hd.thoi_gian) = " + form.getThoiGian() + " ");

        if(form.getIdChiDoan() != -1){
            str.append("and l.id = " + form.getIdChiDoan() + " ");
        }

        if(form.getIdDonVi() != -1){
            str.append("and k.id = " + form.getIdDonVi() + " ");
        }
        str.append("group by maSv ");
        str.append("order by soLuong desc");
        String sql = str.toString();
        try {
            List<HoatDongHoSoDto> listHd = hibernateUtil.getCurrentSession()
                    .createSQLQuery(sql)
                    .addScalar("maSv")
                    .addScalar("hoTen")
                    .addScalar("ngaySinh")
                    .addScalar("chiDoan")
                    .addScalar("donVi")
                    .addScalar("thoiGian")
                    .addScalar("soLuong")
                    .setFirstResult(0)
                    .setMaxResults(form.getSoLuong())
                    .setResultTransformer(Transformers.aliasToBean(HoatDongHoSoDto.class))
                    .list();
            return listHd;
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

	@Override
	public List<HoSo> getHoSoById(Long idHoSo) {
		try {
			String queryString = "from HoSo where id = :id";
			List<HoSo> hoSo = hibernateUtil.getCurrentSession()
					.createQuery(queryString)
					.setParameter("id", idHoSo)
					.list();
			return hoSo;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean updateTaiKhoan(HoSo hoSo) {
		try {
			Session session = hibernateUtil.getCurrentSession();
			session.update(hoSo);
			session.flush();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
