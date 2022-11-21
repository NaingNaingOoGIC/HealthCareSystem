<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<%@ include file="/WEB-INF/jsp/Common/StyleLink.jsp"%>
<%@ include file="/WEB-INF/jsp/Common/TagLib.jsp"%>
<title>Medical Record</title>
<style>
label.error {
	color: red;
}
</style>
</head>
<body class="gradient-skyblue">
	<div class="container-fluid overflow-hidden">
		<div class="row vh-100 overflow-auto">
			<%@ include file="PatientSideBar.jsp"%>
			<div class="col d-flex flex-column h-sm-100 gradient-skyblue">
				<main class="row overflow-auto">
					<div class="col pt-4 ">
						<!-- header -->
						<h2 class="mt-2 text-center">Medical Record</h2>
						<!--end header -->
						<hr>
						<div class="container ">
							<!-- menu tab -->
							<ul class="nav nav-tabs" id="myTab">
								<!-- during treatment tab menu -->
								<li class="nav-item"><a href="#still"
									class="nav-link <%if (session.getAttribute("patientProg").equals("start"))
	out.write("active");%>"
									data-bs-toggle="tab">During Treatment<span
										class="ms-1  badge bg-success
rounded-pill float-end">
											${PatientProgress.progList.size()}</span>
								</a></li>
								<!--end of during treatment tab menu -->
								<!--  treatment done tab menu -->
								<li class="nav-item"><a href="#done" class="nav-link"
									data-bs-toggle="tab">Treatment Done <span
										class="ms-1  badge bg-secondary
rounded-pill float-end">${PatientProgress.doneList.size()}</span>

								</a></li>
								<!-- end of treatment done tab menu -->
								<!--  request progress tab menu -->
								<%
								if (session.getAttribute("patientProg").equals("req")) {
								%>
								<li class="nav-item "><a href="#request"
									class="nav-link active" data-bs-toggle="tab">Request
										Progress </a></li>
								<%
								}
								%><!-- end of request progress tab menu -->
							</ul>
							<!-- menu tab end -->
							<div class="tab-content">
								<!-- during treatment menu content  -->
								<div
									class="tab-pane fade<%if (session.getAttribute("patientProg").equals("start"))
	out.write("show active");%>"
									id="still">
									<div class="row mt-3">
										<%
										int i = 1;
										%>
										<display:table id="data"
											name="sessionScope.PatientProgress.progList" pagesize="9"
											requestURI="Progress.do"
											class="table table-striped bg-white my-custom-scrollbar table-wrapper-scroll-y">

											<display:column title="No" value="<%=i++%>" />
											<display:column property="doctor.doctorName"
												title="Doctor Name" />
											<display:column property="diseaseName" title="Disease Name" />
											<display:column paramId="progressid"
												paramProperty="progressId" title="View"
												href="ViewProgressDetail.do?path=patient">
												<i class="fa-regular fa-eye"></i> Detail
																</display:column>
											<display:column paramId="progressid"
												paramProperty="progressId" title="Request"
												href="Appointment.do">
												<i class="fa-solid fa-square-plus"></i> appointment
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
											<display:setProperty name="basic.msg.empty_list" value="" />
										</display:table>
									</div>
								</div>
								<!--end of  during treatment menu content  -->
								<!--  treatment done menu content  -->
								<div class="tab-pane fade" id="done">

									<div class="row mt-3">
										<%
										int j = 1;
										%>
										<display:table id="data"
											name="sessionScope.PatientProgress.doneList" pagesize="9"
											requestURI="Progress.do"
											class="table table-striped bg-white my-custom-scrollbar table-wrapper-scroll-y">

											<display:column title="No" value="<%=j++%>" />
											<display:column property="doctor.doctorName"
												title="Doctor Name" />
											<display:column property="diseaseName" title="Disease Name" />
											<display:column paramId="progressid"
												paramProperty="progressId" title="View"
												href="ViewProgressDetail.do?path=patient">
												<i class="fa-regular fa-eye"></i> Detail
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
											<display:setProperty name="basic.msg.empty_list"
												value="No Progress Found!" />
										</display:table>

									</div>
								</div>
								<!--end  treatment done menu content  -->
								<!--  request progress menu content  -->
								<%
								if (session.getAttribute("patientProg").equals("req")) {
								%><html:form action="/Progress" styleId="myForm">
									<div class="tab-pane fade show active text-center" id="request">
										<div class="form-group row mt-3">
											<label class="col-md-2 col-form-label col-sm-6 col-lg-2"><span
												class="h5">Doctor Name</span></label>
											<div class="col-md-3 col-sm-6 col-lg-3">
												<html:text property="doctorName" style="height:40px;"
													disabled="true" styleClass="form-control" />
											</div>
											<label class="col-md-2 col-sm-6 col-lg-2 col-form-label"><span
												class="h5">Symptoms</span></label>
											<div class="col-md-3 col-sm-6 col-lg-3" style="height: 150px">
												<html:textarea property="symptoms"
													styleClass="w-100 h-75 form-control" styleId="symptoms" />
											</div>
										</div>

										<button name="request" type="submit"
											class="btn btn-outline-primary">Request</button>
										<a href="Progress.do?doctorid=0"
											class="ms-2   btn btn-outline-danger">Cancel</a>

									</div>
								</html:form>
								<%
								}
								%><!--end  request progress menu content  -->
							</div>
						</div>
						<!-- Content -->

					</div>
				</main>
			</div>
		</div>
	</div>
	<!-- Main (Nav & Content) -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.5/jquery.validate.js"></script>
	<script src="/HealthCareSystem/js/Patient/Progress.js"></script>
</body>
</html>