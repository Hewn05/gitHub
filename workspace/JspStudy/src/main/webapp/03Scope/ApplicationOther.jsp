<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "common.Person" %>
<%@ page import = "java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Application 영역 속성 값</title>
</head>
<body>
	<h2>application 속성</h2>
	<%
	Map<String, Person> maps = (Map<String, Person>)application.getAttribute("maps");
	Set<String> keys = maps.keySet();
	for(String key:keys){
		Person ps = maps.get(key);
		out.print(String.format("이름: %s, 나이: %d<br/>",ps.getName(), ps.getAge()));
	}
	%>
</body>
</html>