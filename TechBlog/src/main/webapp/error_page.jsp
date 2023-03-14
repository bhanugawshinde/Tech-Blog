<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="css/mystyle.css">
       
<title>Insert title here</title>
</head>
<body>
<div class =" container text-center">
<img alt="error" src="img/error.png" class="img-fluid" style="width:20vw; margin:10px;">
<h3 class="display-3 m-4" >Sorry ! Something Went Wrong...</h3>
<%=exception %><br>
<a href="index.jsp" class="btn primary-background btn-lg text-white mt-3">Home</a>
</div>
</body>
</html>