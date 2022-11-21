<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@ include file="/WEB-INF/jsp/Common/StyleLink.jsp"%>
<%@ include file="/WEB-INF/jsp/Common/TagLib.jsp"%>
<title>Register</title>
<style>
label.error {
	color: red;
}
</style>
</head>
<body>
	<section class="vh-50 gradient-skyblue">
		<div class="container py-5 h-100">
			<div
				class="row d-flex justify-content-center align-items-center h-100">
				<div class="col-12 col-md-8 col-lg-6 col-xl-5">
					<div class="card gradient-skyblue text-dark"
						style="border-radius: 1rem;">
						<div class="card-body mt-1 ps-5 pt-1 pe-5 text-center">

							<div class="mb-md-1 mt-md-4 pb-5">

								<h2 class="fw-bold  mb-3 text-uppercase">Registration Form</h2>

								<html:form action="/Register" styleId="myForm">
									<div class="form-group row mb-3" style="text-align: left;">
										<label class="col-md-5 form-label"><span class="h5">
												Name <span class="text-danger">*</span>
										</span></label>
										<div class="col-md-7">
											<html:text property="name" styleId="name"
												styleClass="form-control" />
										</div>
									</div>
									<div class="form-group row mb-3" style="text-align: left;">
										<label class="col-md-5 col-form-label"><span
											class="h5">Gender <span class="text-danger">*</span>
										</span> </label>
										<div class="col-md-7 mt-2">
											<html:radio property="gender" value="Male" styleId="gender"
												styleClass="form-check-input" />
											<span class="h5"> Male</span>
											<html:radio property="gender" value="Female" styleId="gender"
												styleClass="form-check-input" />
											<span class="h5"> Female </span>
										</div>
									</div>
									<div class="form-group row mb-3" style="text-align: left;">
										<label class="col-md-5 form-label"> <span class="h5">Date
												of Birth <span class="text-danger">*</span>
										</span>
										</label>
										<div class="col-md-7">
											<html:text property="dateOfBirth" styleId="dob"
												styleClass="form-control" />
										</div>
									</div>
									<div class="form-group row mb-3" style="text-align: left;">
										<label class="col-md-5 form-label"><span class="h5">
												Email<span class="text-danger"> *</span>
										</span> </label>
										<div class="col-md-7">
											<input type="hidden" value="false" name="emailhidField"
												id="hidField">
											<html:text property="email" styleId="email"
												styleClass="form-control" onclick="check()" />
										</div>
									</div>
									<div class="form-group row mb-3" style="text-align: left;">
										<label class="col-md-5 form-label"><span class="h5">
												Phone<span class="text-danger"> *</span>
										</span> (+959)</label>
										<div class="col-md-7">
											<html:text property="phone" styleId="phone"
												styleClass="form-control" />
										</div>
									</div>
									<div class="form-group row mb-3" style="text-align: left;">
										<label class="col-md-5 form-label"><span class="h5">
												Blood Type</span> (Optional)</label>
										<div class="col-md-7">
											<html:select property="bloodType" styleClass="form-select">
												<html:option value="">Please Select Blood Type</html:option>
												<html:optionsCollection property="choices" value="value"
													label="label" />
											</html:select>
											<%-- <html:text property="bloodType" styleClass="form-control" /> --%>
										</div>
									</div>

									<div class="form-group row mb-3" style="text-align: left;">
										<html:errors property="address" />

										<label class="col-md-5 col-form-label"><span
											class="h5">Address <span class="text-danger">*</span></span></label>
										<div class="col-md-7">
											<html:textarea property="address" styleClass="form-control"
												styleId="address" />

										</div>
									</div>

									<button class="btn btn-outline-dark btn-lg px-5 mt-3"
										type="submit">Register</button>
								</html:form>
								<%
								String success = "yes";
								if (session.getAttribute("reg") == "start")
									success = "no";
								else
									success = "yes";
								%>
								<div id="check" hidden=<%=success%>></div>
								<div class="modal fade" id="myModal" tabindex="-1"
									aria-labelledby="exampleModalLabel" aria-hidden="true">
									<div class="modal-dialog modal-dialog-centered">
										<div class="modal-content">
											<div class="modal-header">
												<h5 class="modal-title w-100 text-center text-success"
													id="exampleModalLabel">Successfully Registered</h5>
											</div>
											<div class="modal-body">
												<p class="h5 text-dark lh-lg">
													Thank You For your Registration.<br> We will contact
													you via mail when we finish creating an account for you.
													Have a nice day.
												<p>
													<a href="Home.do" class="btn btn-outline-success col-md-2">OK</a>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
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
	<script src="/HealthCareSystem/js/Register.js"></script>
</body>
</html>