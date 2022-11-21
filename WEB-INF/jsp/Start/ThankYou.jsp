<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@ include file="/WEB-INF/jsp/Common/StyleLink.jsp"%>
<%@ include file="/WEB-INF/jsp/Common/TagLib.jsp"%>
<title>Thank You</title>
</head>
<style>
body {
	height: 100vh;
}

.container {
	height: 100%;
}
</style>
<body class="gradient-skyblue">
	<div class="container d-flex align-items-center justify-content-center">
		<div>
			<div class="card gradient-skyblue text-dark" style="border-radius: 1rem;">
				<div class="card-body text-center">
					<p class="h5 text-dark lh-lg">
						Thank You! For your Registration.<br> We will contact you via
						mail when we finish creating an account for you. <br> Have a
						nice day. <br> <a href="Home.do">Home</a>
					</p>
				</div>
			</div>
		</div>
	</div>
</body>
</html>