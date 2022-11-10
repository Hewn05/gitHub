<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.Enumeration" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>내장 객체 request</title>
</head>
<body>
	<h2>요청 헤더 정보</h2>
<%
	Enumeration headers = request.getHeaderNames();
	while(headers.hasMoreElements()){
		String headerName = (String)headers.nextElement();
		String headerValue = request.getHeader(headerName);
		out.println(headerName + "\t:\t" + headerValue + "<br/>");
	}
%>
	<p>바로 실행하면 정보 미출력</p>
</body>
</html>