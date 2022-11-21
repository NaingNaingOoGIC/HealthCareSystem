package com.HealthCareSystem.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.HealthCareSystem.business.service.DoctorService;
import com.HealthCareSystem.presentation.form.DoctorForm;

public class ViewDoctor extends BaseAction {

	private DoctorService myDoctorService;

	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request, HttpServletResponse response,
			ActionMapping mapping) throws Exception {
		HttpSession session = request.getSession(false);
		if (session.getAttribute("adminId") == null) {
			return "gotoAdminLogin";

		} else {
			DoctorForm myForm = (DoctorForm) form;
			if (myForm.getFrmControl() != null) {
				if (request.getParameter("delete") != null) {
					// delete doctor
					myDoctorService.deleteDoctor(myForm);
					refreshPage(myForm);
					myForm.setFrmControl(null);
					request.getSession().removeAttribute("frmControl");

				} else if (request.getParameter("return") != null) {
					// get back deleted doctor
					myDoctorService.returnDoctor(myForm);
					refreshPage(myForm);
					myForm.setFrmControl(null);
					request.getSession().removeAttribute("frmControl");
				}
			}
			return "gotoViewDoctor";
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
			if (myForm.getDeptid() != 0) {
				// show doctors by department
				myDoctorService.showDoctorbyDept(myForm);
				myForm.setName(null);
				myForm.setDeptid(0);
				return "gotoViewDoctor";
			} else if (myForm.getFrmControl() != null) {
				// to delete or return doctor
				myDoctorService.getActionDoctor(myForm);
				if (myForm.getFrmControl().equals("delete"))
					request.getSession().setAttribute("frmControl", "delete");
				else
					request.getSession().setAttribute("frmControl", "return");
			}
			refreshPage(myForm);

			return "gotoViewDoctor";
		}
	}

	private void refreshPage(DoctorForm form) {

		myDoctorService.showAvailableDoctor(form);
		myDoctorService.showUnAvailableDoctor(form);
		form.setName(null);
		form.setBloodType(null);
	}

	public DoctorService getMyDoctorService() {
		return myDoctorService;
	}

	public void setMyDoctorService(DoctorService myDoctorService) {
		this.myDoctorService = myDoctorService;
	}

}
