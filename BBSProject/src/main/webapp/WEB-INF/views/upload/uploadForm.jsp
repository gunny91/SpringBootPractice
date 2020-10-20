<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
		<meta charset="UTF-8">
		<title>upload Form</title>
		<%@ include file ="../include/header.jsp" %>
		<style>
			iframe{
				width: 800px;
				height: 200px;
				boarder: 1px;
				border-style:solid;
			}
		</style>
</head>
<body>
		
		<%@ include file ="../include/topmenu.jsp" %>
			
			<!--  모든 문자를 인코딩하지 않음을 명시함. 이 방식은 <form> 요소가 파일이나 이미지를 서버로 전송할 때 주로 사용함.
			Also enctype is suppose be encoding type for uploading image files -->
			<form action="${path}/upload/uploadForm" method="post" enctype="multipart/form-data" target="iframeTarget">
				<input type="file" name="file"/>
				<input type="submit" value="Upload"/>
			</form>
			<iframe name="iframeTarget"></iframe>
			

		<%@ include file ="../include/footer.jsp" %>
</body>
</html>