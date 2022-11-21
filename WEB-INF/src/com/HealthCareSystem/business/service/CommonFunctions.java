package com.HealthCareSystem.business.service;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import com.HealthCareSystem.business.entity.ProgressDetail;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;

public class CommonFunctions {

	public String hashPassword(String password) {
		// password digest
		try {
			MessageDigest messageDigest = MessageDigest.getInstance("MD5");

			messageDigest.update(password.getBytes());

			byte[] resultByteArray = messageDigest.digest();

			StringBuilder sb = new StringBuilder();

			for (byte b : resultByteArray) {
				sb.append(String.format("%02x", b));
			}
			return sb.toString();

		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}

		return "";
	}

	public Date convertStringToDateFormat(String dateStirng) {
		// convert string to date
		Date date = null;
		try {
			date = new SimpleDateFormat("yyyy-MM-dd").parse(dateStirng);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	public Date convertStringTo24HourFormat(String timeString) {
		// convert 12 hours format string to 24 hours format time
		Date twentyFourTime = null;
		SimpleDateFormat twentyFourHourFormat = new SimpleDateFormat("HH:mm");
		SimpleDateFormat twelveHourFormat = new SimpleDateFormat("hh:mm a");

		try {
			Date date = twelveHourFormat.parse(timeString);
			twentyFourTime = twentyFourHourFormat.parse(twentyFourHourFormat.format(date));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return twentyFourTime;
	}

	public String convert24TimeToString(Date date) {
		// convert 24 hours format time to string
		String string12hour = null;
		try {
			long d = date.getTime();

			SimpleDateFormat twelveHourFormat = new SimpleDateFormat("hh:mm a");

			string12hour = twelveHourFormat.format(d);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return string12hour;
	}

	public int calcAge(Date DateofBirth) {
		// calculate age
		int age = 0;
		String date = DateofBirth.toString();
		LocalDate dateOfBirth = LocalDate.parse(date);
		LocalDate curDate = LocalDate.now();
		if ((dateOfBirth != null) && (curDate != null))
			age = Period.between(dateOfBirth, curDate).getYears();
		return age;
	}

	public void writeDoc(Document document, List<ProgressDetail> detailList) {
		// write a pdf document with dynamic data
		try {
			DecimalFormat df = new DecimalFormat("0.00");

			String patientName = detailList.get(0).getPatientProgress().getPatient().getPatientName();
			String doctorName = detailList.get(0).getPatientProgress().getDoctor().getDoctorName();
			String diseaseName = detailList.get(0).getPatientProgress().getDiseaseName();
			String symptoms = detailList.get(0).getPatientProgress().getSymptoms();
			String title = "Treatmnet Detail of " + patientName + "'s " + diseaseName;

			Font bfBold12 = new Font(FontFamily.TIMES_ROMAN, 12, Font.BOLD, new BaseColor(0, 0, 0));
			Font bf12 = new Font(FontFamily.TIMES_ROMAN, 12);

			document.addAuthor("Health Care System");
			document.addCreationDate();
			document.addTitle(title);
			document.setPageSize(PageSize.LETTER);
			Paragraph paragraph = new Paragraph("Patient Name : " + patientName + "\n" + "Doctor Name: " + doctorName
					+ "\n" + "Disease Name: " + diseaseName + "\n\n\t" + patientName + " feels " + symptoms
					+ ". Start treatment with Dr. " + doctorName + " and the treatment detail is as follow.\n\n", bf12);

			// specify column widths
			float[] columnWidths = { 0.8f, 2.3f, 2f, 4f, 5f, 4f };
			// create PDF table with the given widths
			PdfPTable table = new PdfPTable(columnWidths);
			// set table width a percentage of the page width
			table.setWidthPercentage(100f);

			// insert column headings
			insertCell(table, "No", Element.ALIGN_RIGHT, 1, bfBold12);
			insertCell(table, "Date", Element.ALIGN_CENTER, 1, bfBold12);
			insertCell(table, "Time", Element.ALIGN_CENTER, 1, bfBold12);
			insertCell(table, "Appointment Reaseon", Element.ALIGN_CENTER, 1, bfBold12);
			insertCell(table, "Treatment Detail", Element.ALIGN_CENTER, 1, bfBold12);
			insertCell(table, "Remark", Element.ALIGN_CENTER, 1, bfBold12);
			table.setHeaderRows(1);
			Collections.sort(detailList, new Comparator<ProgressDetail>() {
				public int compare(ProgressDetail o1, ProgressDetail o2) {
					if (o1.getAppointmentDate() == null || o2.getAppointmentDate() == null)
						return 0;
					return o1.getAppointmentDate().compareTo(o2.getAppointmentDate());
				}
			});
			for (int i = 0; i < detailList.size(); i++) {
				insertCell(table, i + 1 + "", Element.ALIGN_RIGHT, 1, bf12);
				insertCell(table, detailList.get(i).getAppointmentDate().toString(), Element.ALIGN_CENTER, 1, bf12);
				insertCell(table, detailList.get(i).getAppointmentTime().toString(), Element.ALIGN_CENTER, 1, bf12);
				insertCell(table, detailList.get(i).getReason(), Element.ALIGN_CENTER, 1, bf12);
				insertCell(table, detailList.get(i).getProgressDescription(), Element.ALIGN_JUSTIFIED, 1, bf12);
				insertCell(table, detailList.get(i).getRemark(), Element.ALIGN_JUSTIFIED, 1, bf12);
			}
			document.add(paragraph);
			document.add(table);
		} catch (DocumentException e) {
			e.printStackTrace();
		}

	}

	private void insertCell(PdfPTable table, String text, int align, int colspan, Font font) {

		// create a new cell with the specified Text and Font
		PdfPCell cell = new PdfPCell(new Phrase(text.trim(), font));
		// set the cell alignment
		cell.setHorizontalAlignment(align);
		// set the cell column span in case you want to merge two or more cells
		cell.setColspan(colspan);
		// in case there is no text and you wan to create an empty row
		if (text.trim().equalsIgnoreCase("")) {
			cell.setMinimumHeight(10f);
		}
		// add the call to the table
		table.addCell(cell);

	}
}
