package mta.qldv.service;

import mta.qldv.dto.KhenThuongKyLuatDto;
import mta.qldv.entity.KhenThuongKyLuat;
import mta.qldv.form.KhenThuongKyLuatForm;

import java.util.List;

public interface KhenThuongKyLuatService {
    Boolean addKhenThuongKyLuat(KhenThuongKyLuatForm khenThuongKyLuatForm);
    Boolean updateKhenThuongKyLuat(KhenThuongKyLuatForm khenThuongKyLuatForm);
    Boolean deleteKhenThuongKyLuat(Long id);

    KhenThuongKyLuat getById(Long id);
    List<KhenThuongKyLuat> getList();
}
