<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body>
	<h1>appendChild() method</h1>
	<h2 id="item">JavaScript(Ajax)</h2>
	<div id="list">
		<p>JAVA</p>
		<p>HTML</p>
		<p>JSP</p>
	</div>
	<button onclick="appendNode()">Add Node</button>
	
	<script>
	function appendNode() {
		//아이디가 list인 요소를 선택한다.
		var parent  = document.getElementById("list");
		var newItem = document.getElementById("item");
		//newItem을 list요소의 맨 마지막 자식노드로 추가한다.
		parent.appendChild(newItem);
	}
	</script>
	
</body>
</html>














