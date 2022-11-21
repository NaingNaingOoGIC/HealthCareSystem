<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<%@ include file="/WEB-INF/jsp/Common/StyleLink.jsp"%>
<%@ include file="/WEB-INF/jsp/Common/TagLib.jsp"%>
<title>Progress</title>
</head>
<body class="bg-white">
	<div class="container-fluid overflow-hidden">
		<div class="row vh-100 overflow-auto">
			<%@ include file="DoctorSideBar.jsp"%>
			<div class="col d-flex flex-column h-sm-100 gradient-skyblue">
				<main class="row overflow-auto">
					<div class="col pt-4 text-center">
						<h2 class="text-center">Progress</h2>
						<hr>
						<div class="container">
							<!-- menu tab -->
							<ul class="nav nav-tabs" id="myTab">
								<!-- during treatment menu tab -->
								<li class="nav-item"><a href="#still"
									class="nav-link active" data-bs-toggle="tab">During
										Treatment<span
										class="ms-1 d-none d-lg-inline badge bg-success
rounded-pill float-end">
											${DoctorProgress.progList.size()}</span>
								</a></li>
								<!-- end of during treatment menu tab -->
								<!--  treatment done menu tab -->
								<li class="nav-item"><a href="#done" class="nav-link"
									data-bs-toggle="tab">Treatment Done <span
										class="ms-1 d-none d-lg-inline badge bg-secondary
rounded-pill float-end">${DoctorProgress.doneList.size()}</span>

								</a></li>
								<!--end of  treatment done menu tab -->
							</ul>
							<div class="tab-content">
								<!-- during treatment menu content -->
								<div class="tab-pane fade show active" id="still">
									<div class="table-responsive mt-3">
										<%
										int i = 1;
										%>
										<display:table id="data"
											name="sessionScope.DoctorProgress.progList" pagesize="15"
											requestURI="DoctorProgress.do"
											class="table table-striped bg-white">

											<display:column title="No" value="<%=i++%>"></display:column>
											<display:column property="patient.patientName"
												title="Patient Name" />
											<display:column property="diseaseName" title="Disease Name" />
											<display:column paramId="progressid"
												paramProperty="progressId" title="View"
												href="ViewProgressDetail.do?path=doctor">
												<i class="fa-regular fa-eye"></i> Detail
																</display:column>
											<display:column paramId="progressid"
												paramProperty="progressId" title="Add"
												href="DoctorAppointment.do">
												<i class="fa-solid fa-square-plus"></i> appt. 
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
								<!--end during treatment menu content -->
								<!-- treatment done menu content -->
								<div class="tab-pane fade" id="done">

									<div class="table-responsive mt-3">
										<%
										int j = 1;
										%>
										<display:table id="data"
											name="sessionScope.DoctorProgress.doneList" pagesize="15"
											requestURI="DoctorProgress.do"
											class="table table-striped bg-white">

											<display:column title="No" value="<%=j++%>"></display:column>
											<display:column property="patient.patientName"
												title="Patient Name" />
											<display:column property="diseaseName" title="Disease Name" />
											<display:column paramId="progressid"
												paramProperty="progressId" title="View"
												href="ViewProgressDetail.do?path=doctor">
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
								<!-- end of treatment done menu content -->
							</div>
						</div>
					</div>
				</main>
			</div>
		</div>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>