package mta.qldv.service;

import mta.qldv.entity.HoatDong;

import java.util.List;

public interface HoatDongService {
    List<HoatDong> getList();

	HoatDong getById(Long id);

	boolean addHoatDong(HoatDong hoatDong);

	boolean updateHoatDong(HoatDong hoatDong);

	List<HoatDong> getPendingList();

	List<HoatDong> getApprovedList();

	List<HoatDong> getDeniedList();
}
