package com.HealthCareSystem.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.HealthCareSystem.business.service.ProgressService;
import com.HealthCareSystem.presentation.form.DoctorForm;
import com.HealthCareSystem.presentation.form.ProgressForm;

public class DoctorProgress extends BaseAction {

	private ProgressService myProgressService;

	public ProgressService getMyProgressService() {
		return myProgressService;
	}

	public void setMyProgressService(ProgressService myProgressService) {
		this.myProgressService = myProgressService;
	}

	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request, HttpServletResponse response,
			ActionMapping mapping) throws Exception {
		return null;
	}

	@Override
	protected String doInit(ActionForm form, HttpServletRequest request, HttpServletResponse response,
			ActionMapping mapping) {
		HttpSession session = request.getSession(false);
		if (session.getAttribute("doctorId") == null) {
			return "gotoDoctorLogin";

		} else {
			// show all progress by doctor id
			ProgressForm myForm = (ProgressForm) form;
			DoctorForm myLoginDoctorForm = (DoctorForm) request.getSession().getAttribute("DoctorForm");
			int doctorId = myLoginDoctorForm.getLoginDoctor().getDoctorId();
			myProgressService.getProgByDoctorID(myForm, doctorId);
			return "gotoDoctorProgress";
		}
	}
}