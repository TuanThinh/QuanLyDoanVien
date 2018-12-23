package mta.qldv.dao;

import mta.qldv.entity.BaoCao;
import mta.qldv.utils.Paging;

import java.util.List;

public interface BaoCaoDao {
    Boolean addBaoCao(BaoCao baoCao);
    Boolean deleteBaoCao(Long id);

    int totalRecord(String parameter);
    List<BaoCao> getList(Long idHoSo);
    BaoCao getById(Long id);
}
