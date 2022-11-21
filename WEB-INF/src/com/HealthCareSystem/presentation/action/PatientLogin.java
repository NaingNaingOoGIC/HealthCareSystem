package com.HealthCareSystem.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.HealthCareSystem.business.service.DepartmentService;
import com.HealthCareSystem.business.service.PatientService;
import com.HealthCareSystem.presentation.form.DepartmentForm;
import com.HealthCareSystem.presentation.form.PatientForm;

public class PatientLogin extends BaseAction {

	private PatientService myPatientService;
	private DepartmentService myDeptService;

	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request, HttpServletResponse response,
			ActionMapping mapping) throws Exception {

		PatientForm myForm = (PatientForm) form;
		ActionErrors errors = new ActionErrors();

		myPatientService.checkLoginPatient(myForm);

		if (myForm.getLoginPatient() == null) {
			// check username and password
			errors.add("loginerror", new ActionMessage("errors.login"));
			saveErrors(request, errors);
			return "gotoLogin";
		} else {
			request.getSession(true);
			request.getSession().setAttribute("patientId", request.getSession().getId());
			// set data to show in beginning
			DepartmentForm mydeptForm = new DepartmentForm();
			myDeptService.showAvailableDept(mydeptForm);
			request.getSession().setAttribute("DepartmentForm", mydeptForm);
			request.getSession().setAttribute("patientlink", "home");
			return "gotoPatientHome";
		}

	}

	@Override
	protected String doInit(ActionForm form, HttpServletRequest request, HttpServletResponse response,
			ActionMapping mapping) {

		PatientForm myForm = (PatientForm) form;
		myForm.setUserName(null);
		myForm.setPassword(null);

		return "gotoLogin";
	}

	public PatientService getMyPatientService() {
		return myPatientService;
	}

	public void setMyPatientService(PatientService myPatientService) {
		this.myPatientService = myPatientService;
	}

	public DepartmentService getMyDeptService() {
		return myDeptService;
	}

	public void setMyDeptService(DepartmentService myDeptService) {
		this.myDeptService = myDeptService;
	}
}