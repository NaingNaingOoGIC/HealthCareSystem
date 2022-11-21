package com.HealthCareSystem.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.HealthCareSystem.business.service.DoctorService;
import com.HealthCareSystem.presentation.form.DoctorForm;

public class DoctorProfile extends BaseAction {

	private DoctorService myDoctorService;

	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request, HttpServletResponse response,
			ActionMapping mapping) throws Exception {
		HttpSession session = request.getSession(false);
		if (session.getAttribute("doctorId") == null) {
			return "gotoDoctorLogin";
		} else {
			// update profile
			DoctorForm myDoctorForm = (DoctorForm) form;
			myDoctorService.updateDoctor(myDoctorForm);
			request.getSession().setAttribute("doctorProfile", "Update");
			return "gotoDoctorProfile";
		}
	}

	@Override
	protected String doInit(ActionForm form, HttpServletRequest request, HttpServletResponse response,
			ActionMapping mapping) {
		HttpSession session = request.getSession(false);
		if (session.getAttribute("doctorId") == null) {
			return "gotoDoctorLogin";
		} else {
			// set data for doctor profile
			DoctorForm myDoctorForm = (DoctorForm) form;
			DoctorForm myLoginDoctorForm = (DoctorForm) request.getSession().getAttribute("DoctorForm");
			myDoctorForm.setLoginDoctor(myLoginDoctorForm.getLoginDoctor());
			myDoctorService.firstLoadUpdateProfile(myDoctorForm);
			request.getSession().setAttribute("doctorProfile", "show");
			return "gotoDoctorProfile";
		}
	}

	public DoctorService getMyDoctorService() {
		return myDoctorService;
	}

	public void setMyDoctorService(DoctorService myDoctorService) {
		this.myDoctorService = myDoctorService;
	}
}