package mta.qldv.service;

import mta.qldv.entity.ChiDoan;

import java.util.List;

public interface ChiDoanService {
    List<ChiDoan> getList();

	ChiDoan getChiDoanById(Long id);

	Boolean addChiDoan(ChiDoan chiDoan);

	Boolean updateChiDoan(ChiDoan chiDoan);

	Boolean deleteChiDoan(Long id);
    
}
