package mta.qldv.dao;

import mta.qldv.entity.DonVi;

import java.util.List;

public interface DonViDao {
    List<DonVi> getList();
    DonVi getById(Long id);
}
