/**
 * 
 */
$(function (){
	$('#reset').click(function (){
		self.close();
	});
});
function login(){
	window.open("./login.html","_blank","toolbar=no,scrollbars=yes,resizable=yes,top=500,left=500,width=400,height=400,top=50,left=500");
}

function register(){
	window.open("./register.html","_blank","toolbar=yes,scrollbars=yes,resizable=yes,top=500,left=500,width=400,height=400,top=50,left=500");
}