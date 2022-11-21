jQuery.noConflict();//not to conflict jquery and dwr
function check() {

	var email = document.getElementById("email").value;
	Patient.checkEmail(email, setErrorMessage);
}

function setErrorMessage(message) {
	var hidden = document.getElementById("hidField");
	hidden.value = message;
}
jQuery(document).ready(function($) {
	var modal = document.getElementById("check");
	var value = modal.getAttribute("hidden");
	if (value === 'yes')
		$('#myModal').modal('show');
	var now = new Date();
	$("#dob").datepicker({
		changeMonth: true,
		changeYear: true,
		dateFormat: 'yy-mm-dd',
		yearRange: '-100:-18',
		maxDate: new Date(now.getFullYear() - 18, now.getMonth(), now.getDate())
	});
	$("#myForm").validate({
		ignore: [],
		rules: {
			emailhidField: {
				notEqual: "true"
			}
		},
		errorPlacement: (error, element) => {
			if (element.hasClass("radio")) {
				error.insertBefore(element.parent().parent())
			} else
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
	}, "Sorry. You have to be older than 18 years.");

	jQuery.validator.addMethod("notEqual", function(value, element, param) {
		return this.optional(element) || value != param;
	}, "This email already exits! Please try another one.");
	jQuery.validator.addMethod("phoneMyanmar",
		function(phone_number, element) {
			phone_number = phone_number
				.replace(/\s+/g, "");
			var reg = "^\\+?959((20)[0-9]{5}|(2)[0-9]{8}|3[0-9]{7}|4[0-9]{7}|5[0-9]{6}|68[0-9]{5}|69[0-9]{7}|(78|79)[0-9]{7}|89[0-9]{7}|(96|97|95)[0-9]{7})$";
			return this.optional(element)
				|| phone_number.length > 9
				&& phone_number
					.match(reg);
		}, "Invalid phone number");
	$("#name").rules("add", {
		required: true,
		messages: {
			required: "Please Fill Name !"
		}
	});
	$("#gender").rules("add", {
		required: true,
		messages: {
			required: "Please Select Gender !",
		}
	});
	$("#dob").rules("add", {
		required: true,
		minAge: 18,
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
		messages: {
			required: "Please Enter Address !",
		},
	});
})