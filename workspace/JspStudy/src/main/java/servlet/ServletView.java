package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletView extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter writer = resp.getWriter();
		
		writer.println("<html>");
		writer.println("<head><title>서블릿 뷰</title></head>");
		writer.println("<body>");
		writer.println("<h2>서블릿에서 직접 출력 get방식</h2>");
		writer.println("<p>JSP를 거치지 않음</p>");
		writer.println("</body>");
		writer.println("</html>");
		
		writer.close();
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter writer = resp.getWriter();
		
		writer.println("<html>");
		writer.println("<head><title>서블릿 뷰</title></head>");
		writer.println("<body>");
		writer.println("<h2>서블릿에서 직접 출력 post방식</h2>");
		writer.println("<p>JSP를 거치지 않음</p>");
		writer.println("</body>");
		writer.println("</html>");
		
		writer.close();
	}
}

