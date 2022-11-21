package com.HealthCareSystem.presentation.form;

import java.util.List;

import org.apache.struts.action.ActionForm;

import com.HealthCareSystem.business.entity.Doctor;
import com.HealthCareSystem.business.entity.Patient;
import com.HealthCareSystem.business.entity.PatientProgress;

public class ProgressForm extends ActionForm {
//add progress
	private int progressid;
	private int patientid;
	private int doctorid;
	// to add new progress
	private String patientUserName;
	private String doctorUserName;
	private String doctorName;
	private String symptoms;
	private String diseaseName;
	// to change status of requested progress
	private PatientProgress reqProgress;
	// show requested and during treatment and treatment done progress list
	private List<PatientProgress> reqList;
	private List<PatientProgress> progList;
	private List<PatientProgress> doneList;
	private List<Patient> allPatient;
	private List<Doctor> allDoctor;
	private int allProgSize;
	private String added;
	private String frmControl;

	public int getProgressid() {
		return progressid;
	}

	public void setProgressid(int progressid) {
		this.progressid = progressid;
	}

	public int getPatientid() {
		return patientid;
	}

	public void setPatientid(int patientid) {
		this.patientid = patientid;
	}

	public int getDoctorid() {
		return doctorid;
	}

	public void setDoctorid(int doctorid) {
		this.doctorid = doctorid;
	}

	public String getPatientUserName() {
		return patientUserName;
	}

	public void setPatientUserName(String patientUserName) {
		this.patientUserName = patientUserName;
	}

	public String getDoctorUserName() {
		return doctorUserName;
	}

	public void setDoctorUserName(String doctorUserName) {
		this.doctorUserName = doctorUserName;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getSymptoms() {
		return symptoms;
	}

	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}

	public String getDiseaseName() {
		return diseaseName;
	}

	public void setDiseaseName(String diseaseName) {
		this.diseaseName = diseaseName;
	}

	public PatientProgress getReqProgress() {
		return reqProgress;
	}

	public void setReqProgress(PatientProgress reqProgress) {
		this.reqProgress = reqProgress;
	}

	public List<PatientProgress> getReqList() {
		return reqList;
	}

	public void setReqList(List<PatientProgress> reqList) {
		this.reqList = reqList;
	}

	public List<PatientProgress> getProgList() {
		return progList;
	}

	public void setProgList(List<PatientProgress> progList) {
		this.progList = progList;
	}

	public List<PatientProgress> getDoneList() {
		return doneList;
	}

	public void setDoneList(List<PatientProgress> doneList) {
		this.doneList = doneList;
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

	public int getAllProgSize() {
		return allProgSize;
	}

	public void setAllProgSize(int allProgSize) {
		this.allProgSize = allProgSize;
	}

	public List<Patient> getAllPatient() {
		return allPatient;
	}

	public void setAllPatient(List<Patient> allPatient) {
		this.allPatient = allPatient;
	}

	public List<Doctor> getAllDoctor() {
		return allDoctor;
	}

	public void setAllDoctor(List<Doctor> allDoctor) {
		this.allDoctor = allDoctor;
	}

}
