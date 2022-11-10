package servlet;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import membership.MemberDAO;
import membership.MemberDTO;

public class MemberAuth extends HttpServlet {
	MemberDAO dao;
	
	@Override
	public void init() throws ServletException {
		ServletContext application = this.getServletContext();
		
		String driver = application.getInitParameter("OracleDriver");
		String url = application.getInitParameter("OracleUrl");
		String id = application.getInitParameter("OracleId");
		String pw = application.getInitParameter("OraclePw");
		
		dao = new MemberDAO(driver, url, id, pw);		
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String manager_id = this.getInitParameter("manager_id");
		String id = req.getParameter("id");
		String pass = req.getParameter("pass");
		
		MemberDTO dto = dao.getMemberDTO(id, pass);
		
		String memberName = dto.getName();
		if(memberName != null) {
			req.setAttribute("authMsg", memberName + "회원님 박갑습니다.");
		} else {
			if(manager_id.equals(id)){
				req.setAttribute("authMsg", manager_id+": 관리자입니다.");
			}else {
				req.setAttribute("authMsg", "회원이 아닙니다");
				
			}
		}
		req.getRequestDispatcher("/13Servlet/MemberAuth.jsp").forward(req, resp);
	}
	
	@Override
	public void destroy() {
		dao.close();
	}
}
















