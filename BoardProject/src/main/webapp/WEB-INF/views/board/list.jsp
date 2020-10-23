<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List All</title>
	<%@ include file="../include/header.jsp" %>
</head>
<body>
	<%@ include file="../include/topmenu.jsp" %>
	<table class="table talbe-boardered table-striped table-hover">
		<thead>
			<tr>
				<td>Number</td>
				<td>Title</td>
				<td>Writer</td>
				<td>Date</td>
				<td>View Count</td>																								
			</tr>
		</thead>
		
		<c:forEach items="${list }" var="list">
        <tr>
            <td>${list.b_no }</td>
            <td><a href="/board/view?b_no=${list.b_no}">${list.b_title }</a></td>
            <td>${list.b_writer }</td>
            <td><fmt:formatDate pattern="yyyy-MM-dd HH:mm" value="${list.b_date }" /> </td>
            <td><span> ${list.b_count }</span> </td>
        </tr>
    </c:forEach>
	</table>
	
	<%@ include file="../include/footer.jsp" %>
</body>
</html>