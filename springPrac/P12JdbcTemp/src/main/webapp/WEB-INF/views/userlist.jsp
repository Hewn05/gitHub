<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html ; charset=UTF-8">
<title>jdbc</title>
</head>
<body>
<%
	out.println("JdbcTemplate");
%>
<br/>
<c:forEach var="dto" items="${users}">
	${dto.id} / ${dto.pw}
</c:forEach>
</body>
</html>