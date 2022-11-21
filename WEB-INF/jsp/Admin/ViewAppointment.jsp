<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<%@ include file="/WEB-INF/jsp/Common/StyleLink.jsp"%>
<%@ include file="/WEB-INF/jsp/Common/TagLib.jsp"%>
<link rel="stylesheet" type="text/css"
	href="https://cdn.datatables.net/v/dt/dt-1.12.1/datatables.min.css" />
<title>View Appointment</title>
</head>
<body class="bg-white">
	<div class="container-fluid overflow-hidden">
		<div class="row vh-100 overflow-auto">
			<%@ include file="AdminSideBar.jsp"%>
			<div class="col d-flex flex-column h-sm-100 gradient-skyblue">
				<main class="row overflow-auto">
					<div class="col pt-4">
						<h2 class=" text-center">Coming Appointments</h2>
						<hr>
						<ul class="nav nav-tabs" id="myTab">
							<!-- today appointment menu tab will show active when the session has related value -->
							<li class="nav-item"><a href="#today"
								class="nav-link <%if (session.getAttribute("appt").equals("todayDelete") || (session.getAttribute("appt").equals("start")))
	out.write("active");%>"
								data-bs-toggle="tab">Today<span
									class="ms-1 d-none d-lg-inline badge bg-success
rounded-pill float-end">
										${ProgDetailForm.todayApptList.size()}</span>
							</a></li>
							<!-- end of today appointment menu tab -->
							<!-- next day appointment menu tab -->
							<li class="nav-item"><a href="#nextday"
								class="nav-link <%if (session.getAttribute("appt") != null) {
	if (session.getAttribute("appt").equals("nextdayDelete"))
		out.write("active");
}%>"
								data-bs-toggle="tab">Next Day <span
									class="ms-1 d-none d-lg-inline badge bg-warning
rounded-pill float-end">${ProgDetailForm.comingApptList.size()}</span>

							</a></li>
							<!--end of next day appointment menu tab -->
						</ul>
						<div class="tab-content">
							<!-- today appointment menu content -->
							<div
								class="tab-pane fade  <%if (session.getAttribute("appt").equals("todayDelete") || session.getAttribute("appt").equals("start"))
	out.write(" show active");%>"
								id="today">

								<div class="table-responsive mt-3">
									<%
									int i = 1;
									%><table id="todayAppt"
										class="display table table-striped bg-white"
										style="width: 100%">
										<thead>
											<tr>
												<th>No.</th>
												<th>Time</th>
												<th>Doctor</th>
												<th>Patient</th>
												<th>Disease Name</th>
												<th></th>
											</tr>
										</thead>
										<tbody>
											<c:forEach var="i" begin="1"
												end="${ProgDetailForm.todayApptList.size()}" step="1">
												<tr>
													<td><%=i++%></td>
													<td>${ProgDetailForm.todayApptList[i-1].apptTime}</td>
													<td>${ProgDetailForm.todayApptList[i-1].patientProgress.doctor.doctorName}</td>
													<td>${ProgDetailForm.todayApptList[i-1].patientProgress.patient.patientName}</td>
													<td>${ProgDetailForm.todayApptList[i-1].patientProgress.diseaseName}</td>
													<td><a href="#mymodal" data-bs-toggle="modal"
														onclick="apptAction('${ProgDetailForm.todayApptList[i-1].progressDetailId}','todayDelete')"><span
															class="text-danger"> <i class="fa-solid fa-trash"></i></span></a></td>
												</tr>
											</c:forEach>
										</tbody>
									</table>
								</div>
							</div>
							<!-- end of today appointment menu content -->
							<!-- next day appointment menu content -->
							<div
								class="tab-pane fade<%if (session.getAttribute("appt") != null) {
	if (session.getAttribute("appt").equals("nextdayDelete"))
		out.write(" show active");
}%>"
								id="nextday">
								<%
								int j = 1;
								%><div class="table-responsive mt-3">
									<table id="nextAppt"
										class="display table table-striped bg-white"
										style="width: 100%">
										<thead>
											<tr>
												<th>No.</th>
												<th>Date</th>
												<th>Time</th>
												<th>Doctor</th>
												<th>Patient</th>
												<th>Disease Name</th>
												<th></th>
											</tr>
										</thead>
										<tbody>
											<c:forEach var="i" begin="1"
												end="${ProgDetailForm.comingApptList.size()}" step="1">
												<tr>
													<td><%=j++%></td>
													<td>${ProgDetailForm.comingApptList[i-1].appointmentDate}</td>
													<td>${ProgDetailForm.comingApptList[i-1].apptTime}</td>
													<td>${ProgDetailForm.comingApptList[i-1].patientProgress.doctor.doctorName}</td>
													<td>${ProgDetailForm.comingApptList[i-1].patientProgress.patient.patientName}</td>
													<td>${ProgDetailForm.comingApptList[i-1].patientProgress.diseaseName}</td>
													<td><a href="#mymodal" data-bs-toggle="modal"
														onclick="apptAction('${ProgDetailForm.comingApptList[i-1].progressDetailId}','nextdayDelete')"><span
															class="text-danger"> <i class="fa-solid fa-trash"></i></span></a></td>
												</tr>
											</c:forEach>
										</tbody>
									</table>
								</div>
							</div>
							<!--end next day appointment menu content -->
						</div>
					</div>
				</main>
			</div>
		</div>
	</div>
	<div class="modal fade" id="mymodal" tabindex="-1"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog modal-dialog-centered">
			<div class="modal-content">
				<div class="modal-body text-center">
					<p class="h5 text-dark lh-lg">Are you sure to delete this
						appointment?
					<p>
				</div>
				<div class="modal-footer justify-content-center">
					<html:form action="/AdminViewAppointment">
						<html:hidden property="frmControl" styleId="control" />
						<html:hidden property="progDetailid" styleId="id" />
						<button name="delete" type="submit"
							class="btn btn-outline-primary" id="deleteBtn">Yes</button>
					</html:form>
					<button type="button" class="btn btn-outline-danger"
						data-bs-dismiss="modal" aria-label="Close">Cancel</button>
				</div>
			</div>
		</div>
	</div>
	<script
		src="https://cdn.datatables.net/1.12.1/js/jquery.dataTables.min.js"></script>
	<script src="/HealthCareSystem/js/Admin/ViewAppointment.js"></script>
</body>
</html>