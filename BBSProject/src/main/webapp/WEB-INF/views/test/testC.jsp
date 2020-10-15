<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>testC</title>
	<%@ include file="../include/header.jsp" %>
</head>
<body>
		<%@ include file="../include/topmenu.jsp" %>
		
			
			<h1>This is testC!</h1>
			<hr>
			<h2>Product: ${map.product.name}<br>
				Price  : ${map.product.price}
			</h2>
			<%@ include file="../include/footer.jsp" %>
</body>
</html>