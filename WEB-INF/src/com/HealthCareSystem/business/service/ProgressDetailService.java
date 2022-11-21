package com.HealthCareSystem.business.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.HealthCareSystem.business.entity.Doctor;
import com.HealthCareSystem.business.entity.Patient;
import com.HealthCareSystem.business.entity.PatientProgress;
import com.HealthCareSystem.business.entity.ProgressDetail;
import com.HealthCareSystem.dao.DoctorDao;
import com.HealthCareSystem.dao.PatientDao;
import com.HealthCareSystem.dao.ProgressDao;
import com.HealthCareSystem.dao.ProgressDetailDao;
import com.HealthCareSystem.presentation.form.ProgressDetailForm;
import com.itextpdf.text.Document;

public class ProgressDetailService {

	private ProgressDetailDao myProgressDetailDao;
	private ProgressDao myProgressDao;
	private PatientDao myPatientDao;
	private DoctorDao myDoctorDao;
	private CommonFunctions function = new CommonFunctions();

	public ProgressDetailDao getMyProgressDetailDao() {
		return myProgressDetailDao;
	}

	public void setMyProgressDetailDao(ProgressDetailDao myProgressDetailDao) {
		this.myProgressDetailDao = myProgressDetailDao;
	}

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

	public void getDetailList(ProgressDetailForm myForm) {
		// get progress detail list by progress id and appointment status must be done
		PatientProgress progress = myProgressDao.getProgbyId(myForm.getProgressid());
		List<ProgressDetail> detailList = new ArrayList<ProgressDetail>(progress.getProgressDetails());
		Iterator itr = detailList.iterator();
		while (itr.hasNext()) {
			ProgressDetail detail = (ProgressDetail) itr.next();
			if (!detail.getAppointmentStatus().equals("done"))
				itr.remove();
		}
		myForm.setDetailList(detailList);
	}

	public void getreqApptList(ProgressDetailForm myForm) {
		// get requested appointment list
		String status = "request";
		List<ProgressDetail> reqApptList = myProgressDetailDao.getDetailByStatus(status);
		myForm.setReqApptList(reqApptList);
	}

	public void getComingApptList(ProgressDetailForm myForm) {
//get all next day appointment 
		List<ProgressDetail> comingApptList = myProgressDetailDao.getComingAppt();
		if (comingApptList != null) {
			for (int i = 0; i < comingApptList.size(); i++) {
				ProgressDetail appt = comingApptList.get(i);
				appt.setApptTime(function.convert24TimeToString(appt.getAppointmentTime()));
			}
			myForm.setComingApptList(comingApptList);
		} else
			myForm.setComingApptList(null);
	}

	public void getTodayApptList(ProgressDetailForm myForm) {
//get all today appointments
		List<ProgressDetail> todayApptList = myProgressDetailDao.getTodayAppt();
		if (todayApptList != null) {
			for (int i = 0; i < todayApptList.size(); i++) {
				ProgressDetail appt = todayApptList.get(i);
				appt.setApptTime(function.convert24TimeToString(appt.getAppointmentTime()));
			}
			myForm.setTodayApptList(todayApptList);
		} else
			myForm.setTodayApptList(null);
	}

	public void confirmApptReq(ProgressDetailForm myForm) {
//change date or time and status of patient requested appointment
		ProgressDetail confirmAppt = myForm.getOneProgDetail();
		confirmAppt.setAppointmentDate(function.convertStringToDateFormat(myForm.getDate()));
		confirmAppt.setAppointmentTime(function.convertStringTo24HourFormat(myForm.getTime()));
		confirmAppt.setAppointmentStatus("confirmed");
		myProgressDetailDao.saveProgDetail(confirmAppt);
		myForm.setAdded("done");
		myForm.setProgDetailid(0);
	}

