<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List</title>
</head>
<body>
<table width="500" cellpadding="0" cellspacing="0" border="1">
	<tr>
		<td>번호</td>
		<td>작성자</td>
		<td>제목</td>
		<td>삭제</td>
	</tr>
	<c:choose>
		<c:when test="${empty list}">
			<tr>
				<td colspan="4" style="text-align:center">게시글이 없 읍 니다</td>
			</tr>
		</c:when>
		<c:otherwise>
			<c:forEach var="dto" items="${list}">
				<tr>
					<td>${dto.id}</td>
					<td>${dto.writer}</td>
					<td><a href="view?id=${dto.id}">${dto.title}</a></td>
					<td><a href="delete?id=${dto.id}">  ☆  </a></td>
				</tr>
			</c:forEach>
		</c:otherwise>
	</c:choose>
</table>
<p><a href="write">작 성</a></p>
</body>
</html>



