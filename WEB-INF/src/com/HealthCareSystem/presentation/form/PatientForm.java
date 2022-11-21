package com.HealthCareSystem.presentation.form;

import java.util.LinkedList;
import java.util.List;

import org.apache.struts.action.ActionForm;
import org.apache.struts.util.LabelValueBean;
import org.apache.struts.validator.ValidatorForm;

import com.HealthCareSystem.business.entity.Patient;

public class PatientForm extends ValidatorForm {
	// for login
	private int patientid;
	private String userName;
	private String password;
	private Patient loginPatient;
//for register or profile
	private String name;
	private String gender;
	private String dateOfBirth;
	private String email;
	private String phone;
	private String bloodType;
	private String address;
//to change password
	private String newPassword;
	private String confirmPassword;
	private boolean changePs;
//show requested patient and patient account
	private List<Patient> reqPatientList;
	private List<Patient> allPatientList;
	private Patient patient;
	private String added;
	private String frmControl;

	public List getChoices() {
		List list = new LinkedList();
		list.add(new LabelValueBean("A", "A"));
		list.add(new LabelValueBean("A-", "A-"));
		list.add(new LabelValueBean("A+", "A+"));
		list.add(new LabelValueBean("B", "B"));
		list.add(new LabelValueBean("B-", "B-"));
		list.add(new LabelValueBean("B+", "B+"));
		list.add(new LabelValueBean("AB", "AB"));
		list.add(new LabelValueBean("AB-", "AB-"));
		list.add(new LabelValueBean("AB+", "AB+"));
		list.add(new LabelValueBean("O", "O"));
		list.add(new LabelValueBean("O-", "O-"));
		list.add(new LabelValueBean("O+", "O+"));

		return list;
	}

	public int getPatientid() {
		return patientid;
	}

	public void setPatientid(int patientid) {
		this.patientid = patientid;
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

	public Patient getLoginPatient() {
		return loginPatient;
	}

	public void setLoginPatient(Patient loginPatient) {
		this.loginPatient = loginPatient;
	}

	public boolean isChangePs() {
		return changePs;
	}

	public void setChangePs(boolean changePs) {
		this.changePs = changePs;
	}

	public List<Patient> getReqPatientList() {
		return reqPatientList;
	}

	public void setReqPatientList(List<Patient> reqPatientList) {
		this.reqPatientList = reqPatientList;
	}

	public List<Patient> getAllPatientList() {
		return allPatientList;
	}

	public void setAllPatientList(List<Patient> allPatientList) {
		this.allPatientList = allPatientList;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public String getAdded() {
		return added;
	}

	public void setAdded(String added) {
		this.added = added;
	}

	public String getFrmControl() {
		return frmControl;
	}

	public void setFrmControl(String frmControl) {
		this.frmControl = frmControl;
	}

}