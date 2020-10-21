<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Upload File Ajax</title>
	<%@ include file="../include/header.jsp" %>

	<style>
	.fileDropSector {
		width:		800px;
		height:		300px;
		border:		1px dotted black;
	}	
	</style>
</head>
<body>
<%@ include file="../include/topmenu.jsp" %>

<div class="container">
	<h2>Ajax를 이용한 파일 올리기</h2><hr>
	
	<!-- 파일을 업로드할 부분 -->
	<div class="fileDropSector"></div>
	
	<!-- 업로드된 파일의 목록을 보여주는 부분 -->
	<div class="uploadList"></div>
</div>

<script  src="//code.jquery.com/jquery.min.js">
$(function() {
	//드래그의 기본 효과를 못하게 한다.
	//기본효과는 드래그된 곳에 이미지가 보인다.
	$(".fileDropSector").on("dragenter dragover", function(event) {
		event.preventDefault();
	});
	$(".fileDropSector").on("drop", function(event) {
		//drop 이 될 때 기본효과를 막는다.
		event.preventDefault();

		//드래그된 파일들의 정보를 가져온다.
		var files = event.originalEvent.dataTransfer.files;
		//첫번째 첨부파일
		var file = files[0];

		//웹 브라우저에서 F12키를 누르면 어떤 파일인지를 알 수가 있다.
		console.log(file);

		//Ajax로 데이터를 전달할 때는 폼이 존재하지 않기 때문에
		//폼 객체를 만들어주어야 한다.
		var formData = new FormData() //폼 객체를 생성한다.

		//폼에 file변수를 선언하고, 변수에 값을 넣는다.
		formData.append("file", file); 

		//ajax를 통해서 파일을 올린다.
		$.ajax({
			type:			"post",
			url:			"${path}/upload/uploadAjax",
			data:			formData,
			dataType:		"text",
			processData:	false,
			contentType:	false, //=> multipart/form-data로 처리된다.
			success: function(data, status, req) {
					console.log("data:" + data);	//업로드된 파일이름
					console.log("status:" + status); //성공, 실패여부
					console.log("req:" + req.status);//요청코드값

					var str = "";
					if(checkImageType(data)) { //올린 파일이 이미지일 경우
						str="<div><a href='${path}/upload/displayFile?fileName="+getImageLink(data)+"'>";
						str+="<img src='${path}/upload/displayFile?fileName="+data+"'></a>";
					} else { //올린 파일이 이미지가 아닌 경우
						str="<div><a href='${path}/upload/displayFile?fileName=";
						str+=data+"'>" + getOriginalName(data) + "</a>";
					}
					str+="<span data-src=" + data + ">[삭제]</span></div>"
					$(".uploadList").append(str);
				}
				
		});
	});


	function checkImageType(fileType) {
		var pattern = /jpg|png|jpeg|gif|bmp/i; //정규표현식(대소문자는 무시)
		return fileType.match(pattern); //규칙에 포함되어 있으면 true발생
	}
});
</script>



<%@ include file="../include/footer.jsp" %>
</body>
</html>









