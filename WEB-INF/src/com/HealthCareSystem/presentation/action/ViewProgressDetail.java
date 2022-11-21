package com.HealthCareSystem.presentation.action;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.HealthCareSystem.business.service.ProgressDetailService;
import com.HealthCareSystem.presentation.form.ProgressDetailForm;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;

public class ViewProgressDetail extends BaseAction {
	private ProgressDetailService myProgressDetailService;

	public ProgressDetailService getMyProgressDetailService() {
		return myProgressDetailService;
	}

	public void setMyProgressDetailService(ProgressDetailService myProgressDetailService) {
		this.myProgressDetailService = myProgressDetailService;
	}

	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request, HttpServletResponse response,
			ActionMapping mapping) throws Exception {
		return null;
	}

	@Override
	protected String doInit(ActionForm form, HttpServletRequest request, HttpServletResponse response,
			ActionMapping mapping) {

		ProgressDetailForm myForm = (ProgressDetailForm) form;

		HttpSession session = request.getSession(false);
		// check logined or not

		boolean doctorLogin = false;
		boolean patientLogin = false;
		if (myForm.getPath().equals("doctor")) {
			if (session.getAttribute("doctorId") == null) {
				doctorLogin = false;
				return "gotoDoctorLogin";
			} else
				doctorLogin = true;
		} else if (myForm.getPath().equals("patient")) {
			if (session.getAttribute("patientId") == null) {
				patientLogin = false;
				return "gotoLogin";
			} else
				patientLogin = true;
		}
		if (doctorLogin || patientLogin) {

			myProgressDetailService.getDetailList(myForm);

			if (myForm.getDetailList().size() > 0) {
				// if progress has treatment detail show detail as pdf file
				String patientName = myForm.getDetailList().get(0).getPatientProgress().getPatient().getPatientName();
				String diseaseName = myForm.getDetailList().get(0).getPatientProgress().getDiseaseName();
				String title = "Treatmnet Detail of " + patientName + "'s " + diseaseName;
				response.setContentType("application/pdf");
				response.setHeader("Content-Disposition", "filename=" + title + ".pdf");
				Document document = new Document();
				try {
					PdfWriter.getInstance(document, response.getOutputStream());
				} catch (DocumentException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				document.open();
				myProgressDetailService.writeDoc(document, myForm);
				document.close();
				return null;
			} else {
				// if progress has no detail, stay in that page
				if (myForm.getPath().equals("doctor"))
					return "gotoDoctorProgress";
				else
					return "gotoProgress";
			}
		}
		return null;
	}
}
