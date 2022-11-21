jQuery.noConflict();//not to conflict jquery and dwr
function sendCategory(categoryId) {
	if (categoryId === "0") {
		document.querySelector(`#searchByName`).style.display = "flex";
		document.querySelector(`#displayDoctor`).style.display = "flex";
		document.querySelector(`#doctorNames`).style.display = "none";
		document.querySelector(`#byDept`).style.display = "none";
	} else {
		document.querySelector(`#byDept`).style.display = "flex";
		document.querySelector(`#searchByName`).style.display = "none";
		document.querySelector(`#doctorNames`).style.display = "none";
		document.querySelector(`#displayDoctor`).style.display = "none";
		AjaxDoctorSearch.getByDept(categoryId, showDeptDoctor);
	}
}
//when subcategory is obtained from server
function showDeptDoctor(list) {

	var doctorList = list;
	document.getElementById("byDept").innerHTML = "";

	for (var i = 0; i < doctorList.length; i++) {

		var col = document.createElement("div");
		var card = document.createElement("div");
		var cardBody = document.createElement("div");
		var table = document.createElement("table");

		var bioAco = document.createElement("div");
		var bioAcoBody = document.createElement("div");
		var bioHead = document.createElement("h2");
		var bioButton = document.createElement("button");
		var bioTextBody = document.createElement("div");
		var bioText = document.createElement("div");

		bioAco.setAttribute("class", "accordion accordion-flush");
		bioAco.setAttribute("id", "accordionFlushExample");

		bioAcoBody.setAttribute("class", "accordion-item");

		bioHead.setAttribute("class", "accordion-header");
		bioHead.setAttribute("id", "flush-headingThree");

		bioButton.setAttribute("class", "accordion-button collapsed");
		bioButton.setAttribute("type", "button");
		bioButton.setAttribute("data-bs-toggle", "collapse");
		bioButton.setAttribute("data-bs-target", "#panel"
			+ doctorList[i].doctorId);
		bioButton.setAttribute("aria-expanded", "false");
		bioButton.setAttribute("aria-controls", "flush-collapseThree");
		bioButton.innerHTML = "Biography";

		bioTextBody.setAttribute("class", "accordion-collapse collapse");
		bioTextBody.setAttribute("id", "panel" + doctorList[i].doctorId);
		bioTextBody.setAttribute("aria-labelledby", "flush-headingThree");
		bioTextBody
			.setAttribute("data-bs-parent", "#accordionFlushExample");
		bioText.setAttribute("class", "accordion-body");
		bioText.innerHTML = doctorList[i].doctorBiography;
		bioAco.appendChild(bioAcoBody);
		bioAcoBody.appendChild(bioHead);
		bioAcoBody.appendChild(bioTextBody);
		bioHead.appendChild(bioButton);
		bioTextBody.appendChild(bioText);
		var rowDept = table.insertRow(0);
		var rowName = table.insertRow(1);
		var rowGender = table.insertRow(2);
		var rowDegree = table.insertRow(3);
		var rowAge = table.insertRow(4);
		var rowAddress = table.insertRow(5);

		var cellDept = rowDept.insertCell(0);
		var cellDeptVal = rowDept.insertCell(1);
		var cellName = rowName.insertCell(0);
		var cellNameVal = rowName.insertCell(1);
		var cellGender = rowGender.insertCell(0);
		var cellGenderVal = rowGender.insertCell(1);
		var cellDegree = rowDegree.insertCell(0);
		var cellDegreeVal = rowDegree.insertCell(1);
		var cellAge = rowAge.insertCell(0);
		var cellAgeVal = rowAge.insertCell(1);
		var cellAddress = rowAddress.insertCell(0);
		var cellAddressVal = rowAddress.insertCell(1);

		// Add some text to the new cells:
		cellDept.innerHTML = "<b> Department</b>";
		cellDeptVal.innerHTML = doctorList[i].department.departmentName;
		cellName.innerHTML = "<b> Name </b>";
		cellNameVal.innerHTML = doctorList[i].doctorName;
		cellGender.innerHTML = "<b> Gender</b>";
		cellGenderVal.innerHTML = doctorList[i].gender;
		cellDegree.innerHTML = "<b> Degree </b>";
		cellDegreeVal.innerHTML = doctorList[i].degree;
		cellAge.innerHTML = "<b> Age</b>";
		cellAgeVal.innerHTML = doctorList[i].age;
		cellAddress.innerHTML = "<b> Address </b>";
		cellAddressVal.innerHTML = doctorList[i].address;

		col.setAttribute("class", "col-lg-3 col-md-4 col-sm-6 mb-3");
		card.setAttribute("class", "card h-100");
		cardBody.setAttribute("class", "card-body");
		table.setAttribute("class", "table table-borderless");
		table.setAttribute("style", "width: 100%");

		cardBody.appendChild(table);
		cardBody.appendChild(bioAco);
		card.appendChild(cardBody);
		col.appendChild(card);
		document.getElementById("byDept").appendChild(col);

	}

}
// should be in the "onload" of the body
function createAutoCompleter() {
	new Autocompleter.DWR("doctorName", "choices1", populateAutocomplete, {
		afterUpdateElement: doctorSelected,
		valueSelector: doctorNameSelector
	});
}
// the callback for the auto completer
function populateAutocomplete(autocompleter, token) {
	AjaxDoctorSearch.findDoctor(token, function(suggestions) {
		if (suggestions != null) {
			autocompleter.setChoices(suggestions);
		}
	});
}
//this function extractes string from sample object for matching
function doctorNameSelector(Doctor) {

	return Doctor.doctorName;
}
//this function is fired when users selects sample from list
function doctorSelected(inputElement, selectedElement, Doctor) {

	dwr.util.setValue("selectDoctorId", Doctor.doctorId);

}