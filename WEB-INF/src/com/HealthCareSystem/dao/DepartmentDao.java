package com.HealthCareSystem.dao;

import java.util.List;

import com.HealthCareSystem.business.entity.Department;

public interface DepartmentDao {

	public List <Department> getAllDepartment();
	
	public List<Department> getAvailableDepartment();
	
	public Department getDeptById(Integer deptId);
	
	public void saveDept(Department dept);

	public Department checkName(String deptName);
	
}
