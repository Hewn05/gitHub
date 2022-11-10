<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
   %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>지시어 error page</title>
</head>
<body>
<%
	int myAge = Integer.parseInt(request.getParameter("age"))+10;
	out.println(myAge);	
%>
</body>
</html>