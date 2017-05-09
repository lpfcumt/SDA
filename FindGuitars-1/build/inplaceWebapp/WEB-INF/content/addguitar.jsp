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
	<script type="text/javascript" src="js/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/jquery-2.1.1.min.js"></script>
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
		      <input style="width:300px" name="numstrings" type="text" class="btn1 form-control" placeholder="Search for...">
		    </div><!-- /input-group -->
		</div><!-- /.col-lg-6 -->
		
		<div class="col-lg-12 ">
		    <div class="input-group">
		      <span class="input-group-btn">
		        <label style="width:100px" class="btn btn2 btn-default" value="TYPE">backwood</label>
		      </span>
		      <input style="width:300px" name="backwood" type="text" class="btn1 form-control" placeholder="Search for...">
		    </div><!-- /input-group -->
		</div><!-- /.col-lg-6 -->
		<div class="col-lg-12 ">
		    <div class="input-group">
		      <span class="input-group-btn">
		        <label style="width:100px" class="btn btn2 btn-default" value="TYPE">topwood</label>
		      </span>
		      <input style="width:300px" name="topwood" type="text" class="btn1 form-control" placeholder="Search for...">
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
		
</div>
</form>

</body>
</html>