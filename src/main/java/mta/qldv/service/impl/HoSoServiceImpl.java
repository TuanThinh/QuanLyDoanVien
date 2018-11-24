package mta.qldv.service.impl;

import mta.qldv.dao.HoSoDao;
import mta.qldv.dto.DiemHoSoDto;
import mta.qldv.dto.HoatDongHoSoDto;
import mta.qldv.entity.HoSo;
import mta.qldv.form.DiemHoSoForm;
import mta.qldv.form.HoatDongHoSoForm;
import mta.qldv.service.HoSoService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HoSoServiceImpl implements HoSoService {

    @Autowired
    private HoSoDao hoSoDao;

    @Override
    public List<HoSo> getList() {
        return hoSoDao.getList();
    }

    @Override
    public List<HoSo> findAll(){
        return hoSoDao.findAll();
    }

    @Override
    public List<HoSo> getHoTen(String hoten) {
        return hoSoDao.getHoTen(hoten);
    }

    @Override
    public List<HoSo> getDiaChi(String diachi) {
        return hoSoDao.getDiaChi(diachi);
    }

    @Override
    public List<HoSo> getChiDoan(String chidoan) {
        return hoSoDao.getChiDoan(chidoan);
    }

    @Override
    public List<HoSo> getDonVi(String donvi) {
        return hoSoDao.getDonVi(donvi);
    }

    @Override
    public List<Long> getVaoDoan(int startDate, int endDate) {
        List<Long> list = new ArrayList<>();
        for (int i = startDate; i <= endDate; i++){
            Long temp = hoSoDao.getVaoDoan(i);
            list.add(temp);
        }
        return list;
    }

    @Override
    public List<Long> getVaoDang(int startDate, int endDate) {
        List<Long> list = new ArrayList<>();
        for (int i = startDate; i <= endDate; i++){
            Long temp = hoSoDao.getVaoDang(i);
            list.add(temp);
        }
        return list;
    }

    public double formatRound(double a){
        return (double) Math.round(a * 100) / 100;
    }

    @Override
    public JSONObject getChiDoanHl(int idChiDoan, int nam) {
        JSONObject jsonObject = new JSONObject();
        double all = hoSoDao.getAllChiDoan(idChiDoan, nam).doubleValue();
        double countXuatSac = hoSoDao.getChiDoanHlXuatSac(idChiDoan, nam).doubleValue();
        double countGioi = hoSoDao.getChiDoanHlGioi(idChiDoan, nam).doubleValue();
        double countKha = hoSoDao.getChiDoanHlKha(idChiDoan, nam).doubleValue();
        double countTbKha = hoSoDao.getChiDoanHlTBKha(idChiDoan, nam).doubleValue();
        double countTrungBinh = hoSoDao.getChiDoanHlTrungBinh(idChiDoan, nam).doubleValue();
        double countTbYeu = hoSoDao.getChiDoanHlTBYeu(idChiDoan, nam).doubleValue();
        double countYeu = hoSoDao.getChiDoanHlYeu(idChiDoan, nam).doubleValue();
        double countKem = hoSoDao.getChiDoanHlKem(idChiDoan, nam).doubleValue();

        double xuatSac = formatRound((countXuatSac * 100) / all);
        double gioi = formatRound((countGioi * 100) / all);
        double kha = formatRound((countKha * 100) / all);
        double tbKha = formatRound((countTbKha * 100) / all);
        double trungBinh = formatRound((countTrungBinh * 100) / all);
        double tbYeu = formatRound((countTbYeu * 100) / all);
        double yeu = formatRound((countYeu * 100) / all);
        double kem = formatRound((countKem * 100) / all);

        jsonObject.put("xuatSac", xuatSac);
        jsonObject.put("gioi", gioi);
        jsonObject.put("kha", kha);
        jsonObject.put("tbKha", tbKha);
        jsonObject.put("trungBinh", trungBinh);
        jsonObject.put("tbYeu", tbYeu);
        jsonObject.put("yeu", yeu);
        jsonObject.put("kem", kem);

        return jsonObject;
    }

    @Override
    public JSONObject getDonViHl(int idDonVi, int nam) {
        JSONObject jsonObject = new JSONObject();
        double all = hoSoDao.getAllDonVi(idDonVi, nam).doubleValue();
        double countXuatSac = hoSoDao.getDonViHlXuatSac(idDonVi, nam).doubleValue();
        double countGioi = hoSoDao.getDonViHlGioi(idDonVi, nam).doubleValue();
        double countKha = hoSoDao.getDonViHlKha(idDonVi, nam).doubleValue();
        double countTbKha = hoSoDao.getDonViHlTBKha(idDonVi, nam).doubleValue();
        double countTrungBinh = hoSoDao.getDonViHlTrungBinh(idDonVi, nam).doubleValue();
        double countTbYeu = hoSoDao.getDonViHlTBYeu(idDonVi, nam).doubleValue();
        double countYeu = hoSoDao.getDonViHlYeu(idDonVi, nam).doubleValue();
        double countKem = hoSoDao.getDonViHlKem(idDonVi, nam).doubleValue();

        double xuatSac = formatRound((countXuatSac * 100) / all);
        double gioi = formatRound((countGioi * 100) / all);
        double kha = formatRound((countKha * 100) / all);
        double tbKha = formatRound((countTbKha * 100) / all);
        double trungBinh = formatRound((countTrungBinh * 100) / all);
        double tbYeu = formatRound((countTbYeu * 100) / all);
        double yeu = formatRound((countYeu * 100) / all);
        double kem = formatRound((countKem * 100) / all);

        jsonObject.put("xuatSac", xuatSac);
        jsonObject.put("gioi", gioi);
        jsonObject.put("kha", kha);
        jsonObject.put("tbKha", tbKha);
        jsonObject.put("trungBinh", trungBinh);
        jsonObject.put("tbYeu", tbYeu);
        jsonObject.put("yeu", yeu);
        jsonObject.put("kem", kem);

        return jsonObject;
    }

    @Override
    public List<DiemHoSoDto> getTkDanhSachDiem(DiemHoSoForm form){
        return hoSoDao.getTkDanhSachDiem(form);
    }

    @Override
    public List<HoatDongHoSoDto> getTkDanhSachHoatDong(HoatDongHoSoForm form){
        return hoSoDao.getTkDanhSachHoatDong(form);
    }
}
