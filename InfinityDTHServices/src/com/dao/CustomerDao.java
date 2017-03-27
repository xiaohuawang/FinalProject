package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.bean.Customer;
import com.bean.User;
import com.util.DBConnection;

public class CustomerDao extends GenericDao implements ICustomerDao {

	public ResultSet selectSQL(String sql) {
	
		ResultSet result=null;
		Connection conn=null;
		
		try {
			conn=DBConnection.getConnection();
			PreparedStatement preStatement = conn.prepareStatement(sql);
			result=preStatement.executeQuery();
		} catch (SQLException e) {
			logger.error(e.getMessage());
		}
		
		return result;
	}
	
	@Override
//	public Integer addCustomer(Customer customer) throws SQLException, ClassNotFoundException {
	public Integer addCustomer(Customer customer) throws SQLException, ClassNotFoundException {
		
		Integer userId = addNewUser(customer, User.CUSTOMER);
		
		con = DBConnection.getConnectionTest();
		
		AddressDao addressDao = new AddressDao();
		
		Integer addressId = addressDao.addAddress(customer.getAddress());
		
		String sql = "INSERT INTO CUSTOMER VALUES(?,?,?,?,?,?)";
		
		System.out.println(sql);
		
		logger.info(sql);
		
		ps = con.prepareStatement(sql);
		
		ps.setInt(1, userId);
		ps.setString(2,customer.getFirstName());
		ps.setString(3,customer.getLastName());
		ps.setString(4,customer.getEmailAddress());
		ps.setString(5,customer.getPhoneNumber());
		ps.setInt(6, addressId);
		
		ps.executeUpdate();

//		query = "select XUsers_Sequences.currval from dual";
		
//		System.out.println(query);
//		stmt = con.createStatement();
//		ResultSet rs = selectSQL(query);
		
//		while(rs.next()) {
//			Integer customerId = rs.getInt(1);
//			logger.info("CustomerID: " + customerId);
//			return customerId;
//		}
//		
//		System.out.println("end");
		
		DBConnection.CloseConnection(con);
		
		return userId;
	}
	
	public ArrayList<Customer> getAllCustomer(){
		
		ArrayList<Customer> customers=new ArrayList<Customer>();
		String sql="select * from customer";
		System.out.println(sql);
		ResultSet rs=selectSQL(sql);
//		while(rs.next()){
//			Customer customer =new Customer();
//			customer.set
//		}
		
		return customers;
	}
	
}