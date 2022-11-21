<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<link rel="stylesheet" type="text/css"
	href="https://cdn.datatables.net/v/dt/dt-1.12.1/datatables.min.css" />

<%@ include file="/WEB-INF/jsp/Common/StyleLink.jsp"%>
<%@ include file="/WEB-INF/jsp/Common/TagLib.jsp"%>
<title>Search Doctors</title>
</head>
<body class="gradient-skyblue">
	<div class="container-fluid overflow-hidden">
		<div class="row vh-100 overflow-auto">
			<%@ include file="PatientSideBar.jsp"%>
			<div class="col d-flex flex-column h-sm-100 gradient-skyblue">
				<main class="row overflow-auto">
					<div class="col pt-4 text-center">
						<h2 class="mt-2 text-center">Doctors</h2>
						<hr>

						<!--end of doctor list -->
						<div class="container">
							<div class="table-responsive mt-3">
								<%
								int i = 1;
								%>
								<table id="doctor" class="display table table-striped bg-white"
									style="width: 100%">
									<thead>
										<tr>
											<th>No.</th>
											<th>Department</th>
											<th>Name</th>
											<th>Gender</th>
											<th>Degree</th>
											<th>Age</th>
											<th>Address</th>
											<th></th>
										</tr>
									</thead>
									<tbody>
										<c:forEach var="i" begin="1"
											end="${DoctorForm.availableDoctorList.size()}" step="1">
											<tr>
												<td><%=i++%></td>
												<td>${DoctorForm.availableDoctorList[i-1].department.departmentName}</td>
												<td>${DoctorForm.availableDoctorList[i-1].doctorName}</td>
												<td>${DoctorForm.availableDoctorList[i-1].gender}</td>
												<td>${DoctorForm.availableDoctorList[i-1].degree}</td>
												<td>${DoctorForm.availableDoctorList[i-1].age}</td>
												<td>${DoctorForm.availableDoctorList[i-1].address}</td>
												<td><a
													href="Progress.do?doctorid=${DoctorForm.availableDoctorList[i-1].doctorId}"><i
														class="fa-solid fa-square-plus"></i> Request treatment </a></td>
										</c:forEach>
									</tbody>
								</table>
							</div>
						</div>
					</div>
				</main>
			</div>
		</div>
	</div>
	<script src="/HealthCareSystem/js/AutoComplement.js"></script>
	<script
		src="https://cdn.datatables.net/1.12.1/js/jquery.dataTables.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
	<script src="/HealthCareSystem/js/Patient/SearchDoctor.js"></script>
</body>
</html>