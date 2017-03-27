package com.dao;

import java.sql.SQLException;

import com.bean.Operator;

public interface IOperatorDao {
	public Integer addOperator(Operator operator) throws SQLException, ClassNotFoundException;
}