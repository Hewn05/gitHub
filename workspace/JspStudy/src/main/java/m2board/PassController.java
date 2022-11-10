package m2board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fileUpDown.FileUtil;
import utils.AlertFunc;

@WebServlet("/m2board/pass.do")
public class PassController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("mode", req.getParameter("mode"));
		req.getRequestDispatcher("/14M2Board/Pass.jsp").forward(req, resp);	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String idx = req.getParameter("idx");
		String mode = req.getParameter("mode");
		String pass = req.getParameter("pass");
		
		MBoardDAO dao = new MBoardDAO();
		boolean confirmed = dao.confirmPassword(pass,idx);
		dao.close();
		
		if(confirmed) {
			if(mode.equals("edit")) {
				HttpSession session = req.getSession();
				session.setAttribute("pass", pass);
				resp.sendRedirect("../m2board/edit.do?idx=" + idx);
			} else if(mode.equals("delete")) {
				dao = new MBoardDAO();
				MBoardDTO dto = dao.selectView(idx);
				int result = dao.deletePost(idx);
				dao.close();
				if (result == 1) {
					String saveFileName = dto.getNfile();
					FileUtil.deleteFile(req, "/Storage", saveFileName);
				}
				AlertFunc.alertLocation(resp, "삭제되었습니다.", "../m2board/list.do");
			}
		} else {
			AlertFunc.alertBack(resp, "비밀번호 검증에 실패했습니다.");
		}
	}
}
