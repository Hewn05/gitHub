<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
<%@page import="common.Person"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL core set</title>
</head>
<body>
	<c:set var="aVar" value="200" />
	<c:set var="elVar" value="${aVar mod 7 }" />
	<c:set var="expVar" value="<%= new Date() %>" />
	<c:set var="tagVar">태그 내 설정</c:set>
	
	<h3>변수 출력</h3>
	${pageScope.aVar}<br/>
	${elVar}<br/>
	${expVar}<br/>
	${tagVar}<br/>
	
	<h4>자바빈즈 생성자 사용</h4>
	<c:set var="personVar1" value='<%= new Person("아이참",40) %>' scope="request"/>
	<ul>
		<li>이름 : ${requestScope.personVar1.name }</li>
		<li>나이 : ${personVar1.age }</li>
	</ul>
	
	<h4>자바빈즈 target, property 사용</h4>
	<c:set var="personVar2" value="<%= new Person() %>" scope="request" />
	<c:set target="${personVar2 }" property="name" value="정약용" />
	<c:set target="${personVar2 }" property="age" value="60" />
	<ul>
		<li>이름 : ${personVar2.name }</li>
		<li>나이 : ${requestScope.personVar2.age }</li>
	</ul>
	
	<h4>List</h4>
	<%
	ArrayList<Person> pList = new ArrayList<Person>();
	pList.add(new Person("제임스", 55));
	pList.add(new Person("윌리엄", 60));
	%>
	<c:set var="personList" value="<%=pList %>" scope="request" />;
	<ul>
		<li>이름 : ${requestScope.personlist[0].name }</li>
		<li>나이 : ${personlist[0].age }</li>
	</ul>
	
	<h4>Map</h4>
	<%
	Map<String,Person> pMap = new HashMap<String, Person>();
	pMap.put("personArgs1",new Person("슈퍼맨",65));
	pMap.put("personArgs2",new Person("배트맨",65));	
	%>
	<c:set var="personMap" value="<%=pMap %>" scope="request" />
	
	<ul>
		<li>아이디 : ${requestScope.personMap.personArgs2.name }</li>
		<li>비번 : ${personMap.personArgs2.age }</li>
	</ul>
</body>
</html>























