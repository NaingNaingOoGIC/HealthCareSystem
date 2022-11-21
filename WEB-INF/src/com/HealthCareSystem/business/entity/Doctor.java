package com.HealthCareSystem.business.entity;
// Generated Jul 23, 2022, 6:48:25 PM by Hibernate Tools 4.3.6.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Doctor generated by hbm2java
 */
public class Doctor implements java.io.Serializable {

	private Integer doctorId;
	private Department department;
	private String doctorLoginName;
	private String password;
	private String doctorName;
	private String gender;
	private Date dateOfBirth;
	private int age;
	private String degree;
	private String doctorBiography;
	private String mail;
	private String phone;
	private String bloodType;
	private String address;
	private String status;

	private Set<PatientProgress> patientProgresses = new HashSet<PatientProgress>(0);

	public Doctor() {
	}

	public Doctor(Department department, String doctorLoginName, String password, String doctorName, String gender,
			Date dateOfBirth, String degree, String mail, String phone, String bloodType, String address,
			String status) {
		this.department = department;
		this.doctorLoginName = doctorLoginName;
		this.password = password;
		this.doctorName = doctorName;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.degree = degree;
		this.mail = mail;
		this.phone = phone;
		this.bloodType = bloodType;
		this.address = address;
		this.status = status;
	}

	public Doctor(Department department, String doctorLoginName, String password, String doctorName, String gender,
			Date dateOfBirth, String degree, String doctorBiography, String mail, String phone, String bloodType,
			String address, String status, Set<PatientProgress> patientProgresses) {
		this.department = department;
		this.doctorLoginName = doctorLoginName;
		this.password = password;
		this.doctorName = doctorName;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.degree = degree;
		this.doctorBiography = doctorBiography;
		this.mail = mail;
		this.phone = phone;
		this.bloodType = bloodType;
		this.address = address;
		this.status = status;
		this.patientProgresses = patientProgresses;
	}

	public Integer getDoctorId() {
		return this.doctorId;
	}

	public void setDoctorId(Integer doctorId) {
		this.doctorId = doctorId;
	}

	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getDoctorLoginName() {
		return this.doctorLoginName;
	}

	public void setDoctorLoginName(String doctorLoginName) {
		this.doctorLoginName = doctorLoginName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDoctorName() {
		return this.doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
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

	public String getDegree() {
		return this.degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getDoctorBiography() {
		return this.doctorBiography;
	}

	public void setDoctorBiography(String doctorBiography) {
		this.doctorBiography = doctorBiography;
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

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Set<PatientProgress> getPatientProgresses() {
		return this.patientProgresses;
	}

	public void setPatientProgresses(Set<PatientProgress> patientProgresses) {
		this.patientProgresses = patientProgresses;
	}

}