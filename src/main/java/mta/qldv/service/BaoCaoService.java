package mta.qldv.service;

import mta.qldv.entity.BaoCao;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BaoCaoService {
    List<BaoCao> getList();
}
