package mta.qldv.service.impl;

import mta.qldv.dao.TaiKhoanDao;
import mta.qldv.entity.TaiKhoan;
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
	public boolean createAccount(TaiKhoan newAccount) {
		return taiKhoanDao.createAccount(newAccount);
	}
}
