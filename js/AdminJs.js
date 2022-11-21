
var modal = document.getElementById("successAddProgress");
var value = modal.getAttribute("hidden");
if (value === 'show') {
	swal({
		title: "Successfully Added",
		text: "This progress is successfully added.",
		icon: "success",
		buttons: false,
		timer: 4000,
	});
}
$("#patientSelect").select2({
	placeholder: "Select Patient",
});
$("#doctorSelect").select2({
	placeholder: "Select Doctor",
});
$("#AddProgForm").validate({
	ignore: [],
	errorPlacement: function(error, element) {
		error.insertBefore(element.before());
	},
});
$("#patientSelect").rules("add", {
	required: true,
	messages: {
		required: "Please Select Patient !"
	}
});
$("#doctorSelect").rules("add", {
	required: true,
	messages: {
		required: "Please Select Doctor !"
	}
});
$("#symptoms").rules("add", {
	required: true,
	messages: {
		required: "Please Fill Symptoms !"
	}
});