package com.HealthCareSystem.business.service;

import com.HealthCareSystem.presentation.form.PatientForm;
import com.HealthCareSystem.util.SendEmailTLS;

public class MailService {

	SendEmailTLS sendEmail = new SendEmailTLS();// create a object of SendEmailTLS class to sent a mail

	public void sendMail(PatientForm myForm) {
		String patientName = myForm.getName();// get patient name
		String userName = myForm.getUserName();// get user name for patient
		String userPassword = myForm.getPassword();// get password for patient
		String mailAddress = myForm.getEmail();// get mail address to send email
		sendEmail.sendMail(mailAddress, patientName, userName, userPassword);// send email by using senMail method of
																				// SendEmailTLS class
	}

}
