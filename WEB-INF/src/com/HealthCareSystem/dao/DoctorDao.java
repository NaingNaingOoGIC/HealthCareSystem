package com.HealthCareSystem.dao;

import java.util.List;

import com.HealthCareSystem.business.entity.Doctor;

public interface DoctorDao {

	public Doctor getDoctor(String userName, String password);

	public Doctor getDoctorById(int id);

	public void saveDoctor(Doctor myDoctor);

	public List<Doctor> getAvailableDoctor();

	public List<Doctor> getUnAvailableDoctor();

	public List<Doctor> searchDoctorbyName(String search, String status);

	public List<Doctor> getAvailableDoctorbyDeptId(int id);

	public int getLatestId();

}
