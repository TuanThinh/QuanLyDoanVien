package mta.qldv.service.impl;

import mta.qldv.dao.ChiDoanDao;
import mta.qldv.entity.ChiDoan;
import mta.qldv.entity.DonVi;
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
	public Boolean addChiDoan(ChiDoan newChiDoan) {
		return chiDoanDao.addChiDoan(newChiDoan);
	}

	@Override
	public Boolean updateChiDoan(ChiDoan newChiDoan) {
		return chiDoanDao.updateChiDoan(newChiDoan);
	}

	@Override
	public Boolean deleteChiDoan(Long id) {
		return chiDoanDao.deleteChiDoan(id);
	}

	@Override
	public ChiDoan getChiDoanById(Long id) {
		return chiDoanDao.getChiDoanById(id);
	}

	@Override
	public DonVi getDonVi(Long idChiDOan) {
		return chiDoanDao.getDonVi(idChiDOan);
	}
}
