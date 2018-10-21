package mta.qldv.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	private static Connection conn = null;
	
	public static Connection openConnect() {
		
		String url = DatabaseProperties.getData("url");
		String user = DatabaseProperties.getData("user");
		String pass = DatabaseProperties.getData("password");
		String driver = DatabaseProperties.getData("driver");
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, pass);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	
	public static Connection closeConnect() {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return conn;
	}
}
