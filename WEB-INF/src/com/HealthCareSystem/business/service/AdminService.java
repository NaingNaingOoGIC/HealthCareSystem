package com.HealthCareSystem.business.service;

import java.text.SimpleDateFormat;

import com.HealthCareSystem.business.entity.Admin;
import com.HealthCareSystem.dao.AdminDao;
import com.HealthCareSystem.presentation.form.AdminForm;

public class AdminService {

	private AdminDao myAdminDao;
	private CommonFunctions function = new CommonFunctions();

	public AdminDao getMyAdminDao() {
		return myAdminDao;
	}

	public void setMyAdminDao(AdminDao myAdminDao) {
		this.myAdminDao = myAdminDao;
	}

	public void checkLoginAdmin(AdminForm myForm) {
// to check login admin's username and password
		Admin myAdmin = myAdminDao.getAdmin(myForm.getUserName(), function.hashPassword(myForm.getPassword()));
		myForm.setLoginAdmin(myAdmin);
	}

	public void firstLoadUpdateProfile(AdminForm myAdminForm) {
		// to show data on admin profile
		Admin myLoginAdmin = myAdminForm.getLoginAdmin();

		myAdminForm.setUserName(myLoginAdmin.getAdminLoginName());
		myAdminForm.setName(myLoginAdmin.getAdminName());
		myAdminForm.setGender(myLoginAdmin.getGender());
		SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd");
		myAdminForm.setDateOfBirth(myFormat.format(myLoginAdmin.getDateOfBirth()));
		myAdminForm.setEmail(myLoginAdmin.getMail());
		myAdminForm.setPhone(myLoginAdmin.getPhone());
		myAdminForm.setBloodType(myLoginAdmin.getBloodType());
		myAdminForm.setAddress(myLoginAdmin.getAddress());

	}

	public void updateAdmin(AdminForm myAdminForm) {
// to update admin profile data
		Admin myLoginAdmin = myAdminForm.getLoginAdmin();
		myLoginAdmin.setAdminName(myAdminForm.getName());
		myLoginAdmin.setGender(myAdminForm.getGender());
		myLoginAdmin.setDateOfBirth(function.convertStringToDateFormat(myAdminForm.getDateOfBirth()));
		myLoginAdmin.setMail(myAdminForm.getEmail());
		myLoginAdmin.setPhone(myAdminForm.getPhone());
		myLoginAdmin.setBloodType(myAdminForm.getBloodType());
		myLoginAdmin.setAddress(myAdminForm.getAddress());
		myAdminDao.saveAdmin(myLoginAdmin);
	}

	public void firstUploadUpdatePS(AdminForm myAdminForm) {
//to set nothing in password field for change password
		myAdminForm.setPassword(null);
		myAdminForm.setNewPassword(null);
		myAdminForm.setConfirmPassword(null);

	}

	public void updatePassword(AdminForm myAdminForm) {
		// to update admin password
		Admin myLoginAdmin = myAdminForm.getLoginAdmin();
		myLoginAdmin.setPassword(function.hashPassword(myAdminForm.getNewPassword()));
		myAdminDao.saveAdmin(myLoginAdmin);
	}

	public void countAdmin(AdminForm myAdminForm) {
		// to count how many admin in system
		int count = myAdminDao.countAdmin();
		myAdminForm.setCount(count);
	}

	public boolean checkPassword(AdminForm myForm) {
		boolean ps = false;
		String checkPs = function.hashPassword(myForm.getPassword());
		if (checkPs.equals(myForm.getLoginAdmin().getPassword()))
			ps = true;
		else
			ps = false;
		return ps;
	}
}