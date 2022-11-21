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
				<span class="fs-5 d-none d-md-inline text-primary">Welcome,<br>Dr.
					${DoctorForm.loginDoctor.doctorName}
			</span>
			</a>
			<ul
				class="nav nav-pills flex-sm-column flex-row flex-nowrap flex-shrink-1 flex-sm-grow-0 flex-grow-1 mb-sm-auto mb-0 justify-content-center align-items-center align-items-sm-start"
				id="menu">
				<li class="nav-item"><a href="DoctorAppointment.do"
					class="nav-link px-sm-0 px-2"> <i class="fs-5 bi-table"></i><span
						class="ms-1 d-none d-sm-inline"> Appointment</span>
				</a></li>
				<li><a href="DoctorProgress.do" class="nav-link px-sm-0 px-2">
						<i class="fa-solid fa-list-check"></i><span
						class="ms-1 d-none d-sm-inline"> Progress</span>
				</a></li>
				<li class="dropdown"><a href="#"
					class="nav-link dropdown-toggle px-sm-0 px-1" id="dropdown"
					data-bs-toggle="dropdown" aria-expanded="false"> <i
						class="fa-solid fa-user-tie"></i><span
						class="ms-1 d-none d-sm-inline">Profile</span>
				</a>
					<ul class="dropdown-menu dropdown-menu-dark text-small shadow"
						aria-labelledby="dropdown">
						<li><a class="dropdown-item" href="DoctorProfile.do">Your
								Profile</a></li>
						<li><a class="dropdown-item" href="DoctorChangePs.do">Change
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