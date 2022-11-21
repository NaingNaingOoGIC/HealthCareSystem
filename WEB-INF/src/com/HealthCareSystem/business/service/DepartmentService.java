package com.HealthCareSystem.business.service;

import java.util.ArrayList;
import java.util.List;

import com.HealthCareSystem.business.entity.Department;
import com.HealthCareSystem.business.entity.Doctor;
import com.HealthCareSystem.dao.DepartmentDao;
import com.HealthCareSystem.dao.DoctorDao;
import com.HealthCareSystem.presentation.form.DepartmentForm;

public class DepartmentService {

	private DepartmentDao myDeptDao;
	private DoctorDao myDoctorDao;

	public DepartmentDao getMyDeptDao() {
		return myDeptDao;
	}

	public void setMyDeptDao(DepartmentDao myDeptDao) {
		this.myDeptDao = myDeptDao;
	}

	public DoctorDao getMyDoctorDao() {
		return myDoctorDao;
	}

	public void setMyDoctorDao(DoctorDao myDoctorDao) {
		this.myDoctorDao = myDoctorDao;
	}

	public void showAllDept(DepartmentForm myForm) {
//show all department on admin side
		List<Department> deptList = myDeptDao.getAllDepartment();
		for (Department dept : deptList) {
			List<Doctor> alldoctor = new ArrayList<Doctor>(dept.getDoctors());
			dept.setNoOfDoctor(alldoctor.size());
		}
		myForm.setDeptList(deptList);
	}

	public void showAvailableDept(DepartmentForm myForm) {
//show just available department in patient side
		List<Department> deptList = myDeptDao.getAvailableDepartment();
		for (Department dept : deptList) {
			List<Doctor> alldoctor = new ArrayList<Doctor>(dept.getDoctors());
			for (int i = 0; i < alldoctor.size(); i++) {
				if (alldoctor.get(i).getStatus().equals("unavailable")) {
					alldoctor.remove(i);
				}
			}
			dept.setNoOfDoctor(alldoctor.size());
		}
		myForm.setDeptList(deptList);
	}

	public void countDept(DepartmentForm myForm) {
//count department to show in admin home page
		int avaDept = myDeptDao.getAvailableDepartment().size();
		int unAvaDept = myDeptDao.getAllDepartment().size() - avaDept;
		myForm.setAvaDept(avaDept);
		myForm.setUnavaDept(unAvaDept);
	}

	public void getDepartment(DepartmentForm myForm) {
//get department with relative id
		Department myDept = myDeptDao.getDeptById(myForm.getDeptId());

		List<Doctor> alldoctor = new ArrayList<Doctor>(myDept.getDoctors());
		for (int i = 0; i < alldoctor.size(); i++) {
			if (alldoctor.get(i).getStatus().equals("unavailable")) {
				alldoctor.remove(i);
			}
		}
		myDept.setNoOfDoctor(alldoctor.size());

		myForm.setDepartment(myDept);

	}

	public boolean checkDeptNameExit(DepartmentForm myForm) {
		Department dept = myDeptDao.checkName(myForm.getDeptName());
		return dept == null ? false : true;
	}

	public void saveNewDept(DepartmentForm myForm) {
//save new department to db
		Department newDept = new Department();
		newDept.setDepartmentId(null);
		newDept.setDepartmentName(myForm.getDeptName());
		newDept.setDepartmentDescription(myForm.getDescription());
		newDept.setStatus("available");

		myDeptDao.saveDept(newDept);
	}

	public void editDept(DepartmentForm myForm) {
//update department
		Department editDept = myForm.getDepartment();
		editDept.setDepartmentName(myForm.getDeptName());
		editDept.setDepartmentDescription(myForm.getDescription());
		myDeptDao.saveDept(editDept);
	}

	public void deleteDept(DepartmentForm myForm) {
		// change status of department to unavailable
		changDeptStatus("unavailable", myForm);
	}

	public void reuploadDept(DepartmentForm myForm) {
		// change status of department to available
		changDeptStatus("available", myForm);
	}

	private void changDeptStatus(String status, DepartmentForm myForm) {
//detail of department status changing
		Department deleteDept = myDeptDao.getDeptById(myForm.getDeptId());
		deleteDept.setStatus(status);
		List<Doctor> doctorInDept = new ArrayList<Doctor>(deleteDept.getDoctors());
		for (int i = 0; i < doctorInDept.size(); i++) {
			Doctor doctor = doctorInDept.get(i);
			doctor.setStatus(status);
			myDoctorDao.saveDoctor(doctor);
		}
		myDeptDao.saveDept(deleteDept);

	}
}
