<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<jsp:include page="/WEB-INF/jsp/Common/StyleLink.jsp"></jsp:include>

<title>About us</title>
</head>
<body>
	<%
	request.getSession().setAttribute("link", "about");
	%>
	<jsp:include page="Header.jsp" />
	<section class="mt-2">
		<div style="text-align: center;">
			<h2 class="ms-2">About Us</h2>
			<p>A concern of Care and Cure Group is the only
				multi-disciplinary super-specialty tertiary care hospital in
				Mandalay, confidently providing comprehensive health care with the
				latest medical, surgical and diagnostic facilities. These services
				are provided by expert medical professionals, skilled nurses and
				technologists using state-of-the-art technology.</p>
		</div>
		<div class="ms-2">
			<div class="intro-main">
				<div class="row">

					<!-- Intro Detail -->
					<div class="col-md-8">
						<div class="ms-2">
							<h5 class="text-center">Health Check Ups</h5>
							<p>Besides providing world class clinical lab services,
								Labaid Diagnostic Centre houses a pool of doctors of different
								medical specialty to serve the ailing patients as outpatients.
								They are all reputed and respected in their medical specialty
								for outstanding clinical management</p>
							<ul class="row" style="list-style: none;">
								<li class="col-sm-6">
									<h6>
										<i class="fa-solid fa-circle-check"></i>EMERGENCY CASE
									</h6>
									<p>Excepteur sint occaecat cupidatat non roident, sunt in
										culpa qui officia deserunt mollit</p>
								</li>
								<li class="col-sm-6">
									<h6>
										<i class="fa-solid fa-circle-check"></i> QUALIFIED DOCTORS
									</h6>
									<p>Excepteur sint occaecat cupidatat non roident, sunt in
										culpa qui officia deserunt mollit</p>
								</li>
								<li class="col-sm-6">
									<h6>
										<i class="fa-solid fa-circle-check"></i> ONLINE APPOINTMENT
									</h6>
									<p>Excepteur sint occaecat cupidatat non roident, sunt in
										culpa qui officia deserunt mollit</p>
								</li>
								<li class="col-sm-6">
									<h6>
										<i class="fa-solid fa-circle-check"></i>FREE MEDICAL
										COUNSELING
									</h6>
									<p>Excepteur sint occaecat cupidatat non roident, sunt in
										culpa qui officia deserunt mollit</p>
								</li>
							</ul>
						</div>
					</div>

					<!-- Intro Timing -->
					<div class="col-md-4">
						<div class="timing">
							<i class="fa-solid fa-clock"></i>
							<ul>
								<li>Monday <span>7.00 - 21.00</span></li>
								<li>Tuesday <span>7.00 - 21.00</span></li>
								<li>Wednesday <span>7.00 - 21.00</span></li>
								<li>Thursday <span>7.00 - 21.00</span></li>
								<li>Friday <span>7.00 - 21.00</span></li>
								<li>Saturday <span>7.00 - 21.00</span></li>
								<li>Sunday <span>7.00 - 21.00</span></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>

	<div class="container">

		<!-- Heading -->
		<div class="heading-block">
			<h2 class="heading-block">Our Services</h2>
			<hr>
			<span>Duis autem vel eum iriure dolor in hendrerit n vuew
				lputate velit esse molestie conseu vel illum dolore eufe ugiat nulla
				facilisis at vero.</span>
		</div>

		<!-- Services -->
		<div class="services">
			<div class="row">
				<div class="col-md-4">
					<article>
						<div class="flex">
							<div>
								<i class="fa-solid fa-eye icon"></i>
							</div>
							<div>
								<h6>Eye Specialist</h6>
								<p>Excepteur sint occaecat cupidatat non proident, sunt in
									culpa qui officia deserunt mollit random text.</p>
							</div>
						</div>
					</article>

				</div>

				<!-- Services -->
				<div class="col-md-4">
					<article>
						<div class="flex">
							<div>
								<i class="bi bi-scissors icon"></i>
							</div>
							<div>
								<h6>Operation Theater</h6>
								<p>Excepteur sint occaecat cupidatat non proident, sunt in
									culpa qui officia deserunt mollit random text.</p>
							</div>
						</div>
					</article>

				</div>

				<!-- Services -->
				<div class="col-md-4">
					<article>
						<div class="flex">
							<div>
								<i class="bi bi-activity icon"></i>
							</div>
							<div>
								<h6>ICU Department</h6>
								<p>Excepteur sint occaecat cupidatat non proident, sunt in
									culpa qui officia deserunt mollit random text.</p>
							</div>
						</div>
					</article>

				</div>

				<!-- Services -->
				<div class="col-md-4">
					<article>
						<div class="flex">
							<div>
								<i class="bi bi-people icon"></i>
							</div>
							<div>
								<h6>Qualified Doctors</h6>
								<p>Excepteur sint occaecat cupidatat non proident, sunt in
									culpa qui officia deserunt mollit random text.</p>
							</div>
						</div>
					</article>
				</div>

				<!-- Services -->
				<div class="col-md-4">
					<article>
						<div class="flex">
							<div>
								<i class="fa-solid fa-heart-pulse icon"></i>
							</div>
							<div>
								<h6>Heart Problems</h6>
								<p>Excepteur sint occaecat cupidatat non proident, sunt in
									culpa qui officia deserunt mollit random text.</p>
							</div>
						</div>
					</article>

				</div>

				<!-- Services -->
				<div class="col-md-4">
					<article>
						<div class="flex">
							<div>
								<img src="Images/stomach.png" class="icon">
							</div>
							<div>
								<h6>Stomach Problems</h6>
								<p>Excepteur sint occaecat cupidatat non proident, sunt in
									culpa qui officia deserunt mollit random text.</p>
							</div>
						</div>
					</article>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="Footer.jsp" />
	<script>
		console.log("hi");
	</script>
</body>
</html>