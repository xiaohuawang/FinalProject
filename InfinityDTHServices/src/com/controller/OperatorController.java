package com.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.bean.Operator;
import com.util.DBConnection;
import com.util.DateUtil;
import com.service.OperatorService;

/*
 * Controller Servlet Class to take Operator information from
 * Operator Registration page. First, storing it locally in an
 * Operator object. Finally, saving it to database for persistent
 * storage.
 * Class written by: Patrick Laflin 3/24/2017 
 */

@WebServlet("/OperatorController")
public class OperatorController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger logger = LogManager.getLogger(DBConnection.class);
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OperatorController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// create operator object to hold input form data locally
		Operator operator = new Operator();
		OperatorService service = new OperatorService();
		
		// filling operator class variables from input form
		operator.setCreationDate(DateUtil.convertStringToDate(request.getParameter("creationDate"), "MM/dd/yyyy") );
		operator.setEmailAddress(request.getParameter("emailAddress"));
		operator.setFirstName(request.getParameter("firstName"));
		operator.setLastName(request.getParameter("lastName"));		
		operator.setMaxNoCustomers(Integer.parseInt((request.getParameter("maxNoCustomers"))));
		operator.setPhoneNumber(request.getParameter("phoneNumber"));
		DateFormat sdf = new SimpleDateFormat("hh:mm:ss"); 
		
		logger.info(operator.getFirstName());
		
		// try catch to try and parse the start time input from operator form
		try {
			Date startTime = sdf.parse(request.getParameter("shiftTimeStart"));
			operator.setShiftTimeStart(startTime);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // End try-catch block for start time
		
		// try catch to try and parse the end time input from operator form
		try {
			Date endTime = sdf.parse(request.getParameter("shiftTimeEnd"));
			operator.setShiftTimeStart(endTime);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // End try-catch block for end time
		
		// TODO: FIND OUT HOW TO GET THIS FROM DATABASE
		//operator.setTotalNoActiveCustomers(Integer.parseInt(request.getParameter("totalNoActiveCustomers")));
		
				
		try {
			// service will add the sample to db
			Integer userId = service.addOperator(operator);
			
			if(userId == -1) {
				logger.error("ERROR ADDING OPERATOR");
				request.getRequestDispatcher("sample.jsp").forward(request, response);
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// make sure to log error
			logger.error(e.getMessage());
		}
	}

}
