package mta.qldv.dao;

import mta.qldv.entity.ChiDoan;

import java.util.List;

public interface ChiDoanDao {
    List<ChiDoan> getList();
	boolean addChiDoan(ChiDoan newChiDoan);
	boolean updateChiDoan(ChiDoan newChiDoan);
	boolean deleteChiDoan(ChiDoan chiDoan);
	List<ChiDoan> getListById(int id);
}
