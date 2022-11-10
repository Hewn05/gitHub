<%@page import="utils.PagingUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="board.BoardDAO" %>
<%@ page import="board.BoardDTO" %>
<%@ page import = "java.util.List" %>
<%@ page import = "java.util.Map" %>
<%@ page import = "java.util.HashMap" %>
<% 
   BoardDAO dao = new BoardDAO(application);
   
   String findCol = request.getParameter("findCol");
   String findWord = request.getParameter("findWord");
   Map<String,Object> param = new HashMap<String,Object>();
   if(findWord!=null) {
      param.put("findCol",findCol);
      param.put("findWord",findWord);
   }
   int totalCount = dao.selectCount(param);
   
   int pageSize = Integer.parseInt(application.getInitParameter("PAGE_SIZE"));
   int pageBlock = Integer.parseInt(application.getInitParameter("PAGING_BLOCK"));
   int totalPage = (int)Math.ceil((double)totalCount/pageSize);
   
   int pageNum = 1;
   String pageTemp = request.getParameter("pageNum");
   if(pageTemp!=null && !pageTemp.equals("")){
      pageNum = Integer.parseInt(pageTemp);
   }
   int start = (pageNum-1)*pageSize+1;
   int end = pageNum*pageSize; 
   param.put("start",start);
   param.put("end",end);
   
   List<BoardDTO> boardLists = dao.selectListPage(param);
   dao.close();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
</head>
<body>
   <jsp:include page = "../Common/Top.jsp" />
   <h2> 목록 보기 </h2>
   <h4>전체 <%=totalPage%>페이지 중 <%=pageNum %>페이지 </h4>
   <!-- 검색 -->
   <form method="get">
      <table border = "1" width="90%">
         <tr>
            <td align="center">
               <select name="findCol">
                  <option value="title">제목</option>
                  <option value="content">내용</option>
               </select>
               <input type="text" name="findWord"/>
               <input type="submit" value="검색"/>
            </td>
         </tr>
      </table>
   </form>
   <!-- 목록 -->
   <table border = "1" width="90%">
      <tr>
         <th>번호</th>
         <th>제목</th>
         <th>작성자</th>
         <th>조회수</th>
         <th>작성일</th>
      </tr>
<%
if(boardLists.isEmpty()){   //게시물이 없는 경우
%>
      <tr>
         <td colspan = "5" align="center"> 등록된 게시물이 없습니다.</td>
      </tr>
<%
}else{  //게시물이 있는 경우
   int vNum=0;
   int count=0;
   for(BoardDTO dto:boardLists) {
      vNum=totalCount-(((pageNum-1)*pageSize)+count++);
%>
   <tr align = "center">
      <td align="center"><%=vNum %></td>
      <td align="left">
         <a href="View.jsp?num=<%=dto.getNum() %>"><%=dto.getTitle() %></a>
      </td>
      <td align="center"><%=dto.getId() %></td>
      <td align="center"><%=dto.getVisitcount() %></td>
      <td align="center"><%=dto.getPostdate() %></td>
   </tr>
<%
   }
}
%>
   </table>
   <table border="1" width="90%">
      <tr align="center">
         <td>
            <%=PagingUtil.pagingTest(totalCount,pageSize,pageBlock,pageNum,request.getRequestURI(),param) %>
         </td>
      </tr>
   </table><br/>
   <div align="center">
      <button type="button" onclick="location.href='Write.jsp';">글쓰기</button>   
   </div>
</body>
</html>