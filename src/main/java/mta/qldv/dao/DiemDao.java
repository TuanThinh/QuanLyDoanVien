package mta.qldv.dao;

import mta.qldv.dto.DiemHoSoDto;
import mta.qldv.entity.Diem;

import java.util.List;

public interface DiemDao {
    List<Diem> getList();
    List<DiemHoSoDto> findAll();
}
