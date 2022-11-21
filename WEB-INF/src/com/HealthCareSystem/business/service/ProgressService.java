package com.HealthCareSystem.business.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.HealthCareSystem.business.entity.Doctor;
import com.HealthCareSystem.business.entity.Patient;
import com.HealthCareSystem.business.entity.PatientProgress;
import com.HealthCareSystem.dao.DoctorDao;
import com.HealthCareSystem.dao.PatientDao;
import com.HealthCareSystem.dao.ProgressDao;
import com.HealthCareSystem.presentation.form.ProgressForm;

public class ProgressService {

	private ProgressDao myProgressDao;
	private PatientDao myPatientDao;
	private DoctorDao myDoctorDao;

	public ProgressDao getMyProgressDao() {
		return myProgressDao;
	}

	public void setMyProgressDao(ProgressDao myProgressDao) {
		this.myProgressDao = myProgressDao;
	}

	public PatientDao getMyPatientDao() {
		return myPatientDao;
	}

	public void setMyPatientDao(PatientDao myPatientDao) {
		this.myPatientDao = myPatientDao;
	}

	public DoctorDao getMyDoctorDao() {
		return myDoctorDao;
	}

	public void setMyDoctorDao(DoctorDao myDoctorDao) {
		this.myDoctorDao = myDoctorDao;
	}

	public void getProgressbyId(ProgressForm myForm) {
		// get progress by id
		PatientProgress prog = myProgressDao.getProgbyId(myForm.getProgressid());
		myForm.setReqProgress(prog);
	}

	public void setReqProg(ProgressForm myForm) {
		// get requested progress list by patient
		List<PatientProgress> reqList = myProgressDao.getProgListByStatus("request");
		if (reqList != null) {
			myForm.setReqList(reqList);
		} else
			myForm.setReqList(null);
	}

	public void setStillProgress(ProgressForm myForm) {
		// get all during treatment list
		List<PatientProgress> progList = myProgressDao.getProgListByStatus("confirmed");
		if (progList != null) {
			myForm.setProgList(progList);
		}
	}

	public void setDoneProgress(ProgressForm myForm) {
		// get all treatment done progress
		List<PatientProgress> doneProg = myProgressDao.getProgListByStatus("done");
		if (doneProg != null)
			myForm.setDoneList(doneProg);
		else
			myForm.setDoneList(null);
	}

	public void firstLoadReqProg(ProgressForm myForm) {
		// set information of requested progress to add form
		PatientProgress prog = myForm.getReqProgress();
		myForm.setPatientUserName(prog.getPatient().getPatientId() + "");
		myForm.setDoctorUserName(prog.getDoctor().getDoctorId() + "");
		myForm.setAllDoctor(myDoctorDao.getAvailableDoctorbyDeptId(prog.getDoctor().getDepartment().getDepartmentId()));
		myForm.setSymptoms(prog.getSymptoms());
	}

	public void clearAddForm(ProgressForm myForm) {
		// clear add progress form
		myForm.setPatientUserName("");
		myForm.setDoctorUserName("");
		myForm.setAllDoctor(myDoctorDao.getAvailableDoctor());
		myForm.setAllPatient(myPatientDao.getPatientAcc());
		myForm.setSymptoms(null);

	}

	public void confirmPatientReq(ProgressForm myForm) {
//confirm patient requested progress
		PatientProgress reqProg = myForm.getReqProgress();
		Doctor doctor = myDoctorDao.getDoctorById(Integer.parseInt(myForm.getDoctorUserName()));
		reqProg.setDoctor(doctor);
		reqProg.setStatus("confirmed");
		myProgressDao.saveProg(reqProg);
		myForm.setAdded("done");
	}

