<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>

<t:layout title="Infinity- Customer Registration">

	<jsp:attribute name="head">
		<!-- Add HTML content to page header here i.e. StyleSheets -->
		
	</jsp:attribute>

	<jsp:attribute name="body">
		<!-- Add HTML content to page body here -->
	<div class="container">
  	<h2>Manage Channel Packages</h2>
  	<form>
    <div class="form-group">
      <label for="inputdefault">Package Name</label>
      <input class="form-control" id="inputdefault" type="text">
    </div>
    <form class="input-append">
    <div id="field">
						<small>Press + to add category</small><br>
    <input autocomplete="off" class="input" id="field1" name="prof1"
							type="text" placeholder="Additional New Feature" data-items="8" />
    <button id="b1" class="btn add-more" type="button">+</button>
				
	</div>
    </form>
    <div class="form-group">
      <label for="sel1">Package Category</label>
      <select class="form-control" id="sel1">
        <option>Sports</option>
        <option>News</option>
        <option>Kids</option>
        <option>Nature</option>
      </select>
    </div>
    <div class="form-group">
      <label for="inputdefault">Package Charging Type(Paid for FTA)</label>
      <select class="form-control" id="sel1">
        <option>Paid</option>
        <option>FTA</option>
      </select>
    </div>
    <div class="form-group">
      <label for="sel1">Package Transmission Type</label>
      <select class="form-control" id="sel1">
        <option>HD</option>
        <option>Standard</option>
      </select>
    </div>
    <div class="form-group">
      <label for="inputdefault">Add Channels</label>
    <form action="/action_page.php">
<select name="Add Channels" multiple>
  <option value="standard">Standard</option>
  <option value="high definition">High Definition</option>
  <option value="hd recorder">HD Recorder</option>
  <option value="iptv">IPTV</option>
</select>
						<p>Hold down Ctrl to select multiple options.</p>
</form>
</div>

    <div class="form-group">
      <label for="inputdefault">Package Cost</label>
      <input class="form-control" id="inputdefault" type="text">
    </div>
    <!--Add starting date-->
    <div class="form-group">  
    <label for="datetimepicker1">Package Available from Date</label>
       <div class='input-group date' id='datetimepicker1'>
                    <input type='text' class="form-control" />
                    <span class="input-group-addon">
                        <span class="glyphicon glyphicon-calendar"></span>
                    </span>
                </div>
    
    
    <!--Add Ending date-->
    <div class="form-group">
    <label for="datetimepicker1">Package Available to Date</label>
      <div class="input-group date" id="datetimepicker1">
      
        <input type="text" class="form-control" /><span
								class="input-group-addon"><span
								class="glyphicon-calendar glyphicon"></span></span>
        
    </div>
    <div class="form-group">
    <span> Added by default </span>
      <form action="">
        <input id="Yes" type="radio" name="addByDefault" value="Yes"> <span>Yes</span>
        <input id="No" type="radio" name="addByDefault" value="No"> <span>No</span>

      </form>
    </div>
			<footer class="footer">
 				<p>© 2017 Infinity DTH services, Inc.</p>
			</footer>
			
		</div>
	
	</jsp:attribute>

</t:layout>