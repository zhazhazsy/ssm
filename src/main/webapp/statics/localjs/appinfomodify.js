$.ajax({
	type:"GET",//请求类型
	url:"/dev/categorylevellist0.json",//请求的url
	data:{pid:null},//请求参数
	dataType:"json",//ajax接口（请求url）返回的数据类型
	success:function(data){//data：返回数据（json对象）
		$("#categoryLevel1").html("");
		var options = "<option value=\"\">--请选择--</option>";
		for(var i = 0; i < data.length; i++){
			options += "<option value=\""+data[i].id+"\">"+data[i].categoryname+"</option>";
		}
		$("#categoryLevel1").html(options);
	},
	error:function(data){//当访问时候，404，500 等非200的错误状态码
		alert("加载一级分类列表失败！");
	}
});
//动态加载二级分类列表
$("#categoryLevel1").change(function(){
	var categoryLevel1 = $("#categoryLevel1").val();
	if(categoryLevel1 != '' && categoryLevel1 != null){
		$.ajax({
			type:"GET",//请求类型
			url:"/dev/categorylevellist.json",//请求的url
			data:{pid:categoryLevel1},//请求参数
			dataType:"json",//ajax接口（请求url）返回的数据类型
			success:function(data){//data：返回数据（json对象）
				$("#categoryLevel2").html("");
				var options = "<option value=\"\">--请选择--</option>";
				for(var i = 0; i < data.length; i++){
					options += "<option value=\""+data[i].id+"\">"+data[i].categoryname+"</option>";
				}
				$("#categoryLevel2").html(options);
			},
			error:function(data){//当访问时候，404，500 等非200的错误状态码
				alert("加载二级分类失败！？？？？？？？");
			}
		});
	}else{
		$("#categoryLevel2").html("");
		var options = "<option value=\"\">--请选择--</option>";
		$("#categoryLevel2").html(options);
	}
	$("#categoryLevel3").html("");
	var options = "<option value=\"\">--请选择--</option>";
	$("#categoryLevel3").html(options);
});
//动态加载三级分类列表
$("#categoryLevel2").change(function(){
	var categoryLevel2 = $("#categoryLevel2").val();
	if(categoryLevel2 != '' && categoryLevel2 != null){
		$.ajax({
			type:"GET",//请求类型
			url:"/dev/categorylevellist.json",//请求的url
			data:{pid:categoryLevel2},//请求参数
			dataType:"json",//ajax接口（请求url）返回的数据类型
			success:function(data){//data：返回数据（json对象）
				$("#categoryLevel3").html("");
				var options = "<option value=\"\">--请选择--</option>";
				for(var i = 0; i < data.length; i++){
					options += "<option value=\""+data[i].id+"\">"+data[i].categoryname+"</option>";
				}
				$("#categoryLevel3").html(options);
			},
			error:function(data){//当访问时候，404，500 等非200的错误状态码
				alert("加载三级分类失败！");
			}
		});
	}else{
		$("#categoryLevel3").html("");
		var options = "<option value=\"\">--请选择--</option>";
		$("#categoryLevel3").html(options);
	}
});


function delfile(id){
	$.ajax({
		type:"GET",//请求类型
		url:"delfile.json",//请求的url
		data:{id:id,flag:'logo'},//请求参数
		dataType:"json",//ajax接口（请求url）返回的数据类型
		success:function(data){//data：返回数据（json对象）
			if(data.result == "success"){
				alert("删除成功！");
				$("#uploadfile").show();
				$("#logoFile").html('');
			}else if(data.result == "failed"){
				alert("删除失败！");
			}
		},
		error:function(data){//当访问时候，404，500 等非200的错误状态码
			alert("请求错误！");
		}
	});  
}

$(function(){  
	//动态加载所属平台列表
	$.ajax({
		type:"GET",//请求类型
		url:"/dev/tadictionarylist.json",//请求的url
		data:{tcode:"APP_FLATFORM"},//请求参数
		dataType:"json",//ajax接口（请求url）返回的数据类型
		success:function(data){//data：返回数据（json对象）
			var fid = $("#fid").val();
			$("#flatformId").html("");
			var options = "<option value=\"\">--请选择--</option>";
			for(var i = 0; i < data.length; i++){
				if(fid != null && fid != undefined && data[i].valueId == fid ){
					options += "<option selected=\"selected\" value=\""+data[i].valueid+"\" >"+data[i].valuename+"</option>";
				}else{
					options += "<option value=\""+data[i].valueid+"\">"+data[i].valuename+"</option>";
				}
			}
			$("#flatformId").html(options);
		},
		error:function(data){//当访问时候，404，500 等非200的错误状态码
			alert("加载平台列表失败！");
		}
	});  
	
	var cl1 = $("#cl1").val();
	var cl2 = $("#cl2").val();
	var cl3 = $("#cl3").val();
	
	$("#back").on("click",function(){
		window.location.href = "list";
	});
	
	
	//LOGO图片---------------------
	var logoPicPath = $("#logoPicPath").val();
	var id = $("#id").val();
	if(logoPicPath == null || logoPicPath == "" ){
		$("#uploadfile").show();
	}else{
		$("#logoFile").append("<p><img src=\""+logoPicPath+"?m="+Math.random()+"\" width=\"100px;\"/> &nbsp;&nbsp;"+
							"<a href=\"javascript:;\" onclick=\"delfile('"+id+"');\">删除</a></p>");
		
	}

});
      
      
      