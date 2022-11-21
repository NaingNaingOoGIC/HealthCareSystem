package com.HealthCareSystem.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.HealthCareSystem.business.service.DepartmentService;
import com.HealthCareSystem.presentation.form.DepartmentForm;

public class PatientHome extends BaseAction {

	private DepartmentService myDeptService;

	public DepartmentService getMyDeptService() {
		return myDeptService;
	}

	public void setMyDeptService(DepartmentService myDeptService) {
		this.myDeptService = myDeptService;
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
		if (session.getAttribute("patientId") == null) {
			return "gotoLogin";

		} else {
			// show all department at home page
			DepartmentForm myForm = (DepartmentForm) form;
			myDeptService.showAvailableDept(myForm);
			request.getSession().setAttribute("patientlink", "home");
			return "gotoPatientHome";
		}

	}

}
