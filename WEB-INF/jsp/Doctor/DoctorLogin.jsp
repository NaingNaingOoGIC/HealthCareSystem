<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@ include file="/WEB-INF/jsp/Common/StyleLink.jsp"%>
<%@ include file="/WEB-INF/jsp/Common/TagLib.jsp"%>
<title>Doctor Login</title>
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
				<div class="col-md-9 col-lg-6 col-xl-5 d-none d-md-block">
					<img src="/HealthCareSystem/Images/doctorLogin.svg"
						class="img-fluid" alt="Sample image">
				</div>
				<!-- left panel end -->
				<!-- right login panel -->
				<div class="col-md-8 col-lg-6 col-xl-4 offset-xl-1">
					<div class="card gradient-skyblue text-dark mt-5"
						style="border-radius: 1rem;">
						<div class="card-body p-5 text-center">
							<div class="mb-md-1 mt-md-4 pb-5">
								<h2 class="fw-bold mb-3 text-uppercase">Login</h2>
								<p class="text-dark-50 mb-4">Please enter your username and
									password!</p>
								<html:form action="/DoctorLogin" styleId="myForm">
									<span class="h6"><html:errors property="loginerror" /></span>
									<div class="form-outline form-dark mb-4"
										style="text-align: left;">
										<label class="form-label"><i class="fa-solid fa-user"></i>
											Username</label>
										<html:text property="userName" styleClass="form-control"
											styleId="username" />
									</div>
									<html:errors property="password" />
									<div class="form-outline form-dark mb-4"
										style="text-align: left;">
										<label class="form-label"> <i class="fa-solid fa-lock"></i>
											Password
										</label>
										<html:password property="password" styleClass="form-control"
											styleId="password" />
									</div>
									<button class="btn btn-outline-dark btn-lg px-5" type="submit">Login</button>
								</html:form>
							</div>
						</div>
					</div>
				</div>
				<!-- end of right login panel -->
			</div>
		</div>
	</section>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.5/jquery.validate.js"></script>
	<script src="/HealthCareSystem/js/Login.js"></script>
</body>
</html>