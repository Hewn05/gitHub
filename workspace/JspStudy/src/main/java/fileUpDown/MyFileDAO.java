package fileUpDown;

import java.util.List;
import java.util.Map;
import java.util.Vector;

import common.JDBConnPool;

public class MyFileDAO extends JDBConnPool {
	
	public List<MyFileDTO> selectList(Map<String, Object> param) {
		List<MyFileDTO> bl = new Vector<MyFileDTO>();
		String sql = "SELECT * FROM MYFILES";
		if (param.get("findWord") != null)
			sql += " WHERE " + param.get("findCol") + " LIKE '%" + param.get("findWord") + "%'";
		sql += " ORDER BY REGDATE DESC ";
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				MyFileDTO dto = new MyFileDTO();
				dto.setIdx(rs.getString("IDX"));
				dto.setName(rs.getString("NAME"));
				dto.setTitle(rs.getString("TITLE"));
				dto.setCate(rs.getString("CATE"));
				dto.setOfile(rs.getString("OFILE"));
				dto.setNfile(rs.getString("NFILE"));
				dto.setRegdate(rs.getString("REGDATE"));
				bl.add(dto);
			}
		} catch (Exception e) {
			System.out.println("게시물 목록 읽기 중 에러");
			e.printStackTrace();
		}
		return bl;
	}
	
	public int insertFile(MyFileDTO dto) {
		int applyResult = 0;
		try {
			String query = "INSERT INTO MYFILES ( IDX, NAME, TITLE, CATE, OFILE, NFILE)"
					+ "		VALUES ( SEQ_BOARD_NUM.NEXTVAL, ?, ?, ?, ?, ?)";
			
			psmt = con.prepareStatement(query);
			psmt.setString(1, dto.getName());
			psmt.setString(2, dto.getTitle());
			psmt.setString(3, dto.getCate());
			psmt.setString(4, dto.getOfile());
			psmt.setString(5, dto.getNfile());
			
			applyResult = psmt.executeUpdate();			
		} catch (Exception e) {
			System.out.println("INSERT 중 예외 발생");
			e.printStackTrace();
		}
		return applyResult;
	}
	
	public List<MyFileDTO> myFileList() {
		List<MyFileDTO> fileList = new Vector<MyFileDTO>();
		
		String query = "SELECT * FROM MYFILES ORDER BY IDX DESC";
		try {
			psmt = con.prepareStatement(query);
			rs = psmt.executeQuery();
			while(rs.next()) {
				MyFileDTO dto = new MyFileDTO();
				dto.setIdx(rs.getString(1));
				dto.setName(rs.getString(2));
				dto.setTitle(rs.getString(3));
				dto.setCate(rs.getString(4));
				dto.setOfile(rs.getString(5));
				dto.setNfile(rs.getString(6));
				dto.setRegdate(rs.getString(7));
				
				fileList.add(dto);
			}
		} catch (Exception e) {
			System.out.println("SELECT 에서 예외 발생");
			e.printStackTrace();
		}
		
		return fileList;
	}
}

















