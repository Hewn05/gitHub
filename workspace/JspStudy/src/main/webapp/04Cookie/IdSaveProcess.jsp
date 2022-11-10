<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="utils.ManageCookie"%>
<%@ page import="utils.AlertFunc"%>
<%
String user_id = request.getParameter("user_id");
String user_pw = request.getParameter("user_pw");
String save_check = request.getParameter("save_check");

//if("user".equals(user_id) && "1234".equals(user_pw)){
if (user_id.equals("user") && user_pw.equals("1234")) {
	if (save_check != null && save_check.equals("Y")) {
		ManageCookie.makeCookie(response, "loginId", user_id, 86400);
	} else {
		ManageCookie.deleteCookie(response, "loginId");
	}

	AlertFunc.alertLocation("로그인에 성공했습니다.", "IdSaveMain.jsp", out);
} else {
	AlertFunc.alertBack("로그인에 실패했습니다.", out);
}
%>
