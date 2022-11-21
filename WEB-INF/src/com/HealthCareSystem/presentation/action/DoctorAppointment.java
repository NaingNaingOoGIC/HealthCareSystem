package com.HealthCareSystem.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import com.HealthCareSystem.business.service.ProgressDetailService;
import com.HealthCareSystem.presentation.form.DoctorForm;
import com.HealthCareSystem.presentation.form.ProgressDetailForm;

public class DoctorAppointment extends BaseAction {

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
		if (session.getAttribute("doctorId") == null) {
			return "gotoDoctorLogin";
		} else {
			ProgressDetailForm myForm = (ProgressDetailForm) form;
			DoctorForm myLoginDoctorForm = (DoctorForm) request.getSession().getAttribute("DoctorForm");
			int doctorId = myLoginDoctorForm.getLoginDoctor().getDoctorId();

			if (myForm.getProgDetailid() != 0) {
				// add treatment detail
				myProgressDetailService.addProgDetail(myForm);
				myProgressDetailService.getApptByDoctorId(myForm, doctorId);
				myForm.setProgDetailid(0);
				request.getSession().setAttribute("doctorAppt", "start");
				return "gotoDoctorAppointment";

			} else {
				myProgressDetailService.addApptByAdminorDoctor(myForm);
				myProgressDetailService.getApptByDoctorId(myForm, doctorId);
				request.getSession().setAttribute("doctorAppt", "start");
				return "gotoDoctorAppointment";
			}
		}
	}

	@Override
	protected String doInit(ActionForm form, HttpServletRequest request, HttpServletResponse response,
			ActionMapping mapping) {
		HttpSession session = request.getSession(false);
		if (session.getAttribute("doctorId") == null) {
			return "gotoDoctorLogin";

		} else {
			ProgressDetailForm myForm = (ProgressDetailForm) form;
			DoctorForm myLoginDoctorForm = (DoctorForm) request.getSession().getAttribute("DoctorForm");
			int doctorId = myLoginDoctorForm.getLoginDoctor().getDoctorId();

			if (myForm.getProgressid() != 0) {
				// to add Appointment
				myProgressDetailService.uploadPatientNameAndDiseaseName(myForm);
				request.getSession().setAttribute("doctorAppt", "addAppt");
				return "gotoDoctorAppointment";
			} else if (myForm.getProgDetailid() != 0) {
				// to add treatment detail
				myProgressDetailService.uploadDiseaseName(myForm);
				request.getSession().setAttribute("doctorAppt", "addDetail");
				return "gotoDoctorAppointment";
			} else {
				// show all appointment
				myProgressDetailService.getApptByDoctorId(myForm, doctorId);
				request.getSession().setAttribute("doctorAppt", "start");
				return "gotoDoctorAppointment";
			}
		}
	}
}