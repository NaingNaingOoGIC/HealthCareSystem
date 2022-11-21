package com.HealthCareSystem.dao;

import java.util.List;

import com.HealthCareSystem.business.entity.Patient;

public interface PatientDao {

	public Patient getPatient(String userName, String password);

	public Patient getPatientById(int patientId);

	public void savePatient(Patient myPatient);

	public List<Patient> getReqPatient();

	public List<Patient> getPatientAcc();

	public Patient getPatientbyEmail(String mail);

	public Patient getPatientbyEmailAndId(String email, Integer patientId);

	public int getLatestId();

}
