package com.HealthCareSystem.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.HealthCareSystem.business.service.DepartmentService;
import com.HealthCareSystem.business.service.DoctorService;
import com.HealthCareSystem.presentation.form.DepartmentForm;
import com.HealthCareSystem.presentation.form.DoctorForm;

public class DepartmentDetail extends BaseAction {
	private DepartmentService myDeptService;
	private DoctorService myDoctorService;

	public DoctorService getMyDoctorService() {
		return myDoctorService;
	}

	public void setMyDoctorService(DoctorService myDoctorService) {
		this.myDoctorService = myDoctorService;
	}

	public DepartmentService getMyDeptService() {
		return myDeptService;
	}

	public void setMyDeptService(DepartmentService myDeptService) {
		this.myDeptService = myDeptService;
	}

	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request, HttpServletResponse response,
			ActionMapping mapping) throws Exception {
		// TODO Auto-generated method stub
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
			myDeptService.getDepartment(myForm);
			DoctorForm myDoctorForm = new DoctorForm();
			myDoctorForm.setDeptid(myForm.getDeptId());
			myDoctorService.showDoctorbyDept(myDoctorForm);
			request.getSession().setAttribute("DeptDoctorForm", myDoctorForm);
			return "gotoDeptDetail";
		}
	}
}