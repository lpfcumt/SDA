<%@ page contentType="text/html; charset=utf-8" language="java"
	errorPage=""%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

    <meta http-equiv="Cache-Control" content="no-cache" />
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
   
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
	<title>添加吉他</title>
	<link href="css/bootstrap.min.css" rel="stylesheet" />
	<script type="text/javascript" src="js/jquery-2.1.1.min.js"></script>
	<link rel="stylesheet" type="text/css" href="css/xcConfirm.css"/>
	<script src="js/xcConfirm.js" type="text/javascript" charset="utf-8"></script>
	<style type="text/css">
			.sgBtn{width: 135px; height: 35px; line-height: 35px; margin-left: 10px; margin-top: 10px; text-align: center; background-color: #0095D9; color: #FFFFFF; float: left; border-radius: 5px;}
		</style>
	
	<script type="text/javascript" src="js/bootstrap.min.js"></script>
	
	
	
</head>
<body>
<form action="addGuitar" method="post">
<div class="container">
	<div class="col-lg-12"><h3>添加吉他</h3></div>
		<div class="col-lg-12 " >
		    <div class="input-group">
		      <span class="input-group-btn">
		        <label style="width:100px" class="btn btn2 btn-default" value="TYPE">builder</label>
		      </span>
		      <input style="width:300px" name="builder" type="text" class="btn1 form-control" placeholder="Search for...">
		    </div><!-- /input-group -->
		</div><!-- /.col-lg-12 -->
	    <div class="col-lg-12" >
		    <div class="input-group">
		      <span class="input-group-btn">
		        <label style="width:100px"  class="btn btn2 btn-default" type="button">model</label>
		      </span>
		      <input style="width:300px" name="model" type="text" class=" btn1 form-control" placeholder="Search for...">
		    </div><!-- /input-group -->
		</div><!-- /.col-lg-6 -->
		<div class="col-lg-12 " >
		    <div class="input-group">
		      <span class="input-group-btn">
		        <label style="width:100px" class="btn btn2 btn-default" value="type">TYPE</label>
		      </span>
		      <input style="width:300px" name="type" type="text" class="btn1 form-control" placeholder="Search for...">
		    </div><!-- /input-group -->
		</div>
		<div class="col-lg-12 " >
		    <div class="input-group">
		      <span class="input-group-btn">
		        <label style="width:100px" class="btn btn2 btn-default" value="TYPE">numstrings</label>
		      </span>
		      <input style="width:300px" name="numStrings" type="text" class="btn1 form-control" placeholder="Search for...">
		    </div><!-- /input-group -->
		</div><!-- /.col-lg-6 -->
		
		<div class="col-lg-12 ">
		    <div class="input-group">
		      <span class="input-group-btn">
		        <label style="width:100px" class="btn btn2 btn-default" value="TYPE">backwood</label>
		      </span>
		      <input style="width:300px" name="backWood" type="text" class="btn1 form-control" placeholder="Search for...">
		    </div><!-- /input-group -->
		</div><!-- /.col-lg-6 -->
		<div class="col-lg-12 ">
		    <div class="input-group">
		      <span class="input-group-btn">
		        <label style="width:100px" class="btn btn2 btn-default" value="TYPE">topwood</label>
		      </span>
		      <input style="width:300px" name="topWood" type="text" class="btn1 form-control" placeholder="Search for...">
		    </div><!-- /input-group -->
		</div><!-- /.col-lg-6 -->
		<div class="col-lg-12 ">
		    <div class="input-group">
		      <span class="input-group-btn">
		        <label style="width:100px" class="btn btn2 btn-default" value="TYPE">price</label>
		      </span>
		      <input style="width:300px" name="price" type="text" class="btn1 form-control" placeholder="Search for...">
		    </div><!-- /input-group -->
		</div><!-- /.col-lg-6 -->
		<br>
		<div class="col-lg-12 ">
		    
		      <input style="width:300px"  type="submit" class="btn-default"  value="添加">
		   
		</div><!-- /.col-lg-6 -->
		<input style="width:300px" id="a" type="button"  value="测试" >
		<a id="a1" >测试</a>
</div>
</form>
<div class="" style="height: 768px;">
			<div class="sgBtn" id="btn1">弹窗1(信息)</div>
			<div class="sgBtn" id="btn2">弹窗2(提示)</div>
			<div class="sgBtn" id="btn3">弹窗3(警告)</div>
			<div class="sgBtn" id="btn4">弹窗4(错误)</div>
			<div class="sgBtn" id="btn5">弹窗5(成功)</div>
			<div class="sgBtn" id="btn6">弹窗6(输入框)</div>
			<div class="sgBtn" id="btn7">弹窗7(自定义)</div>
			<div class="sgBtn" id="btn8">弹窗8(默认)</div>
		</div>

<script type="text/javascript">
			$(function(){
				
				$("#btn1").click(function(){
					var txt=  "提示文字，提示文字，提示文字，提示文字，提示文字，提示文字";
					window.wxc.xcConfirm(txt, window.wxc.xcConfirm.typeEnum.info);
				});
				
				$("#btn2").click(function(){
					var txt=  "提示文字，提示文字，提示文字，提示文字，提示文字，提示文字";
					window.wxc.xcConfirm(txt, window.wxc.xcConfirm.typeEnum.confirm);

				});
				
				$("#btn3").click(function(){
					var txt=  "提示文字，提示文字，提示文字，提示文字，提示文字，提示文字";
					window.wxc.xcConfirm(txt, window.wxc.xcConfirm.typeEnum.warning);
				});
				
				$("#btn4").click(function(){
					var txt=  "提示文字，提示文字，提示文字，提示文字，提示文字，提示文字";
					window.wxc.xcConfirm(txt, window.wxc.xcConfirm.typeEnum.error);
				});
				
				$("#btn5").click(function(){
					var txt=  "提示文字，提示文字，提示文字，提示文字，提示文字，提示文字";
					window.wxc.xcConfirm(txt, window.wxc.xcConfirm.typeEnum.success);
				});
				
				$("#btn6").click(function(){
					var txt=  "请输入";
					window.wxc.xcConfirm(txt, window.wxc.xcConfirm.typeEnum.input,{
						onOk:function(v){
							console.log(v);
						}
					});
				});
				
				$("#btn7").click(function(){
					var txt=  "确的要删除该吉他吗？";
					var option = {
						title: "确认删除",
						btn: parseInt("0011",2),
						onOk: function(){
							console.log("确认啦");
							alert("12313");
						}
					
					}
					window.wxc.xcConfirm(txt, "custom", option);
				});
				
				$("#btn8").click(function(){
					var txt=  "默认";
					window.wxc.xcConfirm(txt);
				});
			});
		</script>
<script>

		$("#a").click(function(){
			  if(confirm("是否继续")){
				  $("#a1").fadeOut(500);
			   }
			
			
		})
	
	
</script>
</body>
</html>