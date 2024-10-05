<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	    <title>Leave Page</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    
    <link href="https://fonts.googleapis.com/css?family=Poppins:200,300,400,500,600,700,800&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Lora:400,400i,700,700i&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Amatic+SC:400,700&display=swap" rel="stylesheet">

    <link rel="stylesheet" href="css/open-iconic-bootstrap.min.css">
    <link rel="stylesheet" href="css/animate.css">
    
    <link rel="stylesheet" href="css/owl.carousel.min.css">
    <link rel="stylesheet" href="css/owl.theme.default.min.css">
    <link rel="stylesheet" href="css/magnific-popup.css">

    <link rel="stylesheet" href="css/aos.css">

    <link rel="stylesheet" href="css/ionicons.min.css">

    <link rel="stylesheet" href="css/bootstrap-datepicker.css">
    <link rel="stylesheet" href="css/jquery.timepicker.css">

    
    <link rel="stylesheet" href="css/flaticon.css">
    <link rel="stylesheet" href="css/icomoon.css">
    <link rel="stylesheet" href="css/style.css">
	
	
	<script src="https://apis.google.com/js/platform.js" async defer></script>
    <meta name="google-signin-client_id" content="647658882271-f7rg54qt1mqv546ef9aft9mejh7ri150.apps.googleusercontent.com">
	
