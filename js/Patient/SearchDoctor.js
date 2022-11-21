$(document).ready(function() {
	var dataSrc = [];
	$('#doctor').DataTable({
		"ordering": false,
		'initComplete': function() {
			var api = this.api();
			api.cells('tr', [1, 2]).every(function() {
				var data = $('<div>').html(this.data()).text();
				if (dataSrc.indexOf(data) === -1) {
					dataSrc.push(data);
				}
			});
			// Sort dataset alphabetically
			dataSrc.sort();
			// Initialize Typeahead plug-in
			$('.dataTables_filter input[type="search"]', api.table().container()).typeahead({
				source: dataSrc,
				afterSelect: function(value) {
					api.search(value).draw();
				}
			});
		}
	});
});