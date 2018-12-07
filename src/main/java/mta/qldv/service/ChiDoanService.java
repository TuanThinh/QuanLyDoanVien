package mta.qldv.service;

import mta.qldv.entity.ChiDoan;

import java.util.List;

public interface ChiDoanService {
    List<ChiDoan> getList();

	ChiDoan getChiDoanById(Long id);

	boolean addChiDoan(ChiDoan newChiDoan);

	boolean updateChiDoan(ChiDoan newChiDoan);

	boolean deleteChiDoan(ChiDoan chiDoan);
    
}
