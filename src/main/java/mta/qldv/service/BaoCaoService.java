package mta.qldv.service;

import mta.qldv.entity.BaoCao;
import mta.qldv.utils.Paging;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BaoCaoService {
    Boolean addBaoCao(BaoCao baoCao);
    Boolean deleteBaoCao(Long id);

    int totalRecord(String parameter);
    JSONObject getList(Paging paging);
}
