package com.HealthCareSystem.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.HealthCareSystem.business.entity.Doctor;

public class DoctorDaoImpl extends HibernateDaoSupport implements DoctorDao {

	@Override
	public Doctor getDoctor(String userName, String password) {

		String hql = "from Doctor i where i.doctorLoginName=? and i.password=?";
		Object[] param = { userName, password };
		List l = getHibernateTemplate().find(hql, param);
		return l.isEmpty() || l == null ? null : (Doctor) l.get(0);

	}

	@Override
	public void saveDoctor(Doctor myDoctor) {
		getHibernateTemplate().saveOrUpdate(myDoctor);

	}

	@Override
	public List<Doctor> getAvailableDoctor() {
		String hql = "from Doctor where status=? ORDER BY department.departmentName ASC";
		List<Doctor> doctorList = getHibernateTemplate().find(hql, "available");
		return doctorList.isEmpty() || doctorList == null ? null : doctorList;
	}

	@Override
	public List<Doctor> getUnAvailableDoctor() {
		String hql = "from Doctor where status=? ORDER BY department.departmentName ASC";
		List<Doctor> doctorList = getHibernateTemplate().find(hql, "unavailable");
		return doctorList.isEmpty() || doctorList == null ? null : doctorList;
	}

	@Override
	public Doctor getDoctorById(int id) {
		String hql = "from Doctor i where i.doctorId=?";
		List<Doctor> doctorList = getHibernateTemplate().find(hql, id);
		return doctorList.isEmpty() || doctorList == null ? null : doctorList.get(0);
	}

	@Override
	public List<Doctor> searchDoctorbyName(String search, String status) {
		String hql = "from Doctor i where i.doctorName LIKE ? and i.status=? ORDER BY department.departmentName ASC";
		Object[] nameSearch = { "%" + search + "%", status };
		List<Doctor> nameList = getHibernateTemplate().find(hql, nameSearch);
		return nameList.isEmpty() || nameList == null ? null : nameList;
	}

	@Override
	public List<Doctor> getAvailableDoctorbyDeptId(int id) {
		String hql = "from Doctor i where status=? and  i.department.departmentId=? ";
		Object[] nameSearch = { "available", id };
		List<Doctor> doctorList = getHibernateTemplate().find(hql, nameSearch);
		return doctorList.isEmpty() || doctorList == null ? null : doctorList;
	}

	public int getLatestId() {
		String getLast = "from Doctor i ORDER BY doctorId DESC WHERE ROWNUM <=1";
		List l = getHibernateTemplate().find(getLast);
		Doctor p = (Doctor) l.get(0);
		int id = p.getDoctorId();
		return id;
	}
}
