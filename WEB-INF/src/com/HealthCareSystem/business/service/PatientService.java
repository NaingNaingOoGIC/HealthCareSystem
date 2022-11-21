package com.HealthCareSystem.business.service;

import java.text.SimpleDateFormat;
import java.util.List;

import com.HealthCareSystem.business.entity.Patient;
import com.HealthCareSystem.dao.PatientDao;
import com.HealthCareSystem.presentation.form.PatientForm;

public class PatientService {

	private PatientDao myPatientDao;
	private CommonFunctions function = new CommonFunctions();

	public PatientDao getMyPatientDao() {
		return myPatientDao;
	}

	public void setMyPatientDao(PatientDao myPatientDao) {
		this.myPatientDao = myPatientDao;
	}

	public void firstLoadReg(PatientForm myForm) {
//first registration form
		myForm.setName(null);
		myForm.setGender("Male");
		myForm.setDateOfBirth(null);
		myForm.setEmail(null);
		myForm.setPhone("+959");
		myForm.setBloodType(null);
		myForm.setAddress(null);

	}

	public void savePatientReg(PatientForm myPatientForm) {
//save registration 
		Patient regPatient = new Patient();
		regPatient.setPatientId(null);
		regPatient.setPatientLoginName(null);
		regPatient.setPassword(null);
		saveSomeInfo(regPatient, myPatientForm);
		myPatientDao.savePatient(regPatient);
	}

	public void confirmPatientReq(PatientForm myPatientForm) {
		// set username and password for requested patient
		Patient reqpatient = myPatientForm.getPatient();
		int id = reqpatient.getPatientId();
		String loginName = reqpatient.getPatientName().replaceAll("\\s", "").toLowerCase() + id;
		reqpatient.setPatientLoginName(loginName);
		reqpatient.setPassword(function.hashPassword("Patient123"));
		myPatientForm.setAdded("done");
		myPatientDao.savePatient(reqpatient);
	}

	public void addByAdmin(PatientForm myPatientForm) {
		// add patient by admin not from request
		int id = myPatientDao.getLatestId() + 1;
		String loginName = myPatientForm.getName().replaceAll("\\s", "").toLowerCase() + id;
		Patient myPatient = new Patient();
		myPatient.setPatientId(null);
		myPatient.setPatientLoginName(loginName);
		myPatient.setPassword(function.hashPassword("Patient123"));
		saveSomeInfo(myPatient, myPatientForm);
		myPatientForm.setAdded("done");
		myPatientDao.savePatient(myPatient);
	}

	private void saveSomeInfo(Patient patient, PatientForm myPatientForm) {
		// save some information of patient
		patient.setPatientName(myPatientForm.getName());
		patient.setGender(myPatientForm.getGender());
		patient.setDateOfBirth(function.convertStringToDateFormat(myPatientForm.getDateOfBirth()));
		patient.setMail(myPatientForm.getEmail());
		patient.setPhone(myPatientForm.getPhone());
		patient.setBloodType(myPatientForm.getBloodType());
		patient.setAddress(myPatientForm.getAddress());
	}

	public void getPatientbyId(PatientForm myPatientForm) {
		// get patient by id
		Patient patient = myPatientDao.getPatientById(myPatientForm.getPatientid());
		myPatientForm.setPatient(patient);
	}

	public void firstLoadAddbyRequest(PatientForm myPatientForm) {
		// set requested patient's information in add form of admin
		Patient reqpatient = myPatientForm.getPatient();
		myPatientForm.setName(reqpatient.getPatientName());
		myPatientForm.setGender(reqpatient.getGender());
		SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd");
		myPatientForm.setDateOfBirth(myFormat.format(reqpatient.getDateOfBirth()));
		myPatientForm.setEmail(reqpatient.getMail());
		myPatientForm.setPhone(reqpatient.getPhone());
		myPatientForm.setBloodType(reqpatient.getBloodType());
		myPatientForm.setAddress(reqpatient.getAddress());

	}

	public void clearAddForm(PatientForm myForm) {
		// clear add form of admin
		myForm.setUserName(null);
		myForm.setPassword(null);
		firstLoadReg(myForm);

	}

	public void checkLoginPatient(PatientForm myForm) {
		// check login patient with username and password
		String password = function.hashPassword(myForm.getPassword());
		Patient myPatient = myPatientDao.getPatient(myForm.getUserName(), password);
		myForm.setLoginPatient(myPatient);
	}

	public void firstLoadUpdateProfile(PatientForm myPatientForm) {
//show patient profile
		Patient myLoginPatient = myPatientForm.getLoginPatient();

		myPatientForm.setUserName(myLoginPatient.getPatientLoginName());
		myPatientForm.setName(myLoginPatient.getPatientName());
		myPatientForm.setGender(myLoginPatient.getGender());
		SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd");
		myPatientForm.setDateOfBirth(myFormat.format(myLoginPatient.getDateOfBirth()));
		myPatientForm.setEmail(myLoginPatient.getMail());
		myPatientForm.setPhone(myLoginPatient.getPhone());
		myPatientForm.setBloodType(myLoginPatient.getBloodType());
		myPatientForm.setAddress(myLoginPatient.getAddress());

	}

	public void updatePatient(PatientForm myPatientForm) {
//update patient profile
		Patient myLoginPatient = myPatientForm.getLoginPatient();
		saveSomeInfo(myLoginPatient, myPatientForm);
		myPatientDao.savePatient(myLoginPatient);
	}

	public void firstUploadUpdatePS(PatientForm myPatientForm) {
// change password page at first
		myPatientForm.setPassword(null);
		myPatientForm.setNewPassword(null);
		myPatientForm.setConfirmPassword(null);

	}

	public void updatePassword(PatientForm myPatientForm) {
		// patient update password
		Patient myLoginPatient = myPatientForm.getLoginPatient();
		myLoginPatient.setPassword(function.hashPassword(myPatientForm.getNewPassword()));
		myPatientDao.savePatient(myLoginPatient);
	}

	public void countPatient(PatientForm myPatientForm) {
		// count number of patient account and requested patient to show in admin home
		showAllPatients(myPatientForm);
		getReqPerson(myPatientForm);
	}

	public void getReqPerson(PatientForm myPatientForm) {
		// get list of requested patients
		List<Patient> reqPerson = myPatientDao.getReqPatient();
		myPatientForm.setReqPatientList(reqPerson);
	}

	public void showAllPatients(PatientForm myPatientForm) {
		// get all patient accounts
		List<Patient> allPatients = myPatientDao.getPatientAcc();
		if (allPatients != null) {
			setAgetoPatients(allPatients);
		}
		myPatientForm.setAllPatientList(allPatients);
	}

	private void setAgetoPatients(List<Patient> patients) {
		// set age of patients
		for (int i = 0; i < patients.size(); i++) {
			Patient patient = patients.get(i);
			patient.setAge(function.calcAge(patient.getDateOfBirth()));
		}
	}

	public boolean checkEmail(String mail) {
		Patient patient = myPatientDao.getPatientbyEmail(mail);

		return patient == null ? false : true;
	}

	public boolean checkEmailExceptLoginPatient(String mail, int id) {

		Patient patient = myPatientDao.getPatientbyEmailAndId(mail, id);

		return patient == null ? false : true;
	}

	public boolean checkPassword(PatientForm myForm) {
		boolean ps = false;
		String checkPs = function.hashPassword(myForm.getPassword());
		if (checkPs.equals(myForm.getLoginPatient().getPassword()))
			ps = true;
		else
			ps = false;
		return ps;
	}
}
