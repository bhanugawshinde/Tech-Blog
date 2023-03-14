$(document).ready(function(e){
	console.log("hello");
})
function doLike(pId,uId){
	console.log(pId+" "+uId)
	const d={
		uId: uId,
		pId: pId,
		operation: 'like'
	}
	//send data
	$.ajax({
		url: "LikeServlet",
		type:'POST',
		data: d,
		success:function(data,textStatus,jqXHR){
			if(data.trim()=="done"){
				let c = $("#like-counter-"+pId).html();
				c++;
				$("#like-counter-"+pId).html(c);
				$("#like-counter-"+pId).addClass('like-color');
			}else{
				swal("Error!!","Something went wrong try again...","error");
				console.log(data)
			}
		
			
			
		},
		error:function(jqXHR,textStatus,errorThrown){
			swal("Error!!","Something went wrong try again...","error");
			console.loe("error");
		},
		
	
	});
}