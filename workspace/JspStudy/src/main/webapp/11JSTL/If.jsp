<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL core if</title>
</head>
<body>
	
	<c:set var="number" value="100" />
	<c:set var="string" value="JSP" />
	
	<c:if test="${ number mod 2 eq 0 }" var="result" scope="request">
		${ number }는 짝수입니다. <br />
	</c:if>
	result : ${ result } <br />
	
	<c:if test="${ string eq 'JSP' }" var="result2">
		문자열은 Java입니다.<br/>
	</c:if>
	<c:if test="${ result2 }">
		'Java'가 아닙니다.<br/>
	</c:if>
	
	<c:if test="100" var="result3">
		EL이 아닌 정수를 지정하면 false
	</c:if>
	result3 : ${ result3 } <br/>
	
	<c:if test="tRuE" var="result4">
		대소문자 구분 없이 "tRuE"인경우 true <br/>
	</c:if>
	result4 : ${ result4 } <br/>
	
	<c:if test=" ${ true } " var="result5">
		EL 양쪽에 빈 공백은 false<br/>
	</c:if>
	result5 : ${ result5 } <br/>
	
	
	
	
</body>
</html>