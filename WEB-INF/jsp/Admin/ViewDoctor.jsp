<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>

<%@ include file="/WEB-INF/jsp/Common/StyleLink.jsp"%>
<%@ include file="/WEB-INF/jsp/Common/TagLib.jsp"%>
<link rel="stylesheet" type="text/css"
	href="https://cdn.datatables.net/v/dt/dt-1.12.1/datatables.min.css" />
<title>View Doctors</title>
</head>
<body class="bg-white">
	<div class="container-fluid overflow-hidden">
		<div class="row vh-100 overflow-auto">
			<%@ include file="AdminSideBar.jsp"%>
			<div class="col d-flex flex-column h-sm-100 gradient-skyblue">
				<main class="row overflow-auto">
					<div class="col pt-4">
						<h2 class=" text-center">Doctors</h2>
						<hr>
						<ul class="nav nav-tabs" id="myTab">
							<!-- active doctor menu tab -->
							<li class="nav-item"><a href="#available"
								class="nav-link <%if (session.getAttribute("frmControl") != null) {
	if (session.getAttribute("frmControl").equals("delete"))
		out.write("active");
} else
	out.write("active");%>"
								data-bs-toggle="tab">Available Doctors<span
									class="ms-1 d-none d-lg-inline badge bg-success
rounded-pill float-end">
										${Doctor.availableDoctorList.size()}</span>
							</a></li>
							<!--end of active doctor menu tab -->
							<!-- away doctor menu tab -->
							<li class="nav-item"><a href="#away"
								class="nav-link <%if (session.getAttribute("frmControl") != null) {
	if (session.getAttribute("frmControl").equals("return") || session.getAttribute("frmControl").equals("unavaSearch"))
		out.write("active");
}%>"
								data-bs-toggle="tab">Away<logic:notEmpty
										property="unAvailableDoctorList" name="Doctor">
										<span
											class="ms-1 d-none d-lg-inline badge bg-secondary
