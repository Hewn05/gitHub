<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<table border="1" width="90%">
   <tr>
      <td align="center">
      <% if (session.getAttribute("UserId") == null) { %>
         <a href="../07LogInOutProc/LoginForm.jsp">로그인</a>
      <% } else { %>
         <a href="../07LogInOutProc/Logout.jsp">로그아웃</a>
      <% } %>
      	 <a href="../08Board/List.jsp">게시판</a>
      	 
      	 <a href="../09Paging/List.jsp">게시판(paging)</a>
      	 
      </td>
   </tr>
</table>