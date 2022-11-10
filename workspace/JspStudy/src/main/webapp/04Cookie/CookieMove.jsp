<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>cookie 확인</title>
</head>
<body>
	<h2>쿠키 값 확인</h2>
	<%
	Cookie[] cookies = request.getCookies();			// 요청 헤더 쿠키 얻기
	if(cookies != null){
		for(Cookie ck:cookies){
			String ckName = ck.getName();
			String ckVal = ck.getValue();
			out.println(String.format("%s : %s<br/>",ckName, ckVal));
		}
	}
	%>
</body>
</html>