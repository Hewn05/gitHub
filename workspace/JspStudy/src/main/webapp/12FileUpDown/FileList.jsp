<%@page import="java.util.*"%>
<%@page import="java.net.URLEncoder"%>
<%@page import="fileUpDown.MyFileDTO"%>
<%@page import="fileUpDown.MyFileDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>File List</title>
</head>
<body>
	<h2>파일 목록 보기</h2>
	<a href="FileUPladMain.jsp">파일 등록</a>
	<%
	MyFileDAO dao = new MyFileDAO();
	String findCol = request.getParameter("findCol");
	String findWord = request.getParameter("findWord");
	Map<String, Object> param = new HashMap<String, Object>();
	List<MyFileDTO> fileList = null;
	if (findWord != null) {
		param.put("findCol", findCol);
		param.put("findWord", findWord);
		fileList = dao.selectList(param);
	} else {
		fileList = dao.myFileList();
	}
	
	dao.close();
	%>
	<form method="get">
		<table border="1" width="90%">
			<tr>
				<td align="center"><select name="findCol">
						<option value="NAME">작성자</option>
						<option value="TITLE">제목</option>
						<option value="CATE">카테고리</option>
				</select> <input type="text" name="findWord" /> <input type="submit"
					value="검색" /></td>
			</tr>
		</table>
	</form>
	<table border="1">
		<tr>
			<th>No</th>
			<th>작성자</th>
			<th>제목</th>
			<th>카테고리</th>
			<th>원본 파일명</th>
			<th>저장된 파일명</th>
			<th>작성일</th>
			<th></th>
		</tr>	
	<% 
	for (MyFileDTO f : fileList)
	{
	%>
		<tr>
			<td><%= f.getIdx() %></td>
			<td><%= f.getName() %></td>
			<td><%= f.getTitle() %></td>
			<td><%= f.getCate() %></td>
			<td><%= f.getOfile() %></td>
			<td><%= f.getNfile() %></td>
			<td><%= f.getRegdate() %></td>
			<td><a href="Download.jsp?oName=<%= URLEncoder.encode(f.getOfile(),"UTF-8")%>
					&nName=<%= URLEncoder.encode(f.getNfile(),"UTF-8")%>">[다운로드]</a></td>
		</tr>
	<%
	}
	%>
	</table>
</body>
</html>















