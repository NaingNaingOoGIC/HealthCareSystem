package com.HealthCareSystem.business.entity;
// Generated Jul 23, 2022, 6:48:25 PM by Hibernate Tools 4.3.6.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Patient generated by hbm2java
 */
public class Patient implements java.io.Serializable {

	private Integer patientId;
	private String patientLoginName;
	private String password;
	private String patientName;
	private String gender;
	private Date dateOfBirth;
	private int age;
	private String mail;
	private String phone;
	private String bloodType;
	private String address;
	private Set<PatientProgress> patientProgresses = new HashSet<PatientProgress>(0);

	public Patient() {
	}

	public Patient(String patientName, String gender, Date dateOfBirth, String mail, String phone, String address) {
		this.patientName = patientName;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.mail = mail;
		this.phone = phone;
		this.address = address;
	}

	public Patient(String patientLoginName, String password, String patientName, String gender, Date dateOfBirth,
			String mail, String phone, String bloodType, String address, Set<PatientProgress> patientProgresses) {
		this.patientLoginName = patientLoginName;
		this.password = password;
		this.patientName = patientName;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.mail = mail;
		this.phone = phone;
		this.bloodType = bloodType;
		this.address = address;
		this.patientProgresses = patientProgresses;
	}

	public Integer getPatientId() {
		return this.patientId;
	}

	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}

	public String getPatientLoginName() {
		return this.patientLoginName;
	}

	public void setPatientLoginName(String patientLoginName) {
		this.patientLoginName = patientLoginName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPatientName() {
		return this.patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDateOfBirth() {
		return this.dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMail() {
		return this.mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getBloodType() {
		return this.bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Set<PatientProgress> getPatientProgresses() {
		return this.patientProgresses;
	}

	public void setPatientProgresses(Set<PatientProgress> patientProgresses) {
		this.patientProgresses = patientProgresses;
	}

}
