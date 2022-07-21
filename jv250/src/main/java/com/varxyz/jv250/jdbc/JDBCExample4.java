package com.varxyz.jv250.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCExample4 {
	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/jv250?serverTimezone=Asia/Seoul";
		String id = "jv250";
		String passwd = "jv250";
		
		Connection con = null;
		PreparedStatement stmt = null;
		
		try {
			Class.forName(driver);
			System.out.println("LOADED DRIVER --->" + driver);
			
			con = DriverManager.getConnection(url, id, passwd);
			System.out.println("CONNECTED TO --->" + url);
			
			String sql = "UPDATE Customer SET phone=?, customerId=? WHERE cid=?";
			stmt = con.prepareStatement(sql);
			stmt.setString(1, "010-9999-9999");
			stmt.setString(2, "java");
			stmt.setLong(3, 1007);
			stmt.executeUpdate();
			
			System.out.println("INSERTED....");
//			stmt.close();
//			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
