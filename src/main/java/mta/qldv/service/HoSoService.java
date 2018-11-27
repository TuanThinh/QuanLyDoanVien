package mta.qldv.service;

import mta.qldv.dto.DiemHoSoDto;
import mta.qldv.dto.HoatDongHoSoDto;
import mta.qldv.entity.HoSo;
import mta.qldv.form.DiemHoSoForm;
import mta.qldv.form.HoatDongHoSoForm;
import org.json.JSONObject;

import java.util.List;

public interface HoSoService {
    List<HoSo> getList();
    List<HoSo> findAll();
    List<HoSo> getHoTen(String hoten);
    List<HoSo> getDiaChi(String diachi);
    List<HoSo> getChiDoan(String chidoan);
    List<HoSo> getDonVi(String donvi);

    List<Long> getVaoDoan(int startDate, int endDate);
    List<Long> getVaoDang(int startDate, int endDate);

    JSONObject getChiDoanHl(int idChiDoan, int nam);
    JSONObject getDonViHl(int idDonVi, int nam);

    List<DiemHoSoDto> getTkDanhSachDiem(DiemHoSoForm form);
    List<HoatDongHoSoDto> getTkDanhSachHoatDong(HoatDongHoSoForm form);
}
