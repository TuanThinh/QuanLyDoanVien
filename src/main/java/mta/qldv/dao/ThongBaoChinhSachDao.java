package mta.qldv.dao;

import mta.qldv.entity.ThongBaoChinhSach;

import java.util.List;

public interface ThongBaoChinhSachDao {

	List<ThongBaoChinhSach> getList();

	boolean addThongBaoChinhsSach(ThongBaoChinhSach newTBCS);

	boolean updateThongBaoChinhsSach(ThongBaoChinhSach newTBCS);

	boolean deleteThongBaoChinhsSach(ThongBaoChinhSach tBCS);
	ThongBaoChinhSach getById(Long id);
}