</head>
<body>
 <script> 
		    window.onload = function exampleFunction() { 
		    	var x = localStorage.getItem("googleid");
		   		if (x == null){
		   			window.location.href = "index.jsp";
		   	    }
		    } 
	</script>
	<div class="py-1 bg-primary">
    	<div class="container">
    		<div class="row no-gutters d-flex align-items-start align-items-center px-md-0">
	    		<div class="col-lg-12 d-block">
		    		<div class="row d-flex">
		    			<div class="col-md pr-4 d-flex topper align-items-center">
					    	<div class="icon mr-2 d-flex justify-content-center align-items-center"><span class="icon-phone2"></span></div>
						    <span class="text">+ 1235 2355 98</span>
					    </div>
					    <div class="col-md pr-4 d-flex topper align-items-center">
					    	<div class="icon mr-2 d-flex justify-content-center align-items-center"><span class="icon-paper-plane"></span></div>
						    <span class="text">youremail@email.com</span>
					    </div>
					    <div class="col-md-5 pr-4 d-flex topper align-items-center text-lg-right">
						    <span class="text">3-5 Business days delivery &amp; Free Returns</span>
					    </div>
				    </div>
			    </div>
		    </div>
		  </div>
    </div>
    <h1>${Login_designation}</h1>
    <nav class="navbar navbar-expand-lg navbar-dark ftco_navbar bg-dark ftco-navbar-light" id="ftco-navbar">
	    <div class="container">
	      <a class="navbar-brand" href="index.html">Vegefoods</a>
	      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#ftco-nav" aria-controls="ftco-nav" aria-expanded="false" aria-label="Toggle navigation">
	        <span class="oi oi-menu"></span> Menu
	      </button>

	      <div class="collapse navbar-collapse" id="ftco-nav">
	        <ul class="navbar-nav ml-auto">
	          <li class="nav-item active"><a href="Home?email=${email}" class="nav-link">Home</a></li>
	           <li class="nav-item dropdown">
	              <a class="nav-link dropdown-toggle" href="#" id="dropdown04" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Leave </a>
	              <div class="dropdown-menu" aria-labelledby="dropdown04">
	              	<a class="dropdown-item" href="GoToLeavePage?type=Casual&email=${email}">Casual Leave</a>
	              	<a class="dropdown-item" href="GoToLeavePage?type=Medical&email=${email}">Medical Leave</a>
	                <a class="dropdown-item" href="GoToLeavePage?type=Sick&email=${email}">Sick Leave</a>
	                <a class="dropdown-item" href="GoToLeavePage?type=Earned&email=${email}">Earned Leave</a>
	                <a class="dropdown-item" href="GoToLeavePage?type=Outdoor&email=${email}">Outdoor Duty</a>
					<a class="dropdown-item" href="Sanction?email=${email}">Requests</a>		
	              </div>
              </li>
	          <li class="nav-item"><a href="Blog?email=${email}"class="nav-link">Blog</a></li>
	          <li class="nav-item"><a href="Chat?email=${email}" class="nav-link">Chat</a></li>
	          <li class="nav-item cta cta-colored"><a href="cart.html" class="nav-link"><span class="icon-shopping_cart"></span>[0]</a></li>
	          <li class="nav-item"><a onclick="return myFunction();" class="nav-link">Sign Out</a></li>
	        	<div hidden  class="g-signin2" data-onsuccess="onSignIn" id="myP" method="POST"></div>
				<script type="text/javascript">
			  	    function myFunction() {
				      gapi.auth2.getAuthInstance().disconnect();
				      location.reload();
				      localStorage.clear();
				      window.location.href = "index.jsp";
			      }
			   </script>
	        </ul>
	      </div>
	    </div>
	  </nav>
    <!-- END nav -->
	
	<section class="contact" id="contact" >
	<br>
	<center><h1>Apply For ${leavetype} Leave</h1></center>
	<input hidden  type="text" class="form-control" id="avb" name="avb" value="${Leave}" readonly>
	<div class="container">
	<div class="row" >
		<div class="col-lg-7 col-md-7 mx-auto" style="border:thin black solid; border-radius:10px; margin:25px; padding: 25px;">
			
		<form action="getLeaveReq" method="POST">
			<input hidden  type="text" class="form-control" id="leavetype" name="leavetype" value="${leavetype}" readonly>
			<br>
			<div class="form-group">
		    	<label  >Remaining Leaves : </label>
		    	<input type="text" class="form-control" id="rem" name="rem" value="${Leave}" readonly>
		  	</div>
			<br>
			
			<div class="row">
			    <div class="col">
				   <label for="exampleFormControlInput1">From :</label>
				   <input type="date" class="form-control" id="from" name="from" required>
			    </div>
			    <div class="col">
			      <label for="exampleFormControlInput1">To :</label>
			      <input type="date" onClick="clear()" class="form-control" id="to" name="to"  required>
			    </div>
			</div>
			<br>
			<div class="form-group">
		    	<label for="exampleFormControlInput1">No of Days :</label>
		    	<input type="text" class="form-control" id="nod" name="nod" value="0" readonly>
		  	</div>
		  	<div class="form-group">
		    	<label for="exampleFormControlInput1">Reason For Leave :</label>
		    	<textarea onkeypress="noOfDays()"  class="form-control" rows="3" id="reason"name="reason" value="0" required></textarea>
		  	</div>
		  	<div>
		  		<center><button type="submit" onClick="Days()" value="Submit" class="btn btn-primary" >Apply Leave</button>
				<button type="reset"  value="Reset" class="btn btn-secondary" >Cancel</button></center>
			</div>
		</form>
		</div>
	</div>
	</div>
	
	</section>
	 <script type="text/javascript">
	 		
		  function noOfDays(){
		    var from = document.getElementById('from').value;
		    var to = document.getElementById('to').value;
		    var rem= document.getElementById('rem').value;
		    var nod= document.getElementById('nod').value;
		    var date1, date2;  
	         //define two date object variables with dates inside it  
	         date1 = new Date(from);  
	         date2 = new Date(to);  
	  
	         //calculate time difference  
	         var time_difference = date2.getTime() - date1.getTime();  
	  
	         //calculate days difference by dividing total milliseconds in a day  
	         var days_difference = time_difference / (1000 * 60 * 60 * 24);  
	         document.getElementById("nod").value = days_difference;
	         
	         
	         var validate = rem-nod;
	         if (nod < 0 ) {
	        	 alert("Please Select Proper Date :" +nod);
	        	 location.reload();
	        	 return false;
	         }
	         else if(validate<0)
	         {
	        	 alert("Insufficient leaves :");
	        	 location.reload();
	        	 return false; 
	         }
	         else{
	        	 
	         }
	        
		  }
		  function Days(){
			    var rem= document.getElementById('rem').value;
			    var x = document.getElementById('reason').value;
			    var n = x.length;  
				 if (x == "" || x == null || n<2) {
				    alert("Reason must be filled out : "+n);
				    location.reload();
				    return false;
				  }
			  }
		  function clear()
		  {
			  alert("work ");
		  }
	  </script>
	  <script src="js/jquery.min.js"></script>
	  <script src="js/jquery-migrate-3.0.1.min.js"></script>
	  <script src="js/popper.min.js"></script>
	  <script src="js/bootstrap.min.js"></script>
	  <script src="js/jquery.easing.1.3.js"></script>
	  <script src="js/jquery.waypoints.min.js"></script>
	  <script src="js/jquery.stellar.min.js"></script>
	  <script src="js/owl.carousel.min.js"></script>
	  <script src="js/jquery.magnific-popup.min.js"></script>
	  <script src="js/aos.js"></script>
	  <script src="js/jquery.animateNumber.min.js"></script>
	  <script src="js/bootstrap-datepicker.js"></script>
	  <script src="js/scrollax.min.js"></script>
	  <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBVWaKrjvy3MaE7SQ74_uJiULgl1JY0H2s&sensor=false"></script>
	  <script src="js/google-map.js"></script>
	  <script src="js/main.js"></script>
</body>
</html>