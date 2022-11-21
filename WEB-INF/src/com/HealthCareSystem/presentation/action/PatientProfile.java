package com.HealthCareSystem.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.HealthCareSystem.business.service.PatientService;
import com.HealthCareSystem.presentation.form.PatientForm;

public class PatientProfile extends BaseAction {
	private PatientService myPatientService;

	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request, HttpServletResponse response,
			ActionMapping mapping) throws Exception {
		HttpSession session = request.getSession(false);
		if (session.getAttribute("patientId") == null) {
			return "gotoLogin";

		} else {
			PatientForm myForm = (PatientForm) form;
			myPatientService.updatePatient(myForm);
			myForm.setFrmControl("success");
			request.getSession().setAttribute("patientlink", "profile");
			return "gotoPatientProfile";
		}
	}

	@Override
	protected String doInit(ActionForm form, HttpServletRequest request, HttpServletResponse response,
			ActionMapping mapping) {

		HttpSession session = request.getSession(false);
		if (session.getAttribute("patientId") == null) {
			return "gotoLogin";

		} else {
			// set data to profile
			PatientForm myPatientForm = (PatientForm) form;
			PatientForm loginPatientForm = (PatientForm) request.getSession().getAttribute("PatientForm");
			myPatientForm.setLoginPatient(loginPatientForm.getLoginPatient());
			myPatientService.firstLoadUpdateProfile(myPatientForm);
			myPatientForm.setFrmControl(null);
			request.getSession().setAttribute("patientlink", "profile");
			return "gotoPatientProfile";
		}
	}

	public PatientService getMyPatientService() {
		return myPatientService;
	}

	public void setMyPatientService(PatientService myPatientService) {
		this.myPatientService = myPatientService;
	}
}