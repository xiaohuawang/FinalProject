<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
 
<t:layout title="Create Sample">
 
 	<jsp:attribute name="head">
		<!-- Add HTML content to page header here i.e. StyleSheets -->
		
	</jsp:attribute>
	 
	<jsp:attribute name="body">
	<!-- START -->
	
		<header>
			<div class="page-header">
		  		<h1>Add Sample <small>Sample Management</small></h1>
			</div>	
		</header>
		
		<form class="form-horizontal" method="post" action="SampleController">
			<fieldset>
				
				<!-- Text input-->
				<div class="form-group">
				  <label class="col-md-4 control-label" for="sampleName">Sample Name</label>  
				  <div class="col-md-4">
				  <input id="sampleName" name="sampleName" type="text"
					placeholder="Sample Name" class="form-control input-md" required autofocus >
				  <span class="help-block">minimum 6 characters</span>  
				  </div>
				</div>
				
				<!-- Button -->
				<div class="form-group">
				  <label class="col-md-4 control-label" for="singlebutton"></label>
				  <div class="col-md-4">
				    <button type="submit" class="btn btn-primary">Create Sample</button>
				  </div>
				</div>

			</fieldset>
		</form>
			
	<!-- END -->
	</jsp:attribute>
 
</t:layout>