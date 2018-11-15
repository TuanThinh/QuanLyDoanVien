package mta.qldv.dao;

import mta.qldv.entity.HoatDong;

import java.util.List;

public interface HoatDongDao {
    List<HoatDong> getList();

	HoatDong getHoatDongById(int id);

	boolean addHoatDong(HoatDong newHoatDong);

	boolean updateHoatDong(HoatDong newHoatDong);

	boolean deleteHoatDong(HoatDong hoatDong);

	List<HoatDong> getPendingList();

	List<HoatDong> getApprovedList();

	List<HoatDong> getDeniedList();
}
