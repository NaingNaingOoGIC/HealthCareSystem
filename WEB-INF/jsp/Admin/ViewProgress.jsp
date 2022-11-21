<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<%@ include file="/WEB-INF/jsp/Common/StyleLink.jsp"%>
<%@ include file="/WEB-INF/jsp/Common/TagLib.jsp"%>
<link rel="stylesheet" type="text/css"
	href="https://cdn.datatables.net/v/dt/dt-1.12.1/datatables.min.css" />
<title>View Progress</title>
</head>
<body class="bg-white">
	<div class="container-fluid overflow-hidden">
		<div class="row vh-100 overflow-auto">
			<%@ include file="AdminSideBar.jsp"%>
			<div class="col d-flex flex-column h-sm-100 gradient-skyblue">
				<main class="row overflow-auto">
					<div class="col pt-4">
						<h2 class=" text-center">Progress</h2>
						<hr>
						<ul class="nav nav-tabs" id="myTab">
							<!-- the during treatment menu tab will be seen active when the session has related value -->
							<li class="nav-item"><a href="#still"
								class="nav-link <%if (session.getAttribute("viewProg").equals("still"))
	out.write("active");
if (session.getAttribute("viewProg").equals("start"))
	out.write("active");%>"
								data-bs-toggle="tab">During Treatment<span
									class="ms-1 d-none d-lg-inline badge bg-success
rounded-pill float-end">
										${ProgressForm.progList.size()}</span>
							</a></li>
							<!-- end of during treatment menu tab -->
							<!-- the treatment done menu tab -->
							<li class="nav-item"><a href="#done"
								class="nav-link <%if (session.getAttribute("viewProg").equals("done"))
	out.write("active");%>"
								data-bs-toggle="tab">Treatment Done <span
									class="ms-1 d-none d-lg-inline badge bg-secondary
rounded-pill float-end">${ProgressForm.doneList.size()}</span>

							</a></li>
							<!-- end of treatment done menu tab -->
						</ul>
						<div class="tab-content mb-2">
							<!-- the during treatment menu content -->
							<div
								class="tab-pane fade <%if (session.getAttribute("viewProg").equals("still"))
	out.write(" show active");
if (session.getAttribute("viewProg").equals("start"))
	out.write(" show active");%>"
								id="still">
								<div class="mt-3">
									<%
									int i = 1;
									%><div class="table-responsive">
										<table id="stillProg"
											class="display table table-striped bg-white mt-3"
											style="width: 100%">
											<thead>
												<tr>
													<th>No.</th>
													<th>Patient Name</th>
													<th>Doctor Name</th>
													<th>Disease Name</th>
													<th>Add</th>
												</tr>
											</thead>
											<tbody>
												<c:forEach var="i" begin="1"
													end="${ProgForm.progList.size()}" step="1">
													<tr>
														<td><%=i++%></td>
														<td>${ProgForm.progList[i-1].patient.patientName}</td>
														<td>${ProgForm.progList[i-1].doctor.doctorName}</td>
														<td>${ProgForm.progList[i-1].diseaseName}</td>
														<td><a
															href="AdminAddAppointment.do?progressid=${ProgForm.progList[i-1].progressId}"><i
																class="fa-solid fa-square-plus"></i> appt. </a></td>
													</tr>
												</c:forEach>
											</tbody>
										</table>
									</div>
								</div>
							</div>
							<div
								class="tab-pane fade  <%if (session.getAttribute("viewProg").equals("done"))
	out.write(" show active");%>"
								id="done">
								<div class="mt-3">
									<%
									int j = 1;
									%>
									<div class="table-responsive">
										<table id="doneProg"
											class="display table table-striped bg-white mt-3"
											style="width: 100%">
											<thead>
												<tr>
													<th>No.</th>
													<th>Patient Name</th>
													<th>Doctor Name</th>
													<th>Disease Name</th>

												</tr>
											</thead>
											<tbody>
												<c:forEach var="i" begin="1"
													end="${ProgForm.doneList.size()}" step="1">
													<tr>
														<td><%=j++%></td>
														<td>${ProgForm.doneList[i-1].patient.patientName}</td>
														<td>${ProgForm.doneList[i-1].doctor.doctorName}</td>
														<td>${ProgForm.doneList[i-1].diseaseName}</td>

													</tr>
												</c:forEach>
											</tbody>
										</table>
									</div>
								</div>
							</div>
						</div>
					</div>
				</main>
			</div>
		</div>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
	<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
	<script
		src="https://cdn.datatables.net/1.12.1/js/jquery.dataTables.min.js"></script>
	<script>
		$(document).ready(function() {
			$("#stillProg").DataTable();
			$("#doneProg").DataTable();
		})
	</script>
</body>
</html>