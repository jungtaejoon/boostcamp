package kr.or.connect.dao;

import java.sql.*;

import kr.or.connect.common.*;
import kr.or.connect.dto.*;

public class MemberDao {
	public MemberDto getMember(String name) {
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		MemberDto dto = null;
		
		//선언
		try {
			//접속
			connection = DBUtil.getConnection();
			
			//쿼리 작성
			String sql = "select * from member where name=?";
			ps = connection.prepareStatement(sql);
			ps.setString(1, name);
			
			//쿼리 실행
			rs = ps.executeQuery();
			
			if(rs.next()) {
				dto = new MemberDto();
				dto.setId(rs.getInt("id"));
				dto.setName(rs.getString("name"));
				dto.setEmail(rs.getString("email"));
				dto.setPasswd(rs.getString("passwd"));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			//닫기
			DBUtil.close(connection, ps, rs);
		}
		return dto;
	}
}
