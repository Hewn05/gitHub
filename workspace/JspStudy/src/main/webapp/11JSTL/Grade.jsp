<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>성적평가</title>
</head>
<body>
	<h4>국어/영어/수학 점수를 입력하면 평균을 내어 학점 출력</h4>
	<form>
		<fieldset>
			<legend>학점평가</legend>
			<label>국어</label>
			<input type="number" name="kor" min="0" max="100" />점<br/>
			<label>영어</label>
			<input type="number" name="eng" min="0" max="100" />점<br/>
			<label>수학</label>
			<input type="number" name="math" min="0" max="100" />점<br/>
			<input type="submit" value="학점 구하기" />
		</fieldset>	
	</form>
	<c:if test="${not (empty param.kor or empty param.eng or empty param.math) }">
		<c:set var="avg" value="${ (param.kor + param.eng + param.math)/3 }"/>
		평균 : ${ avg } ||
		<c:choose>
			<c:when test="${ avg ge 90 }">
				학점 : A
			</c:when>
			<c:when test="${ avg ge 80 }">
				학점 : B
			</c:when>
			<c:when test="${ avg ge 70 }">
				학점 : C
			</c:when>
			<c:when test="${ avg ge 60 }">
				학점 : D
			</c:when>
			<c:otherwise>
				학점 : F
			</c:otherwise>
		</c:choose>
	</c:if>
</body>
</html>
