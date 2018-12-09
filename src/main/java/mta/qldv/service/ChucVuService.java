package mta.qldv.service;

import mta.qldv.entity.ChucVu;

import java.util.List;

public interface ChucVuService {
    Boolean addChucVu(ChucVu chucVu);
    Boolean updateChucVu(ChucVu chucVu);
    Boolean deleteChucVu(Long id);

    List<ChucVu> getList();
    ChucVu getById(Long id);
}
