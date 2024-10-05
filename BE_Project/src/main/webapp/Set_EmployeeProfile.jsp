<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	
	 <!-- Icons font CSS-->
    <link href="Profile_Assets/vendor/mdi-font/css/material-design-iconic-font.min.css" rel="stylesheet" media="all">
    <link href="Profile_Assets/vendor/font-awesome-4.7/css/font-awesome.min.css" rel="stylesheet" media="all">
    <!-- Font special for pages-->
    <link href="https://fonts.googleapis.com/css?family=Poppins:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

    <!-- Vendor CSS-->
    <link href="Profile_Assets/vendor/select2/select2.min.css" rel="stylesheet" media="all">
    <link href="Profile_Assets/vendor/datepicker/daterangepicker.css" rel="stylesheet" media="all">

    <!-- Main CSS-->
    <link href="Profile_Assets/css/main.css" rel="stylesheet" media="all">
</head>
<body>
	

	<div class="page-wrapper bg-gra-02 p-t-130 p-b-100 font-poppins">
        <div class="wrapper wrapper--w680">
            <div class="card card-4">
                <div class="card-body">
                    <center><h2 class="title">Fill The Profile Form</h2></center>
                    <form action="SaveUserProfile?name=${name}" method="post" onsubmit="return validateform()">
                        <div class="row row-space">
                            <div class="col-1">
                                <div class="input-group">
                                    <label class="label">Name :</label>
                                    <input class="input--style-4" type="text" name="name" value="${name}" readonly>
                                </div>
                            </div>
                            <div class="col-2">
                               <div class="input-group">
                                    <label class="label">Gender :</label>
                                    <div class="p-t-10">
                                        <label class="radio-container m-r-45">Male
                                            <input type="radio" checked="checked" name="gender" value="Male">
                                            <span class="checkmark"></span>
                                        </label>
                                        <label class="radio-container">Female
                                            <input type="radio" name="gender" value="Female">
                                            <span class="checkmark"></span>
                                        </label>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="label">Birthday :</label>
                                    <div class="input-group-icon">
                                        <input class="input--style-4 js-datepicker" type="text" name="birthday" required>
                                        <i class="zmdi zmdi-calendar-note input-icon js-btn-calendar"></i>
                                    </div>
                                </div>
                            </div>
                            <div class="col-2">
                                 <div class="input-group">
                                    <label class="label">Contact Number :</label>
                                    <input class="input--style-4" type="text" name="phone" pattern="[0-9]{10}" required>
                                   
                                </div>
                            </div>
                        </div>
                        
                        <label class="label">Email :</label>
                        <input class="input--style-4" type="email" name="email" value=${email} readonly>
                        <!--<div class="input-group">
                            <label class="label">Branch : </label>
                            <div class="rs-select2 js-select-simple select--no-search">
                                <select name="subject">
                                    <option disabled="disabled" selected="selected">Choose Branch</option>
                                    <option>IT</option>
                                    <option>COMS</option>
                                    <option>MECH</option>
                                </select>
                                <div class="select-dropdown"></div>
                            </div>
                        </div>-->
                        <input hidden class="input--style-4" type="email" name="img_url" value=${img_url} readonly>
                        <input hidden class="input--style-4" type="email" name="designation" value=${designation} readonly>
                        <input hidden class="input--style-4" type="email" name="branch" value=${branch} readonly>
                        <input hidden class="input--style-4" type="email" name="id" value=${id} readonly>
                        <div class="p-t-15">
                            <center><button class="btn btn--radius-2 btn--blue" type="submit" >Submit</button></center>
                        </div>
                    </form>
					
                </div>
            </div>
        </div>
    </div>
	<script type="text/javascript">
		
	</script>
    <!-- Jquery JS-->
    <script src="Profile_Assets/vendor/jquery/jquery.min.js"></script>
    <!-- Vendor JS-->
    <script src="Profile_Assets/vendor/select2/select2.min.js"></script>
    <script src="Profile_Assets/vendor/datepicker/moment.min.js"></script>
    <script src="Profile_Assets/vendor/datepicker/daterangepicker.js"></script>

    <!-- Main JS-->
    <script src="Profile_Assets/js/global.js"></script>
</body>
</html>