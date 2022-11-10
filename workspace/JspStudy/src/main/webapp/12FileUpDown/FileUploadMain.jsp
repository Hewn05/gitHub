<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파일업로드</title>
<script>
	function validateForm(form) {
		if(form.name.value == ""){
			alert("작성자를 입력하세요");
			form.name.focus();
			return false;
		}
		if(form.title.value == ""){
			alert("제목을 입력하세요");
			form.title.focus();
			return false;
		}
		if(form.attachedFile.value == ""){
			alert("첨부파일은 필수 입력입니다.");
			return false;
		}
	}		
</script>
</head>
<body>
	<h4>파일업로드</h4>
	<span style="color:red;">${ errMsg }</span>
	<form name="fileForm" method="post" enctype="multipart/form-data" action="UploadProc.jsp" onsubmit="return validateForm(this)">
		작성자:<input type="text" name="name" value="홍길동" /><br/>
		제목 :<input type="text" name="title" /><br/>
		카테고리(선택):
			<input type="checkbox" name="cate" value="사진" checked />사진
			<input type="checkbox" name="cate" value="문서" />문서
			<input type="checkbox" name="cate" value="음악" />음악<br/>
			
		첨부파일:
			<input type="file" name="attachedFile" /><br/>
		<input type="submit" value="확인" />
	</form>
</body>
</html>