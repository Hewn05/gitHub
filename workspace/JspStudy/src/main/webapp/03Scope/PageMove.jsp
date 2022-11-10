<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "common.Person" %>
<%
pageContext.setAttribute("pInteger", 450);
pageContext.setAttribute("pString", "page area ");
pageContext.setAttribute("pObject", new Person("송지민",30));
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>page 이동</title>
</head>
<body>
	<h2>page 영역 속성값</h2>
	<%
	Object pInt = pageContext.getAttribute("pInteger");
	Object pStr = pageContext.getAttribute("pString");
	Object pObj = pageContext.getAttribute("pObject");
	%>

	<ul>
		<li>숫자 : <%= pInt == null ? "값이 없음" : pInt %></li>
		<li>문자열 : <%= pStr == null ? "값이 없음" : pStr %></li>
		<li>객체 : <%= pObj == null ? "값이 없음" : pObj %></li>
	</ul>
</body>
</html>