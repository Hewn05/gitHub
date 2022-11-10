<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.Collection" %>
<%@ page import = "java.text.SimpleDateFormat" %>
<%
	request.setCharacterEncoding("UTF-8");
	SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm");
	long date = s.parse(request.getParameter("date")).getTime();
	
	java.sql.Date date2 = new java.sql.Date(date);
	System.out.println(date2);
	
	int num =  Integer.parseInt(request.getParameter("number"));
	String str = request.getParameter("string");
	
	response.addDateHeader("mBirthday", date);
	response.addIntHeader("mNumber", num);
	response.addIntHeader("mNumber", 8282);
	response.addHeader("mStr", str);
	response.addHeader("mStr", "홍길동");
	response.setHeader("mStr", "이만기");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>응답 헤더 정보</h2>
	<ul>
	<%
	Collection<String> headerNames = response.getHeaderNames();
	for(String nm : headerNames){
		String val = response.getHeader(nm);	
	%>
		<li><%=nm%> : <%=val%></li>
	<%
	}
	%>
	<h2>number만 출력</h2>
	<%
	Collection<String> mNumbers = response.getHeaders("mNumber");
	for(String mNum : mNumbers){
	%>
		<li>mNumber : <%=mNum%></li>
	<%
	}
	%>
	</ul>
</body>
</html>