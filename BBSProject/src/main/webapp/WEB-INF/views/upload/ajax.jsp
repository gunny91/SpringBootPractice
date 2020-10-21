<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Create the new node</h1>
	<p id="test">Element Node</p>
	<button onclick="createNode()">New Node</button>
	
	<script>
		function createNode(){
			var testNode = document.getElementById("test");
			var newNode = document.createElement("p");
			newNode.innerHTML = "New p element";

			//new p element add testNode

			document.body.insertBefore(newNode,testNode);
		}
	</script>
</body>
</html>