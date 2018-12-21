package mta.qldv.dao;

import mta.qldv.entity.PhanHoi;

import java.util.List;

public interface PhanHoiDao {
    List<PhanHoi> getList();
    Boolean addPhanHoi(PhanHoi phanHoi);
}
