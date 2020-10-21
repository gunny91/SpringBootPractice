<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body>
	<h1>요소 지우기</h1>
	<button onclick="removeN()">요소 노드 제거</button>
	<div id="itemList">
		<p>HTML</p>
		<p id="good">JSP</p>
		<p>JAVA</p>
	</div>	
	
	<script>
	function removeN() {
		var parent = document.getElementById("itemList");
		var child  = document.getElementById("good");
		parent.removeChild(child);
	}
	</script>
</body>
</html>




