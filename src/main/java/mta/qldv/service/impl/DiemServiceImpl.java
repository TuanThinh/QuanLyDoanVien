package mta.qldv.service.impl;

import mta.qldv.dao.DiemDao;
import mta.qldv.dao.HoSoDao;
import mta.qldv.dto.DiemHoSoDto;
import mta.qldv.entity.Diem;
import mta.qldv.entity.HoSo;
import mta.qldv.form.DiemForm;
import mta.qldv.service.DiemService;
import mta.qldv.utils.Paging;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiemServiceImpl implements DiemService {
    @Autowired
    private DiemDao diemDao;
    @Autowired
    private HoSoDao hoSoDao;

    @Override
    public Boolean addDiem(DiemForm diemForm) {
        HoSo hoSo = hoSoDao.getHoSoById(diemForm.getIdHoSo());
        Diem diem = new Diem();
        diem.setHoSo(hoSo);
        diem.setDiem(diemForm.getDiem());
        diem.setThoiGian(diemForm.getThoiGian());
        diem.setGhiChu(diemForm.getGhiChu());
        Boolean check = diemDao.addDiem(diem);
        return check;
    }

    @Override
    public Boolean updateDiem(DiemForm diemForm) {
        Diem diem = diemDao.getById(diemForm.getId());
        diem.setDiem(diemForm.getDiem());
        diem.setThoiGian(diemForm.getThoiGian());
        diem.setGhiChu(diemForm.getGhiChu());
        Boolean check = diemDao.updateDiem(diem);
        return check;
    }

    @Override
    public Boolean deleteDiem(Long id) {
        return diemDao.deleteDiem(id);
    }

    @Override
    public Diem getById(Long id) {
        return diemDao.getById(id);
    }

    @Override
    public List<Diem> getList() {
        return null;
    }
}
