<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<meta charset="ISO-8859-1">
<title>Date Picker Test</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx"
	crossorigin="anonymous">
<link rel="icon" href="/HealthCareSystem/Images/hospital-regular.svg"
	type="image/x-icon">
<link rel="stylesheet"
	href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet"
	href="/HealthCareSystem/js/jquery.timepicker.min.css">
<link rel="stylesheet"
	href="https://cdn.datatables.net/1.12.1/css/dataTables.bootstrap5.min.css">
</head>
<body>
	<div class="accordion" id="accordionExample">
		<div class="accordion-item">
			<h2 class="accordion-header" id="headingOne">
				<button class="accordion-button" type="button"
					data-bs-toggle="collapse" data-bs-target="#collapseOne"
					aria-expanded="true" aria-controls="collapseOne">
					Accordion Item #1</button>
			</h2>
			<div id="collapseOne" class="accordion-collapse collapse show"
				aria-labelledby="headingOne" data-bs-parent="#accordionExample">
				<div class="accordion-body">
					<strong>This is the first item's accordion body.</strong> It is
					shown by default, until the collapse plugin adds the appropriate
					classes that we use to style each element. These classes control
					the overall appearance, as well as the showing and hiding via CSS
					transitions. You can modify any of this with custom CSS or
					overriding our default variables. It's also worth noting that just
					about any HTML can go within the
					<code>.accordion-body</code>
					, though the transition does limit overflow.
				</div>
			</div>
		</div>
		<div class="accordion-item">
			<h2 class="accordion-header" id="headingTwo">
				<button class="accordion-button collapsed" type="button"
					data-bs-toggle="collapse" data-bs-target="#collapseTwo"
					aria-expanded="false" aria-controls="collapseTwo">
					Accordion Item #2</button>
			</h2>
			<div id="collapseTwo" class="accordion-collapse collapse"
				aria-labelledby="headingTwo" data-bs-parent="#accordionExample">
				<div class="accordion-body">
					<strong>This is the second item's accordion body.</strong> It is
					hidden by default, until the collapse plugin adds the appropriate
					classes that we use to style each element. These classes control
					the overall appearance, as well as the showing and hiding via CSS
					transitions. You can modify any of this with custom CSS or
					overriding our default variables. It's also worth noting that just
					about any HTML can go within the
					<code>.accordion-body</code>
					, though the transition does limit overflow.
				</div>
			</div>
		</div>
		<div class="accordion-item">
			<h2 class="accordion-header" id="headingThree">
				<button class="accordion-button collapsed" type="button"
					data-bs-toggle="collapse" data-bs-target="#collapseThree"
					aria-expanded="false" aria-controls="collapseThree">
					Accordion Item #3</button>
			</h2>
			<div id="collapseThree" class="accordion-collapse collapse"
				aria-labelledby="headingThree" data-bs-parent="#accordionExample">
				<div class="accordion-body">
					<strong>This is the third item's accordion body.</strong> It is
					hidden by default, until the collapse plugin adds the appropriate
					classes that we use to style each element. These classes control
					the overall appearance, as well as the showing and hiding via CSS
					transitions. You can modify any of this with custom CSS or
					overriding our default variables. It's also worth noting that just
					about any HTML can go within the
					<code>.accordion-body</code>
					, though the transition does limit overflow.
				</div>
			</div>
		</div>
	</div>
	<html:form action="/DatePicker">
		Simple Date Picker <html:text property="dateOfBirth"
			styleId="datepicker1" />
		<br>
		<br>
			 Changed month and year <html:text property="dateOfBirth"
			styleId="datepicker2" />
		<br>
		<br>
		Date Format and Year Range <html:text property="dateOfBirth"
			styleId="datepicker3" />
		<br>
		<br>
		Max Date and Min Date <html:text property="dateOfBirth"
			styleId="datepicker4" />
		<br>
		<br>
		<html:text property="dateOfBirth" styleId="time" />

	</html:form>

	<table id="table" class="display" style="width: 100%">
		<thead>
			<tr>
				<th>Name</th>
				<th>Position</th>
				<th>office</th>
				<th>Age</th>
				<th>Start date</th>
				<th>Salary</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>Tiger Nixon</td>
				<td>Stystem Architect</td>
				<td>Tyokyo</td>
				<td>26</td>
				<td>11.04.2018</td>
				<td>$2500</td>
			</tr>
			<tr>
				<td>Tiger Nixon</td>
				<td>Stystem Architect</td>
				<td>Tyokyo</td>
				<td>26</td>
				<td>11.04.2018</td>
				<td>$2500</td>
			</tr>
			<tr>
				<td>Tiger Nixon</td>
				<td>Stystem Architect</td>
				<td>Tyokyo</td>
				<td>26</td>
				<td>11.04.2018</td>
				<td>$2500</td>
			</tr>
			<tr>
				<td>Tiger Nixon</td>
				<td>Stystem Architect</td>
				<td>Tyokyo</td>
				<td>26</td>
				<td>11.04.2018</td>
				<td>$2500</td>
			</tr>
			<tr>
				<td>Tiger Nixon</td>
				<td>Stystem Architect</td>
				<td>Tyokyo</td>
				<td>26</td>
				<td>11.04.2018</td>
				<td>$2500</td>
			</tr>
			<tr>
				<td>Tiger Nixon</td>
				<td>Stystem Architect</td>
				<td>Tyokyo</td>
				<td>26</td>
				<td>11.04.2018</td>
				<td>$2500</td>
			</tr>
			<tr>
				<td>Tiger Nixon</td>
				<td>Stystem Architect</td>
				<td>Tyokyo</td>
				<td>26</td>
				<td>11.04.2018</td>
				<td>$2500</td>
			</tr>
			<tr>
				<td>Tiger Nixon</td>
				<td>Stystem Architect</td>
				<td>Tyokyo</td>
				<td>26</td>
				<td>11.04.2018</td>
				<td>$2500</td>
			</tr>
			<tr>
				<td>Tiger Nixon</td>
				<td>Stystem Architect</td>
				<td>Tyokyo</td>
				<td>26</td>
				<td>11.04.2018</td>
				<td>$2500</td>
			</tr>
			<tr>
				<td>Tiger Nixon</td>
				<td>Stystem Architect</td>
				<td>Tyokyo</td>
				<td>26</td>
				<td>11.04.2018</td>
				<td>$2500</td>
			</tr>
			<tr>
				<td>Tiger Nixon</td>
				<td>Stystem Architect</td>
				<td>Tyokyo</td>
				<td>26</td>
				<td>11.04.2018</td>
				<td>$2500</td>
			</tr>
			<tr>
				<td>Tiger Nixon</td>
				<td>Stystem Architect</td>
				<td>Tyokyo</td>
				<td>26</td>
				<td>11.04.2018</td>
				<td>$2500</td>
			</tr>
			<tr>
				<td>Tiger Nixon</td>
				<td>Stystem Architect</td>
				<td>Tyokyo</td>
				<td>26</td>
				<td>11.04.2018</td>
				<td>$2500</td>
			</tr>
			<tr>
				<td>Tiger Nixon</td>
				<td>Stystem Architect</td>
				<td>Tyokyo</td>
				<td>26</td>
				<td>11.04.2018</td>
				<td>$2500</td>
			</tr>
			<tr>
				<td>Tiger Nixon</td>
				<td>Stystem Architect</td>
				<td>Tyokyo</td>
				<td>26</td>
				<td>11.04.2018</td>
				<td>$2500</td>
			</tr>
			<tr>
				<td>Tiger Nixon</td>
				<td>Stystem Architect</td>
				<td>Tyokyo</td>
				<td>26</td>
				<td>11.04.2018</td>
				<td>$2500</td>
			</tr>
			<tr>
				<td>Tiger Nixon</td>
				<td>Stystem Architect</td>
				<td>Tyokyo</td>
				<td>26</td>
				<td>11.04.2018</td>
				<td>$2500</td>
			</tr>
			<tr>
				<td>Tiger Nixon</td>
				<td>Stystem Architect</td>
				<td>Tyokyo</td>
				<td>26</td>
				<td>11.04.2018</td>
				<td>$2500</td>
			</tr>
			<tr>
				<td>Tiger Nixon</td>
				<td>Stystem Architect</td>
				<td>Tyokyo</td>
				<td>26</td>
				<td>11.04.2018</td>
				<td>$2500</td>
			</tr>
			<tr>
				<td>Tiger Nixon</td>
				<td>Stystem Architect</td>
				<td>Tyokyo</td>
				<td>26</td>
				<td>11.04.2018</td>
				<td>$2500</td>
			</tr>
			<tr>
				<td>Tiger Nixon</td>
				<td>Stystem Architect</td>
				<td>Tyokyo</td>
				<td>26</td>
				<td>11.04.2018</td>
				<td>$2500</td>
			</tr>
			<tr>
				<td>Tiger Nixon</td>
				<td>Stystem Architect</td>
				<td>Tyokyo</td>
				<td>26</td>
				<td>11.04.2018</td>
				<td>$2500</td>
			</tr>
			<tr>
				<td>Tiger Nixon</td>
				<td>Stystem Architect</td>
				<td>Tyokyo</td>
				<td>26</td>
				<td>11.04.2018</td>
				<td>$2500</td>
			</tr>
			<tr>
				<td>Tiger Nixon</td>
				<td>Stystem Architect</td>
				<td>Tyokyo</td>
				<td>26</td>
				<td>11.04.2018</td>
				<td>$2500</td>
			</tr>
			<tr>
				<td>Tiger Nixon</td>
				<td>Stystem Architect</td>
				<td>Tyokyo</td>
				<td>26</td>
				<td>11.04.2018</td>
				<td>$2500</td>
			</tr>
			<tr>
				<td>Tiger Nixon</td>
				<td>Stystem Architect</td>
				<td>Tyokyo</td>
				<td>26</td>
				<td>11.04.2018</td>
				<td>$2500</td>
			</tr>
			<tr>
				<td>Tiger Nixon</td>
				<td>Stystem Architect</td>
				<td>Tyokyo</td>
				<td>26</td>
				<td>11.04.2018</td>
				<td>$2500</td>
			</tr>
			<tr>
				<td>Tiger Nixon</td>
				<td>Stystem Architect</td>
				<td>Tyokyo</td>
				<td>26</td>
				<td>11.04.2018</td>
				<td>$2500</td>
			</tr>
			<tr>
				<td>Tiger Nixon</td>
				<td>Stystem Architect</td>
				<td>Tyokyo</td>
				<td>26</td>
				<td>11.04.2018</td>
				<td>$2500</td>
			</tr>
			<tr>
				<td>Tiger Nixon</td>
				<td>System Architect</td>
				<td>Tyokyo</td>
				<td>26</td>
				<td>11.04.2018</td>
				<td>$2500</td>
			</tr>
			<tr>
				<td>Tiger Nixon</td>
				<td>Stystem Architect</td>
				<td>Tyokyo</td>
				<td>26</td>
				<td>11.04.2018</td>
				<td>$2500</td>
			</tr>
		</tbody>
	</table>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>

	<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
	<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
	<script src="/HealthCareSystem/js/jquery.timepicker.min.js"></script>
	<script
		src="https://cdn.datatables.net/1.12.1/js/jquery.dataTables.min.js"></script>
	<script
		src="https://cdn.datatables.net/1.12.1/js/dataTables.bootstrap5.min.js"></script>
	<script>
		$(document).ready(function() {
			$("#datepicker1").datepicker();
			$("#datepicker2").datepicker({
				changeMonth : true,
				changeYear : true,
			});
			$("#datepicker3").datepicker({
				dateFormat : 'yy-mm-dd',
				changeYear : true,
				yearRange : '-15:+5',
			});
			$("#datepicker4").datepicker({
				minDate : -1,
				maxDate : 5,
			});
			$("#time").timepicker();
			$("#table").DataTable();
		})
	</script>
</body>
</html>