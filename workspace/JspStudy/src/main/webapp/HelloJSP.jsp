<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String str1 = "JSP";
	String str2 = "Hello";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello JSP</title>
</head>
<body>
	<h2>우리는 오렌지 태양 아래</h2>
	<p>
		<%out.println(str2+str1+" study!!"); %>
	</p>
</body>
</html>