<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<jsp:include page="WEB-INF/jsp/Common/StyleLink.jsp" />
<title>Welcome</title>
</head>
<body>
	<%
	request.getSession().setAttribute("link", "home");
	%>
	<jsp:include page="WEB-INF/jsp/Start/Header.jsp" />
	<div id="carouselExampleIndicators" class="carousel slide"
		data-bs-ride="carousel">
		<div class="carousel-indicators">
			<button type="button" data-bs-target="#carouselExampleIndicators"
				data-bs-slide-to="0" class="active" aria-current="true"
				aria-label="Slide 1"></button>
			<button type="button" data-bs-target="#carouselExampleIndicators"
				data-bs-slide-to="1" aria-label="Slide 2"></button>
			<button type="button" data-bs-target="#carouselExampleIndicators"
				data-bs-slide-to="2" aria-label="Slide 3"></button>
			<button type="button" data-bs-target="#carouselExampleIndicators"
				data-bs-slide-to="3" aria-label="Slide 4"></button>
			<button type="button" data-bs-target="#carouselExampleIndicators"
				data-bs-slide-to="4" aria-label="Slide 5"></button>
		</div>
		<div class="carousel-inner">
			<div class="carousel-item active ">
				<div class="gradient-apple d-flex justify-content-center"
					style="height: 200px; width: 100%;">
					<div
						class="col-md-10  bg-white justify-content-center h-50 mt-5 rounded w-50">
						<figure class="text-center">
							<blockquote class="blockquote mt-3">
								<p>Humor and health, the staples of wealth.</p>
							</blockquote>
							<figcaption class="blockquote-footer">
								<cite title="Source Title">S. Austin</cite>
							</figcaption>
						</figure>
					</div>
				</div>
			</div>
			<div class="carousel-item">
				<div class="gradient-apple d-flex justify-content-center"
					style="height: 200px; width: 100%;">
					<div
						class="col-md-10  bg-white justify-content-center h-50 mt-5 rounded w-50">
						<figure class="text-center">
							<blockquote class="blockquote mt-3">
								<p>Health is not valued until sickness comes.</p>
							</blockquote>
							<figcaption class="blockquote-footer">
								<cite title="Source Title">Thomas Fuller</cite>
							</figcaption>
						</figure>
					</div>
				</div>
			</div>
			<div class="carousel-item">
				<div class="gradient-apple d-flex justify-content-center"
					style="height: 200px; width: 100%;">
					<div
						class="col-md-10  bg-white justify-content-center h-50 mt-5 rounded w-50">
						<figure class="text-center">
							<blockquote class="blockquote mt-3">
								<p>The greatest wealth is health.</p>
							</blockquote>
							<figcaption class="blockquote-footer">
								<cite title="Source Title">Virgil</cite>
							</figcaption>
						</figure>
					</div>
				</div>
			</div>
			<div class="carousel-item">
				<div class="gradient-apple d-flex justify-content-center"
					style="height: 200px; width: 100%;">
					<div
						class="col-md-10  bg-white justify-content-center h-50 mt-5 rounded w-50">
						<figure class="text-center">
							<blockquote class="blockquote mt-3">
								<p>Health is the greatest of human blessings.</p>
							</blockquote>
							<figcaption class="blockquote-footer">
								<cite title="Source Title">Hippocrates.</cite>
							</figcaption>
						</figure>
					</div>
				</div>
			</div>
			<div class="carousel-item">
				<div class="gradient-apple d-flex justify-content-center"
					style="height: 200px; width: 100%;">
					<div
						class="col-md-10  bg-white justify-content-center h-50 mt-5 rounded w-50">
						<figure class="text-center">
							<blockquote class="blockquote mt-3">
								<p>Health is a priceless wealth. Invest while you can.</p>
							</blockquote>
							<figcaption class="blockquote-footer">
								<cite title="Source Title">Bryant McGill.</cite>
							</figcaption>
						</figure>
					</div>
				</div>
			</div>

		</div>
		<button class="carousel-control-prev" type="button"
			data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
			<span class="carousel-control-prev-icon" aria-hidden="true"></span> <span
				class="visually-hidden">Previous</span>
		</button>
		<button class="carousel-control-next" type="button"
			data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
			<span class="carousel-control-next-icon" aria-hidden="true"></span> <span
				class="visually-hidden">Next</span>
		</button>
	</div>

	<!-- <div class="show">
		<div class="carousel slide" data-bs-ride="carousel">
			<div class="carousel-inner">
				<div class="carousel-item active">
					<img class="slideshowimage" src="Images/health-is-wealth.png"
						alt="image">

				</div>
				<div class="carousel-item">
					<img class="slideshowimage" src="Images/slide1.jpg" alt="image">
				</div>
				<div class="carousel-item">
					<img class="slideshowimage" src="Images/slide2.jpg" alt="image">
				</div>
				<div class="carousel-item">
					<img class="slideshowimage" src="Images/slide3.jpg" alt="image">
				</div>
			</div>
		</div>
	</div> -->
	<h2 class="mt-3 mb-3 text-center">World Health News</h2>

	<div class="row content mb-3">
		<div class="col-md-3">
			<img alt="covid" src="Images/covid.jpg" style="max-width: 100%">
			<br> Covid: Dozens of Covid cases linked to Beijing bar...<a
				href="https://www.bbc.com/news/world-asia-china-61777304">Read
				More</a>
		</div>
		<div class="col-md-3">
			<img alt="covid" src="Images/candana.jpg" style="max-width: 100%"><br>

			Canada mulls putting warnings on each cigarette...<a
				href="https://www.bbc.com/news/world-us-canada-61767386">Read
				More</a>
		</div>
		<div class="col-md-3">
			<img alt="covid" src="Images/vape.jpg" style="max-width: 100%"><br>
			Vaping - is it a risk-free option?...<a
				href="https://www.bbc.com/news/health-61759776">Read More</a>
		</div>
		<div class="col-md-3">
			<img alt="covid" src="Images/thiland.jpg" style="max-width: 100%"><br>
			Thailand legalises cannabis trade but discourages personal use...<a
				href="https://www.bbc.com/news/world-asia-61741422">Read More</a>
		</div>
	</div>
	<jsp:include page="WEB-INF/jsp/Start/Footer.jsp"></jsp:include>
</body>
</html>