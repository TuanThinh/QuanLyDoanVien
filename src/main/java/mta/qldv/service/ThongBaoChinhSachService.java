package mta.qldv.service;

import mta.qldv.entity.ThongBaoChinhSach;

import java.util.List;

public interface ThongBaoChinhSachService {
    List<ThongBaoChinhSach> getList();

	boolean addThongBaoChinhSach(ThongBaoChinhSach tbcs);

	boolean updateThongBaoChinhSach(ThongBaoChinhSach tbcs);

	boolean deleteThongBaoChinhSach(ThongBaoChinhSach tbcs);

	ThongBaoChinhSach getById(Long id);
}
