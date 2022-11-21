package com.HealthCareSystem.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.HealthCareSystem.business.service.ProgressService;
import com.HealthCareSystem.presentation.form.ProgressForm;

public class AdminViewProgress extends BaseAction {

	private ProgressService myProgressService;

	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request, HttpServletResponse response,
			ActionMapping mapping) throws Exception {
		return null;
	}

	@Override
	protected String doInit(ActionForm form, HttpServletRequest request, HttpServletResponse response,
			ActionMapping mapping) {

		HttpSession session = request.getSession(false);
		if (session.getAttribute("adminId") == null) {
			return "gotoAdminLogin";

		} else {
			ProgressForm myForm = (ProgressForm) form;
			if (myForm.getPatientid() != 0) {
				// view progress by patient id
				myProgressService.getProgByPatientID(myForm, myForm.getPatientid());
				if (myForm.getProgList() != null && myForm.getDoneList() != null)
					request.getSession().setAttribute("viewProg", "start");
				else if (myForm.getProgList() != null)
					request.getSession().setAttribute("viewProg", "still");
				else if (myForm.getDoneList() != null)
					request.getSession().setAttribute("viewProg", "done");
				myProgressService.setReqProg(myForm);
				myForm.setDiseaseName(null);
				myForm.setSymptoms(null);
				request.getSession().setAttribute("ProgressForm", myForm);
				return "gotoAdminViewProgress";

			} else if (myForm.getDoctorid() != 0) {
				// view progress by doctor id
				myProgressService.getProgByDoctorID(myForm, myForm.getDoctorid());
				if (myForm.getProgList() != null && myForm.getDoneList() != null)
					request.getSession().setAttribute("viewProg", "start");
				else if (myForm.getProgList() != null)
					request.getSession().setAttribute("viewProg", "still");
				else if (myForm.getDoneList() != null)
					request.getSession().setAttribute("viewProg", "done");
				myProgressService.setReqProg(myForm);
				myForm.setDiseaseName(null);
				myForm.setSymptoms(null);
				request.getSession().setAttribute("ProgressForm", myForm);
				return "gotoAdminViewProgress";
			} else {
				// show all progress
				myForm.setDiseaseName(null);
				myForm.setSymptoms(null);
				myProgressService.setStillProgress(myForm);
				myProgressService.setDoneProgress(myForm);
				request.getSession().setAttribute("viewProg", "start");
				request.getSession().setAttribute("ProgressForm", myForm);
				myProgressService.setReqProg(myForm);
				return "gotoAdminViewProgress";
			}
		}
	}

	public ProgressService getMyProgressService() {
		return myProgressService;
	}

	public void setMyProgressService(ProgressService myProgressService) {
		this.myProgressService = myProgressService;
	}

}
