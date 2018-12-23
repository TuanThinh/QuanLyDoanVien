package mta.qldv.service;

import mta.qldv.entity.BaoCao;
import mta.qldv.form.BaoCaoForm;
import mta.qldv.utils.Paging;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BaoCaoService {
    Boolean addBaoCao(BaoCaoForm baoCaoForm);
    Boolean deleteBaoCao(Long id);

    int totalRecord(String parameter);
    List<BaoCao> getList(Long idHoSo);
    BaoCao getById(Long id);
}
