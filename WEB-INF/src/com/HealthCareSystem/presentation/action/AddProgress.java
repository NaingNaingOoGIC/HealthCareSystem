package com.HealthCareSystem.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.HealthCareSystem.business.service.ProgressService;
import com.HealthCareSystem.presentation.form.ProgressForm;

public class AddProgress extends BaseAction {

	private ProgressService myProgressService;

	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request, HttpServletResponse response,
			ActionMapping mapping) throws Exception {
		HttpSession session = request.getSession(false);
		// check logined or not
		if (session.getAttribute("adminId") == null) {
			return "gotoAdminLogin";
		} else {
			ProgressForm myForm = (ProgressForm) form;

			if (request.getParameter("confirm") != null) {
				// confirm patient requested progress
				myProgressService.confirmPatientReq(myForm);
				myProgressService.clearAddForm(myForm);
				myProgressService.setReqProg(myForm);
				request.getSession().removeAttribute("progid");
				return "gotoAddProgress";

			} else {
				// add progress by admin
				myProgressService.addByAdmin(myForm);
				myProgressService.clearAddForm(myForm);
				return "gotoAddProgress";

			}
		}
	}

	@Override
	protected String doInit(ActionForm form, HttpServletRequest request, HttpServletResponse response,
			ActionMapping mapping) {
		HttpSession session = request.getSession(false);
		if (session.getAttribute("adminId") == null) {
			return "gotoAdminLogin";

		} else {
			ProgressForm myForm = (ProgressForm) form;
			// set data of requested progress
			if (myForm.getProgressid() != 0) {
				myProgressService.getProgressbyId(myForm);
				myProgressService.firstLoadReqProg(myForm);
				myForm.setAdded(null);
				myForm.setProgressid(0);
				request.getSession().setAttribute("progid", "progId");
				return "gotoAddProgress";
			} else {
				refreshPage(myForm);
				myForm.setAdded(null);
				request.getSession().removeAttribute("progid");
				request.getSession().setAttribute("PrgoressForm", myForm);
				return "gotoAddProgress";
			}

		}
	}

	private void refreshPage(ProgressForm myForm) {
		myProgressService.clearAddForm(myForm);
		myProgressService.setReqProg(myForm);
	}

	public ProgressService getMyProgressService() {
		return myProgressService;
	}

	public void setMyProgressService(ProgressService myProgressService) {
		this.myProgressService = myProgressService;
	}

}
