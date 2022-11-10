<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!	// 선언부 메소드
	public int add(int num1, int num2){
		return num1+num2;
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Script Element</title>
</head>
<body>
<%	// Scriptlet 스크립틀릿
	int result = add(10,30);
%>
덧셈1 : <%= result%> <br>
덧셈2 : <%= add(20,50)%>
</body>
</html>