	public void addApptByAdminorDoctor(ProgressDetailForm myForm) {
		// add new appointment by admin or doctor
		ProgressDetail addAppt = new ProgressDetail();
		PatientProgress prog = myProgressDao.getProgbyId(myForm.getProgressid());
		addAppt.setProgressDetailId(null);
		addAppt.setPatientProgress(prog);
		addAppt.setAppointmentDate(function.convertStringToDateFormat(myForm.getDate()));
		addAppt.setAppointmentTime(function.convertStringTo24HourFormat(myForm.getTime()));
		addAppt.setAppointmentStatus("confirmed");
		addAppt.setReason(myForm.getReason());
		myProgressDetailDao.saveProgDetail(addAppt);
		myForm.setAdded("done");
		myForm.setProgressid(0);
	}

	public void reqApptByPatient(ProgressDetailForm myForm) {
//request progress by patient
		ProgressDetail reqAppt = new ProgressDetail();
		reqAppt.setProgressDetailId(null);
		reqAppt.setPatientProgress(myProgressDao.getProgbyId(myForm.getProgressid()));
		reqAppt.setAppointmentDate(function.convertStringToDateFormat(myForm.getDate()));

		reqAppt.setAppointmentTime(function.convertStringTo24HourFormat(myForm.getTime()));
		reqAppt.setAppointmentStatus("request");
		reqAppt.setReason(myForm.getReason());
		reqAppt.setProgressDescription(null);
		reqAppt.setRemark(null);
		myProgressDetailDao.saveProgDetail(reqAppt);

	}

	public void writeDoc(Document document, ProgressDetailForm myForm) {
		// write progress history
		function.writeDoc(document, myForm.getDetailList());
	}

	public void getByProgDetailId(ProgressDetailForm myForm) {
		// get progress detail by id

		ProgressDetail appt = myProgressDetailDao.getProgDetailById(myForm.getProgDetailid());
		myForm.setOneProgDetail(appt);
	}

	public void firstLoadReqAppt(ProgressDetailForm myForm) {
		// set appointment information of requested appointment by patient
		ProgressDetail appt = myForm.getOneProgDetail();
		myForm.setPatientName(appt.getPatientProgress().getPatient().getPatientName());
		myForm.setDoctorName(appt.getPatientProgress().getDoctor().getDoctorName());
		myForm.setDiseaseName(appt.getPatientProgress().getDiseaseName());
		myForm.setReason(appt.getReason());
		myForm.setDate(appt.getAppointmentDate().toString());
		myForm.setTime(function.convert24TimeToString(appt.getAppointmentTime()));
		myForm.setAdded(null);
	}

	public void loadApptAddByProgid(ProgressDetailForm myForm) {
		// set some information to add new appointment by progress id

		PatientProgress prog = myProgressDao.getProgbyId(myForm.getProgressid());
		myForm.setPatientName(prog.getPatient().getPatientName());
		myForm.setDoctorName(prog.getDoctor().getDoctorName());
		myForm.setDiseaseName(prog.getDiseaseName());
		myForm.setAdded(null);
	}

	public void clearAddForm(ProgressDetailForm myForm) {
		// clear add appointment form
		myForm.setPatientName(null);
		myForm.setDoctorName(null);
		myForm.setDiseaseName(null);
		myForm.setReason(null);
		myForm.setDate(null);
		myForm.setTime(null);
	}

	public void getApptByPatientId(ProgressDetailForm myForm, int patientId) {
		// get all appointment by patient id
		Patient patient = myPatientDao.getPatientById(patientId);
		List<PatientProgress> patientProg = new ArrayList<PatientProgress>(patient.getPatientProgresses());
		divideAppointment(myForm, patientProg);
		myForm.setPatientid(0);
	}

	public void getApptByDoctorId(ProgressDetailForm myForm, int doctorId) {
		// get all appointment by doctor id
		Doctor doctor = myDoctorDao.getDoctorById(doctorId);
		List<PatientProgress> doctorProg = new ArrayList<PatientProgress>(doctor.getPatientProgresses());
		divideAppointment(myForm, doctorProg);
		myForm.setDoctorid(0);
	}

