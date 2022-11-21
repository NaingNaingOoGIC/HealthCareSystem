package com.HealthCareSystem.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.HealthCareSystem.business.service.AdminService;
import com.HealthCareSystem.presentation.form.AdminForm;

public class AdminProfile extends BaseAction {

	private AdminService myAdminService;

	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request, HttpServletResponse response,
			ActionMapping mapping) throws Exception {
		HttpSession session = request.getSession(false);
		// check login or not
		if (session.getAttribute("adminId") == null) {
			return "gotoAdminLogin";
		} else {
			// update profile
			AdminForm myAdminForm = (AdminForm) form;
			myAdminService.updateAdmin(myAdminForm);
			request.getSession().setAttribute("adminProfile", "Update");
			return "gotoAdminProfile";
		}
	}

	@Override
	protected String doInit(ActionForm form, HttpServletRequest request, HttpServletResponse response,
			ActionMapping mapping) {

		HttpSession session = request.getSession(false);
		if (session.getAttribute("adminId") == null) {
			return "gotoAdminLogin";
		} else {
			// set profile data
			AdminForm myAdminForm = (AdminForm) form;
			AdminForm myLoginAdminForm = (AdminForm) request.getSession().getAttribute("AdminForm");
			myAdminForm.setLoginAdmin(myLoginAdminForm.getLoginAdmin());
			myAdminService.firstLoadUpdateProfile(myAdminForm);
			request.getSession().setAttribute("adminProfile", "show");
			return "gotoAdminProfile";
		}

	}

	public AdminService getMyAdminService() {
		return myAdminService;
	}

	public void setMyAdminService(AdminService myAdminService) {
		this.myAdminService = myAdminService;
	}

}
