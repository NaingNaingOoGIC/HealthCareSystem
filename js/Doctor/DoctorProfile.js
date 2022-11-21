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
	yearRange: '-90:-26',
});
$("#myForm").validate({
	ignore: [],
	errorPlacement: function(error, element) {
		error.insertBefore(element.before());
	}
}); jQuery.validator
	.addMethod(
		"phoneMyanmar",
		function(phone_number, element) {
			phone_number = phone_number.replace(/\s+/g, "");
			var reg = "^\\+?959((20)[0-9]{5}|(2)[0-9]{8}|3[0-9]{7}|4[0-9]{7,8}|5[0-9]{6}|68[0-9]{5}|69[0-9]{7}|(78|79)[0-9]{7}|89[0-9]{7}|(96|97|95)[0-9]{7})$";
			return this.optional(element)
				|| phone_number.length > 9
				&& phone_number.match(reg);
		}, "Invalid phone number");
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