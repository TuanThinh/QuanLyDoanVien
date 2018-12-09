package mta.qldv.dao;

import mta.qldv.entity.DonVi;

import java.util.List;

public interface DonViDao {
    Boolean addDonVi(DonVi donVi);
    Boolean updateDonVi(DonVi donVi);
    Boolean deleteDonVi(Long id);

    List<DonVi> getList();
    DonVi getById(Long id);
}
