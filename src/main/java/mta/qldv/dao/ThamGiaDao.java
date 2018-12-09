package mta.qldv.dao;

import mta.qldv.entity.ThamGia;

import java.util.List;

public interface ThamGiaDao {
    Boolean addThamGia(ThamGia thamGia);
    Boolean updateThamGia(ThamGia thamGia);
    Boolean deleteThamGia(Long id);

    List<ThamGia> getList();
}
