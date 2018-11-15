package mta.qldv.service;

import mta.qldv.entity.ThongBaoChinhSach;

import java.util.List;

public interface ThongBaoChinhSachService {
    List<ThongBaoChinhSach> getList();

	boolean addThongBaoChinhSach(ThongBaoChinhSach newTBCS);

	boolean updateThongBaoChinhSach(ThongBaoChinhSach newTBCS);

	boolean deleteThongBaoChinhSach(ThongBaoChinhSach tBCS);
}
