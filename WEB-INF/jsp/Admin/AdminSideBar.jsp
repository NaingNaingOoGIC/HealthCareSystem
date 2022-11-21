<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@ include file="/WEB-INF/jsp/Common/StyleLink.jsp"%>
<%@ include file="/WEB-INF/jsp/Common/TagLib.jsp"%>
</head>
<body class="bg-white">
	<div
		class="col-12 col-sm-3 col-xl-2 px-sm-2 px-0 bg-white d-flex sticky-top">
		<div
			class="d-flex flex-sm-column flex-row flex-grow-1 align-items-center align-items-sm-start px-3 pt-2 text-white">
			<a href="#"
				class="d-flex align-items-center pb-sm-3 mb-md-0 me-md-auto text-black text-decoration-none">
				<span class="fs-5 d-none d-md-inline text-primary">Welcome,<br>${AdminForm.loginAdmin.adminName}</span>
			</a>
			<ul
				class="nav nav-pills flex-sm-column flex-row flex-nowrap flex-shrink-1 flex-sm-grow-0 flex-grow-1 mb-sm-auto mb-0 justify-content-center align-items-center align-items-sm-start"
				id="menu">
				<li class="nav-item"><a href="AdminHome.do"
					class="nav-link px-sm-0 px-2"> <i class="fs-5 bi-speedometer2"></i><span
						class="ms-1 d-none d-sm-inline">Dashboard</span>
				</a></li>
				<li class="dropdown"><a href="#"
					class="nav-link dropdown-toggle px-sm-0 px-1" id="dropdown"
					data-bs-toggle="dropdown" aria-expanded="false"><logic:notEmpty
							property="reqList" name="PrgoressForm">
							<span class="text-danger"></span>
						</logic:notEmpty><i class="fa-solid fa-list-check"></i><span
						class="ms-1 d-none d-sm-inline"> Progress</span> <logic:notEmpty
							property="reqList" name="PrgoressForm">
							<span class="d-md-inline d-none badge bg-danger
rounded-pill"
								id="reqProg"> ${PrgoressForm.reqList.size()}</span>
						</logic:notEmpty> </a>
					<ul class="dropdown-menu dropdown-menu-dark text-small shadow"
						aria-labelledby="dropdown">
						<li><a class="dropdown-item" href="AddProgress.do">Add
								Progress<logic:notEmpty property="reqList" name="PrgoressForm">
									<span class="d-inline badge bg-danger
rounded-pill float-end">
										${PrgoressForm.reqList.size()}</span>
								</logic:notEmpty>
						</a></li>
						<li><a class="dropdown-item" href="AdminViewProgress.do">View
								Progresses</a></li>
					</ul></li>
				<li class="dropdown"><a href="#"
					class="nav-link dropdown-toggle px-sm-0 px-1" id="dropdown"
					data-bs-toggle="dropdown" aria-expanded="false"> <i
						class="fs-5 bi-table"></i><span class="ms-1 d-none d-sm-inline">
							Appointment</span> <logic:notEmpty property="reqApptList"
							name="ProgDetailForm">
							<span class="d-md-inline d-none badge bg-danger
rounded-pill">
								${ProgDetailForm.reqApptList.size()}</span>
						</logic:notEmpty>
				</a>
					<ul class="dropdown-menu dropdown-menu-dark text-small shadow"
						aria-labelledby="dropdown">
						<li><a class="dropdown-item" href="AdminAddAppointment.do">Add
								Appointment<logic:notEmpty property="reqApptList"
									name="ProgDetailForm">
									<span class="d-inline badge bg-danger
rounded-pill">
										${ProgDetailForm.reqApptList.size()}</span>
								</logic:notEmpty>
						</a></li>
						<li><a class="dropdown-item" href="AdminViewAppointment.do">View
								Appointment</a></li>
					</ul></li>
				<li class="dropdown"><a href="#"
					class="nav-link dropdown-toggle px-sm-0 px-1" id="dropdown"
					data-bs-toggle="dropdown" aria-expanded="false"> <i
						class="fa-solid fa-user-doctor"></i><span
						class="ms-1 d-none d-sm-inline"> Doctor</span>
				</a>
					<ul class="dropdown-menu dropdown-menu-dark text-small shadow"
						aria-labelledby="dropdown">
						<li><a class="dropdown-item" href="AddDoctor.do">Add
								Doctor </a></li>
						<li><a class="dropdown-item" href="ViewDoctor.do">View
								Doctors</a></li>
					</ul></li>
				<li class="dropdown"><a href="#"
					class="nav-link dropdown-toggle px-sm-0 px-1" id="dropdown"
					data-bs-toggle="dropdown" aria-expanded="false"> <i
						class="fa-solid fa-user"></i><span class="ms-1 d-none d-sm-inline">
							Patient</span> <logic:notEmpty property="reqPatientList" name="Patient">
							<span class="ms-1d-inline badge bg-danger
rounded-pill">
								${Patient.reqPatientList.size()}</span>
						</logic:notEmpty>
				</a>
					<ul class="dropdown-menu dropdown-menu-dark text-small shadow"
						aria-labelledby="dropdown">
						<li><a class="dropdown-item" href="AddPatient.do">Add
								Patient<logic:notEmpty property="reqPatientList" name="Patient">
									<span
										class="ms-1d-inline badge bg-danger
rounded-pill float-end">
										${Patient.reqPatientList.size()}</span>
								</logic:notEmpty>
						</a></li>
						<li><a class="dropdown-item" href="AdminViewPatient.do">View
								Patient</a></li>
					</ul></li>
				<li><a href="Department.do?frmControl=null"
					class="nav-link px-sm-0 px-2"> <i class="fa-solid fa-clipboard"></i><span
						class="ms-1 d-none d-sm-inline">Department</span>
				</a></li>
				<li class="dropdown"><a href="#"
					class="nav-link dropdown-toggle px-sm-0 px-1" id="dropdown"
					data-bs-toggle="dropdown" aria-expanded="false"> <i
						class="fa-solid fa-user-tie"></i><span
						class="ms-1 d-none d-sm-inline">Profile</span>
				</a>
					<ul class="dropdown-menu dropdown-menu-dark text-small shadow"
						aria-labelledby="dropdown">
						<li><a class="dropdown-item" href="AdminProfile.do">Your
								Profile</a></li>
						<li><a class="dropdown-item" href="AdminChangePs.do">Change
								Password</a></li>
						<li>
							<hr class="dropdown-divider">
						</li>
						<li><a class="dropdown-item" href="logout.do"><i
								class="fa-solid fa-arrow-right-from-bracket"></i>Logout</a></li>
					</ul></li>
			</ul>
		</div>
	</div>
</body>
</html>