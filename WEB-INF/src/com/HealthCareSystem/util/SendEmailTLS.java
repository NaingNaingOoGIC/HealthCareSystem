package com.HealthCareSystem.util;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class SendEmailTLS {

	public void sendMail(String mailAddress, String patientName, String userName, String userPassword) {

		final String username = "naing114oo98@gmail.com";
		final String password = "rqgbsfkmosrqryci";

		Properties prop = new Properties();
		prop.put("mail.smtp.host", "smtp.gmail.com");
		prop.put("mail.smtp.port", "587");
		prop.put("mail.smtp.auth", "true");
		prop.put("mail.smtp.starttls.enable", "true"); // TLS

		Session session = Session.getInstance(prop, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});

		try {
			String sendMessage = "Dear " + patientName + ",\n\n " + "Your account has been created with\n\n"
					+ "Username: " + userName + "\n\n" + "Password: " + userPassword
					+ "\n\nUse this Username and Password to loign. \n\n"
					+ " http://localhost:8080/HealthCareSystem/PatientLogin.do\n\n"
					+ "You can change the password after login. \n"
					+ "New Password must contain at least one uppercase, one lowercase and one numeric values and length must be 8 or more characters. \n\n"
					+ "If there is any problem, \n09-983749815\n" + "071-35192\n\nHave a nice day🥳🥳";
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("naing114oo98@gmail.com"));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(mailAddress));
			message.setSubject("Sending Login Information");
			message.setText(sendMessage);

			Transport.send(message);

		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}

}
