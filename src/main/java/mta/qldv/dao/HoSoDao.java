package mta.qldv.dao;

import mta.qldv.dto.DiemHoSoDto;
import mta.qldv.dto.DiemHoSoIdDto;
import mta.qldv.dto.HoatDongHoSoDto;
import mta.qldv.dto.KtklHoSoId;
import mta.qldv.entity.HoSo;
import mta.qldv.form.DiemHoSoForm;
import mta.qldv.form.HoatDongHoSoForm;
import mta.qldv.utils.Paging;

import java.math.BigInteger;
import java.util.List;

public interface HoSoDao {
    Boolean addHoSo(HoSo hs);
    Boolean updateHoSo(HoSo hs);
    Boolean deleteHoSo(Long id);

    int totalRecord(String parameter);
    List<HoSo> getList(Paging paging);

    Long getCurrentIdHoSo(String tenTaiKhoan);
    HoSo getHoSoById(Long id);
    List<DiemHoSoIdDto> getDiemHoSoId(Long id);
    List<KtklHoSoId> getKtklHoSoId(Long id);

    List<HoSo> getHoTen(String hoten);
    List<HoSo> getDiaChi(String diachi);
    List<HoSo> getChiDoan(String chidoan);
    List<HoSo> getDonVi(String donvi);
    List<HoSo> searchHoSo(HoSo hoSo);

    Long getVaoDoan(int nam);
    Long getVaoDang(int nam);

    BigInteger getAllChiDoan(int idChiDoan, int nam);
    BigInteger getChiDoanHlXuatSac(int idChiDoan, int nam);
    BigInteger getChiDoanHlGioi(int idChiDoan, int nam);
    BigInteger getChiDoanHlKha(int idChiDoan, int nam);
    BigInteger getChiDoanHlTBKha(int idChiDoan, int nam);
    BigInteger getChiDoanHlTrungBinh(int idChiDoan, int nam);
    BigInteger getChiDoanHlTBYeu(int idChiDoan, int nam);
    BigInteger getChiDoanHlYeu(int idChiDoan, int nam);
    BigInteger getChiDoanHlKem(int idChiDoan, int nam);

    BigInteger getAllDonVi(int idDonVi, int nam);
    BigInteger getDonViHlXuatSac(int idDonVi, int nam);
    BigInteger getDonViHlGioi(int idDonVi, int nam);
    BigInteger getDonViHlKha(int idDonVi, int nam);
    BigInteger getDonViHlTBKha(int idDonVi, int nam);
    BigInteger getDonViHlTrungBinh(int idDonVi, int nam);
    BigInteger getDonViHlTBYeu(int idDonVi, int nam);
    BigInteger getDonViHlYeu(int idDonVi, int nam);
    BigInteger getDonViHlKem(int idDonVi, int nam);

    List<DiemHoSoDto> getTkDanhSachDiem(DiemHoSoForm form);
    List<HoatDongHoSoDto> getTkDanhSachHoatDong(HoatDongHoSoForm form);

//	List<HoSo> getHoSoById(Long idHoSo);
	boolean updateTaiKhoan(HoSo hoSo);
	List<HoSo> getListInAdmin();
	List<HoSo> getByChiDoanId(Long id);
}
