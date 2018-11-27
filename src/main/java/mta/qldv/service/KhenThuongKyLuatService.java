package mta.qldv.service;

import mta.qldv.dto.KhenThuongKyLuatDto;
import mta.qldv.entity.KhenThuongKyLuat;

import java.util.List;

public interface KhenThuongKyLuatService {
    List<KhenThuongKyLuat> getList();
    List<KhenThuongKyLuatDto> findAll();
}
