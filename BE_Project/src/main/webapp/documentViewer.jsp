<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
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
	    
	    <style>
			div {text-align: center;}
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
              <a class="nav-link dropdown-toggle" href="#" id="dropdown04" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Shop</a>
              <div class="dropdown-menu" aria-labelledby="dropdown04">
              	<a class="dropdown-item" href="shop.html">Shop</a>
              	<a class="dropdown-item" href="wishlist.html">Wishlist</a>
                <a class="dropdown-item" href="product-single.html">Single Product</a>
                <a class="dropdown-item" href="cart.html">Cart</a>
                <a class="dropdown-item" href="checkout.html">Checkout</a>
              </div>
            </li>
	          <li class="nav-item"><a href="about.html" class="nav-link">About</a></li>
	          <li class="nav-item"><a href="Blog?email=${email}"class="nav-link">Blog</a></li>
	          <li class="nav-item"><a href="contact.html" class="nav-link">Contact</a></li>
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
	 <h1>${file}</h1>
	<div><iframe src="uploads/${file}" width="1000" height="600" > </iframe></div>
</body>
</html>