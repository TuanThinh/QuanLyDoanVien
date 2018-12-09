package mta.qldv.service;

import mta.qldv.dto.DiemHoSoDto;
import mta.qldv.entity.Diem;
import mta.qldv.utils.Paging;
import org.json.JSONObject;

import java.util.List;

public interface DiemService {
    Boolean addDiem(Diem diem);
    Boolean updateDiem(Diem diem);
    Boolean deleteDiem(Long id);

    int totalRecord(String parameter);
    JSONObject getList(Paging paging);
}
