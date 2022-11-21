package com.HealthCareSystem.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.HealthCareSystem.business.service.ProgressDetailService;
import com.HealthCareSystem.presentation.form.ProgressDetailForm;

public class AdminViewAppointment extends BaseAction {

	private ProgressDetailService myProgressDetailService;

	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request, HttpServletResponse response,
			ActionMapping mapping) throws Exception {
		HttpSession session = request.getSession(false);
		if (session.getAttribute("adminId") == null) {
			return "gotoAdminLogin";

		} else {
			ProgressDetailForm myForm = (ProgressDetailForm) form;
			if (request.getParameter("delete") != null) {
				// delete appointment
				myProgressDetailService.deletAppointment(myForm);
				refreshPage(myForm);
				request.getSession().setAttribute("appt", "start");
			}
			return "gotoAdminViewAppointment";
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
			if (myForm.getProgDetailid() != 0) {
				// if appointment is deleted
				if (myForm.getFrmControl().equals("nextdayDelete"))
					request.getSession().setAttribute("appt", "nextdayDelete");
				if (myForm.getFrmControl().equals("todayDelete"))
					request.getSession().setAttribute("appt", "todayDelete");
				return "gotoAdminViewAppointment";
			} else if (myForm.getPatientid() != 0) {
				// view appointment by patient id
				myProgressDetailService.getApptByPatientId(myForm, myForm.getPatientid());
				request.getSession().setAttribute("appt", "start");
				request.getSession().setAttribute("person", "patient");
				return "gotoAdminViewAppointment";
			} else if (myForm.getDoctorid() != 0) {
				// view appointment by doctor id
				myProgressDetailService.getApptByDoctorId(myForm, myForm.getDoctorid());
				request.getSession().setAttribute("appt", "start");
				request.getSession().setAttribute("person", "doctor");
				return "gotoAdminViewAppointment";
			} else {
				// show all appointment
				refreshPage(myForm);
				request.getSession().setAttribute("appt", "start");
				return "gotoAdminViewAppointment";
			}
		}
	}

	private void refreshPage(ProgressDetailForm myForm) {
		myForm.setFrmControl(null);
		myProgressDetailService.getComingApptList(myForm);
		myProgressDetailService.getTodayApptList(myForm);
	}

	public ProgressDetailService getMyProgressDetailService() {
		return myProgressDetailService;
	}

	public void setMyProgressDetailService(ProgressDetailService myProgressDetailService) {
		this.myProgressDetailService = myProgressDetailService;
	}

}
