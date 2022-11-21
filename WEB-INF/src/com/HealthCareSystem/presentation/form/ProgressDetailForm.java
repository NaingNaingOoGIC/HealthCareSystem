package com.HealthCareSystem.presentation.form;

import java.util.List;
import org.apache.struts.action.ActionForm;

import com.HealthCareSystem.business.entity.ProgressDetail;

public class ProgressDetailForm extends ActionForm {
//for appointment and add treatment detail
	private int progressid;
	private int progDetailid;
	private int patientid;
	private int doctorid;
	private String patientName;
	private String doctorName;
	private String diseaseName;
	private String reason;
	private String date;
	private String time;
	private String frmControl;
	private String progDetail;
	private String remark;
	private String progStatus;
	private String added;
	// to write pdf
	private List<ProgressDetail> detailList;
	// to show requested, coming and today appointment
	private List<ProgressDetail> reqApptList;
	private List<ProgressDetail> comingApptList;
	private List<ProgressDetail> todayApptList;
	private ProgressDetail oneProgDetail;
	private String path;

	public int getProgressid() {
		return progressid;
	}

	public void setProgressid(int progressid) {
		this.progressid = progressid;
	}

	public int getProgDetailid() {
		return progDetailid;
	}

	public void setProgDetailid(int progDetailid) {
		this.progDetailid = progDetailid;
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

	public String getProgDetail() {
		return progDetail;
	}

	public void setProgDetail(String progDetail) {
		this.progDetail = progDetail;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getProgStatus() {
		return progStatus;
	}

	public void setProgStatus(String progStatus) {
		this.progStatus = progStatus;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getDiseaseName() {
		return diseaseName;
	}

	public void setDiseaseName(String diseaseName) {
		this.diseaseName = diseaseName;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getFrmControl() {
		return frmControl;
	}

	public void setFrmControl(String frmControl) {
		this.frmControl = frmControl;
	}

	public List<ProgressDetail> getDetailList() {
		return detailList;
	}

	public void setDetailList(List<ProgressDetail> detailList) {
		this.detailList = detailList;
	}

	public List<ProgressDetail> getReqApptList() {
		return reqApptList;
	}

	public void setReqApptList(List<ProgressDetail> reqApptList) {
		this.reqApptList = reqApptList;
	}

	public List<ProgressDetail> getComingApptList() {
		return comingApptList;
	}

	public void setComingApptList(List<ProgressDetail> comingApptList) {
		this.comingApptList = comingApptList;
	}

	public List<ProgressDetail> getTodayApptList() {
		return todayApptList;
	}

	public void setTodayApptList(List<ProgressDetail> todayApptList) {
		this.todayApptList = todayApptList;
	}

	public ProgressDetail getOneProgDetail() {
		return oneProgDetail;
	}

	public void setOneProgDetail(ProgressDetail oneProgDetail) {
		this.oneProgDetail = oneProgDetail;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getAdded() {
		return added;
	}

	public void setAdded(String added) {
		this.added = added;
	}

}
