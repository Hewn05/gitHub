<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>내장객체 request</title>
</head>
<body>
<%
	request.setCharacterEncoding("UTF-8");
	String id = request.getParameter("id");
	String gender = request.getParameter("gender");
	String [] inter = request.getParameterValues("inter");
	String interS = "";
	if(inter != null)
		for(String str:inter)
			interS += str +" ";
	String intro = request.getParameter("intro").replace("\r\n","<br/>");
%>	
	<ul>
		<li>아이디:<%=id %></li>
		<li>성별:<%=gender %></li>
		<li>관심사:<%=interS %></li>
		<li>자기소개:<%=intro %></li>
	</ul>
</body>
</html>