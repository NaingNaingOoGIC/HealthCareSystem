$("#todayAppt").DataTable();
$("#nextAppt").DataTable();
function apptAction(id, control) {
	var apptId = document.getElementById("id");
	var frmControl = document.getElementById("control");
	apptId.value = id;
	frmControl.value = control;
}