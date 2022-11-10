<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>      
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL core import</title>
</head>
<body>
	<c:set var="reqVar" value="lee" scope="request" />
	<c:import url="/11JSTL/inc/OtherPage.jsp" var="contents" >
		<c:param name="param1" value="JSP" />
		<c:param name="param2" value="JAVA" />
	</c:import>
	${contents}
	<iframe src="./inc/OuterPage.jsp" style="width:100%;height:600px">	</iframe>
</body>
</html>