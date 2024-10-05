
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
    <style type="text/css">
		    	.button {
		  background-color: #4CAF50; /* Green */
		  border: none;
		  color: white;
		  padding: 12px 112px;
		  text-align: center;
		  text-decoration: none;
		  display: inline-block;
		  font-size: 16px;
		  margin: 0px 0px;
		  cursor: pointer;
		}
			.buttonSearch {
		  background-color: #4CAF50; /* Green */
		  border: none;
		  color: white;
		  padding: 12px 122px;
		  text-align: center;
		  text-decoration: none;
		  display: inline-block;
		  font-size: 16px;
		  margin: 0px 0px;
		  cursor: pointer;
		}
		.a {color:blue;}
		.button2 {background-color: #008CBA;}
		.button3 {background-color: ##00FF00;}
    </style>
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
	          <li class="nav-item active"><a href="index.html" class="nav-link">Home</a></li>
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

   <div class="hero-wrap hero-bread" style="background-image: url('images/collage.jfif');">
      <div class="container">
        <div class="row no-gutters slider-text align-items-center justify-content-center">
          <div class="col-md-9 ftco-animate text-center">
          	<p class="breadcrumbs"><span class="mr-2"><a href="index.html">Home</a></span> <span>Blog</span></p>
            <h1 class="mb-0 bread">Blog</h1>
          </div>
        </div>
      </div>
    </div>

    <section class="ftco-section ftco-degree-bg">
      <div class="container">
        <div class="row">
          <div class="col-lg-8 ftco-animate">
			<div class="row">
				<c:forEach items="${Entity_Blog_AddData}" var="data">
					<div class="col-md-12 d-flex ftco-animate">
			            <div class="blog-entry align-self-stretch d-md-flex">
			              <a href="blog-single.html" class="block-20" style="background-image: url('uploads/${data.img}');">
			              </a>
			              <div class="text d-block pl-md-4">
			              	<div class="meta mb-3">
			                  <div><a href="#">${data.date}</a></div>
			                  <div><a href="#">${data.name}</a></div>
			                </div>
			                <h3 class="heading"><a href="#">${data.subject}</a></h3>
			                <p>${data.description}</p>
			                <p>
				                <c:choose>
				              	     <c:when test="${empty data.file}">
								        
								    </c:when>
								    <c:otherwise>
								        <a href="ViewDocument?file=${data.file}">Click here to open document</a>
								    </c:otherwise>  	
								</c:choose>
							</p>
			                <p>
			               		 <a href="blog-single.html" class="btn btn-outline-success py-2 px-3">Read more</a>
			                 	 <c:set var="emailid" scope="session" value="${data.email}"/>  
								 <c:if test="${param.email == emailid}">  
								  	 <a href="Blog_Delete?id=${data.id}&email=${data.email}" class="btn btn-outline-danger py-2 px-3">delete</a> 
								</c:if> 	
			               </p>
			              </div>
			            </div>
			         </div>
			        
			     </c:forEach>
			 </div>
          </div> <!-- .col-md-8 -->
          <div class="col-lg-4 sidebar ftco-animate">
            <div class="sidebar-box">
              <form action="Blog_AddData" class="search-form">
              	<div class="form-group">
              		<input hidden  type="text" class="form-control" id="email" value="${email}" name="email" readonly>
              		<button class="button button2" >Add_Blog</button>
                </div>
              </form>
              <br>
              <form action="Blog_ByName" class="search-form">
                <div class="form-group">
                  <span class="icon ion-ios-search"></span>
                  	<input type="text" class="form-control" id="name" value="" name="name" placeholder= "Search by name">
                </div>
                	<button class="buttonSearch button3" >Search</button>
              </form>
            </div>
            <div class="sidebar-box ftco-animate">
            	<h3 class="heading">Categories</h3>
              <ul class="categories">
                <li><a href="#">Principle <span>(${NoOfPrinciple})</span></a></li>
                <li><a href="#">Hod <span>(${NoOfHod})</span></a></li>
                <li><a href="#">Teacher <span>(${NoOfTeacher})</span></a></li>
              </ul>
            </div>
          </div>

        </div>
      </div>
    </section> <!-- .section -->

    <footer class="ftco-footer ftco-section bg-light">
      <div class="container">
      	<div class="row">
      		<div class="mouse">
						<a href="#" class="mouse-icon">
							<div class="mouse-wheel"><span class="ion-ios-arrow-up"></span></div>
						</a>
					</div>
      	</div>
    </footer>
    
  

  <!-- loader -->
  <div id="ftco-loader" class="show fullscreen"><svg class="circular" width="48px" height="48px"><circle class="path-bg" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke="#eeeeee"/><circle class="path" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke-miterlimit="10" stroke="#F96D00"/></svg></div>


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