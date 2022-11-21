$(document).ready(function() {
	$("#avatable").DataTable({
		"columnDefs": [{
			"targets": [6, 7, 8, 9, 10],
			"orderable": false
		}, {
			"width": "30%",
			"targets": [1, 2],
		},]
	});
	$("#unavatable").DataTable({
		"columnDefs": [{
			"targets": [6, 7, 8, 9],
			"orderable": false
		}, {
			"width": "30%",
			"targets": [1, 2],
		},]
	});
})
function doctorAction(id, name, control) {

	var doctorId = document.getElementById("id");
	var frmControl = document.getElementById("control");
	doctorId.value = id;
	frmControl.value = control;
	var showText = control == "delete" ? " away " : " return ";
	if (control == "delete") {
		document.getElementById("deleteBtn").style.display = "block";
		document.getElementById("returnBtn").style.display = "none";
	} else {
		document.getElementById("deleteBtn").style.display = "none";
		document.getElementById("returnBtn").style.display = "block";
	}
	document.getElementById("doctorName").textContent = name + showText;

}