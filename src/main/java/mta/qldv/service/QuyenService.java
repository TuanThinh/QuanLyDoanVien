package mta.qldv.service;

import mta.qldv.entity.Quyen;

import java.util.List;

public interface QuyenService {
    List<Quyen> getList();
	Quyen getById(Long id);
}
