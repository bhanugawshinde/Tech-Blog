<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="css/mystyle.css">
       
<title>Register Page</title>
</head>
<body>
   <%@include file="normal_navbar.jsp" %>
<main class =" d-flex align-items-center primary-background banner-background p-4" >
<div class="container">
<div class="row">
<div class="col-md-6 offset-md-3">
<div class="card m-4"  >
<div class ="card-header primary-background text-white text-center">
<span class="fa fa-user-plus fa-3x"></span><br>
Register here</div>
<div class="card-body">

<form id="reg-form" action="RegisterServlet" method="POST" >

    <div class="form-group">
    <label for="exampleInputEmail1">User Name</label>
    <input name="user_name" type="text" class="form-control" id="name" aria-describedby="emailHelp" placeholder="User Name">
    <small id="emailHelp" class="form-text text-muted">We'll never share your name with anyone else.</small>
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">Email address</label>
    <input name="user_email" type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input name="user_password" type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
  </div>
  
  <div class="form-group">
    <label for="user_gender">Gender</label><br>
   <input name="user_gender" type="radio" id="male"  value="male" > Male
  <input name="user_gender" type="radio" id="female"  value="female"> Female
    </div>
   <div class="form-group">
   <textarea class="form-control" name="about" id=""  rows="5" placeholder="Enter about yout self" ></textarea>
        </div>
  
  <div class="form-check">
    <input name="check" type="checkbox" class="form-check-input" id="exampleCheck1">
    <label class="form-check-label" for="exampleCheck1">Check me out</label>
  </div>
  <br>
  <div class ="container text-center " id ="loader" style="display:none;">
  <span class="fa fa-refresh fa-spin fa-3x"></span>
  <h4>Plese Wait...</h4>
  </div>
  <button id ="submit-btn" type="submit" class="btn btn-primary">Submit</button>
</form>
</div>
</div>
</div>
</div>
</div>
</main>
  <script src="https://code.jquery.com/jquery-3.6.3.min.js" integrity="sha256-pvPw+upLPUjgMXY0G+8O0xUf+/Im1MZjXxxgOcBQBXU=" crossorigin="anonymous"></script>
 <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
 <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
 <script src="js/javaScript.js" type="text/javascript"></script>
 <script src="https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	console.log("loaded.......")
	$('#reg-form').on('submit' , function(event){
		event.preventDefault();
		var form = new FormData(this);
		$("#submit-btn").hide();
		$("#loader").show();
		//send data
	    $.ajax({
			url: "RegisterServlet",
			type:'POST',
			data: form,
			success:function(data,textStatus,jqXHR){
				$("#submit-btn").show();
				$("#loader").hide();
				if(data.trim()==='done'){
					swal("Register Successfully")
					.then((value)=>{
						window.location="login_page.jsp";
					});
				}else{
					swal(data);
				}
				
			},
			error:function(jqXHR,textStatus,errorThrown){
				swal("Something went Wrong... \n Try Again!")
				$("#submit-btn").show();
				$("#loader").hide();
			},
			processData :false,
			contentType : false
		
		});
	})
})
</script>
</body>
</html>