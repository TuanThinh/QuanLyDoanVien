package mta.qldv.service.impl;

import mta.qldv.dao.BaoCaoDao;
import mta.qldv.dao.HoSoDao;
import mta.qldv.entity.BaoCao;
import mta.qldv.entity.HoSo;
import mta.qldv.form.BaoCaoForm;
import mta.qldv.service.BaoCaoService;
import mta.qldv.utils.Paging;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaoCaoServiceImpl implements BaoCaoService {
    @Autowired
    private BaoCaoDao baoCaoDao;
    @Autowired
    private HoSoDao hoSoDao;

    @Override
    public Boolean addBaoCao(BaoCaoForm baoCaoForm) {
        HoSo hoSo = hoSoDao.getHoSoById(baoCaoForm.getIdHoSo());
        BaoCao baoCao = new BaoCao();
        baoCao.setHoSo(hoSo);
        baoCao.setTieuDe(baoCaoForm.getTieuDe());
        baoCao.setNoiDung(baoCaoForm.getNoiDung());
        baoCao.setNgayGui(baoCaoForm.getThoiGian());
        return baoCaoDao.addBaoCao(baoCao);
    }

    @Override
    public Boolean deleteBaoCao(Long id) {
        return baoCaoDao.deleteBaoCao(id);
    }

    @Override
    public int totalRecord(String parameter) {
        return 0;
    }

    @Override
    public List<BaoCao> getList(Long idHoSo) {
        return baoCaoDao.getList(idHoSo);
    }
}
