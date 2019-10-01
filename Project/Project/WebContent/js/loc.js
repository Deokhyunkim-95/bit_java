/**
 * 
 */


jQuery(function () { 

	
	
});

function show_south() {
	$("#LocationFilter_RegionButton_South").click( function() {
		$("#LocationFilter_Result").text("");
		$("#LocationFilter_MetroWrap_South").appendTo("#LocationFilter_Result");
		
	})
	
}

function show_north() {
	$("#LocationFilter_RegionButton_North").click( function() {
		$("#LocationFilter_Result").text("");
		$("#LocationFilter_MetroWrap_North").appendTo("#LocationFilter_Result");
		
	})
}

