<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<link rel="stylesheet"
	href="/HealthCareSystem/js/jquery.timepicker.min.css">
<%@ include file="/WEB-INF/jsp/Common/StyleLink.jsp"%>
<%@ include file="/WEB-INF/jsp/Common/TagLib.jsp"%>
<title>Appointment</title>
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
						<h2 class="mt-2 text-center">Appointments</h2>
						<hr>
						<div class="container">
							<!-- menu tab -->
							<ul class="nav nav-tabs" id="myTab">
								<!-- today appointment menu tab -->
								<li class="nav-item"><a href="#today"
									class="nav-link <%if (session.getAttribute("patientAppt").equals("start"))
	out.write("active");%>"
									data-bs-toggle="tab">Today<logic:notEmpty
											property="todayApptList" name="PatientAppointment">
											<span
												class="ms-1d-inline badge bg-success
rounded-pill float-end">
												${PatientAppointment.todayApptList.size()}</span>
										</logic:notEmpty>
								</a></li>
								<!--end of today appointment menu tab -->
								<!-- next day appointment menu tab -->
								<li class="nav-item"><a href="#nextday" class="nav-link"
									data-bs-toggle="tab">Next Day<logic:notEmpty
											property="comingApptList" name="PatientAppointment">
											<span
												class="ms-1  d-inline badge bg-warning
rounded-pill float-end">${PatientAppointment.comingApptList.size()}</span>
										</logic:notEmpty>

								</a></li>
								<!-- end of next day appointment menu tab -->
								<!-- request appointment menu tab -->
								<%
								if (session.getAttribute("patientAppt").equals("reqAppt")) {
								%>
								<li class="nav-item"><a href="#addAppt"
									class="nav-link active" data-bs-toggle="tab">Request
										Appointment</a></li>
								<%
								}
								%><!--end of request appointment menu tab -->

							</ul>
							<!-- end of menu tab -->
							<div class="tab-content">
								<!-- today appointment menu content -->
								<div
									class="tab-pane fade  <%if (session.getAttribute("patientAppt").equals("start"))
	out.write("show active");%>"
									id="today">

									<div class="row mt-3">
										<%
										int i = 1;
										%>
										<display:table id="data"
											name="sessionScope.PatientAppointment.todayApptList"
											pagesize="6" requestURI="Appointment.do"
											class="table table-striped bg-white my-custom-scrollbar table-wrapper-scroll-y">

											<display:column title="No" value="<%=i++%>"></display:column>
											<display:column property="apptTime" title="Time" />

											<display:column property="patientProgress.doctor.doctorName"
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
												value="Today No Appointment." />
										</display:table>

									</div>
								</div>
								<!--end of  today appointment menu content -->
								<!-- next appointment menu content -->
								<div class="tab-pane fade" id="nextday">

									<%
									int j = 1;
									%>
									<div class="row mt-3">
										<display:table id="data"
											name="sessionScope.PatientAppointment.comingApptList"
											pagesize="6" requestURI="Appointment.do"
											class="table table-striped bg-white my-custom-scrollbar table-wrapper-scroll-y">

											<display:column title="No" value="<%=j++%>" />
											<display:column property="appointmentDate" title="Date" />
											<display:column property="apptTime" title="Time" />

											<display:column property="patientProgress.doctor.doctorName"
												title="Doctor" />
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
												value="No Appointment" />
										</display:table>

									</div>
								</div>
								<!-- end of next appointment menu content -->
								<!-- request appointment menu content -->
								<%
								if (session.getAttribute("patientAppt").equals("reqAppt")) {
								%>
								<div class="tab-pane fade show active text-center" id="addAppt">
									<html:form action="/Appointment" styleId="appt">
										<div class="form-group row mt-4 mb-4">
											<label class="col-md-2 col-form-label"><span
												class="h5">Doctor Name</span></label>
											<div class="col-md-3">
												<html:text property="doctorName" style="height:40px;"
													disabled="true" styleClass="form-control" />
											</div>
											<label class="col-md-2 col-form-label"><span
												class="h5">Disease Name</span></label>
											<div class="col-md-3">
												<html:text property="diseaseName" style="height:40px;"
													disabled="true" styleClass="form-control" />
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
													styleClass="form-control" />
											</div>
										</div>
										<div class="form-group row mb-4">

											<label class="col-md-2 col-form-label"><span
												class="h5">Reason</span></label>
											<div class="col-md-3 col-sm-6 col-lg-3" style="height: 150px">
												<html:textarea property="reason"
													styleClass="w-100 h-75 form-control" styleId="reason" />
											</div>
										</div>
										<button name="request" type="submit"
											class="btn btn-outline-primary">Request</button>
										<a href="Appointment.do?progressid=0"
											class="ms-2   btn btn-outline-danger">Cancel</a>
									</html:form>
								</div>
								<%
								}
								%><!-- end of request appointment menu content -->
							</div>
						</div>
					</div>
				</main>
			</div>
		</div>
	</div>
	<!-- Content -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
	<script src="/HealthCareSystem/js/jquery.timepicker.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.5/jquery.validate.js"></script>
	<script src="/HealthCareSystem/js/Patient/Appointment.js"></script>
</body>
</html>