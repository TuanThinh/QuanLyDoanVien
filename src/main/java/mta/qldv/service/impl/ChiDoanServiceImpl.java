package mta.qldv.service.impl;

import mta.qldv.dao.ChiDoanDao;
import mta.qldv.entity.ChiDoan;
import mta.qldv.service.ChiDoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChiDoanServiceImpl implements ChiDoanService {
    @Autowired
    private ChiDoanDao chiDoanDao;

    @Override
    public List<ChiDoan> getList() {
        return chiDoanDao.getList();
    }

	@Override
	public boolean addChiDoan(ChiDoan newChiDoan) {
		return chiDoanDao.addChiDoan(newChiDoan);
	}

	@Override
	public boolean updateChiDoan(ChiDoan newChiDoan) {
		return chiDoanDao.updateChiDoan(newChiDoan);
	}

	@Override
	public boolean deleteChiDoan(ChiDoan chiDoan) {
		return chiDoanDao.deleteChiDoan(chiDoan);
	}

	@Override
	public List<ChiDoan> getListById(int id) {
		return chiDoanDao.getListById(id);
	}
}
