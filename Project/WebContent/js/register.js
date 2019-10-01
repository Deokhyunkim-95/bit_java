/**
 * 
 */
$(function() {
	
	$('#id_check').click(function (){
			idcheck();
	});
});

function idcheck(){
		$.ajax({
			
			url : 'id_check.jsp',
			type : 'get',
			data : {id: $('#id').val()},
			dataType:'json',
			
			success : function(data){
				//xdata=data;
				//alert("success"+data.id);
				
				if(data.id == undefined){
					$('#msg1').html("사용가능한 ID입니다.")
					
				}else{
					$('#msg1').html("사용중인 ID입니다.")
				}
				
			}
			,error: function(error) {
				alert("데이터가 넘어 오지 않았습니다.")
			}
		});
	};

