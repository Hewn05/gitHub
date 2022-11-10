<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>내장객체 response</title>
</head>
<body>
<%
	String id = request.getParameter("userID");
	String pw = request.getParameter("userPW");
	if(id.equalsIgnoreCase("user") && pw.equalsIgnoreCase("1234")){
		response.sendRedirect("ResponseOK.jsp");
	}else {
		request.getRequestDispatcher("ResponseMain.jsp?logErr=1").forward(request,response);
	}
%>
</body>
</html>