package com.HealthCareSystem.presentation.form;

import java.util.List;

import org.apache.struts.validator.ValidatorForm;

import com.HealthCareSystem.business.entity.Department;
import com.HealthCareSystem.business.entity.Doctor;

public class DoctorForm extends ValidatorForm {
	// for login
	private int doctorid;
	private String userName;
	private String password;
	private Doctor loginDoctor;
	// to add
	private int deptid;
	private String name;
	private String gender;
	private String dateOfBirth;
	private String department;
	private String degree;
	private String email;
	private String phone;
	private String bloodType;
	private String address;
	private String biography;
	private List<Department> deptList;
	private List<String> degreeList;
//to change password
	private String newPassword;
	private String confirmPassword;
	private boolean changePs;
//show available and unavailable doctor
	private List<Doctor> availableDoctorList;
	private List<Doctor> unAvailableDoctorList;
	private String frmControl;
	// delete or come back doctor
	private Doctor actionDoctor;
	private int deleteId;

	public int getDoctorid() {
		return doctorid;
	}

	public void setDoctorid(int doctorid) {
		this.doctorid = doctorid;
	}

	public int getDeptid() {
		return deptid;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBiography() {
		return biography;
	}

	public void setBiography(String biography) {
		this.biography = biography;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public Doctor getLoginDoctor() {
		return loginDoctor;
	}

	public void setLoginDoctor(Doctor loginDoctor) {
		this.loginDoctor = loginDoctor;
	}

	public boolean isChangePs() {
		return changePs;
	}

	public void setChangePs(boolean changePs) {
		this.changePs = changePs;
	}

	public List<Department> getDeptList() {
		return deptList;
	}

	public void setDeptList(List<Department> deptList) {
		this.deptList = deptList;
	}

	public List<Doctor> getAvailableDoctorList() {
		return availableDoctorList;
	}

	public void setAvailableDoctorList(List<Doctor> availableDoctorList) {
		this.availableDoctorList = availableDoctorList;
	}

	public List<Doctor> getUnAvailableDoctorList() {
		return unAvailableDoctorList;
	}

	public void setUnAvailableDoctorList(List<Doctor> unAvailableDoctorList) {
		this.unAvailableDoctorList = unAvailableDoctorList;
	}

	public String getFrmControl() {
		return frmControl;
	}

	public void setFrmControl(String frmControl) {
		this.frmControl = frmControl;
	}

	public Doctor getActionDoctor() {
		return actionDoctor;
	}

	public void setActionDoctor(Doctor actionDoctor) {
		this.actionDoctor = actionDoctor;
	}

	public int getDeleteId() {
		return deleteId;
	}

	public void setDeleteId(int deleteId) {
		this.deleteId = deleteId;
	}

	public List<String> getDegreeList() {
		return degreeList;
	}

	public void setDegreeList(List<String> degreeList) {
		this.degreeList = degreeList;
	}

}
