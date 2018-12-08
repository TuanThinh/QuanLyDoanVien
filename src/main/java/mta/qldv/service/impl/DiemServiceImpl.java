package mta.qldv.service.impl;

import mta.qldv.dao.DiemDao;
import mta.qldv.dto.DiemHoSoDto;
import mta.qldv.entity.Diem;
import mta.qldv.service.DiemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiemServiceImpl implements DiemService {
    @Autowired
    private DiemDao diemDao;


}
