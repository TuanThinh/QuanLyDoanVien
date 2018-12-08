package mta.qldv.dao;

import mta.qldv.entity.BaoCao;

import java.util.List;

public interface BaoCaoDao {
    Boolean addBaoCao(BaoCao baoCao);
    Boolean deleteBaoCao(Long id);

    List<BaoCao> getList();
}
