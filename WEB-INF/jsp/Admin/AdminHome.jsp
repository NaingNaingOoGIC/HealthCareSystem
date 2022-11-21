<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<%@ include file="/WEB-INF/jsp/Common/StyleLink.jsp"%>
<%@ include file="/WEB-INF/jsp/Common/TagLib.jsp"%>
<title>Admin Home</title>
</head>
<body class="bg-white">
	<div class="container-fluid overflow-hidden">
		<div class="row vh-100 overflow-auto">
			<%@ include file="AdminSideBar.jsp"%>
			<div class="col d-flex flex-column h-sm-100 gradient-skyblue">
				<main class="row overflow-auto">
					<div class="col pt-4">
						<!-- Content Row 1 -->
						<h2 class="h4 text-black-50">DashBoard</h2>
						<p class="text-black-50">Welcome to Admin Panel</p>
						<div class="row">
							<!-- show count of patients -->
							<div class="col-md-3 mb-2">
								<div class="card h-100">
									<div class="card-body ">
										<h4 class="card-title text-success">
											<i class="fa-solid fa-user"></i> Total Patients
										</h4>
										<p class="h4 text-success">Patients
											${Patient.allPatientList.size()}</p>
										<p class="h4 text-warning">
											<logic:notEmpty property="reqPatientList" name="Patient">
									Requested 
										${Patient.reqPatientList.size()}</logic:notEmpty>
										</p>
									</div>
								</div>
							</div>
							<!--end show count of patients -->
							<div class="col-md-3 mb-2">
								<div class="card h-100">
									<div class="card-body">
										<h4 class="card-title text-success">
											<i class="fa-solid fa-list-check"></i> Progresses
										</h4>
										<p class="h4 text-success">Total Progresses
											${PrgoressForm.allProgSize}</p>
										<p class="h4 text-warning">
											<logic:notEmpty property="reqList" name="PrgoressForm">
									Requested Progress
										${PrgoressForm.reqList.size()}</logic:notEmpty>
										</p>
										<p class="h4 text-info">During Treatment
											${PrgoressForm.progList.size()}</p>
										<p class="h4 text-success">Treatment Done
											${PrgoressForm.doneList.size()}</p>
									</div>
								</div>
							</div>
							<!--end show count of progress -->
							<!-- show count of doctors -->
							<div class="col-md-3 mb-2">
								<div class="card h-100">
									<div class="card-body">
										<h4 class="card-title text-success">
											<i class="fa-solid fa-user-doctor"></i> Total Doctor
										</h4>
										<p class="h2 text-success">${DoctorForm.availableDoctorList.size()}</p>
									</div>
								</div>
							</div>
							<!--end of show count of doctors -->
							<!-- show count of admin -->
							<div class="col-md-3 mb-2">
								<div class="card  h-100">
									<div class="card-body">
										<h4 class="card-title text-success">
											<i class="fa-solid fa-user-tie"></i> Total Admin
										</h4>
										<p class="h2 text-success">${AdminForm.count}</p>
									</div>
								</div>
							</div>
							<!--end of show count of admin -->
							<!-- show count of departments -->
							<div class="col-md-3 mb-2">
								<div class="card  h-100">
									<div class="card-body">
										<h4 class="card-title text-success">
											<i class="fa-solid fa-clipboard"></i> Total Department
										</h4>
										<p class="h4 text-success">Available
											${DepartmentForm.avaDept}</p>
										<p class="h4 text-secondary">Unavailable
											${DepartmentForm.unavaDept}</p>
									</div>
								</div>
							</div>
						</div>
						<!--end of show count of departments -->
					</div>
				</main>
			</div>
		</div>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>