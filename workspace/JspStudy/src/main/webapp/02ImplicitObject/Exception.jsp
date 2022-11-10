<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>내장객체 exception</title>
</head>
<body>
<%
int status = response.getStatus();

if(status == 404){
	out.print("404 NOT FOUND");
	out.print("<br/>파일 경로 확인");
}else if(status == 405){
	out.print("405 METHOD NOT ALLOWED");
	out.print("<br/>요청 방식 확인");
}else if(status == 500){
	out.print("500 INTERNAL SERVER ERROR");
	out.print("<br/>소스 코드 확인");
}

%>
</body>
</html>