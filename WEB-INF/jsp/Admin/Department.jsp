<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<%@ include file="/WEB-INF/jsp/Common/StyleLink.jsp"%>
<%@ include file="/WEB-INF/jsp/Common/TagLib.jsp"%>
<link rel="stylesheet" type="text/css"
	href="https://cdn.datatables.net/v/dt/dt-1.12.1/datatables.min.css" />
<style>
label.error {
	color: red;
}
</style>
<title>Department</title>
</head>
<body class="bg-white">
	<div class="container-fluid overflow-hidden">
		<div class="row vh-100 overflow-auto">
			<%@ include file="AdminSideBar.jsp"%>
			<div class="col d-flex flex-column h-sm-100 gradient-skyblue">
				<main class="row overflow-auto">
					<div class="col pt-4 text-center">
						<h2 class=" text-center">Departments</h2>
						<hr>
						<ul class="nav nav-tabs" id="myTab">
							<!-- view departments menu tab -->
							<li class="nav-item"><a href="#view"
								class="nav-link <%if (session.getAttribute("dept").equals("view") || session.getAttribute("dept").equals("start"))
	out.write("active");%>"
								data-bs-toggle="tab">View</a></li>
							<!--end of view departments menu tab -->
							<!-- add or edit departments menu tab -->
							<li class="nav-item"><a href="#add"
								class="nav-link <%if (session.getAttribute("dept") != null)
	if (session.getAttribute("dept").equals("update") || session.getAttribute("dept").equals("add"))
		out.write("active");%>"
								data-bs-toggle="tab"><logic:empty property="frmControl"
										name="DepartmentForm">Add</logic:empty> <logic:notEmpty
										property="frmControl" name="DepartmentForm">Edit</logic:notEmpty>
							</a></li>
							<!--end of add or edit departments menu tab -->
						</ul>
						<div class="tab-content">
							<!-- view departments menu content -->
							<div
								class="tab-pane fade <%if (session.getAttribute("dept") != null)
	if (session.getAttribute("dept").equals("update") || session.getAttribute("dept").equals("add"))
		out.write("show active");%>"
								id="add">
								<div class="row mt-3 text-center">
									<html:form action="/Department" styleId="myForm">

										<div class="row mb-2">
											<label class="offset-md-2 col-md-2 col-form-label"><span
												class="h5">Department Name</span></label>
											<div class="col-md-6">
												<html:errors property="Department_Name" />
												<html:text property="deptName" styleClass="form-control"
													styleId="name" />
											</div>
										</div>
										<div class="row mb-2">
											<label class="offset-md-2 col-md-2 col-form-label"><span
												class="h5">Description</span> </label>
											<div class="col-md-6 mb-2" style="height: 300px">
												<html:textarea property="description"
													styleClass="form-control  h-100" styleId="desc" />
											</div>

										</div>
										<logic:empty property="frmControl" name="DepartmentForm">
											<button name="add" type="submit"
												class=" mt-3 btn btn-outline-primary">Add</button>
										</logic:empty>
										<logic:notEmpty property="frmControl" name="DepartmentForm">
											<button name="update" type="submit"
												class=" mt-3 btn btn-outline-primary">Update</button>
										</logic:notEmpty>
										<a href="Department.do?frmControl=null"
											class=" mt-3 btn btn-outline-danger">Cancel</a>
									</html:form>
								</div>
							</div>
							<!--end of view departments menu content -->
							<!-- add or edit departments menu content -->

							<div
								class="tab-pane fade <%if (session.getAttribute("dept").equals("view") || session.getAttribute("dept").equals("start"))
	out.write("show active");%>"
								id="view">
								<div class="table-responsive mt-3">
									<%
									int i = 1;
									%>
									<table id="dept" class="display table table-striped bg-white"
										style="width: 100%">
										<thead>
											<tr>
												<th>No.</th>
												<th>Name</th>
												<th>Total Doctor</th>
												<th>Status</th>
												<th></th>
												<th>Action</th>
												<th></th>
											</tr>
										</thead>
										<tbody>
											<c:forEach var="j" begin="1"
												end="${DepartmentForm.deptList.size()}" step="1">
												<tr>
													<td><%=i++%></td>
													<td>${DepartmentForm.deptList[j-1].departmentName}</td>
													<td>${DepartmentForm.deptList[j-1].noOfDoctor}</td>
													<td>${DepartmentForm.deptList[j-1].status}</td>
													<td><a
														href="Department.do?frmControl=update&deptId=${DepartmentForm.deptList[j-1].departmentId}"><i
															class="fa-solid fa-pen"></i></a></td>
													<td><a href="#mymodal" data-bs-toggle="modal"
														onclick="deptAction('${DepartmentForm.deptList[j-1].departmentId}','${DepartmentForm.deptList[j-1].departmentName}','delete')"><span
															class="text-danger"><c:choose>
																	<c:when
																		test="${DepartmentForm.deptList[j-1].status.equals('available')}">
																		<i class="fa-solid fa-trash"></i>
																	</c:when>
																</c:choose></span></a></td>
													<td><a href="#mymodal" data-bs-toggle="modal"
														onclick="deptAction('${DepartmentForm.deptList[j-1].departmentId}','${DepartmentForm.deptList[j-1].departmentName}','reupload')">
															<c:choose>
																<c:when
																	test="${DepartmentForm.deptList[j-1].status.equals('unavailable')}">
																	<i class="fa-solid fa-arrow-rotate-left"></i>
																</c:when>
															</c:choose>
													</a></td>

												</tr>
											</c:forEach>

										</tbody>
									</table>
								</div>
							</div>
							<!--end of add or edit departments menu content -->
						</div>
					</div>
				</main>
			</div>
		</div>
	</div>
	<div class="modal fade" id="mymodal" tabindex="-1"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog modal-dialog-centered">
			<div class="modal-content">
				<div class="modal-body text-center">
					<p class="h5 text-dark lh-lg">
						Do you really want to make <span id="deptName"></span> ?
					<p>
				</div>
				<div class="modal-footer justify-content-center">
					<html:form action="/Department">
						<html:hidden property="deptDelete" styleId="control" />
						<html:hidden property="deptId" styleId="id" />
						<button name="delete" type="submit"
							class="btn btn-outline-primary" id="deleteBtn">Yes</button>
						<button name="reupload" type="submit"
							class="btn btn-outline-primary" id="returnBtn">Yes</button>
					</html:form>
					<button type="button" class="btn btn-outline-danger"
						data-bs-dismiss="modal" aria-label="Close">Cancel</button>
				</div>
			</div>
		</div>
	</div>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.5/jquery.validate.js"></script>
	<script
		src="https://cdn.datatables.net/1.12.1/js/jquery.dataTables.min.js"></script>
	<script src="/HealthCareSystem/js/Admin/Department.js"></script>
</body>
</html>