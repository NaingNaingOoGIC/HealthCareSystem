$(document).ready(function() {
	$("#myForm").validate({
		ignore: [],
		errorPlacement: function(error, element) {
			error.insertBefore(element.before());
		}
	});
	jQuery.validator.addMethod("noSpace", function(value, element) {

		return /[a-zA-Z]/.test(value) || /[0-9]/.test(value) || /[`!@#$%^&*()_+\-=\[\]{};':"\\|,.<>\/?~]/.test(value);
	}, "");
	$("#username").rules("add", {
		required: true,
		noSpace: true,
		messages: {
			required: "Please Fill Username !",
			noSpace: "Please Fill Username !"
		}
	});
	$("#password").rules("add", {
		required: true,
		noSpace: true,
		messages: {
			required: "Please Fill Password !",
			noSpace: "Please Fill Password !"
		}
	});
})