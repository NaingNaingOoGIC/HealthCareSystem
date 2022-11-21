package com.HealthCareSystem.presentation.form;

import java.util.List;

import org.apache.struts.action.ActionForm;

import com.HealthCareSystem.business.entity.Department;

public class DepartmentForm extends ActionForm {
//add or edit department
	private int deptId;
	private String deptName;
	private String description;
	private String deptStatus;
	private List<Department> deptList;
	private Department department;
	private String frmControl;
	private String deptDelete;
	// to count available and unavailable departments
	private int avaDept;
	private int unavaDept;

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDeptStatus() {
		return deptStatus;
	}

	public void setDeptStatus(String deptStatus) {
		this.deptStatus = deptStatus;
	}

	public List<Department> getDeptList() {
		return deptList;
	}

	public void setDeptList(List<Department> deptList) {
		this.deptList = deptList;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getFrmControl() {
		return frmControl;
	}

	public void setFrmControl(String frmControl) {
		this.frmControl = frmControl;
	}

	public String getDeptDelete() {
		return deptDelete;
	}

	public void setDeptDelete(String deptDelete) {
		this.deptDelete = deptDelete;
	}

	public int getAvaDept() {
		return avaDept;
	}

	public void setAvaDept(int avaDept) {
		this.avaDept = avaDept;
	}

	public int getUnavaDept() {
		return unavaDept;
	}

	public void setUnavaDept(int unavaDept) {
		this.unavaDept = unavaDept;
	}

}