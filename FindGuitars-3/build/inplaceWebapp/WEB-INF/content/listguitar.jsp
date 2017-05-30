<%@ page contentType="text/html; charset=utf-8" language="java"
	errorPage=""%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

    <meta http-equiv="Cache-Control" content="no-cache" />
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
   
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
	<title>展示吉他</title>
	<link href="css/bootstrap.min.css" rel="stylesheet" />
	<script type="text/javascript" src="js/jquery-2.1.1.min.js"></script>
	<script type="text/javascript" src="js/bootstrap.min.js"></script>

</head>
<body>

<div class="container">
<h3>搜索结果</h3>
	<table class="table col-sm-6 table-bordered table-striped">
		<thead>
			<tr>
				<th>builder</th>
				<th>model</th>
				<th>type</th>
				<th>numstrings</th>
				<th>backwood</th>
				<th>topwood</th>
				<th>price</th>
				<th>delete</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${sessionScope.list }" var="list">
			<c:if test="${empty sessionScope.list }">
			<tr>
				<td>对不起未找到！</td>
				
				
			</tr>
			</c:if>
			
			<c:if test="${not empty sessionScope.list }">
			<tr>
				<td>${list.builder}</td>
				<td>${list.model}</td>
				<td>${list.type}</td>
				<td>${list.numStrings}</td>
				<td>${list.backWood}</td>
				<td>${list.topWood}</td>
				<td>${list.price}</td>
				<td><a href="deleteGuitar?id=${list.id}"  name="${list.id}">delete</a></td>
			</tr>
			</c:if>
			</c:forEach>
		</tbody>
	</table>
</div>
<script>
	$("a").click(function(){
		alert("删除成功！");
		return true;
	})
</script>		


</body>
</html>