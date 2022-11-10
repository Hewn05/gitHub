<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="common.Person"%>
<%@page import="java.util.LinkedList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL core forEach</title>
</head>
<body>
	<h4>일반 for문</h4>
	<c:forEach var="i" begin="1" end="3" step="1">
		<p>반복 ${i}</p>
	</c:forEach>
	
	<h4>반복문 속성</h4>
	<table border="1">
	<c:forEach var="i" begin="3" end="7" varStatus="loop">
		<tr>
			<td>count:${loop.count}</td>
			<td>index:${loop.index}</td>
			<td>current:${loop.current}</td>
			<td>first:${loop.first}</td>
			<td>last:${loop.last}</td>
			<td>i:${i}</td>
		</tr>
	</c:forEach>
	</table>
	
	<h4>1~100까지 정수의 합</h4>
	<c:forEach var="i" begin="1" end="100">
		<c:set var="sum" value="${sum + i }" />
		<c:choose>
			<c:when test="${ i mod 2 eq 0 }">
				<c:set var="even" value="${even + i }" />
			</c:when>
			<c:otherwise>
				<c:set var="odd" value="${odd + i }" />
			</c:otherwise>
		</c:choose>
	</c:forEach>
	합계 : ${ sum } || 짝수 합 : ${ even } || 홀수 합 : ${ odd }<br/>	
	
	<h4>enhanced for문</h4>
	<%
	String[] rainbow={"red","orange","yellow","green","blue","navy","purple"};
	%>	
	<c:forEach items="<%=rainbow %>" var="color" varStatus="loop">
		<span style="color:${color};">${color}</span>
	</c:forEach>	
	
	<h4>반복문 속성</h4>
	<table border="1">
	<c:forEach items="<%=rainbow %>" var="color" varStatus="loop">
		<tr>
			<td>count:${loop.count}</td>
			<td>index:${loop.index}</td>
			<td>current:${loop.current}</td>
			<td>first:${loop.first}</td>
			<td>last:${loop.last}</td>
			<td>color:${color}</td>
		</tr>
	</c:forEach>
	</table>
	
	<h2>List</h2>
	<%
	LinkedList<Person> llist = new LinkedList<Person>();
	llist.add(new Person("이성계",60));
	llist.add(new Person("이방원",45));
	llist.add(new Person("이방덕",50));
	%>
	<c:set var="lists" value="<%=llist %>" />
	<c:forEach items="${lists}" var="list">
		<p>이름 : ${list.name} || 나이 : ${list.age}</p>
	</c:forEach>
	
	
	<h4>Map</h4>
	<%
	Map<String, Person> maps = new HashMap<String, Person>();
	maps.put("1st",new Person("동동일", 60));
	maps.put("2nd",new Person("동동이", 58));
	maps.put("3rd",new Person("동동삼", 54));
	%>
	<c:set var="maps" value="<%=maps %>" />
	<c:forEach items="${ maps }" var="map">
		<li>Key => ${ map.key }
			Value => 이름 : ${ map.value.name }, 나이 : ${ map.value.age} </li>	
	</c:forEach>
	
</body>
</html>

















