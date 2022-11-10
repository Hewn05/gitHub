<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>지시어 error 발생</title>
</head>
<body>
<%
	try{
		int myAge = Integer.parseInt(request.getParameter("age"))+10;
		out.println(myAge);
	}catch(Exception e) {
		out.println("예외처리");
	}
%>
</body>
</html>