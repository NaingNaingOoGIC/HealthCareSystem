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
<title>View Patients</title>
</head>
<body class="bg-white">
	<div class="container-fluid overflow-hidden">
		<div class="row vh-100 overflow-auto">
			<%@ include file="AdminSideBar.jsp"%>
			<div class="col d-flex flex-column h-sm-100 gradient-skyblue">
				<main class="row overflow-auto">
					<div class="col pt-4">
						<h2 class=" text-center">Patients</h2>
						<hr>
						<div class="table-responsive mt-3">
							<%
							int i = 1;
							%>
							<table id="patient" class="display table table-striped bg-white"
								style="width: 100%">
								<thead>
									<tr>
										<th>No.</th>
										<th>Name</th>
										<th>UserName</th>
										<th>Gender</th>
										<th>Age</th>
										<th>Blood</th>
										<th>Phone</th>
										<th>Email</th>
										<th>Address</th>
										<th></th>
										<th>Action</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach var="i" begin="1"
										end="${PatientForm.allPatientList.size()}" step="1">
										<tr>
											<td><%=i++%></td>
											<td>${PatientForm.allPatientList[i-1].patientName}</td>
											<td>${PatientForm.allPatientList[i-1].patientLoginName}</td>
											<td>${PatientForm.allPatientList[i-1].gender}</td>
											<td>${PatientForm.allPatientList[i-1].age}</td>
											<td>${PatientForm.allPatientList[i-1].bloodType}</td>
											<td>${PatientForm.allPatientList[i-1].phone}</td>
											<td>${PatientForm.allPatientList[i-1].mail}</td>
											<td>${PatientForm.allPatientList[i-1].address}</td>
											<td><a
												href="AdminViewAppointment.do?patientid=${PatientForm.allPatientList[i-1].patientId}"><i
													class="fa-regular fa-eye"></i> appt.</a></td>
											<td><a
												href="AdminViewProgress.do?patientid=${PatientForm.allPatientList[i-1].patientId}"><i
													class="fa-regular fa-eye"></i> prog.</a></td>

										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
					</div>
				</main>
			</div>
		</div>
	</div>
	<script
		src="https://cdn.datatables.net/1.12.1/js/jquery.dataTables.min.js"></script>
	<script>
		$("#patient").DataTable({
			"columnDefs" : [ {
				"targets" : [ 9 ],
				"orderable" : false
			}, {
				"width" : "40%",
				"targets" : [ 1 ],
			}, ]
		});
	</script>
</body>
</html>