<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<%@ include file="/WEB-INF/jsp/Common/StyleLink.jsp"%>
<%@ include file="/WEB-INF/jsp/Common/TagLib.jsp"%>
<title>Patient Home</title>
</head>
<body class="gradient-skyblue">
	<div class="container-fluid overflow-hidden">
		<div class="row vh-100 overflow-auto">
			<%@ include file="PatientSideBar.jsp"%>
			<div class="col d-flex flex-column h-sm-100 gradient-skyblue">
				<main class="row overflow-auto">
					<div class="col pt-4">
						<div id="head" style="display: none;">
							<h4 class="head text-start ms-2  fst-italic">Health is
								Wealth</h4>
							<p class="text-end h4 fst-italic">Please Take Care of Your
								Body & Mind</p>
						</div>


						<div class="text-center h3" id="head1" style="display: none;">Our
							Service</div>
						<div class="row ms-2 me-2" style="display: none;" id="dept">
							<!-- <div class="row gradient-skyblue"> -->
							<logic:notEmpty name="DepartmentForm" property="deptList">
								<c:forEach var="i" begin="1"
									end="${DepartmentForm.deptList.size()}" step="1">
									<div class="col-lg-3 col-md-4 col-sm-6 mb-3">
										<div class="card p-2 h-100 ">
											<div class="card-body">
												<table class="table table-borderless" style="width: 100%">
													<tr>
														<th class="text-center">${DepartmentForm.deptList[i-1].departmentName}</th>
													</tr>
													<tr>
														<th class="text-center">Total Doctor :
															${DepartmentForm.deptList[i-1].noOfDoctor}</th>
													</tr>
													<tr>
														<th class="text-center">Description : <a
															href="DepartmentDetail.do?deptId=${DepartmentForm.deptList[i-1].departmentId}">Read</a></th>
													</tr>
												</table>
											</div>
										</div>
									</div>
								</c:forEach>
							</logic:notEmpty>
						</div>
					</div>
				</main>
			</div>
		</div>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
	<script>
		$("#head").fadeIn(3000);
		$("#head1").fadeIn(3000);
		$("#dept").fadeIn(3000);
	</script>
</body>
</html>