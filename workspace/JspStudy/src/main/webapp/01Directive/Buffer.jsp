<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    buffer = "1kb" autoFlush = "false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>지시어 buffer</title>
</head>
<body>
<%
	for(int i = 1;i <= 1000;i++)
		out.println("print repeat" + i);
%>
</body>
</html>