<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<%@ include file="../include/header.jsp" %>
</head>
<body>
			<%@ include file="../include/topmenu.jsp" %>
		
			
			<h1>This is test E!</h1>
			<%@ include file="../include/footer.jsp" %>
	<br>
	<font color="red">The Context Path is:<%=request.getContextPath()%></font>
</body>
</html>