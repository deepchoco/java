package com.varxyz.jv300.mod009;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.varxyz.jv300.mod009.User;

public class UserDao {
	NamingService namingService = NamingService.getInstance();
	DataSource ds = (DataSource) namingService.getAttribute("dataSource");
	
	public void addUser(User user) {
		String sql = "INSERT INTO SignedUser(userId, passwd, userName, ssn, email, addr) "
				+ "VALUES(?, ?, ?, ?, ?, ?)";
		
		System.out.println(user.getUserId());
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			try {
				con = ds.getConnection();
				pstmt = con.prepareStatement(sql);
				
				pstmt.setString(1, user.getUserId());
				pstmt.setString(2, user.getPasswd());
				pstmt.setString(3, user.getUserName());
				pstmt.setString(4, user.getSsn());
				pstmt.setString(5, user.getEmail());
				pstmt.setString(6, user.getAddr());
				pstmt.executeUpdate();
				
				System.out.println(user.getAddr());
				System.out.println("INSERTED...");
			} finally {
				ds.close(pstmt, con);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<User> findAllUser() {
		String sql = "SELECT * FROM SignedUser";
		List<User> userList = new ArrayList<User>();
		
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				con = ds.getConnection();
				pstmt = con.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while (rs.next()) {
					User u = new User();
					u.setUserId(rs.getString("userId"));
					u.setPasswd(rs.getString("passwd"));
					u.setUserName(rs.getString("userName"));
					u.setSsn(rs.getString("ssn"));
					u.setEmail(rs.getString("email"));
					u.setAddr(rs.getString("addr"));
					userList.add(u);
				}
			} finally {
				ds.close(rs, pstmt, con);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return userList;
	}
	
	public User findUserByUserId(String userId) {
		String sql = "SELECT * FROM SignedUser WHERE userId = ?";
		User u = null;
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				con = ds.getConnection();
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, userId);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					u = new User();
					u.setUserId(rs.getString("userId"));
					u.setPasswd(rs.getString("passwd"));
					u.setUserName(rs.getString("userName"));
					u.setSsn(rs.getString("ssn"));
					u.setEmail(rs.getString("email"));
					u.setAddr(rs.getString("addr"));
				}
			}finally {
				ds.close(rs,  pstmt, con);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return u;
	}
}