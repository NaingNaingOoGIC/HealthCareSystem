package com.HealthCareSystem.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import com.HealthCareSystem.business.service.AdminService;
import com.HealthCareSystem.presentation.form.AdminForm;

public class AdminChangePS extends BaseAction {

	private AdminService myAdminService;

	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request, HttpServletResponse response,
			ActionMapping mapping) throws Exception {
		HttpSession session = request.getSession(false);
		// check logined or not
		if (session.getAttribute("adminId") == null) {
			return "gotoAdminLogin";

		} else {
			AdminForm myForm = (AdminForm) form;
			AdminForm myLoginAdminForm = (AdminForm) request.getSession().getAttribute("AdminForm");
			myForm.setLoginAdmin(myLoginAdminForm.getLoginAdmin());

			boolean wrongPs = !myAdminService.checkPassword(myForm);
			ActionErrors errors = new ActionErrors();
			if (wrongPs) {
				errors.add("wrongPassword", new ActionMessage("errors.wrongPS"));
				saveErrors(request, errors);
				return "gotoAdminChangePs";
			}

			else {
				myAdminService.updatePassword(myForm);
				myAdminService.firstUploadUpdatePS(myForm);
				myForm.setChangePs(true);
				return "gotoAdminChangePs";
			}
		}
	}

	@Override
	protected String doInit(ActionForm form, HttpServletRequest request, HttpServletResponse response,
			ActionMapping mapping) {
		HttpSession session = request.getSession(false);
		// check logined or not
		if (session.getAttribute("adminId") == null) {
			return "gotoAdminLogin";
		} else {
			// update password form set up
			AdminForm myForm = (AdminForm) form;
			myAdminService.firstUploadUpdatePS(myForm);
			myForm.setChangePs(false);
			return "gotoAdminChangePs";
		}
	}

	public AdminService getMyAdminService() {
		return myAdminService;
	}

	public void setMyAdminService(AdminService myAdminService) {
		this.myAdminService = myAdminService;
	}
}