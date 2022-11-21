<nav
	class="navbar navbar-expand-lg navbar-light gradient-skyblue sticky-top">
	<div class="container-fluid">
		<div class="md-navbar-brand">
			<img src="Images/logo.png" alt="Photo" style="height: 50px" /> <span class="d-none d-md-inline fs-3">Health
				Care System</span>
		</div>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="flex-fill" style="width: 600px"></div>
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav me-auto mb-2 mb-lg-0">
				<li class="nav-item"><a
					class="nav-link <%if (session.getAttribute("link") != null)
	if (session.getAttribute("link").equals("home"))
		out.write("active");%>"
					aria-current="page" href="Home.do">Home</a></li>
				<li class="nav-item"><a
					class="nav-link <%if (session.getAttribute("link") != null)
	if (session.getAttribute("link").equals("about"))
		out.write("active");%>"
					href="About.do">About</a></li>
				<li class="nav-item"><a
					class="nav-link <%if (session.getAttribute("link") != null)
	if (session.getAttribute("link").equals("searchDoctor"))
		out.write("active");%> "
					href="SearchDoctor.do"> Doctor</a></li>
				<li class="nav-item"><a class="nav-link" href="PatientLogin.do">Login</a></li>
			</ul>
		</div>
	</div>
</nav>