<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
</head>
<body>
Member 화녕행 !!!!
<%-- 
<c:if test="${not empty pageContext.request.userPrincipal}">
	<p>is Log-In</p>
</c:if>

<c:if test="${empty pageContext.request.userPrincipal}">
	<p>is Log-Out</p>
</c:if>

USER ID : ${pageContext.request.userPrincipal.name}<br/> --%>

<sec:authorize access="isAuthenticated()">
	<p> is Log-in </p>
</sec:authorize>
<sec:authorize access="!isAuthenticated()">
	<p>is Log-Out</p>
</sec:authorize>
USER ID : <sec:authentication property="name" /><br/>
<a href="/logout">Log Out</a> <br/>
<sec:authorize access="hasAnyRole('ROLE_ADMIN','ROLE_USER')">
관리자 혹은 유저
</sec:authorize>
<sec:authorize access="hasRole('ROLE_ADMIN')">
관리자
</sec:authorize>
<sec:authorize access="hasRole('ROLE_USER')">
유저
</sec:authorize>
</body>
</html>