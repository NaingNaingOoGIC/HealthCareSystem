package com.HealthCareSystem.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.HealthCareSystem.business.entity.Patient;
import com.HealthCareSystem.business.service.ProgressService;
import com.HealthCareSystem.presentation.form.PatientForm;
import com.HealthCareSystem.presentation.form.ProgressForm;

public class Progress extends BaseAction {

	private ProgressService myProgressService;

	public ProgressService getMyProgressService() {
		return myProgressService;
	}

	public void setMyProgressService(ProgressService myProgressService) {
		this.myProgressService = myProgressService;
	}

	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request, HttpServletResponse response,
			ActionMapping mapping) throws Exception {
		HttpSession session = request.getSession(false);
		if (session.getAttribute("patientId") == null) {
			return "gotoLogin";

		} else {
			ProgressForm myForm = (ProgressForm) form;
			PatientForm loginPatientForm = (PatientForm) request.getSession().getAttribute("PatientForm");
			Patient patient = loginPatientForm.getLoginPatient();
			if (request.getParameter("request") != null) {
				// request progress
				myProgressService.requestProg(myForm, patient);
				myForm.setDoctorid(0);
				request.getSession().setAttribute("patientProg", "start");
				request.getSession().setAttribute("patientlink", "prog");
			}
			return "gotoProgress";
		}
	}

	@Override
	protected String doInit(ActionForm form, HttpServletRequest request, HttpServletResponse response,
			ActionMapping mapping) {
		HttpSession session = request.getSession(false);
		if (session.getAttribute("patientId") == null) {
			return "gotoLogin";

		} else {
			ProgressForm myForm = (ProgressForm) form;
			PatientForm loginPatientForm = (PatientForm) request.getSession().getAttribute("PatientForm");
			int patientId = loginPatientForm.getLoginPatient().getPatientId();
			if (myForm.getDoctorid() != 0) {
				// to request progress
				myProgressService.setDoctorNameById(myForm, myForm.getDoctorid());
				myForm.setSymptoms(null);
				request.getSession().setAttribute("patientProg", "req");
			} else {
				// show all progress
				myForm.setDoctorName(null);
				request.getSession().setAttribute("patientProg", "start");
			}
			myProgressService.getProgByPatientID(myForm, patientId);
			request.getSession().setAttribute("patientlink", "prog");
			return "gotoProgress";
		}
	}
}