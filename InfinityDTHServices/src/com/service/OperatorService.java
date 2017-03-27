package com.service;

import java.sql.SQLException;
import com.bean.Operator;
import com.dao.OperatorDao;
import com.dao.IOperatorDao;


public class OperatorService {
	
	IOperatorDao dao = new OperatorDao();
		
	public Integer addOperator(Operator operator) throws SQLException, ClassNotFoundException {
		return dao.addOperator(operator);
	}
	}

