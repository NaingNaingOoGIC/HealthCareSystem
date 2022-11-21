package com.HealthCareSystem.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import com.HealthCareSystem.business.service.DoctorService;
import com.HealthCareSystem.presentation.form.DoctorForm;

public class AddDoctor extends BaseAction {

	private DoctorService myDoctorService;

	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request, HttpServletResponse response,
			ActionMapping mapping) throws Exception {
		HttpSession session = request.getSession(false);
		// check login or not
		if (session.getAttribute("adminId") == null) {
			return "gotoAdminLogin";
		} else {
			DoctorForm myForm = (DoctorForm) form;
			// add new doctor
			myDoctorService.addNewDoctor(myForm);
			myDoctorService.firstLoadaddDoctor(myForm);
			request.getSession().setAttribute("addDoctor", "added");
			return "gotoAddDoctor";
		}
	}

	@Override
	protected String doInit(ActionForm form, HttpServletRequest request, HttpServletResponse response,
			ActionMapping mapping) {
		HttpSession session = request.getSession(false);
		if (session.getAttribute("adminId") == null) {
			return "gotoAdminLogin";
		} else {
			DoctorForm myForm = (DoctorForm) form;
			myDoctorService.firstLoadaddDoctor(myForm);
			request.getSession().setAttribute("addDoctor", "start");
			myForm.setUserName(null);
			myForm.setPassword(null);
			return "gotoAddDoctor";
		}
	}

	public DoctorService getMyDoctorService() {
		return myDoctorService;
	}

	public void setMyDoctorService(DoctorService myDoctorService) {
		this.myDoctorService = myDoctorService;
	}
}