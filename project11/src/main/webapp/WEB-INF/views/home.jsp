<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<html>
<head>
	<title>Home</title>
</head>
<body>

	<table>
			<thead>
				<tr>
					<th>ID</th>
					<th>PW</th>
					<th>Name</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="member" items="${memberList}" >
				<tr>
					<td>${member.id}</td>
					<td>${member.passwd}</td>
					<td>${member.name}</td>
				</tr>
				</c:forEach>
			
			</tbody>
	</table>

</body>
</html>
