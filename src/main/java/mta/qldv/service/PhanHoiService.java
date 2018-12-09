package mta.qldv.service;

import mta.qldv.entity.PhanHoi;

import java.util.List;

public interface PhanHoiService {
    Boolean addPhanHoi(PhanHoi phanHoi);
    Boolean deletePhanHoi(Long id);
    List<PhanHoi> getList();
}
