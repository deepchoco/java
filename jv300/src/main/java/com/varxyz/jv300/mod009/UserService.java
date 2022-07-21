package com.varxyz.jv300.mod009;

import java.util.List;

public class UserService {
	
	private UserDao userdao;
	
	public void addUser(User user) {
		userdao = new UserDao();
		userdao.addUser(user);
	}
	
	public List<User> findAllUser() {
		userdao = new UserDao();
		return userdao.findAllUser();
	}
	
	public User findUserByUserId(String userId) {
		userdao = new UserDao();
		return userdao.findUserByUserId(userId);
	}

	public boolean isValidUser(String userId, String passwd) {
		if(findUserByUserId(userId) == null) {
			return false;
		} else {
			if(findUserByUserId(userId).getPasswd().equals(passwd)) {
				return true;
			} else {
				return false;
			}
		}
	}
}
