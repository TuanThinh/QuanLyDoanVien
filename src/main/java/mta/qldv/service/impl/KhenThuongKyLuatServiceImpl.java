package mta.qldv.service.impl;

import mta.qldv.dao.HoSoDao;
import mta.qldv.dao.KhenThuongKyLuatDao;
import mta.qldv.dao.SqdKhenThuongKyLuatDao;
import mta.qldv.dto.KhenThuongKyLuatDto;
import mta.qldv.entity.HoSo;
import mta.qldv.entity.KhenThuongKyLuat;
import mta.qldv.entity.SqdKhenThuongKyLuat;
import mta.qldv.form.KhenThuongKyLuatForm;
import mta.qldv.service.KhenThuongKyLuatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KhenThuongKyLuatServiceImpl implements KhenThuongKyLuatService {
    @Autowired
    private KhenThuongKyLuatDao khenThuongKyLuatDao;

    @Autowired
    private HoSoDao hoSoDao;

    @Autowired
    private SqdKhenThuongKyLuatDao sqdKhenThuongKyLuatDao;

    @Override
    public Boolean addKhenThuongKyLuat(KhenThuongKyLuatForm khenThuongKyLuatForm) {
        HoSo hoSo = hoSoDao.getHoSoById(khenThuongKyLuatForm.getIdHoSo());
        SqdKhenThuongKyLuat sqdKhenThuongKyLuat = sqdKhenThuongKyLuatDao.getById(khenThuongKyLuatForm.getIdSqdKtkl());
        KhenThuongKyLuat khenThuongKyLuat = new KhenThuongKyLuat();
        khenThuongKyLuat.setHoSo(hoSo);
        khenThuongKyLuat.setSqdKhenThuongKyLuat(sqdKhenThuongKyLuat);
        khenThuongKyLuat.setThoiGian(khenThuongKyLuatForm.getThoiGian());
        return khenThuongKyLuatDao.addKhenThuongKyLuat(khenThuongKyLuat);
    }

    @Override
    public Boolean updateKhenThuongKyLuat(KhenThuongKyLuatForm khenThuongKyLuatForm) {
        SqdKhenThuongKyLuat sqdKhenThuongKyLuat = sqdKhenThuongKyLuatDao.getById(khenThuongKyLuatForm.getIdSqdKtkl());
        KhenThuongKyLuat khenThuongKyLuat = khenThuongKyLuatDao.getById(khenThuongKyLuatForm.getId());
        khenThuongKyLuat.setSqdKhenThuongKyLuat(sqdKhenThuongKyLuat);
        khenThuongKyLuat.setThoiGian(khenThuongKyLuatForm.getThoiGian());
        return khenThuongKyLuatDao.updateKhenThuongKyLuat(khenThuongKyLuat);
    }

    @Override
    public Boolean deleteKhenThuongKyLuat(Long id) {
        return khenThuongKyLuatDao.deleteKhenThuongKyLuat(id);
    }

    @Override
    public KhenThuongKyLuat getById(Long id) {
        return khenThuongKyLuatDao.getById(id);
    }

    @Override
    public List<KhenThuongKyLuat> getList() {
        return khenThuongKyLuatDao.getList();
    }

}
