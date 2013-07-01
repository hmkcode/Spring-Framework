
function match(){
	
	var serialized = $("#form1").serialize();
	//$("#results").text( serialized );
	url = "rest/controller/match";
	
	
	$.ajax({  type: "POST",  
		url: url,  
		data: {
			regex : $("#regex").val(),
			input:$("#text").val()
		},  
		success: function(data){ 
			$("results").empty();
			$("#results").text(data.match);
			$.each(data.groups, function (index, group) {
                $('<p/>').text(group).appendTo("#results");
            });  
		},  
		dataType: "json", 
		error:function(){ alert("error") } 
	});
	
}

$(document).ready(function(){
	
	$("table tr").has("td").mouseover(function(){
		$(this).css({'background-color':'#eee','cursor':'pointer','color':'#0088CC'});
	});
	$("table tr").has("td").mouseout(function(){
		$(this).css({'background-color':'#fff','cursor':'none','color':'#000'});
	});
});