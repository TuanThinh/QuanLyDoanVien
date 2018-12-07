package mta.qldv.dao;

import mta.qldv.entity.ChucVu;

import java.util.List;

public interface ChucVuDao {
    List<ChucVu> getList();
    ChucVu getById(Long id);
}
