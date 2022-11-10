package membership;

import common.JDBConnect;

public class MemberDAO  extends JDBConnect {
	public MemberDAO(String drv, String url, String id, String pw) {
		super(drv,url,id,pw);
	}
	
	public MemberDTO getMemberDTO(String uid, String upw) {
		MemberDTO dto = new MemberDTO();
		String query = "SELECT * FROM member WHERE id=? AND pw=?";
		
		try {
			psmt = con.prepareStatement(query);
			psmt.setString(1,uid);
			psmt.setString(2,upw);
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				dto.setId(rs.getString("id"));
				dto.setPw(rs.getString("pw"));
				dto.setName(rs.getString("name"));
				dto.setRegdate(rs.getString("regdate"));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return dto;
	}
	

	}


