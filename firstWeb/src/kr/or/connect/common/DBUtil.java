package kr.or.connect.common;

import java.sql.*;

public class DBUtil {
	//접속
	public static Connection getConnection() {
		Connection connection = null;	
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tododb?useSSL=false", "joon", "tiger");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return connection;
	}
	
	//닫기
	
	public static void close(Connection connection, PreparedStatement ps, ResultSet rs) {
		if(rs != null) {
			try {
				rs.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		if(ps != null) {
			try {
				ps.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		if(connection != null) {
			try {
				connection.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}
