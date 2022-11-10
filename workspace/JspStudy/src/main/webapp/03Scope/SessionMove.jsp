<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>이동 후 Session 영역</title>
</head>
<body>
	<h2>이동 후 Session 속성 값</h2>
	<%
	ArrayList<String> lists = (ArrayList<String>)session.getAttribute("lists");
	for(String list:lists) {
		out.print(list+"<br/>");
	}
	%>
</body>
</html>