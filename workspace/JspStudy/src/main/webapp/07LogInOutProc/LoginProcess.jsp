<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "membership.MemberDTO" %>
<%@ page import = "membership.MemberDAO" %>
<%
   String userId = request.getParameter("user_Id");
   String userPwd = request.getParameter("user_pw");
   
   String oracleDriver = application.getInitParameter("OracleDriver");
   String oracleUrl = application.getInitParameter("OracleUrl");
   String oracleId = application.getInitParameter("OracleId");
   String oraclePw = application.getInitParameter("OraclePw");
   MemberDAO dao = new MemberDAO(oracleDriver, oracleUrl, oracleId, oraclePw);
   MemberDTO memberDTO = dao.getMemberDTO(userId, userPwd);
   dao.close();
   
if(memberDTO.getId() != null) {
   //session.setAttribute(이름,값) =세션에 값 저장하기
   session.setAttribute("UserId",memberDTO.getId());  
   session.setAttribute("UserName",memberDTO.getName());
   response.sendRedirect("LoginForm.jsp");
}
else{
   request.setAttribute("LoginErrMsg", "로그인 오류입니다.");
   request.getRequestDispatcher("LoginForm.jsp").forward(request, response);
}   
%>