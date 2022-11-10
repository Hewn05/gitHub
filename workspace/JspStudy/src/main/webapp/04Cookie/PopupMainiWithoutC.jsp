<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String popupMode = "on";

Cookie[] cookies = request.getCookies();
if(cookies != null){
	for(Cookie ck : cookies){
		String ckName = ck.getName();
		if(ckName.equals("PopupMode")){
			popupMode = ck.getValue();
		}
	}
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>팝업창 관리</title>
<style>
	#popup {
		position:absolute; top:100px; left:50px;
		color:yellow; width:270px; height:100px; background-color:gray
	}
	#popup>div{
		position:relative; background-color:white; top:0px;
		border:1px sollid gray; padding:10px; color:black;
	}
</style>
<script
  src="https://code.jquery.com/jquery-3.6.1.min.js"
  integrity="sha256-o88AwQnZB+VDvE9tvIXrMQaPlFFSUTR+nldQm1LuPXQ="
  crossorigin="anonymous">
</script>
<script>
$(function(){
	$('#closeBtn').click(function(){
		$('#popup').hide();
		var chk = $("#inactiveToday:checked").val();
		if(chk=='1'){
			$.ajax({
				url  : './PopupCookie.jsp',
				type : 'get',
				data : {inactive : chk},
				datatype : 'text',
				success  : function(resData){
					if(resData != '')location.reload();
				}
			})
		}
	})
});
</script>
</head>
<body>
	<h2>팝업 메인 페이지</h2>
	<%
	for(int i = 1;i < 10;i++){
		out.print("popupMode : "+popupMode+"<br/>");
	}
	if(popupMode.equals("on")){
	%>
	<div id = "popup">
		<h2 align = "center">공 지 사 항</h2>
		<div align = "right">
			<form name = "popForm">
				<input type = "checkbox" id = "inactiveToday" value = "1"/>
				하루동안 열지 않기
				<input type = "button" value = "닫기" id = "closeBtn">
			</form>
		</div>
	</div>
	<%
	}	
	%>
</body>
</html>