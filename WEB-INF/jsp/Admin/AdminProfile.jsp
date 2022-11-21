<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<%@ include file="/WEB-INF/jsp/Common/StyleLink.jsp"%>
<%@ include file="/WEB-INF/jsp/Common/TagLib.jsp"%>
<style>
label.error {
	color: red;
}

.swal-text {
	background-color: #FEFAE3;
	padding: 17px;
	border: 1px solid #F0E1A1;
	display: block;
	margin: 22px;
	text-align: center;
	color: #61534e;
}

.swal-modal {
	width: 300px;
}
</style>

<title>Admin Profile</title>
</head>
<body class="bg-white">
	<div class="container-fluid overflow-hidden">
		<div class="row vh-100 overflow-auto">
			<%@ include file="AdminSideBar.jsp"%>
			<div class="col d-flex flex-column h-sm-100 gradient-skyblue">
				<main class="row overflow-auto">
					<div class="col pt-4">
						<h2 class=" text-center">Your Profile</h2>
						<hr>
						<html:form action="/AdminProfile" styleId="myForm">
							<%
							String showalert = "notshow";

							if (session.getAttribute("adminProfile").equals("Update"))
								showalert = "show";
							%>

							<div id="updateProfile" hidden=<%=showalert%>></div>
							<div class="form-group row mb-2">
								<label class="offset-md-4 col-md-2 col-form-label"><span
									class="h5">User Name</span></label>
								<div class="col-md-2">
									<html:text property="userName" disabled="true"
										styleClass="form-control" />
								</div>
							</div>
							<div class="form-group row mb-2">
								<label class="offset-md-4 col-md-2 col-form-label"> <span
									class="h5">Name</span><span class="text-danger"> *</span>
								</label>
								<div class="col-md-2">
									<html:text property="name" styleClass="form-control"
										styleId="name"></html:text>
								</div>
							</div>

							<div class="form-group row mb-2">
								<label class="offset-md-4 col-md-2 col-form-label"><span
									class="h5">Gender</span> </label>
								<div class="col-md-4 mt-2">
									<html:radio property="gender" value="Male"
										styleClass="form-check-input" />
									<span class="h5"> Male</span>
									<html:radio property="gender" value="Female"
										styleClass="form-check-input" />
									<span class="h5"> Female</span>
								</div>
							</div>
							<div class="form-group row mb-2">
								<label class="offset-md-4 col-md-2 col-form-label"><span
									class="h5">Date of Birth</span><span class="text-danger">
										*</span></label>
								<div class="col-md-2">
									<html:text property="dateOfBirth" styleId="dob"
										styleClass="form-control" />
								</div>
							</div>
							<div class="form-group row mb-2">
								<label class="offset-md-4 col-md-2 col-form-label"><span
									class="h5">Email</span><span class="text-danger"> *</span></label>
								<div class="col-md-2">
									<html:text property="email" styleClass="form-control"
										styleId="email"></html:text>
								</div>
							</div>
							<div class=" row mb-3">
								<label class=" offset-md-4 col-md-2 col-form-label"><span
									class="h5">Address</span> <span class="text-danger"> *</span></label>
								<div class="col-md-2">
									<html:textarea property="address" styleClass="form-control"
										styleId="address" />
								</div>
							</div>

							<div class="form-group row">
								<span>
									<button name="submit" type="submit"
										class=" offset-md-5 btn btn-outline-primary">Update
										Profile</button>
								</span>
							</div>
						</html:form>
					</div>
				</main>
			</div>
		</div>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.5/jquery.validate.js"></script>
	<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
	<script src="/HealthCareSystem/js/Admin/AdminProfile.js"></script>
</body>
</html>