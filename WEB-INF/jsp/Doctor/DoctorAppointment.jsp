<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<%@ include file="/WEB-INF/jsp/Common/StyleLink.jsp"%>
<%@ include file="/WEB-INF/jsp/Common/TagLib.jsp"%>
<link rel="stylesheet"
	href="/HealthCareSystem/js/jquery.timepicker.min.css">
<title>Appointment</title>
<style>
label.error {
	color: red;
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
						<h2 class="text-center">Appointments</h2>
						<hr>
						<div class="row">
							<!-- menu tab -->
							<ul class="nav nav-tabs" id="myTab">
								<!-- today appointment menu tab -->
								<li class="nav-item"><a href="#today"
									class="nav-link <%if (session.getAttribute("doctorAppt").equals("start"))
	out.write("active");%>"
									data-bs-toggle="tab">Today<logic:notEmpty
											property="todayApptList" name="DoctorAppointment">
											<span
												class="ms-1 d-none d-lg-inline badge bg-success
rounded-pill float-end">
												${DoctorAppointment.todayApptList.size()}</span>
										</logic:notEmpty>
								</a></li>
								<!-- end of today appointment menu tab -->
								<!-- next day appointment menu tab -->
								<li class="nav-item"><a href="#nextday" class="nav-link"
									data-bs-toggle="tab">Next Day <logic:notEmpty
											property="comingApptList" name="DoctorAppointment">
											<span
												class="ms-1 d-none d-lg-inline badge bg-warning
rounded-pill float-end">${DoctorAppointment.comingApptList.size()}</span>
										</logic:notEmpty>

								</a></li>
								<!-- end of appointment menu tab -->
								<!-- add appointment menu tab -->
								<%
								if (session.getAttribute("doctorAppt").equals("addAppt")) {
								%>
								<li class="nav-item"><a href="#addAppt"
									class="nav-link active" data-bs-toggle="tab">Add
										Appointment</a></li>
								<%
								}
								%><!-- end of add appointment menu tab -->
								<!-- add treatment detail menu tab -->
								<%
								if (session.getAttribute("doctorAppt").equals("addDetail")) {
								%>
								<li class="nav-item"><a href="#addDetail"
									class="nav-link active" data-bs-toggle="tab">Add Treatment
										Detail</a></li>
								<%
								}
								%><!-- end of treatment detail menu tab -->
							</ul>
							<!-- end of menu tab -->
							<div class="tab-content">
								<!-- today appointment menu content -->
								<div
									class="tab-pane fade  <%if (session.getAttribute("doctorAppt").equals("start"))
	out.write("show active");%>"
									id="today">

									<div class="table-responsive mt-3">

										<%
										int i = 1;
										%>
										<display:table id="data"
											name="sessionScope.DoctorAppointment.todayApptList"
											pagesize="5" requestURI="DoctorAppointment.do"
											class="table table-striped bg-white">

											<display:column title="No" value="<%=i++%>"></display:column>
											<display:column property="apptTime" title="Time" />

											<display:column
												property="patientProgress.patient.patientName"
												title="Patient" />
											<display:column property="patientProgress.diseaseName"
												title="Disease Name" />
											<display:column paramId="progDetailid"
												paramProperty="progressDetailId" href="DoctorAppointment.do"
												title="Add Treatment Detail">
												<i class="fa-solid fa-square-plus"></i> Detail
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
												value="Today No Appointment." />
										</display:table>

									</div>
								</div>
								<!--end today appointment menu content -->
								<!-- next appointment menu content -->
								<div class="tab-pane fade" id="nextday">
									<div class="table-responsive mt-3">
										<%
										int j = 1;
										%>

										<display:table id="data"
											name="sessionScope.DoctorAppointment.comingApptList"
											pagesize="5" requestURI="DoctorAppointment.do"
											class="table table-striped bg-white">

											<display:column title="No" value="<%=j++%>"></display:column>
											<display:column property="appointmentDate" title="Date" />
											<display:column property="apptTime" title="Time" />

											<display:column
												property="patientProgress.patient.patientName"
												title="Patient" />
											<display:column property="patientProgress.diseaseName"
												title="Disease Name" />
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
												value="No Appointment !" />
										</display:table>
									</div>
								</div>
								<!--end of next appointment menu content -->
								<!--add appointment menu content -->

								<%
								if (session.getAttribute("doctorAppt").equals("addAppt")) {
								%>

								<div class="tab-pane fade show active text-center" id="addAppt">
									<html:form action="/DoctorAppointment" styleId="apptForm">
										<div class="form-group row mt-4 mb-4">
											<label class="col-md-2 col-form-label"><span
												class="h5">Patient Name</span></label>
											<div class="col-md-3">
												<html:text property="patientName" style="height:40px;"
													disabled="true" styleClass="form-control" />
											</div>
											<label class="col-md-2 col-form-label"><span
												class="h5">Disease Name</span></label>
											<div class="col-md-3">
												<html:text property="diseaseName" style="height:40px;"
													styleClass="form-control" />
											</div>

										</div>
										<div class="form-group row mb-4">
											<label class=" col-md-2 col-form-label"><span
												class="h5">Date</span></label>
											<div class="col-md-3">
												<html:text property="date" styleId="date"
													styleClass="form-control" />
											</div>
											<label class="col-md-2 col-form-label"> <span
												class="h5">Time</span>
											</label>
											<div class="col-md-3">
												<html:text property="time" styleId="time"
													style="height:40px;" styleClass="form-control" />
											</div>
										</div>
										<div class="form-group row mb-4">

											<label class="col-md-2 col-form-label"><span
												class="h5">Reason</span></label>
											<div class="col-md-3">
												<html:textarea property="reason" styleClass="form-control"
													styleId="reason" />
											</div>
										</div>
										<button name="apptAdd" type="submit"
											class="ms-2 btn btn-outline-primary">Add</button>
										<a href="DoctorAppointment.do?progressid=0"
											class="ms-2 btn btn-outline-danger">Cancel</a>
									</html:form>
								</div>
								<%
								}
								%>


								<!--end of add appointment menu content -->
								<!--add treatment detail menu content -->
								<%
								if (session.getAttribute("doctorAppt").equals("addDetail")) {
								%>
								<div class="tab-pane fade show active " id="addDetail">
									<html:form action="/DoctorAppointment" styleId="apptDetailForm">
										<div class="h5 mt-4 ms-5">
											<html:checkbox property="progStatus" value="done" />
											All Treatment Has Been Done
										</div>
										<div class="form-group row mt-4 mb-4">
											<label class="col-md-2 offset-md-3 col-form-label"><span
												class="h5">Disease Name</span></label>
											<div class="col-md-3">
												<html:text property="diseaseName" styleClass="form-control" />
											</div>
										</div>
										<div class="form-group row mb-4">
											<label class="col-md-2 offset-md-3 col-form-label"><span
												class="h5">Treatment Detail </span></label>
											<div class="col-md-5" style="height: 200px;">
												<html:textarea property="progDetail"
													styleClass="form-control h-100" styleId="progDetail" />

											</div>
										</div>
										<div class="form-group row mb-4 mt-1">
											<label class="col-md-2 offset-md-3 col-form-label"><span
												class="h5">Remark </span></label>
											<div class="col-md-5" style="height: 200px;">
												<html:textarea property="remark"
													styleClass="form-control h-100" styleId="remark" />
											</div>
										</div>
										<button name="addDetail" type="submit"
											class="  btn btn-outline-primary">Add</button>
										<a href="DoctorAppointment.do?progDetailid=0"
											class="  btn btn-outline-danger">Cancel</a>
										<!--end of add treatment detail menu content -->
									</html:form>
								</div>
								<%
								}
								%>
							</div>
						</div>
					</div>
				</main>
			</div>
		</div>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
	<script src="/HealthCareSystem/js/jquery.timepicker.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.5/jquery.validate.js"></script>
	<script src="/HealthCareSystem/js/Doctor/DoctorAppointment.js"></script>
</body>
</html>