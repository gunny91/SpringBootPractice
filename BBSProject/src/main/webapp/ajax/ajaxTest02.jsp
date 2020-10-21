<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body>
	<h1>새로운 요소 노드를 생성한다.</h1>
	<p id="test">이 요소앞에 새로운 노드를 생성할 예정입니다.</p>
	<button onclick="createNode()">새로운 노드 생성</button>
	
	<script>
	function createNode() {
		var testNode = document.getElementById("test");
		var newNode  = document.createElement("p"); //새로운 <p>요소를 생성
		newNode.innerHTML = "새로운 p요소입니다.";

		//새로운 p요소를 testNode앞에 추가한다.
		document.body.insertBefore(newNode, testNode);
	}
	</script>
</body>
</html>




