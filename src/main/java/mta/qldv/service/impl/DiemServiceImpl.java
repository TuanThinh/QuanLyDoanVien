package mta.qldv.service.impl;

import mta.qldv.dao.DiemDao;
import mta.qldv.dto.DiemHoSoDto;
import mta.qldv.entity.Diem;
import mta.qldv.service.DiemService;
import mta.qldv.utils.Paging;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiemServiceImpl implements DiemService {
    @Autowired
    private DiemDao diemDao;

    @Override
    public Boolean addDiem(Diem diem) {
        return null;
    }

    @Override
    public Boolean updateDiem(Diem diem) {
        return null;
    }

    @Override
    public Boolean deleteDiem(Long id) {
        return null;
    }

    @Override
    public int totalRecord(String parameter) {
        return 0;
    }

    @Override
    public JSONObject getList(Paging paging) {
        return null;
    }
}
