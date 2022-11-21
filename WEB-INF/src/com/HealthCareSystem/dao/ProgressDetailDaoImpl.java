package com.HealthCareSystem.dao;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.HealthCareSystem.business.entity.ProgressDetail;
import com.HealthCareSystem.business.service.CommonFunctions;

public class ProgressDetailDaoImpl extends HibernateDaoSupport implements ProgressDetailDao {

	CommonFunctions function = new CommonFunctions();

	@Override
	public List<ProgressDetail> getDetailByStatus(String status) {
		String hql = "from ProgressDetail where appointmentStatus=?";
		List<ProgressDetail> apptList = getHibernateTemplate().find(hql, status);
		return apptList.isEmpty() || apptList == null ? null : apptList;
	}

	@Override
	public ProgressDetail getProgDetailById(int progDetailid) {
		String hql = "from ProgressDetail where progressDetailId=?";
		List<ProgressDetail> apptList = getHibernateTemplate().find(hql, progDetailid);
		return apptList.isEmpty() || apptList == null ? null : apptList.get(0);
	}

	@Override
	public void saveProgDetail(ProgressDetail progDetail) {
		getHibernateTemplate().saveOrUpdate(progDetail);

	}

	@Override
	public List<ProgressDetail> getComingAppt() {
		String hql = "from ProgressDetail where appointmentDate > ? and appointmentStatus=? ORDER BY appointmentDate ASC";
		LocalDateTime now = LocalDateTime.now();
		Date today = function.convertStringToDateFormat(now + "");
		Object[] param = { today, "confirmed" };
		List<ProgressDetail> apptList = getHibernateTemplate().find(hql, param);
		return apptList.isEmpty() || apptList == null ? null : apptList;

	}

	@Override
	public List<ProgressDetail> getTodayAppt() {
		String hql = "from ProgressDetail where appointmentDate = ? and appointmentStatus=?";
		LocalDateTime now = LocalDateTime.now();
		Date today = function.convertStringToDateFormat(now + "");
		Object[] param = { today, "confirmed" };
		List<ProgressDetail> apptList = getHibernateTemplate().find(hql, param);
		return apptList.isEmpty() || apptList == null ? null : apptList;
	}

	@Override
	public void deleteAppointment(int progDetailid) {
		getHibernateTemplate().delete(getProgDetailById(progDetailid));
	}
}
