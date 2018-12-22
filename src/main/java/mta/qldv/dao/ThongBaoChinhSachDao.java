package mta.qldv.dao;

import mta.qldv.entity.ThongBaoChinhSach;

import java.util.List;

public interface ThongBaoChinhSachDao {

	List<ThongBaoChinhSach> getList();

	Boolean addThongBaoChinhsSach(ThongBaoChinhSach thongBaoChinhSach);

	Boolean updateThongBaoChinhsSach(ThongBaoChinhSach thongBaoChinhSach);

	Boolean deleteThongBaoChinhsSach(ThongBaoChinhSach thongBaoChinhSach);
	ThongBaoChinhSach getById(Long id);
}
