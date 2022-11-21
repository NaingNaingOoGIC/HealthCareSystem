$(function() {
	var year = (new Date).getFullYear();
	$("#date").datepicker({
		changeMonth: true,
		changeYear: true,
		dateFormat: 'yy-mm-dd',
		minDate: 1,
		maxDate: new Date(year, 11, 31),
	});
	$("#time").timepicker({
		'minTime': '7:00am',
		'maxTime': '7:30pm',
		'timeFormat': 'h:i A'
	});
	$("#appt").validate({
		ignore: [],
		errorPlacement: function(error, element) {
			error.insertBefore(element.before());
		}
	});
	jQuery.validator.addMethod("noSpace", function(value, element) {

		return /[a-zA-Z]/.test(value) || /[0-9]/.test(value) || /[`!@#$%^&*()_+\-=\[\]{};':"\\|,.<>\/?~]/.test(value);
	}, "");
	jQuery.validator.addMethod("dategreaterthantoday", function(value, element) {
		var currentDate = new Date();
		var selectedDate = new Date(value);
		return (currentDate <= selectedDate);
	}, "You must select a date greater than today.");
	$("#reason").rules("add", {
		required: true,
		noSpace: true,
		messages: {
			required: "Please Fill Reason !",
			noSpace: "Please Fill Reason !"
		}
	});
	$("#date").rules("add", {
		required: true,
		messages: {
			required: "Please Select Date !"
		},
		dategreaterthantoday: true
	});
	$("#time").rules("add", {
		required: true,
		messages: {
			required: "Please Select Time !"
		}
	});
});
