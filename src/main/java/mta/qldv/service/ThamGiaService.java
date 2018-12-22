package mta.qldv.service;

import mta.qldv.entity.ThamGia;
import mta.qldv.form.ThamGiaHoaDongForm;

import java.util.List;

public interface ThamGiaService {
    Boolean addThamGia(ThamGiaHoaDongForm thamGiaHoaDongForm);
    Boolean updateThamGia(ThamGiaHoaDongForm thamGiaHoaDongForm);
    Boolean deleteThamGia(Long id);

    ThamGia getById(Long id);
    List<ThamGia> getList();
}
