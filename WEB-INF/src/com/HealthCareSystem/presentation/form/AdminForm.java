package com.HealthCareSystem.presentation.form;

import org.apache.struts.validator.ValidatorForm;
import com.HealthCareSystem.business.entity.Admin;

public class AdminForm extends ValidatorForm {
	// for login
	private String userName;
	private String password;
	private Admin loginAdmin;
//for profile
	private String name;
	private String gender;
	private String dateOfBirth;
	private String email;
	private String phone;
	private String bloodType;
	private String address;
//for change password
	private String newPassword;
	private String confirmPassword;
	private boolean changePs;
//to count number of admin
	private int count;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	public Admin getLoginAdmin() {
		return loginAdmin;
	}

	public void setLoginAdmin(Admin loginAdmin) {
		this.loginAdmin = loginAdmin;
	}

	public boolean isChangePs() {
		return changePs;
	}

	public void setChangePs(boolean changePs) {
		this.changePs = changePs;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}