<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="/WEB-INF/jsp/Common/StyleLink.jsp"%>
<%@ include file="/WEB-INF/jsp/Common/TagLib.jsp"%>
<link rel="stylesheet" href="/HealthCareSystem/js/select2.min.css">
<style>
label.error {
	color: red;
}

.swal-text {
	background-color: #FEFAE3;
	padding: 17px;
	border: 1px solid #F0E1A1;
	display: block;
	margin: 22px;
	text-align: center;
	color: #61534e;
}

.swal-modal {
	width: 300px;
}
</style>
<title>Add Progress</title>
</head>
<body class="bg-white">
	<div class="container-fluid overflow-hidden">
		<div class="row vh-100 overflow-auto">
			<%@ include file="AdminSideBar.jsp"%>
			<div class="col d-flex flex-column h-sm-100 gradient-skyblue">
				<main class="row overflow-auto">
					<div class="col pt-4">
						<h2 class="text-center">Add New Progress</h2>
						<hr>
						<ul class="nav nav-tabs ms-2 me-2" id="myTab">
							<!-- add new progress menu tab -->
							<li class="nav-item"><a href="#add" class="nav-link active"
								data-bs-toggle="tab">New Progress</a></li>
							<!--end of add new progress menu tab -->
							<!-- request  progress menu tab -->
							<li class="nav-item"><a href="#request" class="nav-link"
								data-bs-toggle="tab">Requested Progress<logic:notEmpty
										property="reqList" name="ProgForm">
										<span
											class="ms-1  d-inline badge bg-danger
rounded-pill float-end">${ProgForm.reqList.size()}</span>
									</logic:notEmpty>
							</a></li>
							<!--end request  progress menu tab -->
						</ul>
						<div class="tab-content">
							<!-- add new progress menu content -->
							<div class="tab-pane fade show active" id="add">
								<html:form action="/AddProgress" styleId="AddProgForm">
									<%
									boolean disabled = false;
									String showalert = "notshow";
									if (session.getAttribute("progid") == null)
										disabled = false;
									else
										disabled = true;
									%>
									<logic:notEmpty property="added" name="ProgForm">
										<%
										showalert = "show";
										%>
										<!-- <label class="offset-md-5 col-4 col-form-label"><span
																class="h5 text-success">Successfully Added.</span></label> -->
									</logic:notEmpty>
									<div id="successAddProgress" hidden=<%=showalert%>></div>
									<div class="row mt-3">
										<label class="form-label  h5 col-md-2">Patient User
											Name</label>
										<div class="col-md-3">
											<html:select property="patientUserName"
												disabled="<%=disabled%>" styleId="patientSelect"
												styleClass="p-3">
												<html:option value="">Select Patient</html:option>
												<html:optionsCollection property="allPatient"
													value="patientId" label="patientLoginName" />
											</html:select>
										</div>
										<label class="form-label  h5 col-md-2">Doctor User
											Name </label>
										<div class="col-md-3">
											<html:select property="doctorUserName" styleId="doctorSelect"
												styleClass="p-3">
												<html:option value="">Select Doctor</html:option>
												<html:optionsCollection property="allDoctor"
													value="doctorId" label="doctorLoginName" />
											</html:select>
										</div>
									</div>

									<div class="row mt-3">
										<label class="form-label  col-md-2 h5">Symptoms </label>
										<div class="col-md-5">
											<html:textarea property="symptoms" disabled="<%=disabled%>"
												styleClass="form-control p-3" styleId="symptoms" />

										</div>
									</div>
									<div class="offset-md-5 mt-3 col-md-4">
										<%
										if (session.getAttribute("progid") == null) {
										%>

										<button name="add" type="submit"
											class="btn btn-outline-primary ms-3">Add</button>
										<a href="AddProgress.do?progressid=0"
											class="btn btn-outline-danger">Cancel</a>
										<%
										} else {
										%>
										<button name="confirm" type="submit"
											class="btn btn-outline-primary ms-3 ">Confirm</button>
										<a href="AddProgress.do?progressid=0"
											class="btn btn-outline-danger">Cancel</a>
										<%
										}
										%>
									</div>
									<!-- </div> -->
								</html:form>
							</div>
							<!--end of add new progress menu content -->
							<!-- request progress menu content -->
							<div class="tab-pane fade mb-3" id="request">
								<logic:notEmpty property="reqList" name="ProgForm">
									<%
									int i = 1;
									%>
									<div class="table-responsive">
										<display:table id="data" name="sessionScope.ProgForm.reqList"
											pagesize="10" requestURI="AddProgress.do"
											class="table table-striped bg-white mt-3">

											<display:column title="No" value="<%=i++%>" />
											<display:column property="patient.patientName"
												title="Patient Name" />
											<display:column property="patient.patientLoginName"
												title="Patient Username" />
											<display:column property="doctor.doctorName"
												title="Doctor Name" />
											<display:column property="doctor.doctorLoginName"
												title="Doctor Username" />
											<display:column property="doctor.department.departmentName"
												title="Department" />
											<display:column property="symptoms" title="Symptoms"
												style="text-align:justify;" />
											<display:column paramId="progressid"
												paramProperty="progressId" href="AddProgress.do" title="Add"
												style="text-align:center;">
												<i class="fa-solid fa-square-plus"></i>
											</display:column>

											<display:setProperty name="paging.banner.placement"
												value="bottom" />
											<display:setProperty name="paging.banner.some_items_found"
												value="" />
											<display:setProperty name="paging.banner.all_items_found"
												value="" />
											<display:setProperty name="paging.banner.one_item_found"
												value="" />
											<display:setProperty name="paging.banner.onepage" value="" />
										</display:table>
									</div>
								</logic:notEmpty>
							</div>
							<!--end of request progress menu content -->
						</div>
					</div>
				</main>
			</div>
		</div>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
	<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
	<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
	<script src="/HealthCareSystem/js/select2.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.5/jquery.validate.js"></script>
	<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
	<script src="/HealthCareSystem/js/Admin/AddProgress.js"></script>
</body>
</html>