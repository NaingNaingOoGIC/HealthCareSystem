package com.HealthCareSystem.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.HealthCareSystem.business.service.PatientService;
import com.HealthCareSystem.presentation.form.PatientForm;

public class Register extends BaseAction {

	private PatientService myPatientService;

	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request, HttpServletResponse response,
			ActionMapping mapping) throws Exception {

		PatientForm regForm = (PatientForm) form;

		myPatientService.savePatientReg(regForm);
		request.getSession().setAttribute("reg", "success");
		return "gotoRegister";
	}

	@Override
	protected String doInit(ActionForm form, HttpServletRequest request, HttpServletResponse response,
			ActionMapping mapping) {

		PatientForm regForm = (PatientForm) form;
		myPatientService.firstLoadReg(regForm);
		request.getSession().setAttribute("reg", "start");
		return "gotoRegister";
	}

	public PatientService getMyPatientService() {
		return myPatientService;
	}

	public void setMyPatientService(PatientService myPatientService) {
		this.myPatientService = myPatientService;
	}

}
