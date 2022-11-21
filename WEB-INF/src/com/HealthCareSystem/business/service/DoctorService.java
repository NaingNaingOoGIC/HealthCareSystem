package com.HealthCareSystem.business.service;

import java.nio.file.Files;
import java.nio.file.Path;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.HealthCareSystem.business.entity.Department;
import com.HealthCareSystem.business.entity.Doctor;
import com.HealthCareSystem.business.entity.PatientProgress;
import com.HealthCareSystem.business.entity.ProgressDetail;
import com.HealthCareSystem.dao.DepartmentDao;
import com.HealthCareSystem.dao.DoctorDao;
/*import com.HealthCareSystem.presentation.form.AdminForm;
import com.HealthCareSystem.presentation.form.DepartmentForm;*/
import com.HealthCareSystem.presentation.form.DoctorForm;

public class DoctorService {

	private DoctorDao myDoctorDao;

	private DepartmentDao myDeptDao;

	private CommonFunctions function = new CommonFunctions();

	public DoctorDao getMyDoctorDao() {
		return myDoctorDao;
	}

	public void setMyDoctorDao(DoctorDao myDoctorDao) {
		this.myDoctorDao = myDoctorDao;
	}

	public DepartmentDao getMyDeptDao() {
		return myDeptDao;
	}

	public void setMyDeptDao(DepartmentDao myDeptDao) {
		this.myDeptDao = myDeptDao;
	}

	public void firstLoadaddDoctor(DoctorForm myForm) {
		// first load add form to add doctor
		List<Department> deptList = myDeptDao.getAvailableDepartment();
		myForm.setName(null);
		myForm.setGender("Male");
		myForm.setDeptList(deptList);
		myForm.setDegreeList(degree());
		myForm.setDegree("select");
		myForm.setDepartment("0");
		myForm.setDateOfBirth(null);
		myForm.setEmail(null);
		myForm.setPhone("+959");
		myForm.setBloodType(null);
		myForm.setAddress(null);
		myForm.setBiography(null);

	}

	public void addNewDoctor(DoctorForm myForm) {
		// add doctor
		Doctor newDoctor = new Doctor();
		Department dept = myDeptDao.getDeptById(Integer.parseInt(myForm.getDepartment()));
		int id = myDoctorDao.getLatestId() + 1;
		String deptName[] = dept.getDepartmentName().split(" ", 2);
		String loginName = myForm.getName().replaceAll("\\s", "").toLowerCase() + id + "@" + deptName[0].toLowerCase();
		newDoctor.setDoctorId(null);
		newDoctor.setDoctorLoginName(loginName);
		newDoctor.setPassword(function.hashPassword("Doctor123"));
		newDoctor.setDoctorName(myForm.getName());
		newDoctor.setDepartment(dept);
		newDoctor.setGender(myForm.getGender());
		newDoctor.setDateOfBirth(function.convertStringToDateFormat(myForm.getDateOfBirth()));
		newDoctor.setDegree(myForm.getDegree());
		newDoctor.setDoctorBiography(myForm.getBiography());
		newDoctor.setMail(myForm.getEmail());
		newDoctor.setPhone(myForm.getPhone());
		newDoctor.setAddress(myForm.getAddress());
		newDoctor.setBloodType(null);
		newDoctor.setStatus("available");
		myDoctorDao.saveDoctor(newDoctor);
		myForm.setUserName(loginName);
		myForm.setPassword("Doctor123");
	}

	public void checkLoginDoctor(DoctorForm myForm) {
		// check login doctor with username and password
		Doctor myDoctor = myDoctorDao.getDoctor(myForm.getUserName(), function.hashPassword(myForm.getPassword()));
		myForm.setLoginDoctor(myDoctor);
	}

	public void firstLoadUpdateProfile(DoctorForm myDoctorForm) {
		// show doctor profile
		Doctor myLoginDoctor = myDoctorForm.getLoginDoctor();

		myDoctorForm.setUserName(myLoginDoctor.getDoctorLoginName());
		myDoctorForm.setName(myLoginDoctor.getDoctorName());
		myDoctorForm.setGender(myLoginDoctor.getGender());
		myDoctorForm.setDegree(myLoginDoctor.getDegree());
		myDoctorForm.setDegreeList(degree());
		SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd");
		myDoctorForm.setDateOfBirth(myFormat.format(myLoginDoctor.getDateOfBirth()));
		myDoctorForm.setEmail(myLoginDoctor.getMail());
		myDoctorForm.setPhone(myLoginDoctor.getPhone());
		myDoctorForm.setBloodType(myLoginDoctor.getBloodType());
		myDoctorForm.setAddress(myLoginDoctor.getAddress());
		myDoctorForm.setBiography(myLoginDoctor.getDoctorBiography());

	}

	public void updateDoctor(DoctorForm myDoctorForm) {
		// update doctor profile
		Doctor myLoginDoctor = myDoctorForm.getLoginDoctor();
		myLoginDoctor.setDoctorName(myDoctorForm.getName());
		myLoginDoctor.setGender(myDoctorForm.getGender());
		myLoginDoctor.setDateOfBirth(function.convertStringToDateFormat(myDoctorForm.getDateOfBirth()));
		myLoginDoctor.setDegree(myDoctorForm.getDegree());
		myLoginDoctor.setMail(myDoctorForm.getEmail());
		myLoginDoctor.setPhone(myDoctorForm.getPhone());
		myLoginDoctor.setBloodType(myDoctorForm.getBloodType());
		myLoginDoctor.setAddress(myDoctorForm.getAddress());
		myLoginDoctor.setDoctorBiography(myDoctorForm.getBiography());
		myDoctorDao.saveDoctor(myLoginDoctor);
	}

