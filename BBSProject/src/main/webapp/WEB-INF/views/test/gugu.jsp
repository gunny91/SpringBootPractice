<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>GUGU</title>
	<%@ include file="../include/header.jsp" %>
</head>
<body>

	<%@ include file="../include/topmenu.jsp" %>
	<div class="container">
		<h2>The Result is... </h2>
		${result} 
	</div>
	
	<%@ include file="../include/footer.jsp" %>
	
</body>
</html>