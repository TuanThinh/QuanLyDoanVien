package mta.qldv.service;

import mta.qldv.dto.DiemHoSoDto;
import mta.qldv.entity.Diem;
import mta.qldv.form.DiemForm;
import mta.qldv.utils.Paging;
import org.json.JSONObject;

import java.util.List;

public interface DiemService {
    Boolean addDiem(DiemForm diemForm);
    Boolean updateDiem(DiemForm diemForm);
    Boolean deleteDiem(Long id);

    Diem getById(Long id);
    List<Diem> getList();
}
