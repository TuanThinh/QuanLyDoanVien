package mta.qldv.dao;

import mta.qldv.dto.KhenThuongKyLuatDto;
import mta.qldv.entity.KhenThuongKyLuat;

import java.util.List;

public interface KhenThuongKyLuatDao {
    List<KhenThuongKyLuat> getList();
    List<KhenThuongKyLuatDto> findAll();
}