	private void divideAppointment(ProgressDetailForm myForm, List<PatientProgress> list) {
		// divide appointment is today or next day
		List<ProgressDetail> allAppt = null;
		List<ProgressDetail> today = new ArrayList();
		List<ProgressDetail> nextday = new ArrayList();
		LocalDateTime now = LocalDateTime.now();
		Date todaydate = function.convertStringToDateFormat(now + "");
		String status = "confirmed";
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			PatientProgress patientprog = (PatientProgress) itr.next();
			if (patientprog.getStatus().equals(status)) {
				allAppt = new ArrayList<ProgressDetail>(patientprog.getProgressDetails());
				Iterator itrappt = allAppt.iterator();
				while (itrappt.hasNext()) {
					ProgressDetail detail = (ProgressDetail) itrappt.next();
					if (!detail.getAppointmentStatus().equals(status))
						itrappt.remove();
				}
				if (allAppt.size() != 0) {
					Iterator apptitr = allAppt.iterator();
					while (apptitr.hasNext()) {
						ProgressDetail appt = (ProgressDetail) apptitr.next();
						if (appt.getAppointmentDate().compareTo(todaydate) == 0) {
							today.add(appt);
						} else if (appt.getAppointmentDate().compareTo(todaydate) > 0) {
							nextday.add(appt);
						}
					}
				}
			}
		}

		if (today.size() == 0)
			myForm.setTodayApptList(null);
		else {

			for (int i = 0; i < today.size(); i++) {
				ProgressDetail appt = today.get(i);
				appt.setApptTime(function.convert24TimeToString(appt.getAppointmentTime()));
			}
			myForm.setTodayApptList(today);

		}
		if (nextday.size() == 0)
			myForm.setComingApptList(null);

		else {

			// sort list by date
			Collections.sort(nextday, new Comparator<ProgressDetail>() {
				public int compare(ProgressDetail o1, ProgressDetail o2) {
					if (o1.getAppointmentDate() == null || o2.getAppointmentDate() == null)
						return 0;
					return o1.getAppointmentDate().compareTo(o2.getAppointmentDate());
				}
			});

			for (int i = 0; i < nextday.size(); i++) {
				ProgressDetail appt = nextday.get(i);
				appt.setApptTime(function.convert24TimeToString(appt.getAppointmentTime()));
			}
			myForm.setComingApptList(nextday);

		}
	}

	public void deletAppointment(ProgressDetailForm myForm) {
		// delete progress detail physically i.e. delete appointment
		myProgressDetailDao.deleteAppointment(myForm.getProgDetailid());
		myForm.setProgDetailid(0);
	}

	public void uploadDiseaseName(ProgressDetailForm myForm) {
		// set disease name in doctor add progress detail form
		ProgressDetail progDetail = myProgressDetailDao.getProgDetailById(myForm.getProgDetailid());
		myForm.setDiseaseName(progDetail.getPatientProgress().getDiseaseName());
	}

	public void uploadPatientNameAndDiseaseName(ProgressDetailForm myForm) {
		// get patient name and disease name by progress id
		PatientProgress prog = myProgressDao.getProgbyId(myForm.getProgressid());
		myForm.setPatientName(prog.getPatient().getPatientName());
		myForm.setDiseaseName(prog.getDiseaseName());
		myForm.setDate(null);
		myForm.setTime(null);
		myForm.setReason(null);
	}

	public void addProgDetail(ProgressDetailForm myForm) {
//add progress detail by doctor
		ProgressDetail progDetail = myProgressDetailDao.getProgDetailById(myForm.getProgDetailid());
		PatientProgress progress = progDetail.getPatientProgress();
		progress.setDiseaseName(myForm.getDiseaseName());
		myProgressDao.saveProg(progress);
		progDetail.setProgressDescription(myForm.getProgDetail());
		progDetail.setRemark(myForm.getRemark());
		progDetail.setAppointmentStatus("done");
		myProgressDetailDao.saveProgDetail(progDetail);
		if (myForm.getProgStatus() != null) {
			PatientProgress prog = progDetail.getPatientProgress();
			prog.setStatus("done");
			myProgressDao.saveProg(prog);
		}

	}

	public void loadReqAppt(ProgressDetailForm myForm, int patientId) {
		// first load for to request appointment by patient
		PatientProgress reqProg = myProgressDao.getProgbyId(myForm.getProgressid());
		myForm.setDoctorName(reqProg.getDoctor().getDoctorName());
		myForm.setDiseaseName(reqProg.getDiseaseName());

	}
}