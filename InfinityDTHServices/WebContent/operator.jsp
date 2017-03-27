<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>

<t:layout title="Create Sample">

	<jsp:attribute name="head">
		<!-- Add HTML content to page header here i.e. StyleSheets -->
		
	</jsp:attribute>

	<jsp:attribute name="body">
				<div class="container">
			  
			  <form>
			    
			    <div class="form-group">
			      <label for="password">Password:</label>
			      <input type="Password" class="form-control" id="password" name="password">
				    
				</div>
			  </form>
			</div>
	
		<header>
			<div class="page-header">
		  		<h1>Infinity Operator<small>Operator Management</small>
				</h1>
			</div>	
		</header>
		
				<form id="form" method="post" action="OperatorController">
				
	    <div class="form-group">
	      <label for="firstName">First Name</label>
	      <input class="form-control input-sm" id="firstName"
		type="text" name="firstName">
	    </div>
	    <div class="form-group1">
	      <label for="lastName">Last Name</label>
	      <input class="form-control input-sm" id="lastName" type="text"
		name="lastName">
	    </div>
	    <div class="form-group2">
	      <label for="emailAddress">Email ID</label>
	      <input class="form-control input-sm" id="emailAddress"
		type="text" name="emailAddress">
	    </div>
	    <div class="form-group2.1">
	      <label for="phoneNumber">Phone Number</label>
	      <input class="form-control input-sm" id="phoneNumber"
		type="text" name="phoneNumber">
	    </div>
	    <div class="form-group3">
	      <label for="shiftTimeStart">Shift Start Time</label>
	      <select class="form-control input-sm" id="shiftTimeStart"
		name="shiftTimeStart">
	        <option> 7:00 am</option>
	        <option> 3:00 pm</option>
	        <option> 11:00 pm</option>
	       
	      </select>
	    </div>
	    <div class="form-group4">
	      <label for="shiftTimeEnd">Shift End Time</label>
	      <select class="form-control input-sm" id="shiftTimeEnd"
		name="shiftTimeEnd">
	        <option>3:00 pm</option>
	        <option>11:00 pm</option>
	        <option>7:00 am</option>
	      </select>
	    </div>
	    	<br>
	    <div class="form-group5">
	      <label for="maxNoCustomers">Max. number of Customers to be managed: </label>
	      <p>10</p>
	    </div>
	    	<br>


	    <div class="form-group6">
	      <label for="theDate">Creation Date</label>
	      <input class="form-control" type="date" id="theDate" readonly>
			

	    </div>
	    	<br>
	     <button type="submit" class="btn btn-default">Submit</button>
	 </form>
		
			
	<!-- END -->
	</jsp:attribute>

</t:layout>