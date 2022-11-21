<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@ include file="/WEB-INF/jsp/Common/StyleLink.jsp"%>
<%@ include file="/WEB-INF/jsp/Common/TagLib.jsp"%>
</head>
<body>
	<nav
		class="navbar navbar-expand-lg navbar-light bg-white sticky-top border-bottom border-success">
		<div class="md-navbar-brand">
			<h1 class="h4 py-3 text-left text-primary ms-2">Welcome,
				${PatientForm.loginPatient.patientName}</h1>
		</div>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="flex-fill" style="width: 400px"></div>
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav me-auto mb-2 mb-lg-0">
				<li class="nav-item"><a href="PatientHome.do"
					class="nav-item nav-link <%if (session.getAttribute("patientlink") != null)
	if (session.getAttribute("patientlink").equals("home"))
		out.write("active");%>"><i
						class="fa-solid fa-house"></i> Home</a></li>
				<li class="nav-item"><a href="Progress.do"
					class="nav-item nav-link <%if (session.getAttribute("patientlink") != null)
	if (session.getAttribute("patientlink").equals("prog"))
		out.write("active");%>"><i
						class="fa-solid fa-list-check"></i> Medical Record</a></li>
				<li class="nav-item"><a href="Appointment.do"
					class="nav-item nav-link <%if (session.getAttribute("patientlink") != null)
	if (session.getAttribute("patientlink").equals("appt"))
		out.write("active");%>"><i
						class="fa-solid fa-calendar-check"></i> Appointment</a></li>
				<li class="nav-item"><a href="PatientSearchDoctor.do"
					class="nav-item nav-link <%if (session.getAttribute("patientlink") != null)
	if (session.getAttribute("patientlink").equals("doctor"))
		out.write("active");%>"><i
						class="fa-solid fa-user-doctor"></i> Search Doctor</a></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle <%if (session.getAttribute("patientlink") != null)
	if (session.getAttribute("patientlink").equals("profile"))
		out.write("active");%>"
					href="#" id="navbarDropdown" role="button"
					data-bs-toggle="dropdown" aria-expanded="false"> <i
						class="fa-solid fa-user"></i> Profile
				</a>
					<ul class="dropdown-menu" aria-labelledby="navbarDropdown">
						<li><a href="PatientProfile.do" class="dropdown-item">Your
								Profile</a></li>
						<li><a href="PatientChangePs.do" class="dropdown-item">Change
								Password</a></li>
						<li><hr class="dropdown-divider"></li>
						<li><a href="logout.do" class="dropdown-item"><i
								class="fa-solid fa-arrow-right-from-bracket"></i>Logout</a></li>
					</ul></li>
			</ul>
		</div>
	</nav>
</body>
</html>