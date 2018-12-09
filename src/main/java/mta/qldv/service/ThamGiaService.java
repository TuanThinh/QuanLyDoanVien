package mta.qldv.service;

import mta.qldv.entity.ThamGia;

import java.util.List;

public interface ThamGiaService {
    Boolean addThamGia(ThamGia thamGia);
    Boolean updateThamGia(ThamGia thamGia);
    Boolean deleteThamGia(Long id);

    List<ThamGia> getList();
}
