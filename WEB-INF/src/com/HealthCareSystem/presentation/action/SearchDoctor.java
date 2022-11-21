package com.HealthCareSystem.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.HealthCareSystem.business.service.DoctorService;
import com.HealthCareSystem.presentation.form.DoctorForm;

public class SearchDoctor extends BaseAction {

	private DoctorService myDoctorService;

	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request, HttpServletResponse response,
			ActionMapping mapping) throws Exception {

		DoctorForm myForm = (DoctorForm) form;
		myDoctorService.searchAvaDoctor(myForm);

		return "gotoSearchDoctor";
	}

	@Override
	protected String doInit(ActionForm form, HttpServletRequest request, HttpServletResponse response,
			ActionMapping mapping) {
//search doctor by any Internet user
		DoctorForm myForm = (DoctorForm) form;
		myDoctorService.showAvailableDoctor(myForm);
		myForm.setName(null);
		return "gotoSearchDoctor";
	}

	public DoctorService getMyDoctorService() {
		return myDoctorService;
	}

	public void setMyDoctorService(DoctorService myDoctorService) {
		this.myDoctorService = myDoctorService;
	}

}
