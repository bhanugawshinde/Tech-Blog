<%@page import="com.tech.blog.dao.LikeDao" %>
  <%@page import="java.text.DateFormat" %>
    <%@page import="com.tech.blog.dao.UserDao" %>
      <%@page import="com.tech.blog.entities.Message" %>
        <%@page import="com.tech.blog.entities.Category" %>
          <%@page import="java.util.ArrayList" %>
            <%@page import="com.tech.blog.entities.Post" %>
              <%@page import="com.tech.blog.helper.ConnectionProvider" %>
                <%@page import="com.tech.blog.dao.PostDao" %>
                  <%@page import="java.io.File" %>
                    <%@page import="com.tech.blog.entities.User" %>
                      <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
                        <%@page errorPage="error_page.jsp" %>
                          <% User user=(User) session.getAttribute("currentUser"); if(user==null){
                            response.sendRedirect("login_page.jsp"); } %>
                            <% String s=request.getRealPath("/")+"pics"+File.separator+user.getProfile(); %>
                              <% int postId=Integer.parseInt(request.getParameter("postId")); PostDao d=new
                                PostDao(ConnectionProvider.getConnection()); Post p=d.getPostByPostId(postId); %>



                                <!DOCTYPE html>
                                <html>

                                <head>
                                  <meta charset="UTF-8">
                                  <link rel="stylesheet"
                                    href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
                                    integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
                                    crossorigin="anonymous">
                                  <link rel="stylesheet"
                                    href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
                                  <link rel="stylesheet" type="text/css" href="css/mystyle.css">
                                  <style type="text/css">
                                    .post-title {
                                      font-weight: 100;
                                      font-size: 30px;
                                    }

                                    .post-content {
                                      font-weight: 100;
                                      font-size: 25px;
                                    }

                                    .post-date {
                                      font-style: italic;
                                      font-weight: bold;
                                    }

                                    .post-user-info {
                                      font-size: 20px;
                                    }

                                    .row-user {
                                      border: 1px solid #e2e2e2;
                                      padding-top: 15px;
                                    }
                                  </style>

                                  <title>
                                    <%=p.getpTitle() %> || Tech Blog
                                  </title>

                                </head>

                                <body>
                                  <!--  nab bar start -->
                                  <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
                                    <a class="navbar-brand" href="index.jsp"><span class="fa fa-life-bouy"></span> Tech
                                      Blog</a>
                                    <button class="navbar-toggler" type="button" data-toggle="collapse"
                                      data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                                      aria-expanded="false" aria-label="Toggle navigation">
                                      <span class="navbar-toggler-icon"></span>
                                    </button>

                                    <div class="collapse navbar-collapse" id="navbarSupportedContent">
                                      <ul class="navbar-nav mr-auto">
                                        <li class="nav-item active">
                                          <a class="nav-link" href="#"><span class="fa fa-area-chart"></span> Learn
                                            Coding <span class="sr-only">(current)</span></a>
                                        </li>

                                        <li class="nav-item dropdown">
                                          <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
                                            data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                            <span class="fa fa-briefcase"></span> categories
                                          </a>
                                          <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                            <a class="dropdown-item" href="#">Programming</a>
                                            <a class="dropdown-item" href="#">Project</a>
                                            <a class="dropdown-item" href="#">Data Structure</a>
                                            <div class="dropdown-divider"></div>

                                          </div>
                                        </li>
                                        <li class="nav-item">
                                          <a class="nav-link" href="#"><span class="fa fa-envelope"></span> Contact</a>
                                        </li>
                                        <li class="nav-item">
                                          <a class="nav-link" href="#!" data-toggle="modal"
                                            data-target="#add-post-detail"><span class="fa fa-asterisk"></span> Do
                                            Post</a>
                                        </li>
                                      </ul>
                                      <form class="form-inline my-2 my-lg-0">
                                        <input class="form-control mr-sm-2" type="search" placeholder="Search"
                                          aria-label="Search">
                                        <button class="btn btn-outline-success my-2 my-sm-0"
                                          type="submit">Search</button>
                                      </form>

                                      <ul class="navbar-nav mr-right">
                                        <li class="nav-item">
                                          <a class="nav-link" href="#!" data-toggle="modal"
                                            data-target="#profile-modal"><span class="fa fa-user-circle "></span>
                                            <%=user.getName() %>
                                          </a>
                                        </li>
                                        <li class="nav-item">
                                          <a class="nav-link" href="LogoutServlet"><span
                                              class="fa fa-user-plus "></span> Logout</a>
                                        </li>
                                      </ul>
                                    </div>
                                  </nav>

                                  <!--  nav bar end  -->
                                  <!--  Main content of body  -->

                                  <div class="container">
                                    <div class="row my-4">
                                      <div class="col-md-6 offset-md-3">
                                        <div class="card">
                                          <div class="card-header primary-background text-white">
                                            <h4 class="post-title">
                                              <%=p.getpTitle() %>
                                            </h4>
                                          </div>
                                          <div class="card-body">
                                            <img class="card-img-top my-2" alt="title pic"
                                              src="blog_pic/<%=p.getpPic() %>">
                                            <div class="row my-3 row-user">
                                              <div class="col-md-6">
                                                <% UserDao ud=new UserDao(ConnectionProvider.getConnection()) ; User
                                                  u=ud.getUserByUserId(p.getUserId()); %>
                                                  <p class="post-user-info"> <a href="#">
                                                      <%=u.getName() %>
                                                    </a></p>
                                              </div>
                                              <div class="col-md-6">
                                                <p class="post-date">
                                                  <%= DateFormat.getDateTimeInstance().format(p.getpDate()) %>
                                                </p>
                                              </div>

                                            </div>
                                            <p class="post-content">
                                              <%=p.getpContent()%>
                                            </p>


                                            <br><br>
                                            <div class="post-code">
                                              <pre><%=p.getpCode() %></pre>
                                            </div>

                                          </div>
                                          <div class="card-footer primary-background text-center">
                                            <% LikeDao ld=new LikeDao(ConnectionProvider.getConnection()); %>
                                              <a href="#" onclick="doLike(<%=p.getpId() %>,<%=user.getId() %>)"
                                                class="btn btn-outline-light btn-sm"> <i class="fa fa-thumbs-o-up like-color">
                                                  <span id="like-counter-<%=p.getpId()%>">
                                                    <%=ld.countLikeOnPost(p.getpId()) %>
                                                  </span></i></a>
                                              <a href="#" class="btn btn-outline-light btn-sm"> <i
                                                  class="fa fa-comments-o"> <span>10 </span></i></a>
                                          </div>

                                        </div>

                                      </div>
                                    </div>
                                  </div>







                                  <!--  End of Main content of body  -->
                                  <!--    -->




                                  <!--  this is copy fron profile page -->
                                  <% Message m=(Message) session.getAttribute("msg"); if(m!=null){ %>
                                    <div class="alert <%= m.getCssClass() %>" role="alert">
                                      <%=m.getContent() %>
                                    </div>
                                    <% session.removeAttribute("msg"); } %>
                                      <!-- Modal -->
                                      <div class="modal fade" id="profile-modal" tabindex="-1" role="dialog"
                                        aria-labelledby="exampleModalLabel" aria-hidden="true">
                                        <div class="modal-dialog" role="document">
                                          <div class="modal-content">
                                            <div class="modal-header">

                                              <h5 class="modal-title" id="exampleModalLabel">Tech Blog</h5>
                                              <button type="button" class="close" data-dismiss="modal"
                                                aria-label="Close">
                                                <span aria-hidden="true">&times;</span>
                                              </button>
                                            </div>
                                            <div class="modal-body">
                                              <div class=" container text-center">
                                                <img alt="Profile" src="pics/<%=user.getProfile()%>"
                                                  style="border-radius: 50% ; width: 150px; height: 150px;"><br>
                                                <h5 class="modal-title mt-3" id="exampleModalLabel">
                                                  <%=user.getName() %>
                                                </h5><br>
                                                <div id="profile-details">
                                                  <table class="table">
                                                    <tbody>
                                                      <tr>
                                                        <th scope="row">ID </th>
                                                        <td>
                                                          <%= user.getId() %>
                                                        </td>
                                                      </tr>
                                                      <tr>
                                                        <th scope="row">Email </th>
                                                        <td>
                                                          <%=user.getEmail() %>
                                                        </td>
                                                      </tr>
                                                      <tr>
                                                        <th scope="row">Gender </th>
                                                        <td>
                                                          <%=user.getGender() %>
                                                        </td>
                                                      </tr>
                                                      <tr>
                                                        <th scope="row">About</th>
                                                        <td>
                                                          <%=user.getAbout() %>
                                                        </td>
                                                      </tr>
                                                      <tr>
                                                        <th scope="row">Registered On </th>
                                                        <td>
                                                          <%=user.getDateAndTime().toString() %>
                                                        </td>
                                                      </tr>
                                                    </tbody>
                                                  </table>
                                                </div>

                                                <div id="profile-edit" style="display: none; ">
                                                  <form action="EditServlet" method="post"
                                                    enctype="multipart/form-data">
                                                    <table class="table">
                                                      <tr>
                                                        <td>Id</td>
                                                        <td>
                                                          <%=user.getId() %>
                                                        </td>
                                                      </tr>
                                                      <tr>
                                                        <td>Name</td>
                                                        <td><input type="text" class="form-control" name="user_name"
                                                            value="<%=user.getName()%>">
                                                        </td>
                                                      </tr>
                                                      <tr>
                                                        <td>Email</td>
                                                        <td><input type="email" class="form-control" name="user_email"
                                                            value="<%=user.getEmail()%>">
                                                        </td>
                                                      </tr>
                                                      <tr>
                                                        <td>password</td>
                                                        <td><input type="password" class="form-control"
                                                            name="user_password" value="<%=user.getPassword()%>"></td>
                                                      </tr>
                                                      <tr>
                                                        <td><label for="user_gender">Gender</label><br></td>
                                                        <td>
                                                          <input name="user_gender" type="radio" id="male" value="male">
                                                          Male
                                                          <input name="user_gender" type="radio" id="female"
                                                            value="female"> Female

                                                        </td>
                                                      </tr>
                                                      <tr>
                                                        <td>About</td>
                                                        <td><textarea class="form-control" rows="3"
                                                            name="user_about"><%=user.getAbout()%></textarea></td>
                                                      </tr>
                                                      <tr>
                                                        <td>New Profile</td>


                                                        <td><input type="file" name="image" value="<%=s%>"></td>
                                                      </tr>
                                                    </table>
                                                    <button type="submit" class="btn btn-outline-primary">save</button>
                                                  </form>
                                                </div>
                                              </div>
                                            </div>
                                            <div class="modal-footer">
                                              <button type="button" class="btn btn-secondary"
                                                data-dismiss="modal">Close</button>
                                              <button id="edit-profile-button" type="button"
                                                class="btn btn-primary">Edit</button>
                                            </div>
                                          </div>
                                        </div>
                                      </div>

                                      <!-- Button trigger modal -->

                                      <!-- Modal -->
                                      <div class="modal fade" id="add-post-detail" tabindex="-1" role="dialog"
                                        aria-labelledby="exampleModalLabel" aria-hidden="true">
                                        <div class="modal-dialog" role="document">
                                          <div class="modal-content">
                                            <div class="modal-header">
                                              <h5 class="modal-title" id="exampleModalLabel">Provide Post Detail</h5>
                                              <button type="button" class="close" data-dismiss="modal"
                                                aria-label="Close">
                                                <span aria-hidden="true">&times;</span>
                                              </button>
                                            </div>
                                            <div class="modal-body">
                                              <form id="add-post-form">

                                                <div class="form-group">
                                                  <input name="pTitle" type="text" placeholder="Enter post Title"
                                                    class="form-control">
                                                </div>

                                                <div class="form-group">
                                                  <select name="cId" class="form-control">
                                                    <option selected disabled>---select category---</option>
                                                    <% PostDao postd=new PostDao(ConnectionProvider.getConnection());
                                                      ArrayList<Category> list = postd.getAllCategories();
                                                      for(Category c:list){
                                                      %>
                                                      <option value="<%=c.getcId()%>">
                                                        <%=c.getName() %>
                                                      </option>
                                                      <%} %>
                                                  </select>
                                                </div>
                                                <div class="form-group">
                                                  <textarea name="pContent" class="form-control" style="height:200px;"
                                                    placeholder="Enter your blog here"></textarea>
                                                </div>
                                                <div class="form-group">
                                                  <textarea name="pCode" class="form-control" style="height:200px;"
                                                    placeholder="Enter your code here if any"></textarea>
                                                </div>
                                                <div class="form-group">
                                                  <label>Select your file</label><br>
                                                  <input name="pic" type="file" class="form-control">
                                                </div>
                                                <div class="container text-center">
                                                  <button type="submit" class="btn btn-outline-primary">Post</button>
                                                </div>
                                              </form>

                                            </div>
                                          </div>
                                        </div>
                                      </div>
                                      <script src="https://code.jquery.com/jquery-3.6.3.min.js"
                                        integrity="sha256-pvPw+upLPUjgMXY0G+8O0xUf+/Im1MZjXxxgOcBQBXU="
                                        crossorigin="anonymous"></script>
                                      <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
                                        integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
                                        crossorigin="anonymous"></script>
                                      <script
                                        src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
                                        integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
                                        crossorigin="anonymous"></script>
                                      <script
                                        src="https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js"></script>

                                      <script src="js/javaScript.js"></script>

                                      </script>

                                      <script type="text/javascript">
                                        $(document).ready(function () {
                                          console.log("ready");

                                          let editStatus = false;

                                          $('#edit-profile-button').click(function () {
                                            if (editStatus == false) {
                                              $("#profile-details").hide();
                                              $("#profile-edit").show();
                                              $(this).text("Back");
                                              editStatus = true;
                                            } else {
                                              $("#profile-details").show();
                                              $("#profile-edit").hide();
                                              $(this).text("Edit");
                                              editStatus = false;
                                            }
                                          })
                                        })
                                      </script>
                                      <script type="text/javascript">
                                        $(document).ready(function () {
                                          console.log("Post sevlet")
                                          $("#add-post-form").on('submit', function (event) {
                                            event.preventDefault();
                                            console.log("Post submited");
                                            let form = new FormData(this);
                                            //send data
                                            $.ajax({
                                              url: "AddPostServlet",
                                              type: 'POST',
                                              data: form,
                                              success: function (data, textStatus, jqXHR) {
                                                if (data.trim() == "done") {
                                                  swal("Good Job", "sava successfully", "success");
                                                } else {
                                                  swal("Error!!", "Something went wrong try again...", "error");
                                                }



                                              },
                                              error: function (jqXHR, textStatus, errorThrown) {
                                                swal("Error!!", "Something went wrong try again...", "error");
                                              },
                                              processData: false,
                                              contentType: false

                                            });
                                          })
                                        })
                                      </script>
                                </body>

                                </html>