/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.68
 * Generated at: 2022-11-07 02:04:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.saii;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class juso_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
 
	//request.setCharacterEncoding("UTF-8");  //한글깨지면 주석제거
	//request.setCharacterEncoding("EUC-KR");  //해당시스템의 인코딩타입이 EUC-KR일경우에
	String inputYn = request.getParameter("inputYn"); 
	String roadFullAddr = request.getParameter("roadFullAddr"); 


      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("// opener관련 오류가 발생하는 경우 아래 주석을 해지하고, 사용자의 도메인정보를 입력합니다. (\"주소입력화면 소스\"도 동일하게 적용시켜야 합니다.)\r\n");
      out.write("//document.domain = \"juso.jsp\";\r\n");
      out.write("\r\n");
      out.write("/*\r\n");
      out.write("		모의 해킹 테스트 시 팝업API를 호출하시면 IP가 차단 될 수 있습니다. \r\n");
      out.write("		주소팝업API를 제외하시고 테스트 하시기 바랍니다.\r\n");
      out.write("*/\r\n");
      out.write("\r\n");
      out.write("function init(){\r\n");
      out.write("	var url = location.href;\r\n");
      out.write("	var confmKey = \"devU01TX0FVVEgyMDIyMTEwMzExNTI1NTExMzE4MTU=\";\r\n");
      out.write("	var resultType = \"4\"; // 도로명주소 검색결과 화면 출력내용, 1 : 도로명, 2 : 도로명+지번+상세보기(관련지번, 관할주민센터), 3 : 도로명+상세보기(상세건물명), 4 : 도로명+지번+상세보기(관련지번, 관할주민센터, 상세건물명)\r\n");
      out.write("	var inputYn= \"");
      out.print(inputYn);
      out.write("\";\r\n");
      out.write("	if(inputYn != \"Y\"){\r\n");
      out.write("		document.form.confmKey.value = confmKey;\r\n");
      out.write("		document.form.returnUrl.value = url;\r\n");
      out.write("		document.form.resultType.value = resultType;\r\n");
      out.write("		document.form.action=\"https://business.juso.go.kr/addrlink/addrLinkUrl.do\"; //인터넷망\r\n");
      out.write("		//document.form.action=\"https://business.juso.go.kr/addrlink/addrMobileLinkUrl.do\"; //모바일 웹인 경우, 인터넷망\r\n");
      out.write("		document.form.submit();\r\n");
      out.write("	}else{\r\n");
      out.write("		opener.jusoCallBack(\"");
      out.print(roadFullAddr);
      out.write("\");\r\n");
      out.write("		window.close();\r\n");
      out.write("		}\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("<body onload=\"init();\">\r\n");
      out.write("	<form id=\"form\" name=\"form\" method=\"post\">\r\n");
      out.write("		<input type=\"hidden\" id=\"confmKey\" name=\"confmKey\" value=\"\"/>\r\n");
      out.write("		<input type=\"hidden\" id=\"returnUrl\" name=\"returnUrl\" value=\"\"/>\r\n");
      out.write("		<input type=\"hidden\" id=\"resultType\" name=\"resultType\" value=\"\"/>\r\n");
      out.write("		<!-- 해당시스템의 인코딩타입이 EUC-KR일경우에만 추가 START-->\r\n");
      out.write("		<!-- \r\n");
      out.write("		<input type=\"hidden\" id=\"encodingType\" name=\"encodingType\" value=\"EUC-KR\"/>\r\n");
      out.write("		 -->\r\n");
      out.write("		<!-- 해당시스템의 인코딩타입이 EUC-KR일경우에만 추가 END-->\r\n");
      out.write("	</form>\r\n");
      out.write("\r\n");
      out.write("<!--마우스 커서-->\r\n");
      out.write("<style type=\"text/css\">* {cursor: url(https://ani.cursors-4u.net/symbols/sym-9/sym833.ani), url(https://ani.cursors-4u.net/symbols/sym-9/sym833.png), auto !important;}</style>\r\n");
      out.write("<a href=\"https://www.cursors-4u.com/cursor/2018/02/17/fast-beating-heart.html\" target=\"_blank\" title=\"Fast Beating Heart\"><img src=\"https://cur.cursors-4u.net/cursor.png\" border=\"0\" alt=\"Fast Beating Heart\" style=\"position:absolute; top: 0px; right: 0px;\" /></a>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
