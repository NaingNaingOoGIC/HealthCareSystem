package com.HealthCareSystem.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import com.HealthCareSystem.business.service.ProgressDetailService;
import com.HealthCareSystem.presentation.form.PatientForm;
import com.HealthCareSystem.presentation.form.ProgressDetailForm;

public class Appointment extends BaseAction {

	private ProgressDetailService myProgressDetailService;

	public ProgressDetailService getMyProgressDetailService() {
		return myProgressDetailService;
	}

	public void setMyProgressDetailService(ProgressDetailService myProgressDetailService) {
		this.myProgressDetailService = myProgressDetailService;
	}

	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request, HttpServletResponse response,
			ActionMapping mapping) throws Exception {
		HttpSession session = request.getSession(false);
		if (session.getAttribute("patientId") == null) {
			return "gotoLogin";

		} else {
			ProgressDetailForm myForm = (ProgressDetailForm) form;

			// request appointment
			myProgressDetailService.reqApptByPatient(myForm);
			myForm.setProgressid(0);
			request.getSession().setAttribute("patientAppt", "start");
			request.getSession().setAttribute("patientlink", "appt");
			return "gotoAppointment";

		}
	}

	@Override
	protected String doInit(ActionForm form, HttpServletRequest request, HttpServletResponse response,
			ActionMapping mapping) {
		HttpSession session = request.getSession(false);
		if (session.getAttribute("patientId") == null) {
			return "gotoLogin";

		} else {
			ProgressDetailForm myForm = (ProgressDetailForm) form;
			PatientForm loginPatientForm = (PatientForm) request.getSession().getAttribute("PatientForm");
			int patientId = loginPatientForm.getLoginPatient().getPatientId();

			if (myForm.getProgressid() != 0) {
				// request appointment
				myProgressDetailService.loadReqAppt(myForm, patientId);
				myProgressDetailService.getApptByPatientId(myForm, patientId);
				myForm.setDate(null);
				myForm.setTime(null);
				myForm.setReason(null);
				request.getSession().setAttribute("patientAppt", "reqAppt");
				request.getSession().setAttribute("patientlink", "appt");
				return "gotoAppointment";
			} else {
				// show all appointments
				myProgressDetailService.getApptByPatientId(myForm, patientId);
				request.getSession().setAttribute("patientAppt", "start");
				request.getSession().setAttribute("patientlink", "appt");
				return "gotoAppointment";
			}
		}
	}
}