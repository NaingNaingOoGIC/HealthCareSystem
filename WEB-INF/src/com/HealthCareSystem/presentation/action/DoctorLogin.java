package com.HealthCareSystem.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.HealthCareSystem.business.service.DoctorService;
import com.HealthCareSystem.business.service.ProgressDetailService;
import com.HealthCareSystem.presentation.form.DoctorForm;
import com.HealthCareSystem.presentation.form.ProgressDetailForm;

public class DoctorLogin extends BaseAction {

	private DoctorService myDoctorService;
	private ProgressDetailService myProgressDetailService;

	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request, HttpServletResponse response,
			ActionMapping mapping) throws Exception {

		DoctorForm myForm = (DoctorForm) form;
		ActionErrors errors = new ActionErrors();

		myDoctorService.checkLoginDoctor(myForm);
		if (myForm.getLoginDoctor() == null) {
//check user name and password
			errors.add("loginerror", new ActionMessage("errors.login"));
			saveErrors(request, errors);
			return "gotoDoctorLogin";

		} else {
			// set some data for beginning
			ProgressDetailForm AppointmentForm = new ProgressDetailForm();
			myProgressDetailService.getApptByDoctorId(AppointmentForm, myForm.getLoginDoctor().getDoctorId());
			request.getSession(true);
			request.getSession().setAttribute("doctorId", request.getSession().getId());
			request.getSession().setAttribute("DoctorAppointment", AppointmentForm);
			request.getSession().setAttribute("doctorAppt", "start");
			return "gotoDoctorAppointment";

		}
	}

	@Override
	protected String doInit(ActionForm form, HttpServletRequest request, HttpServletResponse response,
			ActionMapping mapping) {

		DoctorForm myForm = (DoctorForm) form;
		myForm.setUserName(null);
		myForm.setPassword(null);

		return "gotoDoctorLogin";
	}

	public DoctorService getMyDoctorService() {
		return myDoctorService;
	}

	public void setMyDoctorService(DoctorService myDoctorService) {
		this.myDoctorService = myDoctorService;
	}

	public ProgressDetailService getMyProgressDetailService() {
		return myProgressDetailService;
	}

	public void setMyProgressDetailService(ProgressDetailService myProgressDetailService) {
		this.myProgressDetailService = myProgressDetailService;
	}
}