package mta.qldv.service.impl;

import mta.qldv.dao.ChiDoanDao;
import mta.qldv.dao.ChucVuDao;
import mta.qldv.dao.DonViDao;
import mta.qldv.dao.HoSoDao;
import mta.qldv.dto.DiemHoSoDto;
import mta.qldv.dto.DiemHoSoIdDto;
import mta.qldv.dto.HoatDongHoSoDto;
import mta.qldv.dto.KtklHoSoId;
import mta.qldv.entity.*;
import mta.qldv.form.HoSoForm;
import mta.qldv.form.DiemHoSoForm;
import mta.qldv.form.HoatDongHoSoForm;
import mta.qldv.service.HoSoService;
import mta.qldv.utils.Paging;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HoSoServiceImpl implements HoSoService {

    @Autowired
    private HoSoDao hoSoDao;
    @Autowired
    private DonViDao donViDao;
    @Autowired
    private ChiDoanDao chiDoanDao;
    @Autowired
    private ChucVuDao chucVuDao;

    @Override
    public Boolean addHoSo(HoSoForm form) {
        DonVi donVi = new DonVi();
        donVi.setId(form.getIdDonVi());
        ChiDoan chiDoan = new ChiDoan();
        chiDoan.setId(form.getIdChiDoan());
        chiDoan.setDonVi(donVi);
        ChucVu chucVu = new ChucVu();
        chucVu.setId(form.getIdChucVu());
        HoSo hoSo = new HoSo();
        hoSo.setHinhAnh(form.getHinhAnh());
        hoSo.setMaSv(form.getMaSv());
        hoSo.setHoTen(form.getHoTen());
        hoSo.setNgaySinh(form.getNgaySinh());
        hoSo.setGioiTinh(form.getGioiTinh()!=0);
        hoSo.setDiaChi(form.getDiaChi());
        hoSo.setChiDoan(chiDoan);
        hoSo.setChucVu(chucVu);
        hoSo.setSdt(form.getSoDienThoai());
        hoSo.setEmail(form.getEmail());
        hoSo.setNgayVaoDoan(form.getNgayVaoDoan());
        hoSo.setNgayVaoDang(form.getNgayVaoDang());
        hoSo.setDanToc(form.getDanToc());
        hoSo.setQuocTich(form.getQuocTich());
        hoSo.setTonGiao(form.getTonGiao());
        hoSo.setDoiTuongChinhSach(form.getDoiTuongChinhSach());
        Boolean check = hoSoDao.addHoSo(hoSo);
        return check;
    }

    @Override
    public Boolean updateHoSo(HoSoForm form) {
        DonVi donVi = donViDao.getById(form.getIdDonVi());
        ChiDoan chiDoan = chiDoanDao.getChiDoanById(form.getIdChiDoan());
        chiDoan.setDonVi(donVi);
        ChucVu chucVu = chucVuDao.getById(form.getIdChucVu());
        HoSo hoSo = hoSoDao.getHoSoById(form.getId());
        hoSo.setHinhAnh(form.getHinhAnh());
        hoSo.setMaSv(form.getMaSv());
        hoSo.setHoTen(form.getHoTen());
        hoSo.setNgaySinh(form.getNgaySinh());
        hoSo.setGioiTinh(form.getGioiTinh()!=0);
        hoSo.setDiaChi(form.getDiaChi());
        hoSo.setChiDoan(chiDoan);
        hoSo.setChucVu(chucVu);
        hoSo.setSdt(form.getSoDienThoai());
        hoSo.setEmail(form.getEmail());
        hoSo.setNgayVaoDoan(form.getNgayVaoDoan());
        hoSo.setNgayVaoDang(form.getNgayVaoDang());
        hoSo.setDanToc(form.getDanToc());
        hoSo.setQuocTich(form.getQuocTich());
        hoSo.setTonGiao(form.getTonGiao());
        hoSo.setDoiTuongChinhSach(form.getDoiTuongChinhSach());
        Boolean check = hoSoDao.updateHoSo(hoSo);
        return check;
    }

    @Override
    public Boolean deleteHoSo(Long id) {
        return hoSoDao.deleteHoSo(id);
    }

    @Override
    public JSONObject getList(Paging paging) {
        JSONObject jsonObject = new JSONObject();
        List<HoSo> listHoSo = hoSoDao.getList(paging);
        List<Paging> pagings = new ArrayList<Paging>();
        pagings.add(paging);
        jsonObject.put("listHoSo", listHoSo);
        jsonObject.put("paging", pagings);
        return jsonObject;
    }

    @Override
    public HoSo getHoSoById(Long id){
        return hoSoDao.getHoSoById(id);
    }

    @Override
    public JSONObject getHoSoDetailId(Long idHoSo) {
        JSONObject jsonObject = new JSONObject();
        HoSo hoSo = hoSoDao.getHoSoById(idHoSo);
        List<DiemHoSoIdDto> listDiem = hoSoDao.getDiemHoSoId(idHoSo);
        listDiem.forEach(i -> {
            Double diem = i.getDiem();
            if (diem <= 4 && diem >= 3.6){
                i.setXepLoai("Xuất sắc");
            } else if (diem <= 3.59 && diem >= 3.2){
                i.setXepLoai("Giỏi");
            } else if (diem <= 3.19 && diem >= 2.5){
                i.setXepLoai("Khá");
            } else if (diem <= 2.49 && diem >= 2.3){
                i.setXepLoai("Trung bình khá");
            } else if (diem <= 2.29 && diem >= 2.00){
                i.setXepLoai("Trung binh");
            } else if (diem <= 1.99 && diem >= 1.5){
                i.setXepLoai("Trung bình yếu");
            } else if (diem <= 1.49 && diem >= 1.0){
                i.setXepLoai("Yếu");
            } else {
                i.setXepLoai("Kém");
            }
        });
        List<KtklHoSoId> listKtkl = hoSoDao.getKtklHoSoId(idHoSo);
        List<HoSo> listHoSo = new ArrayList<HoSo>();
        listHoSo.add(hoSo);
        jsonObject.put("hoSo", listHoSo);
        jsonObject.put("listDiem", listDiem);
        jsonObject.put("listKtkl", listKtkl);
        return jsonObject;
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
