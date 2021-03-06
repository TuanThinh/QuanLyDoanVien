package mta.qldv.dao;

import mta.qldv.dto.DiemHoSoDto;
import mta.qldv.entity.Diem;
import mta.qldv.utils.Paging;

import java.util.List;

public interface DiemDao {
    Boolean addDiem(Diem diem);
    Boolean updateDiem(Diem diem);
    Boolean deleteDiem(Long id);

    Diem getById(Long id);
    List<DiemHoSoDto> getList();
}
