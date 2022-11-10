<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL formatting</title>
</head>
<body>
	<c:set var="number1" value="12345" />
	콤마 O :
	<fmt:formatNumber value="${ number1 }" />
	<br /> 콤마 X :
	<fmt:formatNumber value="${ number1 }" groupingUsed="false" />
	<br />
	<fmt:formatNumber value="${ number1 }" type="currency" var="printNum1"
		currencySymbol="$" />
	통화기호 : ${ printNum1 }
	<br />
	<fmt:formatNumber value="0.03" type="percent" var="printNum2" />
	퍼센트 : ${ printNum2 }
	<br />

	<fmt:formatNumber value="132165189443.456" pattern="#,#00.00" />
	<br />

	<c:set var="number2" value="6,789.01" />
	<fmt:parseNumber value="${ number2 }" pattern="00,000.00"
		var="printNum3" />
	소수점 : ${ printNum3 }
	<br />
	<fmt:parseNumber value="${ number2 }" integerOnly="true"
		var="printNum4" />
	정수부분 : ${ printNum4 }
	<br />

	<c:set var="today" value="<%=new java.util.Date()%>" />

	<h4>날짜 포맷</h4>
	full :
	<fmt:formatDate value="${ today }" type="date" dateStyle="full" />
	<br /> short :
	<fmt:formatDate value="${ today }" type="date" dateStyle="short" />
	<br /> long :
	<fmt:formatDate value="${ today }" type="date" dateStyle="long" />
	<br /> default :
	<fmt:formatDate value="${ today }" type="date" dateStyle="default" />
	<br />

	<h4>시간 포맷</h4>
	full :
	<fmt:formatDate value="${ today }" type="time" timeStyle="full" />
	<br /> short :
	<fmt:formatDate value="${ today }" type="time" timeStyle="short" />
	<br /> long :
	<fmt:formatDate value="${ today }" type="time" timeStyle="long" />
	<br /> default :
	<fmt:formatDate value="${ today }" type="time" timeStyle="default" />
	<br />

	<h4>날짜/시간 표시</h4>
	<fmt:formatDate value="${ today }" type="both" dateStyle="full"
		timeStyle="full" />
	<br />
	<fmt:formatDate value="${ today }" type="both"
		pattern="yyyy-MM-dd hh:mm:ss" />
	<br />

	<h4>타임존 설정</h4>
	<fmt:timeZone value="GMT">
		<fmt:formatDate value="${ today }" type="both" dateStyle="full"
			timeStyle="full" />
		<br />
	</fmt:timeZone>
	<fmt:timeZone value="America/Chicago">
		<fmt:formatDate value="${ today }" type="both" dateStyle="full"
			timeStyle="full" />
	</fmt:timeZone>

	<h4>locale 설정</h4>

	한국 :
	<fmt:setLocale value="ko_KR" />
	<fmt:formatNumber value="10000" type="currency" />
	/
	<fmt:formatDate value="${ today }" />
	<br /> 일본 :
	<fmt:setLocale value="ja_JP" />
	<fmt:formatNumber value="10000" type="currency" />
	/
	<fmt:formatDate value="${ today }" />
	<br /> 영어 :
	<fmt:setLocale value="en_US" />
	<fmt:formatNumber value="10000" type="currency" />
	/
	<fmt:formatDate value="${ today }" />
	<br />



</body>
</html>