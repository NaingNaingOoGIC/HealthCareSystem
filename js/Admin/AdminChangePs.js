$(document).ready(function() {
	var modal = document.getElementById("successPs");
	var value = modal.getAttribute("hidden");
	if (value === 'show') {
		swal({
			title: "Successfully Changed",
			text: "Your Password is Successfully Changed.",
			icon: "success",
			buttons: false,
			timer: 3000,
		});
	}
	$("#myForm").validate();
	jQuery.validator.addMethod("passwordPattern", function(phone_number, element) {
		phone_number = phone_number
			.replace(/\s+/g, "");
		var pattern = /^.*(?=.{8,})(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).*$/;
		return this.optional(element)
			|| phone_number.length > 9
			&& phone_number
				.match(pattern);
	}, "Password must contain at least one uppercase, one lowercase and one numeric values and length must be 8 or more characters.");
	$("#currentPs").rules("add", {
		required: true,
		messages: {
			required: "Please Fill Current Password !"
		}
	});
	$("#newPs").rules("add", {
		required: true,
		messages: {
			required: "Please Fill New Password !",
		},
		passwordPattern: true
	});
	$("#confirmPs").rules("add", {
		required: true,
		equalTo: "#newPs",
		messages: {
			required: "Please Fill Confirm Password !",
			equalTo: "New Password and Confirm Password doesn't match !"
		}
	});
})