package m2board;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import common.JDBConnPool;

public class MBoardDAO extends JDBConnPool{
	public MBoardDAO() {
		super();
	}
	
	public int selectCount(Map<String, Object> map) {
		int totalCount = 0;
		String query = "SELECT COUNT(*) FROM FILEBOARD";
		if (map.get("searchStr") != null)
			query += " WHERE " + map.get("searchType") + " LIKE '%" + map.get("searchStr") + "%'";
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			rs.next();
			totalCount = rs.getInt(1); 
		} catch (SQLException e) {
			System.out.println("게시물 카운트 중 에러");
			e.printStackTrace();
		}
		return totalCount;
	}

	
	public List<MBoardDTO> selectListPage(Map<String, Object> map) {
		List<MBoardDTO> bl = new Vector<MBoardDTO>();
		
		String query = "SELECT * FROM ("
				+ "		SELECT ROWNUM AS PNUM, S.* FROM ("
				+ "			SELECT * FROM FILEBOARD ";
		if (map.get("searchStr") != null)
			query += " WHERE " + map.get("searchType") + " LIKE '%" + map.get("searchStr") + "%'";
		query += " 			ORDER BY IDX DESC "
				+ "		)S"
				+ ")WHERE PNUM BETWEEN ? AND ?";
		
		try {
			psmt = con.prepareStatement(query);
			psmt.setString(1, map.get("start").toString());
			psmt.setString(2, map.get("end").toString());
			rs = psmt.executeQuery();
			
			while (rs.next()) {
				MBoardDTO dto = new MBoardDTO();
				dto.setIdx(rs.getString("idx"));
				dto.setName(rs.getString("name"));
				dto.setTitle(rs.getString("title"));
				dto.setContent(rs.getString("content"));
				dto.setPostdate(rs.getDate("postdate"));
				dto.setOfile(rs.getString("ofile"));
				dto.setNfile(rs.getString("nfile"));
				dto.setDowncount(rs.getInt("downcount"));
				dto.setVisitcount(rs.getInt("visitcount"));
				dto.setPass(rs.getString("pass"));
				bl.add(dto);
			}
		} catch (Exception e) {
			System.out.println("게시물 목록 읽기 중 에러");
			e.printStackTrace();
		}
		return bl;
	}

	public int insertWrite(MBoardDTO dto) {
		int result = 0;
		try {
			String query = "INSERT INTO FILEBOARD(IDX, NAME, TITLE, CONTENT, OFILE, NFILE, PASS)"
					+ "		VALUES (SEQ_BOARD_NUM.NEXTVAL, ?,?,?,?,?,?)";
			psmt = con.prepareStatement(query);
			psmt.setString(1, dto.getName());
			psmt.setString(2, dto.getTitle());
			psmt.setString(3, dto.getContent());
			psmt.setString(4, dto.getOfile());
			psmt.setString(5, dto.getNfile());
			psmt.setString(6, dto.getPass());
			result = psmt.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("게시물 입력 중 예외");
			e.printStackTrace();
		}
		return result;
	}
	
	public void updateVisitCount(String idx) {
		String query = "UPDATE FILEBOARD SET"
				+ "		VISITCOUNT=VISITCOUNT+1"
				+ "		WHERE IDX=?";
		try {
			psmt = con.prepareStatement(query);
			psmt.setString(1, idx);
			psmt.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("게시물 조회수 증가 중 예외");
			e.printStackTrace();
		}
	}
	
	public MBoardDTO selectView(String idx) {
		MBoardDTO dto = new MBoardDTO();
		String query = "SELECT * FROM FILEBOARD WHERE IDX=?";
		try {
			psmt = con.prepareStatement(query);
			psmt.setString(1, idx);
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				dto.setIdx(rs.getString(1));
				dto.setName(rs.getString(2));
				dto.setTitle(rs.getString(3));
				dto.setContent(rs.getString(4));
				dto.setPostdate(rs.getDate(5));
				dto.setOfile(rs.getString(6));
				dto.setNfile(rs.getString(7));
				dto.setDowncount(rs.getInt(8));
				dto.setVisitcount(rs.getInt(9));
				dto.setPass(rs.getString(10));
			}
			
		} catch (Exception e) {
			System.out.println("게시물 상세보기 중 에러");
			e.printStackTrace();
		}
		
		return dto;
	}

	public void downCountPlus(String idx) {
		String query = "UPDATE FILEBOARD SET"
			+ "		DOWNCOUNT=DOWNCOUNT+1"
			+ "		WHERE IDX=?";
		try {
			psmt = con.prepareStatement(query);
			psmt.setString(1, idx);
			psmt.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("게시물 다운로드 수 증가 중 예외");
			e.printStackTrace();
		}		
	}

	public int getDownCount(String idx) {
			int dcount = 0;
			String query = "SELECT DOWNCOUNT FROM FILEBOARD"
					+ "		WHERE IDX=?";
			try {
				psmt = con.prepareStatement(query);
				psmt.setString(1, idx);
				rs = psmt.executeQuery();
				rs.next();
				dcount = rs.getInt(1);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return dcount;
	}

	public boolean confirmPassword(String pass, String idx) {
			boolean isCorr = true;
			String query = "SELECT PASS FROM FILEBOARD"
					+ "		WHERE PASS=? AND IDX=?";
			try {
				psmt = con.prepareStatement(query);
				psmt.setString(1, pass);
				psmt.setString(2, idx);
				rs = psmt.executeQuery();
				rs.next();
				if(rs.getInt(1) == 0)
					isCorr = false;
				
			} catch (Exception e) {
				isCorr = false;
				e.printStackTrace();
			} 			
			return isCorr;
		}

	public int deletePost(String idx) {
		int result = 0;
		try {
			String query = "DELETE FROM FILEBOARD WHERE IDX=?";
			psmt = con.prepareStatement(query);
			psmt.setString(1, idx);
			result = psmt.executeUpdate();			
		} catch (Exception e) {
			System.out.println("게시물 삭제 중 에러");
			e.printStackTrace();
		}				
		return result;
	}
	
	public int updatePost(MBoardDTO dto) {
		int result = 0;
		try {
			String query = "UPDATE FILEBOARD"
					+ "		SET TITLE=?, NAME=?, CONTENT=?, OFILE=?, NFILE=?"
					+ "		WHERE IDX=? AND PASS=?";
			psmt = con.prepareStatement(query);
			psmt.setString(1, dto.getTitle());
			psmt.setString(2, dto.getName());
			psmt.setString(3, dto.getContent());
			psmt.setString(4, dto.getOfile());
			psmt.setString(5, dto.getNfile());
			psmt.setString(6, dto.getIdx());
			psmt.setString(7, dto.getPass());
		
			result = psmt.executeUpdate();
		} catch (Exception e) {
			System.out.println("게시물 수정 중 에러");
			e.printStackTrace();
		}
		
		return result;
	}
}













