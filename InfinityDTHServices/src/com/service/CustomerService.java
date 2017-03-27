package com.service;

import java.sql.SQLException;

import com.bean.Customer;
import com.dao.CustomerDao;
import com.dao.ICustomerDao;

public class CustomerService {
	ICustomerDao dao = new CustomerDao();
	
	public Integer addCustomer(Customer customer) throws SQLException, ClassNotFoundException {
		return dao.addCustomer(customer);
	}
}
