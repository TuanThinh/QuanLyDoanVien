package mta.qldv.service;

import mta.qldv.entity.ThongBaoChinhSach;

import java.util.List;

public interface ThongBaoChinhSachService {
    List<ThongBaoChinhSach> getList();

	Boolean addThongBaoChinhSach(ThongBaoChinhSach thongBaoChinhSach);

	Boolean updateThongBaoChinhSach(ThongBaoChinhSach thongBaoChinhSach);

	Boolean deleteThongBaoChinhSach(ThongBaoChinhSach thongBaoChinhSach);

	ThongBaoChinhSach getById(Long id);
}
