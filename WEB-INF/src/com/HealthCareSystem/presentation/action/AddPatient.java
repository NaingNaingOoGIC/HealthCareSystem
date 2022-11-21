package com.HealthCareSystem.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import com.HealthCareSystem.business.service.MailService;
import com.HealthCareSystem.business.service.PatientService;
import com.HealthCareSystem.presentation.form.PatientForm;

public class AddPatient extends BaseAction {

	private PatientService myPatientService;

	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request, HttpServletResponse response,
			ActionMapping mapping) throws Exception {
		HttpSession session = request.getSession(false);
		if (session.getAttribute("adminId") == null) {
			return "gotoAdminLogin";

		} else {
			PatientForm myForm = (PatientForm) form;
			MailService mailService = new MailService();

			if (myForm.getPatientid() != 0) {
				// confirm request
				myPatientService.confirmPatientReq(myForm);
				mailService.sendMail(myForm);
				request.getSession().removeAttribute("reqid");
				myForm.setPatientid(0);
				refreshPage(myForm);
				request.getSession().setAttribute("Patient", myForm);
				return "gotoAddPatient";
			} else {
				// add by admin
				myPatientService.addByAdmin(myForm);
				mailService.sendMail(myForm);
				refreshPage(myForm);
				return "gotoAddPatient";
			}
		}
	}

	@Override
	protected String doInit(ActionForm form, HttpServletRequest request, HttpServletResponse response,
			ActionMapping mapping) {
		HttpSession session = request.getSession(false);
		// check login or not
		if (session.getAttribute("adminId") == null) {
			return "gotoAdminLogin";

		} else {
			PatientForm myForm = (PatientForm) form;
			if (myForm.getPatientid() != 0) {
				// set data for requested patient
				myPatientService.getPatientbyId(myForm);
				myPatientService.firstLoadAddbyRequest(myForm);
				request.getSession().setAttribute("reqid", "id");
			} else {
				request.getSession().removeAttribute("reqid");
				refreshPage(myForm);
			}

			myForm.setAdded(null);
			request.getSession().setAttribute("PatientForm", myForm);
			return "gotoAddPatient";
		}

	}

	private void refreshPage(PatientForm myForm) {

		myPatientService.countPatient(myForm);
		myPatientService.getReqPerson(myForm);
		myPatientService.clearAddForm(myForm);
	}

	public PatientService getMyPatientService() {
		return myPatientService;
	}

	public void setMyPatientService(PatientService myPatientService) {
		this.myPatientService = myPatientService;
	}

}
