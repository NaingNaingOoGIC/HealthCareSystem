<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<%@ include file="/WEB-INF/jsp/Common/StyleLink.jsp"%>
<%@ include file="/WEB-INF/jsp/Common/TagLib.jsp"%>
<title>Add Patient</title>
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
<body class="bg-white">
	<div class="container-fluid overflow-hidden">
		<div class="row vh-100 overflow-auto">
			<%@ include file="AdminSideBar.jsp"%>
			<div class="col d-flex flex-column h-sm-100 gradient-skyblue">
				<main class="row overflow-auto">
					<div class="col pt-4 text-center">
						<h2 class=" text-center">Add New Patient</h2>
						<hr>
						<ul class="nav nav-tabs" id="myTab">
							<!-- the add patient menu tab  -->
							<li class="nav-item"><a href="#add" class="nav-link active"
								data-bs-toggle="tab">New Patient</a></li>
							<!--end of the add patient menu tab  -->
							<!-- the request patient menu tab  -->
							<li class="nav-item"><a href="#request" class="nav-link"
								data-bs-toggle="tab">Requested Person<logic:notEmpty
										property="reqPatientList" name="PatientForm">
										<span
											class="ms-1 d-none d-lg-inline badge bg-danger
rounded-pill float-end">${PatientForm.reqPatientList.size()}</span>
									</logic:notEmpty></a></li>
							<!--end of the request patient menu tab  -->
						</ul>

						<div class="tab-content">
							<div class="tab-pane fade show active" id="add">

								<html:form action="/AddPatient" styleId="myForm">
									<%
									String showalert = "notshow";
									%>
									<logic:notEmpty property="added" name="PatientForm">
										<%
										showalert = "show";
										%>
									</logic:notEmpty>
									<div id="showAlert" hidden=<%=showalert%>></div>
									<%
									boolean disabled = false;
									if (session.getAttribute("reqid") == null)
										disabled = false;
									else
										disabled = true;
									%>

									<div class="form-group row  mb-2 mt-2">
										<label class="col-md-2 col-form-label "> <span
											class="h5">Name <span class="text-danger">*</span>
										</span>
										</label>
										<div class="col-md-3">
											<html:text property="name" disabled="<%=disabled%>"
												styleId="name" styleClass="form-control" />
										</div>
										<label class=" col-md-2 col-form-label"><span
											class="h5">Gender <span class="text-danger">*</span></span> </label>
										<div class="col-md-2 mt-2 ">
											<html:radio property="gender" value="Male"
												disabled="<%=disabled%>" styleId="gender"
												styleClass="form-check-input" />
											<span class="h5"> Male</span>
											<html:radio property="gender" value="Female"
												disabled="<%=disabled%>" styleId="gender"
												styleClass="form-check-input" />
											<span class="h5"> Female</span>

										</div>
									</div>
									<div class="form-group row mb-2">

										<label class="col-md-2 col-form-label "><span
											class="h5">Date of Birth <span class="text-danger">*</span></span></label>
										<div class="col-md-3">
											<html:text property="dateOfBirth" styleId="dob"
												styleClass="form-control" style="height:40px;"
												disabled="<%=disabled%>" />
										</div>
										<label class=" col-md-2 col-form-label"><span
											class="h5">Email <span class="text-danger">*</span></span></label>
										<div class="col-md-3">
											<input type="hidden" value="false" name="emailhidField"
												id="hidField">
											<html:text property="email" disabled="<%=disabled%>"
												styleId="email" styleClass="form-control" onclick="check()" />
										</div>
									</div>
									<div class="form-group row mb-2">
										<label class="col-md-2 col-form-label"><span
											class="h5">Phone<span class="text-danger"> *</span></span>
											(+959)</label>
										<div class="col-md-3">

											<html:text property="phone" style="height:40px;"
												styleClass="form-control" disabled="<%=disabled%>"
												styleId="phone" />

										</div>
										<label class="col-md-2 col-form-label"><span
											class="h5">Blood Type</span> (Optional)</label>
										<div class="col-md-3">
											<html:select property="bloodType" styleClass="form-select"
												disabled="<%=disabled%>">
												<html:option value="">Please Select Blood Type</html:option>
												<html:optionsCollection property="choices" value="value"
													label="label" />
											</html:select>
										</div>
									</div>
									<div class="form-group row mb-2">
										<label class=" col-md-2 col-form-label"><span
											class="h5">Address <span class="text-danger">*</span>
										</span> </label>
										<div class="col-md-3">
											<%-- <html:errors property="address" /> --%>
											<html:textarea property="address" styleClass="form-control"
												disabled="<%=disabled%>" styleId="address" />
										</div>
									</div>
									<button name="add" type="submit"
										class="btn btn-outline-primary">Add</button>
									<a href="AddPatient.do?patientid=0"
										class="btn btn-outline-danger">Cancel</a>
								</html:form>
							</div>
							<!--end of the add patient menu content  -->
							<!-- the request patient menu content  -->
							<div class="tab-pane fade" id="request">
								<div class="form-group row mb-2">
									<logic:notEmpty property="reqPatientList" name="PatientForm">
										<div class="col-6 offset-3 mt-3">
											<%
											int i = 1;
											%>
											<display:table id="data"
												name="sessionScope.PatientForm.reqPatientList" pagesize="10"
												requestURI="AddPatient.do"
												class="table table-striped bg-white">

												<display:column title="No" value="<%=i++%>" />

												<display:column property="patientName" title="Name" />
												<display:column paramId="patientid"
													paramProperty="patientId" href="AddPatient.do" title="Add">
													<i class="fa-solid fa-square-plus"></i>
												</display:column>

												<display:setProperty name="paging.banner.placement"
													value="bottom" />
												<display:setProperty name="paging.banner.some_items_found"
													value="" />
												<display:setProperty name="paging.banner.all_items_found"
													value="" />
												<display:setProperty name="paging.banner.one_item_found"
													value="" />
												<display:setProperty name="paging.banner.onepage" value="" />
											</display:table>
										</div>
									</logic:notEmpty>
								</div>
							</div>
							<!--end of the request patient menu content  -->
						</div>
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
	<script type="text/javascript" src="js/prototype.js"></script>
	<script type="text/javascript" src="js/effects.js"></script>
	<script type="text/javascript" src="js/controls.js"></script>
	<script type="text/javascript" src="js/scriptaculous.js"></script>
	<script type='text/javascript' src="js/autocompleteex.js"></script>
	<!-- Declare the javascript for DWR -->
	<script src='dwr/engine.js'></script>
	<script src='dwr/util.js'></script>
	<script src='dwr/interface/Patient.js'></script>
	<script src="/HealthCareSystem/js/Admin/AddPatient.js"></script>
</body>
</html>