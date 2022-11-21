<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body>
	<div class="container-fluid">
		<nav class="navbar navbar-expand-lg navbar-light bg-white">
			<h1 class="h4 py-3 text-left text-primary">
				<span class="d-lg-inline">Welcome, <%-- <%
			if (session.getAttribute("doctorId") != null)
				out.println("Dr. ");
			%>  --%>${AdminForm.loginAdmin.adminName}
					${DoctorForm.loginDoctor.doctorName}

				</span>
			</h1>
			<div class="flex-fill"></div>
			<div class="navbar nav">
				<a href="logout.do"><i
					class="fa-solid fa-arrow-right-from-bracket"></i>Logout</a>
			</div>
		</nav>
	</div>
</body>
</html>