package com.HealthCareSystem.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.HealthCareSystem.business.service.DoctorService;
import com.HealthCareSystem.presentation.form.DoctorForm;

public class DoctorChangePs extends BaseAction {
	private DoctorService myDoctorService;

	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request, HttpServletResponse response,
			ActionMapping mapping) throws Exception {
		HttpSession session = request.getSession(false);
		if (session.getAttribute("doctorId") == null) {
			return "gotoDoctorLogin";
		} else {
			DoctorForm myForm = (DoctorForm) form;
			DoctorForm loginDoctorForm = (DoctorForm) request.getSession().getAttribute("DoctorForm");
			myForm.setLoginDoctor(loginDoctorForm.getLoginDoctor());
			// check passwords
			boolean wrongPs = !myDoctorService.checkPassword(myForm);

			ActionErrors errors = new ActionErrors();
			if (wrongPs) {
				errors.add("wrongPassword", new ActionMessage("errors.wrongPS"));
				saveErrors(request, errors);
				return "gotoDoctorChangePs";
			} else {
				// update password
				myDoctorService.updatePassword(myForm);
				myDoctorService.firstUploadUpdatePS(myForm);
				myForm.setChangePs(true);
				return "gotoDoctorChangePs";
			}
		}
	}

	@Override
	protected String doInit(ActionForm form, HttpServletRequest request, HttpServletResponse response,
			ActionMapping mapping) {
		HttpSession session = request.getSession(false);
		if (session.getAttribute("doctorId") == null) {
			return "gotoDoctorLogin";
		} else {
			DoctorForm myForm = (DoctorForm) form;
			myDoctorService.firstUploadUpdatePS(myForm);
			myForm.setChangePs(false);
			return "gotoDoctorChangePs";
		}
	}

	public DoctorService getMyDoctorService() {
		return myDoctorService;
	}

	public void setMyDoctorService(DoctorService myDoctorService) {
		this.myDoctorService = myDoctorService;
	}
}