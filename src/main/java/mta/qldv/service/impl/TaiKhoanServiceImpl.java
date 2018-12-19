package mta.qldv.service.impl;

import mta.qldv.dao.TaiKhoanDao;
import mta.qldv.entity.TaiKhoan;
import mta.qldv.form.DoiMatKhauForm;
import mta.qldv.service.TaiKhoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaiKhoanServiceImpl implements TaiKhoanService {
    @Autowired
    private TaiKhoanDao taiKhoanDao;

    @Override
    public List<TaiKhoan> getList() {
        return taiKhoanDao.getList();
    }

    @Override
    public TaiKhoan getById(Long id) {
        return taiKhoanDao.getById(id);
    }

    @Override
    public TaiKhoan findByUserName(String username) {
        return null;
    }

    @Override
	public Long createAccount(TaiKhoan newAccount) {
		return taiKhoanDao.createAccount(newAccount);
	}

    @Override
    public Boolean doiMatKhau(DoiMatKhauForm doiMatKhauForm) {
        TaiKhoan taiKhoan = taiKhoanDao.getById(doiMatKhauForm.getId());
        if (!taiKhoan.getMatKhau().equals(doiMatKhauForm.getMatKhauHienTai())){
            return false;
        }
        if (!doiMatKhauForm.getMatKhauMoi().equals(doiMatKhauForm.getXacNhanMatKhauMoi())) {
            return null;
        }
        taiKhoan.setMatKhau(doiMatKhauForm.getMatKhauMoi());
        Boolean check = taiKhoanDao.updateTaiKhoan(taiKhoan);
        return check;
    }
}
