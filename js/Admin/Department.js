$(document).ready(function() {
	$("#dept").DataTable();
	$("#myForm").validate({
		ignore: [],
		errorPlacement: function(error, element) {
			error.insertBefore(element.before());
		}
	});
	jQuery.validator.addMethod("noSpace", function(value, element) {

		return /[a-zA-Z]/.test(value) || /[0-9]/.test(value) || /[`!@#$%^&*()_+\-=\[\]{};':"\\|,.<>\/?~]/.test(value);
	}, "");
	$("#name").rules("add", {
		required: true,
		noSpace: true,
		messages: {
			required: "Please Fill Name !", noSpace: "Please Fill Name !"
		}
	});
	$("#desc").rules("add", {
		required: true,
		noSpace: true,
		messages: {
			required: "Please Fill Description !", noSpace: "Please Fill Description !"
		}
	});
})
function deptAction(id, name, control) {

	var deptId = document.getElementById("id");
	var frmControl = document.getElementById("control");
	deptId.value = id;
	frmControl.value = control;
	console.log(id)
	console.log(name)
	console.log(control)
	var showText = control == "delete" ? " unavailable " : " available back ";
	if (control == "delete") {
		document.getElementById("deleteBtn").style.display = "block";
		document.getElementById("returnBtn").style.display = "none";
	} else {
		document.getElementById("deleteBtn").style.display = "none";
		document.getElementById("returnBtn").style.display = "block";
	}
	document.getElementById("deptName").textContent = name + "Department" + showText;

}