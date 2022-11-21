<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<%@ include file="/WEB-INF/jsp/Common/StyleLink.jsp"%>
<%@ include file="/WEB-INF/jsp/Common/TagLib.jsp"%>

<title>Doctor Profile</title>
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
			<%@ include file="DoctorSideBar.jsp"%>
			<div class="col d-flex flex-column h-sm-100 gradient-skyblue">
				<main class="row overflow-auto">
					<div class="col pt-4 text-center">
						<h2 class="text-center">Your Profile</h2>
						<hr>
						<!-- profile upload form -->
						<html:form action="/DoctorProfile" styleId="myForm">
							<%
							String showalert = "notshow";

							if (session.getAttribute("doctorProfile").equals("Update"))
								showalert = "show";
							%>

							<div id="updateProfile" hidden=<%=showalert%>></div>
							<div class="form-group row mb-4">
								<label class=" col-md-2 col-form-label"><span class="h5">User
										Name</span></label>
								<div class="col-md-3">
									<html:text property="userName" disabled="true"
										styleClass="form-control" />
								</div>
								<label class=" col-md-2 col-form-label"> <span
									class="h5">Name</span><span class="text-danger"> *</span>
								</label>
								<div class="col-md-3">
									<html:text property="name" styleClass="form-control"
										styleId="name" />
								</div>
							</div>
							<div class="form-group row mb-4">
								<label class=" col-md-2 col-form-label"><span class="h5">Gender</span>
								</label>
								<div class="col-md-3">
									<html:radio property="gender" value="Male"
										styleClass="form-check-input" />
									<span class="h5"> Male</span>
									<html:radio property="gender" value="Female"
										styleClass="form-check-input" />
									<span class="h5"> Female</span>
								</div>
								<label class=" col-md-2 col-form-label"><span class="h5">Degree</span>
								</label>
								<div class="col-md-3">
									<html:select property="degree" styleClass="form-select"
										styleId="degree">
										<c:forEach var="i" begin="1"
											end="${DoctorUpdateForm.degreeList.size()}" step="1">
											<html:option value="${DoctorUpdateForm.degreeList[i-1]}">${DoctorUpdateForm.degreeList[i-1]}</html:option>
										</c:forEach>
									</html:select>
								</div>
							</div>
							<div class="form-group row mb-4">
								<label class=" col-md-2 col-form-label"><span class="h5">Date
										of Birth</span><span class="text-danger"> *</span></label>
								<div class="col-md-3">
									<html:text property="dateOfBirth" styleId="dob"
										styleClass="form-control" />
								</div>
								<label class=" col-md-2 col-form-label"><span class="h5">Email</span><span
									class="text-danger"> *</span></label>
								<div class="col-md-3">
									<html:text property="email" styleClass="form-control"
										styleId="email" />
								</div>
							</div>
							<div class="form-group row mb-4">
								<label class=" col-md-2 col-form-label"><span class="h5">Phone</span><span
									class="text-danger"> *</span>(+959)</label>
								<div class="col-md-3">
									<html:text property="phone" styleClass="form-control"
										styleId="phone" />
								</div>
								<label class=" col-md-2 col-form-label"><span class="h5">Address</span><span
									class="text-danger"> *</span> </label>
								<div class="col-md-3">
									<html:textarea property="address" styleClass="form-control"
										styleId="address" />
								</div>
							</div>
							<div class="form-group row mb-3">
								<label class=" col-md-2 col-form-label"><span class="h5">Biography</span></label>
								<div class="col-md-10" style="height: 200px">
									<html:textarea property="biography"
										styleClass="form-control h-100" />
								</div>
							</div>
							<button name="submit" type="submit"
								class="btn btn-outline-primary">Update Profile</button>
						</html:form>
						<!--end of profile upload form -->
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
	<script src="/HealthCareSystem/js/Doctor/DoctorProfile.js"></script>
</body>
</html>