package mta.qldv.dao;

import mta.qldv.dto.KhenThuongKyLuatDto;
import mta.qldv.entity.KhenThuongKyLuat;

import java.util.List;

public interface KhenThuongKyLuatDao {
    Boolean addKhenThuongKyLuat(KhenThuongKyLuat khenThuongKyLuat);
    Boolean updateKhenThuongKyLuat(KhenThuongKyLuat khenThuongKyLuat);
    Boolean deleteKhenThuongKyLuat(Long id);

    KhenThuongKyLuat getById(Long id);
    List<KhenThuongKyLuat> getList();
}
