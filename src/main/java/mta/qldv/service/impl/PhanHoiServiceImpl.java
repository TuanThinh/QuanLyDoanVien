package mta.qldv.service.impl;

import mta.qldv.dao.HoSoDao;
import mta.qldv.dao.PhanHoiDao;
import mta.qldv.entity.HoSo;
import mta.qldv.entity.PhanHoi;
import mta.qldv.form.PhanHoiForm;
import mta.qldv.service.PhanHoiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PhanHoiServiceImpl implements PhanHoiService {
    @Autowired
    private PhanHoiDao phanHoiDao;
    @Autowired
    private HoSoDao hoSoDao;

    public List<PhanHoi> getList() {
        return phanHoiDao.getList();
    }

    @Override
    public Boolean deletePhanHoi(Long id) {
        return null;
    }
    public boolean addPhanHoi(PhanHoiForm form) {
        HoSo hoSo=hoSoDao.getHoSoById(form.getIdHoSo());
        PhanHoi phanHoi=new PhanHoi();
        phanHoi.setId(form.getId());
        phanHoi.setHoSo(hoSo);
        phanHoi.setNoiDung(form.getNoiDung());
        phanHoi.setTieuDe(form.getTieuDe());
        phanHoi.setThoiGian(form.getThoiGian());
        boolean check=phanHoiDao.addPhanHoi(phanHoi);
        return check;
    }
}
