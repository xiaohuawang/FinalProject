<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
 
<t:layout title="Create Sample">
 
 	<jsp:attribute name="head">
		<!-- Add HTML content to page header here i.e. StyleSheets -->
		
	</jsp:attribute>
	 
	<jsp:attribute name="body">
	<!-- START -->
		
		<!-- Main component for a primary marketing message or call to action -->
		<h1> Search </h1>
		<div class="row">
		</div><!-- /.col-lg-6 -->
  			<div class="col-lg-6">
    			<div class="input-group">
    				<form action="FindCustomerServlet" method="POST"> 
      					<input type="text" class="form-control" placeholder="Search for...">
     				 	<span class="input-group-btn">
     				 	<input type="submit" class="btn btn-info" value="Go">
      				</span>
      				</form>
    			</div><!-- /input-group -->
  			</div><!-- /.col-lg-6 -->
		
	<!-- END -->
	</jsp:attribute>
 
</t:layout>