package mta.qldv.service;

import mta.qldv.entity.DonVi;

import java.util.List;

public interface DonViService {
    List<DonVi> getList();
    DonVi getById(Long id);
}
