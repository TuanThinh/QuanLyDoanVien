package mta.qldv.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mta.qldv.dao.TaiKhoanQuyenDao;
import mta.qldv.entity.TaiKhoanQuyen;
import mta.qldv.service.TaiKhoanQuyenService;

@Service
public class TaiKhoanQuyenServiceImpl implements TaiKhoanQuyenService{
	@Autowired
	private TaiKhoanQuyenDao taiKhoanQuyenDao;

	@Override
	public Long addTaiKhoanQuyen(TaiKhoanQuyen taiKhoanQuyen) {
		return taiKhoanQuyenDao.addTaiKhoanQuyen(taiKhoanQuyen);
	}

}
