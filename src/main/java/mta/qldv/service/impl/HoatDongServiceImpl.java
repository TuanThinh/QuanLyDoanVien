package mta.qldv.service.impl;

import mta.qldv.dao.HoatDongDao;
import mta.qldv.entity.HoatDong;
import mta.qldv.service.HoatDongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HoatDongServiceImpl implements HoatDongService {
    @Autowired
    private HoatDongDao hoatDongDao;

    @Override
    public List<HoatDong> getList() {
        return hoatDongDao.getList();
    }

	@Override
	public HoatDong getById(Long id) {
		return hoatDongDao.getById(id);
	}

	@Override
	public Boolean addHoatDong(HoatDong newHoatDong) {
		return hoatDongDao.addHoatDong(newHoatDong);
	}

	@Override
	public Boolean updateHoatDong(HoatDong newHoatDong) {
		return hoatDongDao.updateHoatDong(newHoatDong);
	}

	@Override
	public Boolean deleteById(Long id) {
		return hoatDongDao.deleteHoatDong(id);
	}

	@Override
	public List<HoatDong> getPendingList() {
		return hoatDongDao.getPendingList();
	}

	@Override
	public List<HoatDong> getApprovedList() {
		return hoatDongDao.getApprovedList();
	}

	@Override
	public List<HoatDong> getDeniedList() {
		return hoatDongDao.getDeniedList();
	}
}
