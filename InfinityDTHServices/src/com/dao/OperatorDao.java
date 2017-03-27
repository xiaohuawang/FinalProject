package com.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;





import com.bean.Operator;
import com.bean.User;
import com.util.DBConnection;

public class OperatorDao extends GenericDao implements IOperatorDao {
	
	@Override
	public Integer addOperator(Operator operator) throws SQLException, ClassNotFoundException {
		//		INSERT INTO ASSIGNMENT (STUDENT_ID,ASSIGNMENT_NAME,ASSIGNMENT_TYPE,ASSIGNMENT_DATE,GRADE) 
		//		VALUES (?,?,?,?,?)";

		Integer userId = addNewUser(operator, User.OPERATOR);

		String sql= "INSERT INTO OPERATOR VALUES(?,?,?,?,?,?,?,?,?)";
		// (USERID,FIRSTNAME,LASTNAME,EMAILID,PHONENUMBER,SHIFTTIMESTART, SHIFTTIMEEND)
		
		ps = con.prepareStatement(sql);
		
		ps.setInt(1, userId);
		ps.setString(2,operator.getFirstName());
		ps.setString(3,operator.getLastName());
		ps.setString(4,operator.getEmailAddress());
		ps.setString(5,operator.getPhoneNumber());
		ps.setDate(6,(Date) operator.getShiftTimeStart());
		ps.setDate(7,(Date) operator.getShiftTimeEnd());
		ps.setInt(8,operator.getMaxNoCustomers());
		ps.setDate(9,(Date) operator.getCreationDate());
		ps.executeUpdate();
		
		logger.info("END");
		
//		DBConnection.CloseConnection(conn);
		
		return -1;
	}
}