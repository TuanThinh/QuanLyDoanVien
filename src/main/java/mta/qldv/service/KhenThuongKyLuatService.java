package mta.qldv.service;

import mta.qldv.dto.KhenThuongKyLuatDto;
import mta.qldv.entity.KhenThuongKyLuat;

import java.util.List;

public interface KhenThuongKyLuatService {
    Boolean addKhenThuongKyLuat(KhenThuongKyLuat khenThuongKyLuat);
    Boolean updateKhenThuongKyLuat(KhenThuongKyLuat khenThuongKyLuat);
    Boolean deleteKhenThuongKyLuat(Long id);

    List<KhenThuongKyLuat> getList();
}
