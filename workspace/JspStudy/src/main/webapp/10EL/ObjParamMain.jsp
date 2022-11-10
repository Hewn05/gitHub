<%@page import="common.Person"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	request.setAttribute("personObj", new Person("이성계",60));
	request.setAttribute("stringObj", "문자열문자열하나문자열둘");
	request.setAttribute("integerObj", new Integer(101112));
%>
<jsp:forward page="ObjParamResult.jsp">
	<jsp:param value="100" name="back"/>
	<jsp:param value="200" name="leeback"/>
</jsp:forward>
</body>
</html>