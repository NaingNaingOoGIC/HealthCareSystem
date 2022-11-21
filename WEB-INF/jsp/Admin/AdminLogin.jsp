<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@ include file="/WEB-INF/jsp/Common/StyleLink.jsp"%>
<%@ include file="/WEB-INF/jsp/Common/TagLib.jsp"%>
<title>Admin Login</title>
<style>
label.error {
	color: red;
}
</style>
</head>
<body>
	<section class="vh-100 gradient-skyblue">
		<div class="container-fluid h-custom">
			<div
				class="row d-flex justify-content-center align-items-center h-100">
				<!-- left panel -->
				<div class="col-md-9 col-lg-6 col-xl-5 d-none d-md-flex">
					<img
						src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-login-form/draw2.webp"
						class="img-fluid" alt="Sample image">
				</div>
				<!-- end of left panel -->
				<!-- right login form -->
				<div class="col-md-8 col-lg-6 col-xl-4 offset-xl-1">
					<div class="card gradient-skyblue text-dark mt-5"
						style="border-radius: 1rem;">
						<div class="card-body p-5 text-center">
							<div class="mb-md-1 mt-md-4">
								<h2 class="fw-bold mb-3 text-uppercase">Login</h2>
								<p class="text-dark-50 mb-4">Please enter your username and
									password!</p>
								<html:form action="/AdminLogin" styleId="myForm">
									<span class="h6"><html:errors property="loginerror" /></span>
									<html:errors property="userName" />
									<div class="form-group row mb-3" style="text-align: left;">
										<label class="col-md-5 form-label"><i
											class="fa-solid fa-user"></i> Username </label>
										<div class="col-md-7">
											<html:text property="userName" styleClass="form-control"
												styleId="username" />
										</div>
									</div>
									<html:errors property="password" />
									<div class="form-group row mb-3" style="text-align: left;">
										<label class="col-md-5 form-label"> <i
											class="fa-solid fa-lock"></i> Password
										</label>
										<div class="col-md-7">
											<html:password property="password" styleClass="form-control"
												styleId="password" />
										</div>
									</div>
									<button class="btn btn-outline-dark  px-5 mt-5" type="submit">Login</button>
								</html:form>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!--end of right login form -->
		</div>
	</section>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.5/jquery.validate.js"></script>
	<script src="/HealthCareSystem/js/Login.js"></script>
</body>
</html>