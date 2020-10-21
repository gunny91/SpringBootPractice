<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
		<meta charset="UTF-8">
		<title>Search for your address</title>
		<%@ include file="../include/header.jsp" %>
</head>
<body>
	<%@ include file="../include/topmenu.jsp" %>
	
	<div class="container">
		<form class="form-horizontal" name="zipForm" method="post">
			<div class="form-group">
				<label class="col-sm2">Post Number</label>
				<div class="col-sm-6">
					<input type="text" class="form-control" name="zipcode" id="zipcode" readonly/>
					<input type="button" class="form-control" onclick="daumZipcode()" value="Search for Post number"/>
				</div>
			</div>
		</form>
	
	</div>
	
	<%@ include file="../include/footer.jsp" %>
	<script src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
	<script>
	function daumZipcode(){
	    new daum.Postcode({
        oncomplete: function(data) {
            // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분입니다.
            // 예제를 참고하여 다양한 활용법을 확인해 보세요.

            var fullAddr = "";
            var subAddr ="";
        }
    }).open();
	}
</script>
	
</body>
</html>