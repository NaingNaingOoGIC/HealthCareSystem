$(document).ready(function() {
	$("#myForm").validate({
		ignore: [],
		errorPlacement: function(error, element) {
			error.insertBefore(element.before());
		}
	});
	$("#username").rules("add", {
		required: true,
		messages: {
			required: "Please Fill Username !"
		}
	});
	$("#password").rules("add", {
		required: true,
		messages: {
			required: "Please Fill Password !"
		}
	});
})