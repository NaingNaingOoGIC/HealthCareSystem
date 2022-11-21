<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<%@ include file="/WEB-INF/jsp/Common/StyleLink.jsp"%>
<%@ include file="/WEB-INF/jsp/Common/TagLib.jsp"%>

<title>Patient Profile</title>
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
						<h2 class="text-center mt-3">Your Profile</h2>
						<hr>
						<!-- profile upload form -->
						<html:form action="/PatientProfile" styleId="myForm">
							<%
							String showalert = "notshow";
							%>
							<logic:notEmpty property="frmControl" name="PatientUpdateForm">
								<%
								showalert = "show";
								%>
							</logic:notEmpty>
							<div id="showAlert" hidden=<%=showalert%>></div>
							<div class="row mb-2 ">
								<label class="offset-md-3 form-label col-md-2"><span
									class="h5">User Name</span></label>
								<div class="col-md-3">
									<html:text property="userName" disabled="true"
										styleClass="form-control" />
								</div>
							</div>
							<div class="row mb-2">
								<html:errors property="name" />
								<label class="offset-md-3 form-label col-md-2"> <span
									class="h5">Name</span><span class="text-danger"> *</span>
								</label>
								<div class="col-md-3">
									<html:text property="name" styleClass="form-control"
										styleId="name" />
								</div>
							</div>
							<div class="row mb-2">
								<label class="offset-md-3 form-label col-md-2"> <span
									class="h5">Gender </span></label>
								<div class="col-md-3">
									<div class="form-check form-check-inline">
										<html:radio property="gender" value="Male"
											styleClass="form-check-input" />
										<label class="form-check-label h5">Male</label>
									</div>
									<div class="form-check form-check-inline">
										<html:radio property="gender" value="Female"
											styleClass="form-check-input" />
										<label class="form-check-label h5">Female</label>
									</div>
								</div>
							</div>
							<div class="row mb-2">
								<html:errors property="dateOfBirth" />
								<label class="offset-md-3 form-label col-md-2"><span
									class="h5  d-md-inline">Date of Birth</span> <span
									class="text-danger"> *</span></label>
								<div class="col-md-3">
									<html:text property="dateOfBirth" styleClass="form-control"
										styleId="dob" />
								</div>
							</div>
							<div class="col-md-6 mx-auto mb-2">

								<div class="row">
									<label class=" col-md-4 col-form-label"><span
										class="h5">Email <span class="text-danger">*</span>
									</span></label>
									<div class="col-md-6">
										<input type="hidden" value="false" name="emailhidField"
											id="hidField">
										<%-- <html:errors property="mailExit" /> --%>
										<html:text property="email" styleId="email"
											styleClass="form-control"
											onclick="check('${PatientUpdateForm.loginPatient.patientId }')" />
									</div>
								</div>
							</div>
							<div class="row mb-2">
								<html:errors property="phone" />
								<label class="offset-md-3 form-label col-md-2"><span
									class="h5">Phone</span><span class="text-danger"> *</span>(+959)</label>
								<div class="col-md-3">
									<html:text property="phone" styleClass="form-control"
										styleId="phone" />
								</div>
							</div>
							<div class="row mb-2 ">
								<html:errors property="bloodType" />
								<label class="offset-md-3 form-label col-md-2"><span
									class="h5">Blood Type</span><span class="text-danger"> *</span></label>
								<div class="col-md-3">
									<html:select property="bloodType" styleClass="form-select"
										styleId="blood">
										<html:option value="">Please Select Blood Type</html:option>
										<html:optionsCollection property="choices" value="value"
											label="label" />
									</html:select>
								</div>
							</div>
							<div class="row mb-2 ">
								<label class="offset-md-3 form-label col-md-2"><span
									class="h5">Address</span> <span class="text-danger"> *</span></label>
								<div class="col-md-3">
									<html:text property="address" styleClass="form-control"
										styleId="address" />
								</div>
							</div>

							<div class="row mb-2 text-center">
								<span>
									<button name="submit" type="submit"
										class="  btn btn-outline-primary">Update Profile</button>
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
	<script type="text/javascript" src="js/prototype.js"></script>
	<script type="text/javascript" src="js/effects.js"></script>
	<script type="text/javascript" src="js/controls.js"></script>
	<script type="text/javascript" src="js/scriptaculous.js"></script>
	<script type='text/javascript' src="js/autocompleteex.js"></script>
	<!-- Declare the javascript for DWR -->
	<script src='dwr/engine.js'></script>
	<script src='dwr/util.js'></script>
	<script src='dwr/interface/Patient.js'></script>
	<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
	<script src="/HealthCareSystem/js/Patient/PatientProfile.js"></script>
</body>
</html>