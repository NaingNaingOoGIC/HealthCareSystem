package com.HealthCareSystem.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.HealthCareSystem.business.service.DoctorService;
import com.HealthCareSystem.presentation.form.DoctorForm;

public class PatientSearchDoctor extends BaseAction {
	private DoctorService myDoctorService;

	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request, HttpServletResponse response,
			ActionMapping mapping) throws Exception {
		return null;
	}

	@Override
	protected String doInit(ActionForm form, HttpServletRequest request, HttpServletResponse response,
			ActionMapping mapping) {
		HttpSession session = request.getSession(false);
		if (session.getAttribute("patientId") == null) {
			return "gotoLogin";

		} else {
			DoctorForm myForm = (DoctorForm) form;

			// show all doctors
			myDoctorService.showAvailableDoctor(myForm);
			myForm.setName(null);
			request.getSession().setAttribute("patientlink", "doctor");
			return "gotoPatientSearchDoctor";

		}
	}

	public DoctorService getMyDoctorService() {
		return myDoctorService;
	}

	public void setMyDoctorService(DoctorService myDoctorService) {
		this.myDoctorService = myDoctorService;
	}

}
