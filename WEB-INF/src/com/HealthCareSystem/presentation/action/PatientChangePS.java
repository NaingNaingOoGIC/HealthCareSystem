package com.HealthCareSystem.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.HealthCareSystem.business.service.PatientService;
import com.HealthCareSystem.presentation.form.PatientForm;

public class PatientChangePS extends BaseAction {
	private PatientService myPatientService;

	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request, HttpServletResponse response,
			ActionMapping mapping) throws Exception {
		HttpSession session = request.getSession(false);
		if (session.getAttribute("patientId") == null) {
			return "gotoLogin";

		} else {
			PatientForm myForm = (PatientForm) form;
			PatientForm loginPatientForm = (PatientForm) request.getSession().getAttribute("PatientForm");
			myForm.setLoginPatient(loginPatientForm.getLoginPatient());
			// check password
			boolean wrongPs = !myPatientService.checkPassword(myForm);
			ActionErrors errors = new ActionErrors();
			if (wrongPs) {
				errors.add("wrongPassword", new ActionMessage("errors.wrongPS"));
				saveErrors(request, errors);
				request.getSession().setAttribute("patientlink", "profile");
				return "gotoPatientChangePs";
			} else {
				// update password
				myPatientService.updatePassword(myForm);
				myPatientService.firstUploadUpdatePS(myForm);
				myForm.setChangePs(true);
				request.getSession().setAttribute("patientlink", "profile");
				return "gotoPatientChangePs";
			}
		}
	}

	@Override
	protected String doInit(ActionForm form, HttpServletRequest request, HttpServletResponse response,
			ActionMapping mapping) {
		HttpSession session = request.getSession(false);
		if (session.getAttribute("patientId") == null) {
			return "gotoLogin";

		} else {
			// set data for beginning
			PatientForm myForm = (PatientForm) form;
			myPatientService.firstUploadUpdatePS(myForm);
			myForm.setChangePs(false);
			request.getSession().setAttribute("patientlink", "profile");
			return "gotoPatientChangePs";
		}
	}

	public PatientService getMyPatientService() {
		return myPatientService;
	}

	public void setMyPatientService(PatientService myPatientService) {
		this.myPatientService = myPatientService;
	}

}