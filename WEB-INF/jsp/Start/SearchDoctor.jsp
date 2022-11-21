<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@ include file="/WEB-INF/jsp/Common/TagLib.jsp"%>
<%@ include file="/WEB-INF/jsp/Common/StyleLink.jsp"%>
<style type="text/css">
body {
	font-family: Times New Roman, Times, serif;
}

<!--
div.choices {
	z-index: 9;
}

div.choices ul { /* autocomplete candidate */
	list-style-type: none;
	background-color: #fff;
	border: 2px solid #ccc;
	margin-left: 0;
	margin-top: 0;
	padding-left: 5px;
	padding-top: 0;
}

div.choices ul li.selected { /* selected autocomplete*/
	background-color: #ffc;
	font-weight: bold;
}

-->
#doctorNames {
	display: none;
}
</style>
<title>Doctors</title>
</head>
<body onload="createAutoCompleter()">
	<%
	request.getSession().setAttribute("link", "searchDoctor");
	%>
	<jsp:include page="Header.jsp" />
	<div class="card gradient-skyblue">
		<div class="card-body gradient-skyblue">

			<div class="row">
				<div class="col-12">
					<div class="form-group row mb-4">

						<h2 class=" text-center">Our Doctors</h2>

						<hr
							style="height: 2px; border-width: 0; color: green; background-color: green">
						<html:form action="/SearchDoctor">
							<div class="row mb-2">
								<div class=" offset-md-5 col-md-3 mb-2">
									<div class="input-group">
										<label class="form-label"><span class="h5">Department</span></label>
										<html:select property="department"
											styleClass=" ms-2 form-select"
											onchange="sendCategory(this[this.selectedIndex].value)">
											<html:option value="0">All</html:option>
											<html:optionsCollection property="deptList"
												value="departmentId" label="departmentName" />
										</html:select>
									</div>
								</div>
								<div class=" col-md-4" id="doctorNames">
									<div class="input-group">
										<label class="form-label"><span class="h5">Doctors</span></label>
										<html:select property="doctorid" styleId="subcategorylist"
											styleClass=" ms-2 form-select">
											<html:option value="0">All</html:option>
											<logic:notEmpty property="availableDoctorList"
												name="DoctorForm">
												<html:optionsCollection property="availableDoctorList"
													value="doctorId" label="doctorName" />
											</logic:notEmpty>
										</html:select>
										<button name="deptsearch" type="submit"
											class=" btn btn-primary">
											<i class="fa-solid fa-magnifying-glass"></i>
										</button>
									</div>
								</div>
								<div class="col-md-4" id="searchByName">
									<div class="input-group">
										<label class="form-label"> <span class="h5">Doctor
												&nbsp;</span>
										</label>
										<html:text property="name" styleClass="form-control"
											styleId="doctorName" />
										<div class="choices" id="choices1"></div>
										<button name="search" type="submit" class=" btn btn-primary">
											<i class="fa-solid fa-magnifying-glass"></i>
										</button>
									</div>
								</div>
							</div>
						</html:form>
						<div id="byDept" class="row"></div>
						<div id="displayDoctor" class="row">
							<logic:notEmpty name="DoctorForm" property="availableDoctorList">

								<c:forEach var="i" begin="1"
									end="${DoctorForm.availableDoctorList.size()}" step="1">
									<div class="col-lg-3 col-md-4 col-sm-6 mb-3">
										<div class="card p-1 h-100">
											<div class="card-body">
												<table class="table table-borderless" style="width: 100%">
													<tr>
														<th>Department</th>
														<!-- <td>:</td> -->
														<td>${DoctorForm.availableDoctorList[i-1].department.departmentName}</td>
													</tr>
													<tr>
														<th>Name</th>
														<!-- <td>:</td> -->
														<td>${DoctorForm.availableDoctorList[i-1].doctorName}</td>
													</tr>
													<tr>
														<th>Gender</th>
														<!-- 	<td>:</td> -->
														<td>${DoctorForm.availableDoctorList[i-1].gender}</td>
													</tr>
													<tr>
														<th>Degree</th>
														<!-- <td>:</td> -->
														<td>${DoctorForm.availableDoctorList[i-1].degree}</td>
													</tr>
													<tr>
														<th>Age</th>
														<!-- 	<td>:</td> -->
														<td>${DoctorForm.availableDoctorList[i-1].age}</td>
													</tr>
													<tr>
														<th>Address</th>
														<!-- 	<td>:</td> -->
														<td>${DoctorForm.availableDoctorList[i-1].address}</td>
													</tr>

												</table>
												<div class="accordion accordion-flush"
													id="accordionFlushExample">
													<div class="accordion-item">
														<h2 class="accordion-header" id="flush-headingThree">
															<button class="accordion-button collapsed" type="button"
																data-bs-toggle="collapse"
																data-bs-target="#panel${DoctorForm.availableDoctorList[i-1].doctorId}"
																aria-expanded="false"
																aria-controls="flush-collapseThree">Biography</button>
														</h2>
														<div
															id="panel${DoctorForm.availableDoctorList[i-1].doctorId}"
															class="accordion-collapse collapse"
															aria-labelledby="flush-headingThree"
															data-bs-parent="#accordionFlushExample">
															<div class="accordion-body">
																${DoctorForm.availableDoctorList[i-1].doctorBiography}</div>
														</div>
													</div>
												</div>
											</div>
										</div>
									</div>
								</c:forEach>
							</logic:notEmpty>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="Footer.jsp" />
	<script type="text/javascript" src="js/prototype.js"></script>
	<script type="text/javascript" src="js/effects.js"></script>
	<script type="text/javascript" src="js/controls.js"></script>
	<script type="text/javascript" src="js/scriptaculous.js"></script>
	<script type='text/javascript' src="js/autocompleteex.js"></script>
	<!-- Declare the javascript for DWR -->
	<script src='dwr/engine.js'></script>
	<script src='dwr/util.js'></script>
	<!-- Do the javascript function for auto complement -->
	<script src='dwr/interface/AjaxDoctorSearch.js'></script>
	<script src="/HealthCareSystem/js/SearchDoctor.js"></script>
</body>
</html>