package mta.qldv.dao;

import mta.qldv.entity.ThongBaoChinhSach;

import java.util.List;

public interface ThongBaoChinhSachDao {
    List<ThongBaoChinhSach> getList();

	boolean addThongBaoChinhsSach(ThongBaoChinhSach tbcs);

	boolean updateThongBaoChinhsSach(ThongBaoChinhSach tbcs);

	boolean deleteThongBaoChinhsSach(ThongBaoChinhSach tbcs);

	ThongBaoChinhSach getById(Long id);
}
