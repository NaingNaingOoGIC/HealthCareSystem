<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<%@ include file="/WEB-INF/jsp/Common/StyleLink.jsp"%>
<%@ include file="/WEB-INF/jsp/Common/TagLib.jsp"%>
<title>Patient Change Password</title>
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
</head>
<body class="gradient-skyblue">
	<div class="container-fluid overflow-hidden">
		<div class="row vh-100 overflow-auto">
			<%@ include file="PatientSideBar.jsp"%>
			<div class="col d-flex flex-column h-sm-100 gradient-skyblue">
				<main class="row overflow-auto">
					<div class="col pt-4 text-center">
						<h2 class="text-center mt-3">Change Password</h2>
						<hr>
						<html:form action="/PatientChangePs" styleId="myForm">
							<%
							String showalert = "notshow";
							%>
							<logic:equal name="PatientChangePsForm" property="changePs"
								value="true">
								<%
								showalert = "show";
								%>
							</logic:equal>
							<div id="successPs" hidden=<%=showalert%>></div>
							<div class="row mb-2 mt-md-2">

								<label class="offset-md-3 form-label col-md-2"><span
									class="h5">Current Password </span><span class="text-danger">*</span></label>
								<div class="col-md-3">
									<html:errors property="wrongPassword" />
									<html:password property="password" styleClass="form-control"
										styleId="currentPs" />
								</div>
							</div>
							<div class="row mb-2 mt-md-2">
								<label class="offset-md-3 form-label col-md-2"><span
									class="h5">New Password </span><span class="text-danger">*</span></label>
								<div class="col-md-3">
									<html:password property="newPassword" styleClass="form-control"
										styleId="newPs" />
								</div>
							</div>
							<div class="row mb-2 mt-md-2">
								<label class="offset-md-3 form-label col-md-2"><span
									class="h5">Confirm Password </span><span class="text-danger">*</span></label>
								<div class="col-md-3">
									<html:password property="confirmPassword"
										styleClass="form-control" styleId="confirmPs" />
								</div>
							</div>
							<button name="submit" type="submit"
								class="mb-3 btn btn-outline-primary">Save</button>
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
	<script src="/HealthCareSystem/js/ChangePs.js"></script>
</body>
</html>