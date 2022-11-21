<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<%@ include file="/WEB-INF/jsp/Common/StyleLink.jsp"%>
<%@ include file="/WEB-INF/jsp/Common/TagLib.jsp"%>
<link rel="stylesheet" type="text/css"
	href="/HealthCareSystem/js/jquery.timepicker.min.css">
<link rel="stylesheet" type="text/css"
	href="https://cdn.datatables.net/v/dt/dt-1.12.1/datatables.min.css" />
<title>Add Appointment</title>
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
</head>
<body class="bg-white">
	<div class="container-fluid overflow-hidden">
		<div class="row vh-100 overflow-auto">
			<%@ include file="AdminSideBar.jsp"%>
			<div class="col d-flex flex-column h-sm-100 gradient-skyblue">
				<main class="row overflow-auto">
					<div class="col pt-4">
						<h2 class=" text-center">Add Appointment</h2>
						<hr>
						<ul class="nav nav-tabs" id="myTab">
							<!-- the add appointment menu tab will be seen only when the session has related value -->
							<%
							if (session.getAttribute("adminAddAppt") != null)
								if (session.getAttribute("adminAddAppt").equals("addReq") || session.getAttribute("adminAddAppt").equals("add")) {
							%>
							<li class="nav-item"><a href="#add" class="nav-link active"
								data-bs-toggle="tab">New Appointment</a></li>
							<%
							}
							%>
							<!-- end of the  add appointment menu tab -->
							<!-- the  request appointment menu tab -->
							<li class="nav-item"><a href="#request"
								class="nav-link <%if (session.getAttribute("adminAddAppt") == null)
	out.write("active");%>"
								data-bs-toggle="tab">Requested Appointment<logic:notEmpty
										property="reqApptList" name="ProgDetailForm">
										<span
											class="ms-1 d-none d-lg-inline badge bg-danger
rounded-pill float-end">${ProgDetailForm.reqApptList.size()}</span>
									</logic:notEmpty>
							</a></li>
							<!-- end of the  request appointment menu tab -->
						</ul>
						<div class="tab-content">
							<!-- the add appointment menu content will be seen only when the session has related value -->
							<div
								class="tab-pane fade <%if (session.getAttribute("adminAddAppt") != null)
	if (session.getAttribute("adminAddAppt").equals("addReq") || session.getAttribute("adminAddAppt").equals("add"))
		out.write("show active");%>"
								id="add">
								<html:form action="/AdminAddAppointment" styleId="ApptForm">
									<%
									boolean dis = false;
									String showalert = "notshow";
									if (session.getAttribute("adminAddAppt") != null)
										if (session.getAttribute("adminAddAppt").equals("addReq"))
											dis = true;
									%>
									<logic:notEmpty property="added" name="ProgDetailForm">
										<%
										showalert = "show";
										%>
									</logic:notEmpty>
									<div id="successAddAppt" hidden=<%=showalert%>></div>
									<div class="form-group row mt-4 mb-4">
										<label class="col-md-2 col-form-label"><span
											class="h5">Patient Name</span></label>
										<div class="col-md-3">
											<html:text property="patientName" style="height:40px;"
												disabled="true" styleClass="form-control" />
										</div>
										<label class="col-md-2 col-form-label"><span
											class="h5">Doctor Name</span></label>
										<div class="col-md-3">
											<html:text property="doctorName" style="height:40px;"
												disabled="true" styleClass="form-control" />
										</div>
									</div>
									<div class="form-group row mb-4">
										<label class="col-md-2 col-form-label"><span
											class="h5">Disease Name</span></label>
										<div class="col-md-3">
											<html:text property="diseaseName" style="height:40px;"
												disabled="true" styleClass="form-control"></html:text>
										</div>
										<label class="col-md-2 col-form-label"><span
											class="h5">Reason</span></label>
										<div class="col-md-3">
											<html:textarea property="reason" disabled="<%=dis%>"
												styleClass="form-control" styleId="reason" />

										</div>
									</div>
									<div class="form-group row mb-4">
										<label class=" col-md-2 col-form-label"><span
											class="h5">Date</span></label>
										<div class="col-md-3">
											<html:text property="date" styleId="apptDate"
												styleClass="form-control" />

										</div>
										<label class="col-md-2 col-form-label"> <span
											class="h5">Time</span>
										</label>
										<div class="col-md-3">
											<html:text property="time" styleId="time"
												styleClass="form-control" />
										</div>
										<div class="form-group d-flex mb-4  mt-3">
											<button name="add" type="submit"
												class="offset-md-5 mt-2 btn btn-outline-primary">
												<%
												if (session.getAttribute("adminAddAppt") != null)
													if (session.getAttribute("adminAddAppt").equals("addReq"))
														out.write("Confirm");
													else if (session.getAttribute("adminAddAppt").equals("add"))
														out.write("Add");
												%>
											</button>
											<%
											if (session.getAttribute("adminAddAppt") != null)
												if (session.getAttribute("adminAddAppt").equals("addReq")) {
											%>
											<a href="AdminAddAppointment.do?progDetailid=0"
												class="mt-2 ms-2 btn btn-outline-danger">Cancel</a>
											<%
											}
											%>
											<%
											if (session.getAttribute("adminAddAppt") != null)
												if (session.getAttribute("adminAddAppt").equals("add")) {
											%>
											<a href="AdminAddAppointment.do?progressid=0"
												class="mt-2 ms-2 btn btn-outline-danger">Cancel</a>
											<%
											}
											%>

										</div>
									</div>
								</html:form>
							</div>
							<!-- end of the  add appointment menu content -->
							<!--the  request appointment menu content -->
							<div
								class="tab-pane fade <%if (session.getAttribute("adminAddAppt") == null)
	out.write("show active");%>"
								id="request">
								<div class="form-group row mb-4">
									<logic:notEmpty property="reqApptList" name="ProgDetailForm">
										<%
										int i = 1;
										%>
										<div class="table-responsive mt-3">
											<table id="reqAppt"
												class="display table table-striped bg-white"
												style="width: 100%">
												<thead>
													<tr>
														<th>No.</th>
														<th>Patient Name</th>
														<th>Doctor Name</th>
														<th>For</th>
														<th>Add</th>
													</tr>
												</thead>
												<tbody>
													<c:forEach var="i" begin="1"
														end="${ProgDetailForm.reqApptList.size()}" step="1">
														<tr>
															<td><%=i++%></td>
															<td>${ProgDetailForm.reqApptList[i-1].patientProgress.patient.patientName}</td>
															<td>${ProgDetailForm.reqApptList[i-1].patientProgress.doctor.doctorName}</td>
															<td>${ProgDetailForm.reqApptList[i-1].patientProgress.diseaseName}</td>

															<td><a
																href="AdminAddAppointment.do?progDetailid=${ProgDetailForm.reqApptList[i-1].progressDetailId}">
																	<i class="fa-solid fa-square-plus"></i>
															</a></td>
														</tr>
													</c:forEach>
												</tbody>
											</table>
										</div>
									</logic:notEmpty>
								</div>
							</div>
							<!-- end of the  request appointment menu content -->
						</div>
					</div>
				</main>
			</div>
		</div>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.5/jquery.validate.js"></script>
	<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
	<script src="/HealthCareSystem/js/jquery.timepicker.min.js"></script>
	<script
		src="https://cdn.datatables.net/1.12.1/js/jquery.dataTables.min.js"></script>
	<script src="/HealthCareSystem/js/Admin/AddAppointment.js"></script>
</body>
</html>