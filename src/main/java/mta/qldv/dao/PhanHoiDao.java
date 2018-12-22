package mta.qldv.dao;

import mta.qldv.entity.PhanHoi;

import java.util.List;

public interface PhanHoiDao {
    Boolean deletePhanHoi(Long id);
    List<PhanHoi> getList();
    Boolean addPhanHoi(PhanHoi phanHoi);
}
