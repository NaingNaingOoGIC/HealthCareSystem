package com.HealthCareSystem.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import com.HealthCareSystem.business.service.ProgressDetailService;
import com.HealthCareSystem.presentation.form.ProgressDetailForm;

public class AdminAddAppointment extends BaseAction {

	private ProgressDetailService myProgressDetailService;

	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request, HttpServletResponse response,
			ActionMapping mapping) throws Exception {
		HttpSession session = request.getSession(false);
		// check logined or not
		if (session.getAttribute("adminId") == null) {
			return "gotoAdminLogin";
		} else {
			ProgressDetailForm myForm = (ProgressDetailForm) form;
			if (request.getParameter("add") != null) {
				if (myForm.getProgDetailid() != 0) {
					// confirm appointment requested by patient
					myProgressDetailService.confirmApptReq(myForm);
					request.getSession().removeAttribute("adminAddAppt");
				} else if (myForm.getProgressid() != 0) {
					// add appointment by admin
					myProgressDetailService.addApptByAdminorDoctor(myForm);
					request.getSession().removeAttribute("adminAddAppt");
				}
				refreshPage(myForm);
			}
			return "gotoAdminAddAppointment";
		}
	}

	@Override
	protected String doInit(ActionForm form, HttpServletRequest request, HttpServletResponse response,
			ActionMapping mapping) {
		HttpSession session = request.getSession(false);
		if (session.getAttribute("adminId") == null) {
			return "gotoAdminLogin";
		} else {
			ProgressDetailForm myForm = (ProgressDetailForm) form;
			// if from request
			myForm.setAdded(null);
			if (myForm.getProgDetailid() != 0) {
				myProgressDetailService.getByProgDetailId(myForm);
				myProgressDetailService.firstLoadReqAppt(myForm);
				request.getSession().setAttribute("adminAddAppt", "addReq");
			} else if (myForm.getProgressid() != 0) {
				// if from progress
				myProgressDetailService.loadApptAddByProgid(myForm);
				request.getSession().setAttribute("adminAddAppt", "add");
			} else {
				request.getSession().removeAttribute("adminAddAppt");
				refreshPage(myForm);
			}
			return "gotoAdminAddAppointment";
		}
	}

	private void refreshPage(ProgressDetailForm myForm) {
		myProgressDetailService.getreqApptList(myForm);
		myProgressDetailService.clearAddForm(myForm);
	}

	public ProgressDetailService getMyProgressDetailService() {
		return myProgressDetailService;
	}

	public void setMyProgressDetailService(ProgressDetailService myProgressDetailService) {
		this.myProgressDetailService = myProgressDetailService;
	}
}