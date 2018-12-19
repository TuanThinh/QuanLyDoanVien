package mta.qldv.dao;

import mta.qldv.entity.ChiDoan;
import mta.qldv.entity.DonVi;

import java.util.List;

public interface ChiDoanDao {
    List<ChiDoan> getList();
	ChiDoan getChiDoanById(Long id);
	DonVi getDonVi(Long idChiDoan);
	boolean addChiDoan(ChiDoan chiDoan);
	boolean updateChiDoan(ChiDoan chiDoan);
	boolean deleteChiDoan(Long Id);
}
