<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "common.Person" %>
<%@ page import = "java.util.ArrayList" %>
<%
ArrayList<String> lists = new ArrayList<String>();
lists.add("목록");
lists.add("모음");
session.setAttribute("lists", lists);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>페이지 이동</h2>
	<a href="SessionMove.jsp">페이지 이동 with Session</a>
	<h2>session 저장</h2>
</body>
</html>