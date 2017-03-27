package com.service;

import java.sql.SQLException;

import com.bean.User;
import com.dao.ILoginDao;
import com.dao.LoginDao;

public class LoginService {
	ILoginDao dao = new LoginDao ();
	
	public User loginUser(User user) throws SQLException, ClassNotFoundException {
		return dao.loginUser(user);
	}
}
