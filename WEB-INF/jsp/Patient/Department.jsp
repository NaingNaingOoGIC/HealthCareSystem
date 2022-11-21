<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@ include file="/WEB-INF/jsp/Common/StyleLink.jsp"%>
<%@ include file="/WEB-INF/jsp/Common/TagLib.jsp"%>
<title>Department Detail</title>
</head>
<body class="gradient-skyblue">
	<div class="container-fluid overflow-hidden">
		<div class="row vh-100 overflow-auto">
			<%@ include file="PatientSideBar.jsp"%>
			<div class="col d-flex flex-column h-sm-100 gradient-skyblue">
				<main class="row overflow-auto">
					<div class="col pt-4">
						<h2 class="text-center ">${DepartmentForm.department.departmentName }</h2>
						<div class="container-fluid">
							<h4>Description</h4>
							<p class="lh-lg" style="text-align: justify;">${DepartmentForm.department.departmentDescription }</p>
							<h4 class="mb-2">Total Doctors:
								${DepartmentForm.department.noOfDoctor }</h4>
							<logic:notEmpty name="DeptDoctorForm"
								property="availableDoctorList">
								<div class="row">
									<c:forEach var="i" begin="1"
										end="${DeptDoctorForm.availableDoctorList.size()}" step="1">
										<div class="col-lg-3 col-md-4 col-sm-6 mb-3">
											<div class="card p-1 h-100">
												<div class="card-body">
													<table class="table table-borderless" style="width: 100%">
														<tr>
															<th>Name</th>
															<td>:</td>
															<td>${DeptDoctorForm.availableDoctorList[i-1].doctorName}</td>
														</tr>
														<tr>
															<th>Gender</th>
															<td>:</td>
															<td>${DeptDoctorForm.availableDoctorList[i-1].gender}</td>
														</tr>
														<tr>
															<th>Degree</th>
															<td>:</td>
															<td>${DeptDoctorForm.availableDoctorList[i-1].degree}</td>
														</tr>
														<tr>
															<th>Age</th>
															<td>:</td>
															<td>${DeptDoctorForm.availableDoctorList[i-1].age}</td>
														</tr>
														<tr>
															<th>Address</th>
															<td>:</td>
															<td>${DeptDoctorForm.availableDoctorList[i-1].address}</td>
														</tr>
														<tr>
															<th class="text-center" colspan="3"><a
																href="Progress.do?doctorid=${DeptDoctorForm.availableDoctorList[i-1].doctorId}"><i
																	class="fa-solid fa-square-plus"></i> Request treatment </a></th>
														</tr>
													</table>
												</div>
											</div>
										</div>
									</c:forEach>
								</div>
							</logic:notEmpty>
						</div>
					</div>
				</main>
			</div>
		</div>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>