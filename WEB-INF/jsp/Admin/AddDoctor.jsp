<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="/WEB-INF/jsp/Common/StyleLink.jsp"%>
<%@ include file="/WEB-INF/jsp/Common/TagLib.jsp"%>
<title>Add Doctor</title>
<style type="text/css">
label.error {
	color: red;
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
						<h2 class="text-center">Add New Doctor</h2>
						<hr>
						<html:form action="/AddDoctor" styleId="myForm">
							<%
							String showalert = "notshow";
							if (session.getAttribute("addDoctor").equals("added"))
								showalert = "show";
							%><div id="showAlert" hidden=<%=showalert%>></div>
							<!-- add doctor form -->
							<div class="form-group row mb-4">
								<label class="col-md-2 col-form-label"> <span class="h5">Name</span><span
									class="text-danger"> *</span>
								</label>
								<div class="col-md-3">
									<html:text property="name" styleClass="form-control"
										styleId="name" />
								</div>
								<label class=" col-md-2 col-form-label"><span class="h5">Gender</span>
									<span class="text-danger"> *</span></label>
								<div class="col-md-3 mt-2">
									<html:radio property="gender" value="Male" styleId="gender"
										styleClass="form-check-input" />
									<span class="h5"> Male</span>
									<html:radio property="gender" value="Female" styleId="gender"
										styleClass="form-check-input" />
									<span class="h5"> Female</span>
								</div>
							</div>
							<div class="form-group row mb-4">
								<label class=" col-md-2 col-form-label"> <span
									class="h5">Department</span><span class="text-danger"> *</span>
								</label>
								<div class="col-md-3">
									<html:select property="department" styleClass="form-select"
										styleId="dept">
										<html:option value="">Select Department</html:option>
										<html:optionsCollection property="deptList"
											value="departmentId" label="departmentName" />
									</html:select>

								</div>
								<label class=" col-md-2 col-form-label"> <span
									class="h5">Degree</span><span class="text-danger"> *</span>
								</label>
								<div class="col-md-3">
									<html:select property="degree" styleClass="form-select"
										styleId="degree">
										<html:option value="">Select Degree</html:option>
										<c:forEach var="i" begin="1"
											end="${AddDoctor.degreeList.size()}" step="1">
											<html:option value="${AddDoctor.degreeList[i-1]}">${AddDoctor.degreeList[i-1]}</html:option>
										</c:forEach>
									</html:select>

								</div>
								<div class="col-md-1">
									<button type="button" class="btn btn-primary"
										data-bs-toggle="modal" data-bs-target="#addDegree">
										<i class="fa-solid fa-circle-plus"></i>
									</button>
								</div>
							</div>
							<div class="form-group row mb-4">
								<label class="col-md-2 col-form-label"><span class="h5">Date
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
								<label class="col-md-2 col-form-label"><span class="h5">Phone</span><span
									class="text-danger"> *</span>(+959)</label>
								<div class="col-md-3">
									<html:text property="phone" styleClass="form-control"
										styleId="phone" />
								</div>
								<label class=" col-md-2 col-form-label"><span class="h5">Address</span><span
									class="text-danger"> *</span></label>
								<div class="col-md-3">
									<html:textarea property="address" styleClass="form-control"
										styleId="address" />
								</div>
							</div>
							<div class="form-group row mb-4">
								<label class=" col-md-2 col-form-label"><span class="h5">Biography</span>
								</label>
								<div class="col-md-7" style="height: 250px;">
									<html:textarea property="biography"
										styleClass="form-control h-100" />
								</div>
							</div>
							<button name="add" type="submit"
								class="btn btn-outline-primary mb-2">Add</button>
							<a href="AddDoctor.do" class="btn btn-outline-danger mb-2">Cancel</a>
							<!-- end  of doctor form -->
						</html:form>
					</div>
				</main>
			</div>
		</div>
	</div>
	<div class="modal fade" id="myModal" tabindex="-1"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog modal-dialog-centered">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title w-100 text-center text-success"
						id="exampleModalLabel">Successfully Registered</h5>
				</div>
				<div class="modal-body text-center">
					<p class="h5 text-dark lh-lg text-center">
						Username: ${ AddDoctor.userName}<br> Password:
						${AddDoctor.password}
					<p>
						<button type="button" class="btn btn-outline-success"
							data-bs-dismiss="modal" aria-label="Close">Ok</button>
				</div>
			</div>
		</div>
	</div>
	<div class="modal fade" id="addDegree" data-bs-backdrop="static"
		tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog modal-dialog-centered">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title w-100 text-center text-info"
						id="exampleModalLabel">Add New Degree</h5>
					<button type="button" class="btn-close" data-bs-dismiss="modal"
						aria-label="Close"></button>
				</div>
				<div class="modal-body">
					<div class="container-fluid">
						<p>You can add one or more degrees separated with comma and
							one space (, )</p>
						<div class="row">
							<div class="col-md-2">
								<h5>Degree</h5>
							</div>
							<div class="col-md-8">
								<input type="text" class="form-control" id="degreeInput">
							</div>
							<div class="col-md-2" style="display: none;" id="complete">
								<span class="text-success h3"><i
									class="fa-solid fa-check"></i></span>
							</div>
						</div>
					</div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-outline-success"
						onclick="addDegree()">Add</button>
					<button type="button" class="btn btn-outline-danger"
						data-bs-dismiss="modal" aria-label="Close">Cancel</button>
				</div>
			</div>
		</div>
	</div>
	<script type="text/javascript" src="js/prototype.js"></script>
	<script type="text/javascript" src="js/effects.js"></script>
	<script type="text/javascript" src="js/controls.js"></script>
	<script type="text/javascript" src="js/scriptaculous.js"></script>
	<script type='text/javascript' src="js/autocompleteex.js"></script>
	<!-- Declare the javascript for DWR -->
	<script src='dwr/engine.js'></script>
	<script src='dwr/util.js'></script>
	<script src='dwr/interface/AddDoctor.js'></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.5/jquery.validate.js"></script>
	<script src="/HealthCareSystem/js/Admin/AddDoctor.js"></script>
</body>
</html>