package com.dao;

import java.sql.SQLException;

import com.bean.Admin;
import com.bean.Customer;
import com.bean.Operator;
import com.bean.Retailer;
import com.bean.User;
import com.util.DBConnection;

public class LoginDao extends GenericDao implements ILoginDao {

	@Override
	public User loginUser(User user) throws SQLException, ClassNotFoundException {
		con = DBConnection.getConnection();
		
		// Prepare SQL statement
		StringBuilder sb = new StringBuilder();
		sb.append("select U.userId, U.username, U.pwd, R.roleId, R.roleName ");
		sb.append("from Users U ");
		sb.append("inner join User_Role UR on U.userId = UR.userId ");
		sb.append("inner join Role R on UR.roleId = R.roleID ");
		sb.append("where U.username = ?");
		
		ps = con.prepareStatement(sb.toString());
		ps.setString(1, user.getUsername());
		
		logger.info("username: " + user.getUsername());
		logger.info("password: " + user.getPassword());
		
		// Execute SQL statement
		rs = ps.executeQuery();
		
		if(rs.next()) {
			User loggedUser = null;
			String userRole = rs.getString("roleName");

			/*switch (userRole) {
			case User.ADMIN:
				loggedUser = new Admin();
				
				loggedUser.setUserId(rs.getInt("userId"));
				loggedUser.setUsername(rs.getString("username"));
				loggedUser.setPassword(rs.getString("pwd"));
				
				if(user.getPassword().equals(loggedUser.getPassword())) {
					logger.info("Successfully Logged In");
				} else {
					logger.info("Wrong username and password combination");
				}
			
				break;
			case User.OPERATOR:
				user = new Operator();
				break;
			case User.RETAILER:
				user = new Retailer();
				break;
			case User.CUSTOMER:
				user = new Customer();
				break;
			}*/
			
			return user;
		}
		
		
		return null;
	}

}
