package mta.qldv.service.impl;

import mta.qldv.dao.BaoCaoDao;
import mta.qldv.entity.BaoCao;
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

    @Override
    public Boolean addBaoCao(BaoCao baoCao) {
        return null;
    }

    @Override
    public Boolean deleteBaoCao(Long id) {
        return null;
    }

    @Override
    public int totalRecord(String parameter) {
        return 0;
    }

    @Override
    public JSONObject getList(Paging paging) {
        return null;
    }
}
