package mta.qldv.dao;

import mta.qldv.entity.HoatDong;

import java.util.List;

public interface HoatDongDao {
    List<HoatDong> getList();

	HoatDong getById(Long id);

	boolean addHoatDong(HoatDong hoatDong);

	boolean updateHoatDong(HoatDong hoatDong);

	boolean deleteHoatDong(Long id);

	List<HoatDong> getPendingList();

	List<HoatDong> getApprovedList();

	List<HoatDong> getDeniedList();
}
