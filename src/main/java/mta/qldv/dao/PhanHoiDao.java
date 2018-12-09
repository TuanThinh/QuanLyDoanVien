package mta.qldv.dao;

import mta.qldv.entity.PhanHoi;

import java.util.List;

public interface PhanHoiDao {
    Boolean addPhanHoi(PhanHoi phanHoi);
    Boolean deletePhanHoi(Long id);
    List<PhanHoi> getList();
}