	public void firstUploadUpdatePS(DoctorForm myDoctorForm) {
		// show before update password
		myDoctorForm.setPassword(null);
		myDoctorForm.setNewPassword(null);
		myDoctorForm.setConfirmPassword(null);

	}

	public void updatePassword(DoctorForm myDoctorForm) {
		// update doctor password
		Doctor myLoginDoctor = myDoctorForm.getLoginDoctor();
		myLoginDoctor.setPassword(function.hashPassword(myDoctorForm.getNewPassword()));
		myDoctorDao.saveDoctor(myLoginDoctor);

	}

	public void showAvailableDoctor(DoctorForm myForm) {
//show available doctor in admin view doctors
		List<Doctor> doctorList = myDoctorDao.getAvailableDoctor();
		List<Department> deptList = myDeptDao.getAvailableDepartment();
		myForm.setDeptList(deptList);
		myForm.setDepartment("0");
		setAge(doctorList);
		myForm.setAvailableDoctorList(doctorList);
	}

	public void searchAvaDoctor(DoctorForm myForm) {
		// search doctor by name and status available
		List<Doctor> searchList = myDoctorDao.searchDoctorbyName(myForm.getName(), "available");
		setAge(searchList);
		myForm.setAvailableDoctorList(searchList);

	}

	public void showUnAvailableDoctor(DoctorForm myForm) {
		// show unavailable doctor in admin view doctors
		List<Doctor> doctorList = myDoctorDao.getUnAvailableDoctor();
		setAge(doctorList);
		myForm.setUnAvailableDoctorList(doctorList);
	}

	public void getActionDoctor(DoctorForm myForm) {
		// get doctor by id
		Doctor doctor = myDoctorDao.getDoctorById(myForm.getDoctorid());
		myForm.setActionDoctor(doctor);
	}

	public void deleteDoctor(DoctorForm myForm) {
		// change status of doctor to unavailable

		Doctor deleteDoctor = myDoctorDao.getDoctorById(myForm.getDeleteId());
		deleteDoctor.setStatus("unavailable");
		myDoctorDao.saveDoctor(deleteDoctor);
	}

	public void returnDoctor(DoctorForm myForm) {
		// change status of doctor to unavailable
		Doctor returnDoctor = myDoctorDao.getDoctorById(myForm.getDeleteId());
		returnDoctor.setStatus("available");
		myDoctorDao.saveDoctor(returnDoctor);
	}

	public List<Doctor> findDoctor(String doctorName) {
		List<Doctor> doctorList = myDoctorDao.searchDoctorbyName(doctorName, "available");
		setAge(doctorList);
		return doctorList;
	}

	public List<Doctor> getByDept(int id) {
		List<Doctor> doctorList = new ArrayList<Doctor>(myDeptDao.getDeptById(id).getDoctors());

		Iterator doctorIterator = doctorList.iterator();
		while (doctorIterator.hasNext()) {
			Doctor doctor = (Doctor) doctorIterator.next();
			if (!doctor.getStatus().equals("available"))
				doctorIterator.remove();

		}
		setAge(doctorList);
		DoctorForm myForm = new DoctorForm();
		myForm.setAvailableDoctorList(doctorList);
		return doctorList;
	}

	private void setAge(List<Doctor> doctorList) {
		// set age of doctors
		if (doctorList != null)
			for (int i = 0; i < doctorList.size(); i++) {
				Doctor doctor = doctorList.get(i);
				doctor.setAge(function.calcAge(doctor.getDateOfBirth()));
			}
	}

	public void showDoctorbyDept(DoctorForm myForm) {
		// show just available doctor in search by department
		Department dept = myDeptDao.getDeptById(myForm.getDeptid());
		List<Doctor> alldoctor = new ArrayList<Doctor>(dept.getDoctors());
		List<Doctor> avaDoctor = new ArrayList<Doctor>();
		List<Doctor> unavaDoctor = new ArrayList<Doctor>();
		for (int i = 0; i < alldoctor.size(); i++) {
			if (alldoctor.get(i).getStatus().equals("unavailable")) {
				unavaDoctor.add(alldoctor.get(i));

			} else
				avaDoctor.add(alldoctor.get(i));
		}
		setAge(avaDoctor);
		setAge(unavaDoctor);
		myForm.setAvailableDoctorList(avaDoctor);
		myForm.setUnAvailableDoctorList(unavaDoctor);

	}

	public boolean checkPassword(DoctorForm myForm) {
		boolean ps = false;
		String checkPs = function.hashPassword(myForm.getPassword());
		if (checkPs.equals(myForm.getLoginDoctor().getPassword()))
			ps = true;
		else
			ps = false;
		return ps;
	}

	private List<String> degree() {

		Path fileName = Path.of("D:\\Training\\J2EE\\HealthCareSystem\\degree.txt");
		List<String> list = new ArrayList<String>();
		try {
			String str = Files.readString(fileName);
			String[] arrSplit = str.split(", ");
			list = Arrays.asList(arrSplit);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return list;
	}

	public List<String> degreeWirte(String degree) {
		String degreeString = ", " + degree;
		try {
			Files.write(Paths.get("D:\\Training\\J2EE\\HealthCareSystem\\degree.txt"), degreeString.getBytes(),
					StandardOpenOption.APPEND);
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		return degree();
	}
}