package mta.qldv.service.impl;

import mta.qldv.dao.DonViDao;
import mta.qldv.entity.DonVi;
import mta.qldv.service.DonViService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DonViServiceImpl implements DonViService {
    @Autowired
    private DonViDao donViDao;

    @Override
    public List<DonVi> getList(){
        return donViDao.getList();
    }

	@Override
	public List<DonVi> getListById(int id) {
		return donViDao.getListById(id);
	}
    
    
}
