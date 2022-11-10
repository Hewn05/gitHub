<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
pageContext.setAttribute("num1",7);
pageContext.setAttribute("num2","12");
pageContext.setAttribute("nullStr",null);
pageContext.setAttribute("emptyStr","");
pageContext.setAttribute("zeroLeng", new Integer [0]);
pageContext.setAttribute("zeroSize", new ArrayList<String>());
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL 연산자</title>
</head>
<body>
	<h3>empty</h3>
	${empty nullStr}<br/>
	${empty emptyStr}<br/>
	${empty zeroLeng}<br/>
	${empty zeroSize}<br/>
	
	<h3>삼항 연산자</h3>
	num1 > num2 ? "참" : "거짓" =>> ${num1 gt num2? "num1 큼" : "num2 큼" }
	
	<h3>null</h3>
	null+10=${nullStr+10}<br/>
	null String+10 = ${nullStr+10}<br/>
	param.no value > 10 ${param.noVal > 10}
</body>
</html>