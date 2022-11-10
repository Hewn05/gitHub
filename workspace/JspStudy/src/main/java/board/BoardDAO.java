package board;

import java.lang.System.Logger;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;

import javax.servlet.ServletContext;

import common.JDBConnect;

public class BoardDAO extends JDBConnect {
	public BoardDAO(ServletContext application) {
		super(application);
	}

	public int selectCount(Map<String, Object> param) {
		int totalCount = 0;
		String sql = "SELECT COUNT(*) FROM BOARD";
		if (param.get("findWord") != null)
			sql += " WHERE " + param.get("findCol") + " LIKE '%" + param.get("findWord") + "%'";
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			rs.next();
			totalCount = rs.getInt(1);
		} catch (SQLException e) {
			System.out.println("게시물 카운트 중 에러");
			e.printStackTrace();
		}
		return totalCount;
	}

	public List<BoardDTO> selectList(Map<String, Object> param) {
		List<BoardDTO> bl = new Vector<BoardDTO>();
		String sql = "SELECT * FROM BOARD";
		if (param.get("findWord") != null)
			sql += " WHERE " + param.get("findCol") + " LIKE '%" + param.get("findWord") + "%'";
		sql += " ORDER BY NUM DESC ";
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				BoardDTO dto = new BoardDTO();
				dto.setNum(rs.getString("num"));
				dto.setTitle(rs.getString("title"));
				dto.setContent(rs.getString("content"));
				dto.setPostdate(rs.getDate("postdate"));
				dto.setId(rs.getString("id"));
				dto.setVisitcount(rs.getString("visitcount"));
				bl.add(dto);
			}
		} catch (Exception e) {
			System.out.println("게시물 목록 읽기 중 에러");
			e.printStackTrace();
		}
		return bl;
	}
	
	public List<BoardDTO> selectListPage(Map<String, Object> param) {
		List<BoardDTO> bl = new Vector<BoardDTO>();
		
		String sql = "SELECT * FROM ("
				+ "		SELECT ROWNUM AS PNUM, S.* FROM ("
				+ "			SELECT * FROM BOARD ";
		if (param.get("findWord") != null)
			sql += " WHERE " + param.get("findCol") + " LIKE '%" + param.get("findWord") + "%'";
		sql += " ORDER BY NUM DESC "
				+ ")S"
				+ ")WHERE PNUM BETWEEN ? AND ?";
		
		try {
			psmt = con.prepareStatement(sql);
			psmt.setString(1, param.get("start").toString());
			psmt.setString(2, param.get("end").toString());
			rs = psmt.executeQuery();
			
			while (rs.next()) {
				BoardDTO dto = new BoardDTO();
				dto.setNum(rs.getString("num"));
				dto.setTitle(rs.getString("title"));
				dto.setContent(rs.getString("content"));
				dto.setPostdate(rs.getDate("postdate"));
				dto.setId(rs.getString("id"));
				dto.setVisitcount(rs.getString("visitcount"));
				bl.add(dto);
			}
		} catch (Exception e) {
			System.out.println("게시물 목록 읽기 중 에러");
			e.printStackTrace();
		}
		return bl;
	}
	
	public int insertWrite(BoardDTO dto) {
		int res = 0;
		try {
			String sql="INSERT INTO BOARD(NUM,TITLE,CONTENT,ID,VISITCOUNT)"
					 + "VALUES(SEQ_BOARD_NUM.NEXTVAL,?,?,?,0)";
			psmt=con.prepareStatement(sql);
			psmt.setString(1, dto.getTitle());
			psmt.setString(2, dto.getContent());
			psmt.setString(3, dto.getId());
			res = psmt.executeUpdate();
		} catch(Exception e) {
			System.out.println("게시물 입력 중 에러");
			e.printStackTrace();
		}
		return res;
	}
	
	public void updateVisitCount(String num) {
		String sql = "UPDATE BOARD SET VISITCOUNT=VISITCOUNT+1 WHERE NUM=?";
		try {
			psmt = con.prepareStatement(sql);
			psmt.setString(1, num);
			psmt.executeUpdate();	//-=-=-
		} catch (Exception e) {
			System.out.println("게시물 조회수 증가 중 에러");
			e.printStackTrace();
		}
	}
	
	public BoardDTO selectView(String num) {
		BoardDTO dto = new BoardDTO();
		
		String sql = "SELECT B.*,M.NAME FROM MEMBER M INNER JOIN BOARD B ON M.ID=B.ID WHERE NUM=?";

		try {
			psmt = con.prepareStatement(sql);
			psmt.setString(1, num);
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				dto.setNum(rs.getString("NUM"));
				dto.setTitle(rs.getString("TITLE"));
				dto.setContent(rs.getString("CONTENT"));
				dto.setPostdate(rs.getDate("POSTDATE"));
				dto.setId(rs.getString("ID"));
				dto.setVisitcount(rs.getString("VISITCOUNT"));
				dto.setName(rs.getString("NAME"));	
			}
		} catch (Exception e) {
			System.out.println("게시물 상세보기 중 에러");
			e.printStackTrace();
		}		
		
		return dto;
	}
	
	public int deletePost(String num) {
		int res = 0;
		try {
			String sql = "DELETE FROM BOARD WHERE NUM=?";
			psmt = con.prepareStatement(sql);
			psmt.setString(1, num);
			res = psmt.executeUpdate();
		} catch (Exception e) {
			System.out.println("게시물 삭제 중 에러");
			e.printStackTrace();
		}
		return res;
	}
	
	public int updateEdit(BoardDTO dto) {
		int res = 0;
		try {
			String sql = "UPDATE BOARD SET TITLE=?, CONTENT=? WHERE NUM=?";
			psmt = con.prepareStatement(sql);
			psmt.setString(1, dto.getTitle());
			psmt.setString(2, dto.getContent());
			psmt.setString(3, dto.getNum());
			res = psmt.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("게시물 수정 중 에러");
			e.printStackTrace();
		}
		
		return res;
	}
}



















