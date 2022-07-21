package com.varxyz.jv252.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.varxyz.jv252.domain.Customer;
import com.varxyz.jv252.domain.Account;
import com.varxyz.jv252.domain.CheckingAccount;
import com.varxyz.jv252.domain.SavingAccount;

public class AccountDao {//jdbc.properties jdbc속성에 세팅된 값을 가져오기
	public static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String JDBC_URL = "jdbc:mysql://localhost:3306/jv250?serverTimezone=Asia/Seoul";
	public static final String JDBC_USER = "jv250";
	public static final String JDBC_PASSWORD = "jv250";
	
	public AccountDao() {
		try {//JDBC드라이버 불러오기 실패시 예외처리
			Class.forName(JDBC_DRIVER);
			System.out.println("LOADED DRIVER ---> " + JDBC_DRIVER);
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	//신규계좌 등록
	public void addAccount(Account account) {
		String sql = "INSERT INTO Account(accountNum, balance, interestRate, "//account에 insert문으로 정보삽입
				+ " overDraft, accountType, customerId)"
				+ " VALUES (?, ?, ?, ?, ?, ?)";
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			//sql구문을 전달하는 역할 스스로는 이해못함
			//PreparedStatement는 매개변수를 set해야하기 때문에 코드량이 길다.
			try {
				con = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, account.getAccountNum());
				pstmt.setDouble(2, account.getBalance());
				if(account instanceof SavingAccount) {//instanceof 객체타입 확인
					SavingAccount sa = (SavingAccount)account;
					pstmt.setDouble(3, sa.getIntrestRate());
					pstmt.setDouble(4, 0.0);
					pstmt.setString(5, String.valueOf('S'));
				}else {
					CheckingAccount ca = (CheckingAccount)account;
					pstmt.setDouble(3, 0.0);
					pstmt.setDouble(4, ca.getOverdraftAmount());
					pstmt.setString(5, String.valueOf('C'));
				}
				pstmt.setLong(6, account.getCustomer().getCid());
				pstmt.executeUpdate();
			}finally {
				DataSourceManager.close(pstmt, con);
			}
			System.out.println("NEW ACCOUNT INSERTED...\n");
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	// 전달된 주민번호를 가진 특정 고객의 계좌 목록 조희
	public List<Account> findAccountBySsn(String ssn){
		String sql = "SELECT a.aid, a.accountNum, a.balance, a.interestRate, a.overdraft, a.accountType, c.name, c.ssn, c.phone, a.regDate"
	            + " FROM Account a INNER JOIN Customer c ON a.customerId = c.cid WHERE c.ssn = ?";
		List<Account> list = new ArrayList<Account>();
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				con = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, ssn);
				rs = pstmt.executeQuery();
				Account account = null;
				while(rs.next()) {//rs.next순서대로 체크한후 데이터가 없으면 false가 나와 while문을 벗어난다
					if(rs.getString("accountType").charAt(0) == 'S') {
						//String 타입인accountType을 char로 바꾸는것 account에 accounType이 char이기때문
						account = new SavingAccount();
						((SavingAccount)account).setInterestRate(rs.getDouble("interestRate"));
					}else {
						account = new CheckingAccount();
						((CheckingAccount)account).setOverdraftAmount(rs.getDouble("overdraft"));
					}
					account.setAid(rs.getLong("aid"));
					account.setAccountNum(rs.getString("accountNum"));
					account.setBalance(rs.getDouble("balance"));
					account.setCustomer(new Customer(rs.getString("name"),
							rs.getString("ssn"), rs.getString("phone")));
					account.setRegDate(rs.getTimestamp("regDate"));
					account.setAccountType(rs.getString("accountType").charAt(0));
					list.add(account);
				}
			}finally {
				DataSourceManager.close(rs, pstmt, con);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	//등록된 모든 계좌 조회
	public List<Account> findAllAccounts(){
		String sql = "SELECT * FROM Account a INNER JOIN Customer c ON a.customerId = c.cid WHERE c.ssn = ?";
		List<Account> accountList = new ArrayList<Account>();
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				con = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
				pstmt = con.prepareStatement(sql);
				rs = pstmt.executeQuery();
			}finally {
				DataSourceManager.close(rs, pstmt, con);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return accountList;
	}
}
