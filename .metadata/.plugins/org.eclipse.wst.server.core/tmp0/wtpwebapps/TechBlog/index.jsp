<%@page import="com.tech.blog.helper.ConnectionProvider" %>
  <%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@page import="java.sql.*" %>
      <!DOCTYPE html>
      <html>

      <head>
        <meta charset="UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

        <link rel="stylesheet"
          href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" type="text/css" href="css/mystyle.css">
        <title>Tech Blog</title>
      </head>

      <body>
        <%@include file="normal_navbar.jsp" %>
          <div class="container-fluid m-0 p-0">
            <div class="jumbotron primary-background text-white banner-background">
              <div class="container ">
                <h3 class="display-3">Welcome to Technical Blog</h3>
                <p>A programming language is a system of notation for writing computer programs.[1] Most programming
                  languages are text-based formal languages, but they may also be graphical. They are a kind of computer
                  language.</p>
                <p>Programming language theory is the subfield of computer science that studies the design,
                  implementation, analysis, characterization, and classification of programming languages.</p>
                <br>
                <a href="register_page.jsp" class="btn btn-outline-light btn-lg mb-2"><span class="fa fa-user-plus"></span> Start ! its
                  Free</a>
                <a href="login_page.jsp" class="btn btn-outline-light btn-lg mb-2"><span class="fa fa-user-circle fa-spin"></span>
                  Login</a>
              </div>
            </div>
          </div>

          <div class="container">

            <div class="row mb-2">

              <div class="col-md-4">
                <div class="card" style="width: 18rem;">
                  <div class="card-body">
                    <h5 class="card-title">Java Programming</h5>
                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the
                      card's content.</p>
                    <a href="#" class="btn primary-background text-white">Read more</a>
                  </div>
                </div>
              </div>

              <div class="col-md-4">
                <div class="card" style="width: 18rem;">
                  <div class="card-body">
                    <h5 class="card-title">Java Programming</h5>
                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the
                      card's content.</p>
                    <a href="#" class="btn primary-background text-white">Read more</a>
                  </div>
                </div>
              </div>

              <div class="col-md-4">
                <div class="card" style="width: 18rem;">
                  <div class="card-body">
                    <h5 class="card-title">Java Programming</h5>
                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the
                      card's content.</p>
                    <a href="#" class="btn primary-background text-white">Read more</a>
                  </div>
                </div>
              </div>

            </div>

            <div class="row mb-2">

              <div class="col-md-4">
                <div class="card" style="width: 18rem;">
                  <div class="card-body">
                    <h5 class="card-title">Java Programming</h5>
                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the
                      card's content.</p>
                    <a href="#" class="btn primary-background text-white">Read more</a>
                  </div>
                </div>
              </div>

              <div class="col-md-4">
                <div class="card" style="width: 18rem;">
                  <div class="card-body">
                    <h5 class="card-title">Java Programming</h5>
                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the
                      card's content.</p>
                    <a href="#" class="btn primary-background text-white">Read more</a>
                  </div>
                </div>
              </div>

              <div class="col-md-4">
                <div class="card" style="width: 18rem;">
                  <div class="card-body">
                    <h5 class="card-title">Java Programming</h5>
                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the
                      card's content.</p>
                    <a href="#" class="btn primary-background text-white">Read more</a>
                  </div>
                </div>
              </div>

            </div>

          </div>


          <script src="https://code.jquery.com/jquery-3.6.3.min.js"
            integrity="sha256-pvPw+upLPUjgMXY0G+8O0xUf+/Im1MZjXxxgOcBQBXU=" crossorigin="anonymous"></script>
          <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
            integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
            crossorigin="anonymous"></script>
          <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
            integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
            crossorigin="anonymous"></script>
          <script src="js/javaScript.js" type="text/javascript">

          </script>
      </body>

      </html>