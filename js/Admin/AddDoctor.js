jQuery.noConflict();//not to conflict jquery and dwr

function addDegree() {

	var degreeInput = document.getElementById("degreeInput");
	var degree = degreeInput.value;
	AddDoctor.degreeWirte(degree, writeDegree);

	degreeInput.value = "";
	document.getElementById("complete").style.display = "block"
	setTimeout(function() {
		document.getElementById("complete").style.display = "none"
	}, 3000);
}

function writeDegree(degreeList) {
	dwr.util.removeAllOptions("degree");
	dwr.util
		.addOptions("degree", degreeList);
}

jQuery(document).ready(function($) {

	var modal = document.getElementById("showAlert");
	var value = modal.getAttribute("hidden");
	if (value === 'show')
		$('#myModal').modal('show');
	var now = new Date();
	$("#dob").datepicker({
		changeMonth: true,
		changeYear: true,
		dateFormat: 'yy-mm-dd',
		yearRange: '-80:-26',
		maxDate: new Date(now.getFullYear() - 26, now.getMonth(), now.getDate()),
		minDate: new Date(now.getFullYear() - 80, now.getMonth(), now.getDate())
	});
	$("#myForm").validate({
		ignore: [],
		errorPlacement: (error, element) => {
			error.insertBefore(element)
		}
	});
	jQuery.validator.addMethod("minAge", function(value, element, min) {
		var today = new Date();
		var birthDate = new Date(value);
		var age = today.getFullYear() - birthDate.getFullYear();

		if (age > min + 1) {
			return true;
		}

		var m = today.getMonth() - birthDate.getMonth();

		if (m < 0 || (m === 0 && today.getDate() < birthDate.getDate())) {
			age--;
		}

		return age >= min;
	}, "Doctor has to be older than 26 years.");
	jQuery.validator
		.addMethod(
			"phoneMyanmar",
			function(phone_number, element) {
				phone_number = phone_number.replace(/\s+/g, "");
				var reg = "^\\+?959((20)[0-9]{5}|(2)[0-9]{8}|3[0-9]{7}|4[0-9]{7,8}|5[0-9]{6}|68[0-9]{5}|69[0-9]{7}|(78|79)[0-9]{7}|89[0-9]{7}|(96|97|95)[0-9]{7})$";
				return this.optional(element)
					|| phone_number.length > 9
					&& phone_number.match(reg);
			}, "Invalid phone number");
	jQuery.validator.addMethod("noSpace", function(value, element) {

		return /[a-zA-Z]/.test(value) || /[0-9]/.test(value) || /[`!@#$%^&*()_+\-=\[\]{};':"\\|,.<>\/?~]/.test(value);
	}, "");
	$("#name").rules("add", {
		required: true,
		noSpace: true,
		messages: {
			required: "Please Fill Name !",
			noSpace: "Please Fill Name !",
		}
	});
	$("#gender").rules("add", {
		required: true,
		messages: {
			required: "Please Select Gender !",
		}
	});
	$("#dept").rules("add", {
		required: true,
		messages: {
			required: "Please Select Department !",
		}
	});
	$("#degree").rules("add", {
		required: true,
		messages: {
			required: "Please Select degree !",
		}
	});
	$("#dob").rules("add", {
		required: true,
		minAge: 26,
		messages: {
			required: "Please Fill Date of Birth !",
		}
	});
	$("#email").rules("add", {
		required: true,
		messages: {
			required: "Please Enter Email !",
		},
		email: true,
	});
	$("#phone").rules("add", {
		required: true,
		messages: {
			required: "Please Enter Phone Number !",
		},
		phoneMyanmar: true
	});
	$("#address").rules("add", {
		required: true,
		noSpace: true,
		messages: {
			required: "Please Enter Address !",
			noSpace: "Please Enter Address !"
		},
	});
})	