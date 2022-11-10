 <%@page import="utils.AlertFunc"%>
<%@page import="java.io.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
String saveDirectory = application.getRealPath("/Storage");
String saveFilename = request.getParameter("nName").trim();
String originalFilename = request.getParameter("oName").trim();

try{
	File file = new File(saveDirectory, saveFilename);
	InputStream inStream = new FileInputStream(file);
	
	String client = request.getHeader("User-Agent");
	if(client.indexOf("WOW64") == -1) {
		originalFilename = new String(originalFilename.getBytes("UTF-8"),"ISO-8859-1");
	} else {
		originalFilename = new String(originalFilename.getBytes("KSC5601"),"ISO-8859-1");
	}
	
	response.reset();
	response.setContentType("application/octet-stream");
	response.setHeader("Content-Disposition","attachment; filename=\"" + originalFilename + "\"");
	response.setHeader("Content-Length", "" + file.length());
	
	out.clear();
	out = pageContext.pushBody();
	
	OutputStream outStream = response.getOutputStream();
	
	byte b[] = new byte[(int)file.length()];
	int readBuffer = 0;
	while( (readBuffer = inStream.read(b)) > 0 ) {
		outStream.write(b,0,readBuffer);
	}
	
	inStream.close();
	outStream.close();
	
}catch(FileNotFoundException e) {
	AlertFunc.alertBack("파일을 찾을 수 없습니다.", out);
}catch(Exception e){
	AlertFunc.alertBack("예외가 발생하였습니다.", out);
}
%>