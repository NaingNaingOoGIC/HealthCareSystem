package com.HealthCareSystem.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.HealthCareSystem.business.service.AdminService;
import com.HealthCareSystem.business.service.DepartmentService;
import com.HealthCareSystem.business.service.DoctorService;
import com.HealthCareSystem.business.service.PatientService;
import com.HealthCareSystem.business.service.ProgressDetailService;
import com.HealthCareSystem.business.service.ProgressService;
import com.HealthCareSystem.presentation.form.AdminForm;
import com.HealthCareSystem.presentation.form.DepartmentForm;
import com.HealthCareSystem.presentation.form.DoctorForm;
import com.HealthCareSystem.presentation.form.PatientForm;
import com.HealthCareSystem.presentation.form.ProgressDetailForm;
import com.HealthCareSystem.presentation.form.ProgressForm;

public class AdminHome extends BaseAction {

	private AdminService myAdminService;
	private PatientService myPatientService;
	private DoctorService myDoctorService;
	private DepartmentService myDeptService;
	private ProgressService myProgressService;
	private ProgressDetailService myProgressDetailService;

	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request, HttpServletResponse response,
			ActionMapping mapping) throws Exception {
		return null;
	}

	@Override
	protected String doInit(ActionForm form, HttpServletRequest request, HttpServletResponse response,
			ActionMapping mapping) {
		HttpSession session = request.getSession(false);
		// check logined or not
		if (session.getAttribute("adminId") == null) {
			return "gotoAdminLogin";

		} else {
			// get data to set on session
			PatientForm patientForm = new PatientForm();
			myPatientService.countPatient(patientForm);
			DoctorForm doctorForm = new DoctorForm();
			myDoctorService.showAvailableDoctor(doctorForm);
			AdminForm myForm = (AdminForm) form;
			myAdminService.countAdmin(myForm);
			DepartmentForm deptForm = new DepartmentForm();
			myDeptService.countDept(deptForm);
			ProgressForm prgoressForm = new ProgressForm();
			myProgressService.setProgCount(prgoressForm);
			/* myProgressService.setReqProg(prgoressForm); */
			ProgressDetailForm appointmentForm = new ProgressDetailForm();
			myProgressDetailService.getreqApptList(appointmentForm);
			request.getSession().setAttribute("Patient", patientForm);
			request.getSession().setAttribute("DoctorForm", doctorForm);
			request.getSession().setAttribute("DepartmentForm", deptForm);
			request.getSession().setAttribute("PrgoressForm", prgoressForm);
			request.getSession().setAttribute("ProgDetailForm", appointmentForm);
			return "gotoAdminHome";
		}

	}

	public AdminService getMyAdminService() {
		return myAdminService;
	}

	public void setMyAdminService(AdminService myAdminService) {
		this.myAdminService = myAdminService;
	}

	public PatientService getMyPatientService() {
		return myPatientService;
	}

	public void setMyPatientService(PatientService myPatientService) {
		this.myPatientService = myPatientService;
	}

	public DoctorService getMyDoctorService() {
		return myDoctorService;
	}

	public void setMyDoctorService(DoctorService myDoctorService) {
		this.myDoctorService = myDoctorService;
	}

	public DepartmentService getMyDeptService() {
		return myDeptService;
	}

	public void setMyDeptService(DepartmentService myDeptService) {
		this.myDeptService = myDeptService;
	}

	public ProgressService getMyProgressService() {
		return myProgressService;
	}

	public void setMyProgressService(ProgressService myProgressService) {
		this.myProgressService = myProgressService;
	}

	public ProgressDetailService getMyProgressDetailService() {
		return myProgressDetailService;
	}

	public void setMyProgressDetailService(ProgressDetailService myProgressDetailService) {
		this.myProgressDetailService = myProgressDetailService;
	}

}
