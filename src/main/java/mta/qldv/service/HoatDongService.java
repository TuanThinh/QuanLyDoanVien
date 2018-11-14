package mta.qldv.service;

import mta.qldv.entity.HoatDong;

import java.util.List;

public interface HoatDongService {
    List<HoatDong> getList();

	HoatDong getHoatDongById(int id);

	boolean addHoatDong(HoatDong newHoatDong);

	boolean updateHoatDong(HoatDong newHoatDong);

	boolean deleteHoatDongById(HoatDong hoatDong);

	List<HoatDong> getPendingList();

	List<HoatDong> getApprovedList();

	List<HoatDong> getDeniedList();
}
