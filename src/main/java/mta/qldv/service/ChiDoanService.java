package mta.qldv.service;

import mta.qldv.entity.ChiDoan;

import java.util.List;

public interface ChiDoanService {
    List<ChiDoan> getList();

	ChiDoan getChiDoanById(Long id);

	boolean addChiDoan(ChiDoan chiDoan);

	boolean updateChiDoan(ChiDoan chiDoan);

	boolean deleteChiDoan(ChiDoan chiDoan);
    
}
