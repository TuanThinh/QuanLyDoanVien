package mta.qldv.service;

import mta.qldv.entity.HoatDong;

import java.util.List;

public interface HoatDongService {
    List<HoatDong> getList();

	HoatDong getById(Long id);

	Boolean addHoatDong(HoatDong hoatDong);

	Boolean updateHoatDong(HoatDong hoatDong);

	Boolean deleteById(Long id);

	List<HoatDong> getPendingList();

	List<HoatDong> getApprovedList();

	List<HoatDong> getDeniedList();
}