	public void addByAdmin(ProgressForm myForm) {
		// add progress by admin
		PatientProgress prog = new PatientProgress();
		prog.setProgressId(null);
		Patient patient = myPatientDao.getPatientById(Integer.parseInt(myForm.getPatientUserName()));
		Doctor doctor = myDoctorDao.getDoctorById(Integer.parseInt(myForm.getDoctorUserName()));
		prog.setPatient(patient);
		prog.setDoctor(doctor);
		prog.setDiseaseName(null);
		prog.setSymptoms(myForm.getSymptoms());
		prog.setStatus("confirmed");
		myProgressDao.saveProg(prog);
		myForm.setAdded("done");

	}

	public void getProgByPatientID(ProgressForm myForm, int patientId) {
//get progress both during treatment and treatment done by patient id
		Patient patient = myPatientDao.getPatientById(patientId);
		List<PatientProgress> patientProg = new ArrayList<PatientProgress>(patient.getPatientProgresses());
		List<PatientProgress> patientStillProg = new ArrayList();
		List<PatientProgress> patientDoneProg = new ArrayList();
		if (patientProg != null)
			for (int i = 0; i < patientProg.size(); i++) {
				PatientProgress prog = patientProg.get(i);
				if (prog.getStatus().equals("confirmed"))
					patientStillProg.add(prog);
				else if (prog.getStatus().equals("done"))
					patientDoneProg.add(prog);
			}
		myForm.setProgList(patientStillProg);
		myForm.setDoneList(patientDoneProg);
		myForm.setPatientid(0);
	}

	public void getProgByDoctorID(ProgressForm myForm, int doctorid) {
		// get progress both during treatment and treatment done by doctor id
		Doctor doctor = myDoctorDao.getDoctorById(doctorid);
		List<PatientProgress> doctorProg = new ArrayList<PatientProgress>(doctor.getPatientProgresses());
		List<PatientProgress> doctorStillProg = new ArrayList();
		List<PatientProgress> doctorDoneProg = new ArrayList();
		if (doctorProg != null)
			for (int i = 0; i < doctorProg.size(); i++) {
				PatientProgress prog = doctorProg.get(i);
				if (prog.getStatus().equals("confirmed"))
					doctorStillProg.add(prog);
				else if (prog.getStatus().equals("done"))
					doctorDoneProg.add(prog);
			}
		myForm.setProgList(doctorStillProg);
		myForm.setDoneList(doctorDoneProg);
		myForm.setDoctorid(0);
	}

	public void setDoctorNameById(ProgressForm myForm, int doctorid) {
		// set doctor name in patient request progress form
		Doctor doctor = myDoctorDao.getDoctorById(doctorid);
		myForm.setDoctorName(doctor.getDoctorName());
	}

	public void requestProg(ProgressForm myForm, Patient patient) {
//save requested progress by patient 
		PatientProgress reqProg = new PatientProgress();
		reqProg.setProgressId(null);
		reqProg.setPatient(patient);
		reqProg.setDoctor(myDoctorDao.getDoctorById(myForm.getDoctorid()));
		reqProg.setDiseaseName(null);
		reqProg.setSymptoms(myForm.getSymptoms());
		reqProg.setStatus("request");
		myProgressDao.saveProg(reqProg);

	}

	public void setProgCount(ProgressForm prgoressForm) {
		List<PatientProgress> allProg = myProgressDao.getAllProg();
		List<PatientProgress> reqProg = new ArrayList();
		List<PatientProgress> doneProg = new ArrayList();
		List<PatientProgress> stillProg = new ArrayList();
		prgoressForm.setAllProgSize(allProg.size());
		Iterator itr = allProg.iterator();
		while (itr.hasNext()) {
			PatientProgress prog = (PatientProgress) itr.next();
			if (prog.getStatus().equals("request"))
				reqProg.add(prog);
			else if (prog.getStatus().equals("done"))
				doneProg.add(prog);
			else
				stillProg.add(prog);
		}
		prgoressForm.setReqList(reqProg);
		prgoressForm.setDoneList(doneProg);
		prgoressForm.setProgList(stillProg);
	}
}