$(document).ready(function() {
	var modal = document.getElementById("updateProfile");
	var value = modal.getAttribute("hidden");
	if (value === 'show') {
		swal({
			title: "Successfully Updated",
			text: "Your Profile is Successfully Updated.",
			icon: "success",
			buttons: false,
			timer: 3000,
		});
	}
	$("#dob").datepicker({
		changeMonth: true,
		changeYear: true,
		dateFormat: 'yy-mm-dd',
		yearRange: '-40:-18',

	});
	$("#myForm").validate({
		ignore: [],
		errorPlacement: function(error, element) {
			error.insertBefore(element.before());
		}
	});
	$("#name").rules("add", {
		required: true,
		messages: {
			required: "Please Fill Name !"
		}
	});
	$("#dob").rules("add", {
		required: true,
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
	$("#address").rules("add", {
		required: true,
		messages: {
			required: "Please Enter Address !",
		},
	});
})