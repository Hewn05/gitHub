<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>      
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL core redirect</title>
</head>
<body>
	<c:set var="reqVar" value="lee" scope="request" />
	<c:redirect url="/11JSTL/inc/OtherPage.jsp;?param1=carrot&param2=dangeun">
		<c:param name="param1" value="orange" />
		<c:param name="param2" value="lemon" />
	</c:redirect>
</body>
</html>