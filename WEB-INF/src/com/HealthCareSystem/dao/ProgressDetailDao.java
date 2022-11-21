package com.HealthCareSystem.dao;

import java.util.List;

import com.HealthCareSystem.business.entity.ProgressDetail;

public interface ProgressDetailDao {

	public List<ProgressDetail> getDetailByStatus(String status);

	public ProgressDetail getProgDetailById(int progDetailid);

	public void saveProgDetail(ProgressDetail progDetail);

	public List<ProgressDetail> getComingAppt();

	public List<ProgressDetail> getTodayAppt();

	public void deleteAppointment(int progDetailid);

}
