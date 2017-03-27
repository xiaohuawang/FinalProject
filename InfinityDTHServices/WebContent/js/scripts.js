/**
 * when page has loaded
 * perform JavaScript validation
 */

$(document).ready(function() {
	/*
	$("#form").submit(function(){
	    var isFormValid = true;

	    $(".input-sm").each(function(){
	        if ($.trim($(this).val()).length == 0){
	        	$(this).removeClass("valid").addClass("invalid");
	            isFormValid = false;
	        }
	        else{
	        	$(this).removeClass("invalid").addClass("valid");
	        }
	    });

	    if (!isFormValid) alert("Please fill in all the  fields that are red ");
	    		return isFormValid;
	    
	});*/
	
	//get current date 
    var date = new Date();

    var day = date.getDate();
    var month = date.getMonth() + 1;
    var year = date.getFullYear();

    if (month < 10) month = "0" + month;
    if (day < 10) day = "0" + day;

    var today =  month + "-" + day + "-" + year;       
    $("#theDate").attr("value", today);
    
   /* $('#form').on('submit', function() {
        return $('#form').jqxValidator('validate');
    });
    $('#testForm')
    .jqxValidator({  rules : [
	       {
	           input : '#firstName',
	           message : 'Country Name is required!',
	           action : 'keyup, blur',
	           rule : 'required'
	       }],
	       theme : theme
    });*/
  
});
//Add date for 4.3 Manage Channel Packages
$(function () {
	   var bindDatePicker = function() {
			$(".date").datetimepicker({
	        format:'YYYY-MM-DD',
				icons: {
					time: "fa fa-clock-o",
					date: "fa fa-calendar",
					up: "fa fa-arrow-up",
					down: "fa fa-arrow-down"
				}
			}).find('input:first').on("blur",function () {
				// check if the date is correct. We can accept dd-mm-yyyy and yyyy-mm-dd.
				// update the format if it's yyyy-mm-dd
				var date = parseDate($(this).val());

				if (! isValidDate(date)) {
					//create date based on momentjs (we have that)
					date = moment().format('YYYY-MM-DD');
				}

				$(this).val(date);
			});
		};
	   
	   var isValidDate = function(value, format) {
			format = format || false;
			// lets parse the date to the best of our knowledge
			if (format) {
				value = parseDate(value);
			}

			var timestamp = Date.parse(value);

			return isNaN(timestamp) == false;
	   };
	   
	   var parseDate = function(value) {
			var m = value.match(/^(\d{1,2})(\/|-)?(\d{1,2})(\/|-)?(\d{4})$/);
			if (m)
				value = m[5] + '-' + ("00" + m[3]).slice(-2) + '-' + ("00" + m[1]).slice(-2);

			return value;
	   };
	   
	   bindDatePicker();
	 });






