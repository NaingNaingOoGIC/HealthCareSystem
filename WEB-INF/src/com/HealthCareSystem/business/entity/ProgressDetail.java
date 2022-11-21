package com.HealthCareSystem.business.entity;
// Generated Jul 23, 2022, 6:48:25 PM by Hibernate Tools 4.3.6.Final

import java.util.Date;

/**
 * ProgressDetail generated by hbm2java
 */
public class ProgressDetail implements java.io.Serializable {

	private Integer progressDetailId;
	private PatientProgress patientProgress;
	private Date appointmentDate;
	private Date appointmentTime;
	private String apptTime;
	private String appointmentStatus;
	private String reason;
	private String progressDescription;
	private String remark;

	public ProgressDetail() {
	}

	public ProgressDetail(PatientProgress patientProgress, Date appointmentDate, Date appointmentTime,
			String appointmentStatus, String reason) {
		this.patientProgress = patientProgress;
		this.appointmentDate = appointmentDate;
		this.appointmentTime = appointmentTime;
		this.appointmentStatus = appointmentStatus;
		this.reason = reason;
	}

	public ProgressDetail(PatientProgress patientProgress, Date appointmentDate, Date appointmentTime,
			String appointmentStatus, String reason, String progressDescription, String remark) {
		this.patientProgress = patientProgress;
		this.appointmentDate = appointmentDate;
		this.appointmentTime = appointmentTime;
		this.appointmentStatus = appointmentStatus;
		this.reason = reason;
		this.progressDescription = progressDescription;
		this.remark = remark;
	}

	public Integer getProgressDetailId() {
		return this.progressDetailId;
	}

	public void setProgressDetailId(Integer progressDetailId) {
		this.progressDetailId = progressDetailId;
	}

	public PatientProgress getPatientProgress() {
		return this.patientProgress;
	}

	public void setPatientProgress(PatientProgress patientProgress) {
		this.patientProgress = patientProgress;
	}

	public Date getAppointmentDate() {
		return this.appointmentDate;
	}

	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public Date getAppointmentTime() {
		return this.appointmentTime;
	}

	public void setAppointmentTime(Date appointmentTime) {
		this.appointmentTime = appointmentTime;
	}

	public String getApptTime() {
		return apptTime;
	}

	public void setApptTime(String apptTime) {
		this.apptTime = apptTime;
	}

	public String getAppointmentStatus() {
		return this.appointmentStatus;
	}

	public void setAppointmentStatus(String appointmentStatus) {
		this.appointmentStatus = appointmentStatus;
	}

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getProgressDescription() {
		return this.progressDescription;
	}

	public void setProgressDescription(String progressDescription) {
		this.progressDescription = progressDescription;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}