package mta.qldv.service.impl;

import mta.qldv.dao.HoSoDao;
import mta.qldv.dao.HoatDongDao;
import mta.qldv.dao.ThamGiaDao;
import mta.qldv.entity.HoSo;
import mta.qldv.entity.HoatDong;
import mta.qldv.entity.ThamGia;
import mta.qldv.form.ThamGiaHoaDongForm;
import mta.qldv.service.ThamGiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThamGiaServiceImpl implements ThamGiaService {
    @Autowired
    private ThamGiaDao thamGiaDao;

    @Autowired
    private HoSoDao hoSoDao;

    @Autowired
    private HoatDongDao hoatDongDao;

    @Override
    public Boolean addThamGia(ThamGiaHoaDongForm thamGiaHoaDongForm) {
        HoSo hoSo = hoSoDao.getHoSoById(thamGiaHoaDongForm.getIdHoSo());
        HoatDong hoatDong = hoatDongDao.getById(thamGiaHoaDongForm.getIdHoatDong());
        ThamGia thamGia = new ThamGia();
        thamGia.setHoSo(hoSo);
        thamGia.setHoatDong(hoatDong);
        thamGia.setThoiGian(thamGiaHoaDongForm.getThoiGian());
        return thamGiaDao.addThamGia(thamGia);
    }

    @Override
    public Boolean updateThamGia(ThamGiaHoaDongForm thamGiaHoaDongForm) {
        HoatDong hoatDong = hoatDongDao.getById(thamGiaHoaDongForm.getIdHoatDong());
        ThamGia thamGia = thamGiaDao.getById(thamGiaHoaDongForm.getId());
        thamGia.setHoatDong(hoatDong);
        thamGia.setThoiGian(thamGiaHoaDongForm.getThoiGian());
        return thamGiaDao.updateThamGia(thamGia);
    }

    @Override
    public Boolean deleteThamGia(Long id) {
        return thamGiaDao.deleteThamGia(id);
    }

    @Override
    public ThamGia getById(Long id) {
        return thamGiaDao.getById(id);
    }

    @Override
    public List<ThamGia> getList() {
        return thamGiaDao.getList();
    }
}
