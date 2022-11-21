jQuery(document).ready(function($) {
	$("#myForm").validate({
		ignore: [],
		errorPlacement: (error, element) => {
			error.insertBefore(element)
		}
	});
	jQuery.validator.addMethod("noSpace", function(value, element) {

		return /[a-zA-Z]/.test(value) || /[0-9]/.test(value) || /[`!@#$%^&*()_+\-=\[\]{};':"\\|,.<>\/?~]/.test(value);
	}, "");

	$("#symptoms").rules("add", {
		required: true,
		noSpace: true,
		messages: {
			required: "Please Fill Symptoms !",
			noSpace: "Please Fill Symptoms !"
		}
	});
})