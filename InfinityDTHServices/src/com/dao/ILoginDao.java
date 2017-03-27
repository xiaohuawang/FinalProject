package com.dao;

import java.sql.SQLException;

import com.bean.User;

public interface ILoginDao {
	public User loginUser(User user) throws SQLException, ClassNotFoundException;
}