rounded-pill float-end">${Doctor.unAvailableDoctorList.size()}</span>
									</logic:notEmpty>
							</a></li>
							<!--end away doctor menu tab -->
						</ul>
						<div class="tab-content">
							<!-- active doctor menu content -->
							<div
								class="tab-pane fade  <%if (session.getAttribute("frmControl") != null) {
	if (session.getAttribute("frmControl").equals("delete"))
		out.write(" show active");
} else
	out.write(" show active");%>"
								id="available">
								<div class="table-responsive mt-3">
									<%
									int i = 1;
									%>
									<table id="avatable"
										class="display table table-striped bg-white"
										style="width: 100%">
										<thead>
											<tr>
												<th>No.</th>
												<th>Department</th>
												<th>Name</th>
												<th>UserName</th>
												<th>Age</th>
												<th>Degree</th>
												<th>Phone</th>
												<th>Email</th>
												<th></th>
												<th>Action</th>
												<th></th>
											</tr>
										</thead>
										<tbody>
											<c:forEach var="i" begin="1"
												end="${Doctor.availableDoctorList.size()}" step="1">
												<tr>
													<td><%=i++%></td>
													<td>${Doctor.availableDoctorList[i-1].department.departmentName}</td>
													<td>${Doctor.availableDoctorList[i-1].doctorName}</td>
													<td>${Doctor.availableDoctorList[i-1].doctorLoginName}</td>
													<td>${Doctor.availableDoctorList[i-1].age}</td>
													<td>${Doctor.availableDoctorList[i-1].degree}</td>
													<td>${Doctor.availableDoctorList[i-1].phone}</td>
													<td>${Doctor.availableDoctorList[i-1].mail}</td>
													<td><a
														href="AdminViewAppointment.do?doctorid=${Doctor.availableDoctorList[i-1].doctorId}"><i
															class="fa-regular fa-eye"></i>appt.</a></td>
													<td><a
														href="AdminViewProgress.do?doctorid=${Doctor.availableDoctorList[i-1].doctorId}"><i
															class="fa-regular fa-eye"></i>prog.</a></td>
													<td><a href="#mymodal" data-bs-toggle="modal"
														onclick="doctorAction('${Doctor.availableDoctorList[i-1].doctorId}','${Doctor.availableDoctorList[i-1].doctorName}','delete')"><span
															class="text-danger"> <i class="fa-solid fa-trash"></i></span></a></td>
												</tr>
											</c:forEach>
										</tbody>
									</table>
								</div>
							</div>
							<!--end of active doctor menu content -->
							<!-- away doctor menu content -->
							<div
								class="tab-pane fade<%if (session.getAttribute("frmControl") != null) {
	if (session.getAttribute("frmControl").equals("return") || session.getAttribute("frmControl").equals("unavaSearch"))
		out.write(" show active");
}%>"
								id="away">
								<logic:notEmpty property="unAvailableDoctorList" name="Doctor">
									<div style="height: 100%; width: 100%;">
										<div class="table-responsive mt-3">
											<%
											int j = 1;
											%>
											<table id="unavatable"
												class="display table table-striped bg-white"
												style="width: 100%">
												<thead>
													<tr>
														<th>No.</th>
														<th>Department</th>
														<th>Name</th>
														<th>UserName</th>
														<th>Age</th>
														<th>Degree</th>
														<th>Phone</th>
														<th>Email</th>
														<th>Return</th>
														<th>View</th>
													</tr>
												</thead>
												<tbody>
													<c:forEach var="j" begin="1"
														end="${Doctor.unAvailableDoctorList.size()}" step="1">
														<tr>
															<td><%=j++%></td>
															<td>${Doctor.unAvailableDoctorList[j-1].department.departmentName}</td>
															<td>${Doctor.unAvailableDoctorList[j-1].doctorName}</td>
															<td>${Doctor.unAvailableDoctorList[j-1].doctorLoginName}</td>
															<td>${Doctor.unAvailableDoctorList[j-1].age}</td>
															<td>${Doctor.unAvailableDoctorList[j-1].degree}</td>
															<td>${Doctor.unAvailableDoctorList[j-1].phone}</td>
															<td>${Doctor.unAvailableDoctorList[j-1].mail}</td>
															<td><a href="#mymodal" data-bs-toggle="modal"
																onclick="doctorAction('${Doctor.unAvailableDoctorList[j-1].doctorId}','${Doctor.unAvailableDoctorList[j-1].doctorName}','return')"><i
																	class="fa-solid fa-arrow-rotate-left"></i></a></td>
															<td><a
																href="AdminViewProgress.do?doctorid=${Doctor.unAvailableDoctorList[j-1].doctorId}"><i
																	class="fa-regular fa-eye"></i>prog.</a></td>

														</tr>
													</c:forEach>
												</tbody>
											</table>
										</div>
									</div>
								</logic:notEmpty>
							</div>
							<!-- end of away doctor menu content -->
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
					<p class="h5 text-dark lh-lg">
						Is Dr. <span id="doctorName"></span> ?
					<p>
				</div>
				<div class="modal-footer justify-content-center">
					<html:form action="/ViewDoctor">
						<html:hidden property="frmControl" styleId="control" />
						<html:hidden property="deleteId" styleId="id" />
						<button name="delete" type="submit"
							class="btn btn-outline-primary" id="deleteBtn">Yes</button>
						<button name="return" type="submit"
							class="btn btn-outline-primary" id="returnBtn">Yes</button>
					</html:form>
					<button type="button" class="btn btn-outline-danger"
						data-bs-dismiss="modal" aria-label="Close">Cancel</button>
				</div>
			</div>
		</div>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
	<script
		src="https://cdn.datatables.net/1.12.1/js/jquery.dataTables.min.js"></script>
	<script src="/HealthCareSystem/js/Admin/ViewDoctor.js"></script>
</body>
</html>