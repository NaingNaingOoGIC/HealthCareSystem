package com.HealthCareSystem.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.HealthCareSystem.business.service.DepartmentService;
import com.HealthCareSystem.presentation.form.DepartmentForm;

public class DepartmentAction extends BaseAction {

	private DepartmentService myDeptService;

	@Override
	protected String doExecute(ActionForm form, HttpServletRequest request, HttpServletResponse response,
			ActionMapping mapping) throws Exception {
		HttpSession session = request.getSession(false);
		if (session.getAttribute("adminId") == null) {
			return "gotoAdminLogin";

		} else {
			DepartmentForm myDeptForm = (DepartmentForm) form;
			ActionErrors errors = new ActionErrors();
			// if the action is delete or re-upload
			if (myDeptForm.getDeptDelete() != null) {

				if (myDeptForm.getDeptDelete().equals("delete")) {// if the action is delete
					if (request.getParameter("delete") != null) {// if delete button is clicked

						myDeptService.deleteDept(myDeptForm);// call deleteDept function of DepartmentService to change
																// status of department
						refreshPage(myDeptForm);
						return "gotoDepartment";
					}
				} else if (myDeptForm.getDeptDelete().equals("reupload")) {// if the action is re-upload

					if (request.getParameter("reupload") != null) {// if re-upload button is clicked

						myDeptService.reuploadDept(myDeptForm);// call reuploadDept function of DepartmentService to
																// change
																// status of department
						refreshPage(myDeptForm);
						return "gotoDepartment";
					}
				}
				return "gotoDepartment";
			} else {// if the action is add or edit department

				if (myDeptForm.getFrmControl() != null) {// if the action is edit
					if (request.getParameter("update") != null) {// if update button is clicked
						myDeptService.editDept(myDeptForm);// call editDept function of DepartmentService to
															// update
															// department
						refreshPage(myDeptForm);
						request.getSession().setAttribute("dept", "update");
					}
					return "gotoDepartment";
				} else {// if action is add
					if (myDeptService.checkDeptNameExit(myDeptForm)) {
						errors.add("Department_Name", new ActionMessage("errors.exit"));

						saveErrors(request, errors);
						request.getSession().setAttribute("dept", "update");
						return "gotoDepartment";
					} else {
						myDeptService.saveNewDept(myDeptForm);// call saveNewDept function of DepartmentService
																// to add new department
						refreshPage(myDeptForm);
						return "gotoDepartment";
					}
				}
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
			DepartmentForm myDeptForm = (DepartmentForm) form;
			if (myDeptForm.getFrmControl().equals("null")) {
				request.getSession().setAttribute("dept", "start");
				refreshPage(myDeptForm);
				return "gotoDepartment";
			} else if (myDeptForm.getFrmControl() != null) {// if update
				myDeptService.getDepartment(myDeptForm);// get department by id to update
				myDeptForm.setDeptName(myDeptForm.getDepartment().getDepartmentName());
				myDeptForm.setDescription(myDeptForm.getDepartment().getDepartmentDescription());
				request.getSession().setAttribute("dept", "update");
				myDeptService.showAllDept(myDeptForm);
				return "gotoDepartment";
			} else if (myDeptForm.getDeptDelete() != null) {// if delete or re-upload
				request.getSession().setAttribute("dept", "view");
				myDeptService.getDepartment(myDeptForm);// get department by id to make action
				myDeptService.showAllDept(myDeptForm);
				return "gotoDepartment";
			} else {
				request.getSession().setAttribute("dept", "start");
				myDeptForm.setDeptName(null);
				myDeptForm.setDescription(null);
				myDeptService.showAllDept(myDeptForm);
				return "gotoDepartment";
			}
		}
	}

	private void refreshPage(DepartmentForm myDeptForm) {// a function to refresh the page
		myDeptService.showAllDept(myDeptForm);
		myDeptForm.setDeptName(null);
		myDeptForm.setDeptDelete(null);
		myDeptForm.setDescription(null);
		myDeptForm.setFrmControl(null);
	}

	public DepartmentService getMyDeptService() {
		return myDeptService;
	}

	public void setMyDeptService(DepartmentService myDeptService) {
		this.myDeptService = myDeptService;
	}
}