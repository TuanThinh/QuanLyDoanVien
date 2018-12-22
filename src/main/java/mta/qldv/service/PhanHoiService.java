package mta.qldv.service;

import mta.qldv.entity.PhanHoi;
import mta.qldv.form.PhanHoiForm;

import java.util.List;

public interface PhanHoiService {
    Boolean deletePhanHoi(Long id);
    List<PhanHoi> getList();
    boolean addPhanHoi(PhanHoiForm form);
}
