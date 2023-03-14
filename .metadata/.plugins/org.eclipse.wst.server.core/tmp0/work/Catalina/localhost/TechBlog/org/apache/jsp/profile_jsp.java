/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.67
 * Generated at: 2023-02-01 11:50:49 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.tech.blog.entities.Category;
import java.util.ArrayList;
import com.tech.blog.helper.ConnectionProvider;
import com.tech.blog.entities.Post;
import com.tech.blog.dao.PostDao;
import java.io.File;
import com.tech.blog.entities.Message;
import com.tech.blog.entities.User;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.tech.blog.helper.ConnectionProvider");
    _jspx_imports_classes.add("com.tech.blog.entities.Post");
    _jspx_imports_classes.add("com.tech.blog.dao.PostDao");
    _jspx_imports_classes.add("com.tech.blog.entities.Category");
    _jspx_imports_classes.add("com.tech.blog.entities.Message");
    _jspx_imports_classes.add("java.io.File");
    _jspx_imports_classes.add("java.util.ArrayList");
    _jspx_imports_classes.add("com.tech.blog.entities.User");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"error_page.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("    \r\n");
      out.write("      ");
 User user=(User) session.getAttribute("currentUser");
      if(user==null){ 
    	  response.sendRedirect("login_page.jsp");
        } 
       
      out.write("\r\n");
      out.write("        ");
 String s = request.getRealPath("/")+"pics"+File.separator+user.getProfile(); 
      out.write("\r\n");
      out.write("        <!DOCTYPE html>\r\n");
      out.write("        <html>\r\n");
      out.write("\r\n");
      out.write("        <head>\r\n");
      out.write("          <meta charset=\"UTF-8\">\r\n");
      out.write("          <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\"\r\n");
      out.write("            integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\r\n");
      out.write("          <link rel=\"stylesheet\"\r\n");
      out.write("            href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("          <link rel=\"stylesheet\" type=\"text/css\" href=\"css/mystyle.css\">\r\n");
      out.write("          <title>Insert title here</title>\r\n");
      out.write("        </head>\r\n");
      out.write("\r\n");
      out.write("        <body>\r\n");
      out.write("          <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\r\n");
      out.write("            <a class=\"navbar-brand\" href=\"index.jsp\"><span class=\"fa fa-life-bouy\"></span> Tech Blog</a>\r\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\"\r\n");
      out.write("              aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("              <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("            </button>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("              <ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("                <li class=\"nav-item active\">\r\n");
      out.write("                  <a class=\"nav-link\" href=\"#\"><span class=\"fa fa-area-chart\"></span> Learn Coding <span\r\n");
      out.write("                      class=\"sr-only\">(current)</span></a>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("                <li class=\"nav-item dropdown\">\r\n");
      out.write("                  <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\"\r\n");
      out.write("                    aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                    <span class=\"fa fa-briefcase\"></span> categories\r\n");
      out.write("                  </a>\r\n");
      out.write("                  <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("                    <a class=\"dropdown-item\" href=\"#\">Programming</a>\r\n");
      out.write("                    <a class=\"dropdown-item\" href=\"#\">Project</a>\r\n");
      out.write("                    <a class=\"dropdown-item\" href=\"#\">Data Structure</a>\r\n");
      out.write("                    <div class=\"dropdown-divider\"></div>\r\n");
      out.write("\r\n");
      out.write("                  </div>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                  <a class=\"nav-link\" href=\"#\"><span class=\"fa fa-envelope\"></span> Contact</a>\r\n");
      out.write("                </li>\r\n");
      out.write("				 <li class=\"nav-item\">\r\n");
      out.write("                  <a class=\"nav-link\" href=\"#!\" data-toggle=\"modal\" data-target=\"#add-post-detail\"><span class=\"fa fa-asterisk\"></span> Do Post</a>\r\n");
      out.write("                </li>\r\n");
      out.write("              </ul>\r\n");
      out.write("              <form class=\"form-inline my-2 my-lg-0\">\r\n");
      out.write("                <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\r\n");
      out.write("                <button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\">Search</button>\r\n");
      out.write("              </form>\r\n");
      out.write("\r\n");
      out.write("              <ul class=\"navbar-nav mr-right\">\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                  <a class=\"nav-link\" href=\"#!\" data-toggle=\"modal\" data-target=\"#profile-modal\"><span\r\n");
      out.write("                      class=\"fa fa-user-circle \"></span>\r\n");
      out.write("                    ");
      out.print(user.getName() );
      out.write("\r\n");
      out.write("                  </a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                  <a class=\"nav-link\" href=\"LogoutServlet\"><span class=\"fa fa-user-plus \"></span> Logout</a>\r\n");
      out.write("                </li>\r\n");
      out.write("              </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("          </nav>\r\n");
      out.write("          <!-- nav end here -->\r\n");
      out.write("          \r\n");
      out.write("          <!-- main body of the page -->\r\n");
      out.write("          \r\n");
      out.write("          <main>\r\n");
      out.write("          		<div class=\"container\">\r\n");
      out.write("          				<div class=\"row mt-4\">\r\n");
      out.write("          					<div class=\"col-md-4\">\r\n");
      out.write("          						<div class=\"list-group\">\r\n");
      out.write("          							<a href=\"#\" onclick=\"getPosts(0,this)\" class=\"c-link list-group-item list-group-item-action active\"> All Posts </a>\r\n");
      out.write("          							");

          								PostDao d = new PostDao(ConnectionProvider.getConnection());
          								ArrayList<Category> list1 = d.getAllCategories();
          								for(Category c:list1){
          							
      out.write("\r\n");
      out.write("          									<a href=\"#\" onclick=\"getPosts(");
      out.print(c.getcId() );
      out.write(",this)\"  class=\"c-link list-group-item list-group-item-action \"> ");
      out.print(c.getName() );
      out.write("</a>\r\n");
      out.write("          							\r\n");
      out.write("          							");


          								}
          							
      out.write("\r\n");
      out.write("          						 </div>\r\n");
      out.write("          					</div>\r\n");
      out.write("          					\r\n");
      out.write("          					<!-- second column -->\r\n");
      out.write("          					<div class=\"col-md-8\">\r\n");
      out.write("          						<div class=\"container text-center \" id=\"loader\">\r\n");
      out.write("          							<i class=\"fa fa-refresh fa-4x fa-spin\"></i>\r\n");
      out.write("          							<h3 class=\"mt-2\">Loading ...</h3>\r\n");
      out.write("          						</div>\r\n");
      out.write("          						<div class=\"container-fluid\" id=\"post-container\"></div>\r\n");
      out.write("          					\r\n");
      out.write("          					</div>\r\n");
      out.write("          				\r\n");
      out.write("          				</div>\r\n");
      out.write("          		 </div>\r\n");
      out.write("          </main>\r\n");
      out.write("          \r\n");
      out.write("          <!--End main body of the page -->\r\n");
      out.write("          <!-- Button trigger modal -->\r\n");
      out.write("\r\n");
      out.write("			");
 Message m = (Message) session.getAttribute("msg");
				if(m!=null){
			
      out.write("\r\n");
      out.write("			<div class=\"alert ");
      out.print( m.getCssClass() );
      out.write("\" role=\"alert\">\r\n");
      out.write("					");
      out.print(m.getContent() );
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("			");

					session.removeAttribute("msg");
				}
			
      out.write("\r\n");
      out.write("          <!-- Modal -->\r\n");
      out.write("          <div class=\"modal fade\" id=\"profile-modal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\"\r\n");
      out.write("            aria-hidden=\"true\">\r\n");
      out.write("            <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("              <div class=\"modal-content\">\r\n");
      out.write("                <div class=\"modal-header\">\r\n");
      out.write("\r\n");
      out.write("                  <h5 class=\"modal-title\" id=\"exampleModalLabel\">Tech Blog</h5>\r\n");
      out.write("                  <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("                    <span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("                  </button>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"modal-body\">\r\n");
      out.write("                  <div class=\" container text-center\">\r\n");
      out.write("                    <img alt=\"Profile\" src=\"pics/");
      out.print(user.getProfile());
      out.write("\"\r\n");
      out.write("                      style=\"border-radius: 50% ; width: 150px; height: 150px;\"><br>\r\n");
      out.write("                    <h5 class=\"modal-title mt-3\" id=\"exampleModalLabel\">\r\n");
      out.write("                      ");
      out.print(user.getName() );
      out.write("\r\n");
      out.write("                    </h5><br>\r\n");
      out.write("                    <div id=\"profile-details\">\r\n");
      out.write("                      <table class=\"table\">\r\n");
      out.write("                        <tbody>\r\n");
      out.write("                          <tr>\r\n");
      out.write("                            <th scope=\"row\">ID </th>\r\n");
      out.write("                            <td>\r\n");
      out.write("                              ");
      out.print( user.getId() );
      out.write("\r\n");
      out.write("                            </td>\r\n");
      out.write("                          </tr>\r\n");
      out.write("                          <tr>\r\n");
      out.write("                            <th scope=\"row\">Email </th>\r\n");
      out.write("                            <td>\r\n");
      out.write("                              ");
      out.print(user.getEmail() );
      out.write("\r\n");
      out.write("                            </td>\r\n");
      out.write("                          </tr>\r\n");
      out.write("                          <tr>\r\n");
      out.write("                            <th scope=\"row\">Gender </th>\r\n");
      out.write("                            <td>\r\n");
      out.write("                              ");
      out.print(user.getGender() );
      out.write("\r\n");
      out.write("                            </td>\r\n");
      out.write("                          </tr>\r\n");
      out.write("                          <tr>\r\n");
      out.write("                            <th scope=\"row\">About</th>\r\n");
      out.write("                            <td>\r\n");
      out.write("                              ");
      out.print(user.getAbout() );
      out.write("\r\n");
      out.write("                            </td>\r\n");
      out.write("                          </tr>\r\n");
      out.write("                          <tr>\r\n");
      out.write("                            <th scope=\"row\">Registered On </th>\r\n");
      out.write("                            <td>\r\n");
      out.write("                              ");
      out.print(user.getDateAndTime().toString() );
      out.write("\r\n");
      out.write("                            </td>\r\n");
      out.write("                          </tr>\r\n");
      out.write("                        </tbody>\r\n");
      out.write("                      </table>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div id=\"profile-edit\" style=\"display: none; \">\r\n");
      out.write("                      <form action=\"EditServlet\" method=\"post\" enctype=\"multipart/form-data\">\r\n");
      out.write("                        <table class=\"table\">\r\n");
      out.write("                          <tr>\r\n");
      out.write("                            <td>Id</td>\r\n");
      out.write("                            <td>\r\n");
      out.write("                              ");
      out.print(user.getId() );
      out.write("\r\n");
      out.write("                            </td>\r\n");
      out.write("                          </tr>\r\n");
      out.write("                          <tr>\r\n");
      out.write("                            <td>Name</td>\r\n");
      out.write("                            <td><input type=\"text\" class=\"form-control\" name=\"user_name\" value=\"");
      out.print(user.getName());
      out.write("\">\r\n");
      out.write("                            </td>\r\n");
      out.write("                          </tr>\r\n");
      out.write("                          <tr>\r\n");
      out.write("                            <td>Email</td>\r\n");
      out.write("                            <td><input type=\"email\" class=\"form-control\" name=\"user_email\" value=\"");
      out.print(user.getEmail());
      out.write("\">\r\n");
      out.write("                            </td>\r\n");
      out.write("                          </tr>\r\n");
      out.write("                          <tr>\r\n");
      out.write("                            <td>password</td>\r\n");
      out.write("                            <td><input type=\"password\" class=\"form-control\" name=\"user_password\"\r\n");
      out.write("                                value=\"");
      out.print(user.getPassword());
      out.write("\"></td>\r\n");
      out.write("                          </tr>\r\n");
      out.write("                          <tr>\r\n");
      out.write("                            <td><label for=\"user_gender\">Gender</label><br></td>\r\n");
      out.write("                            <td>\r\n");
      out.write("                              <input name=\"user_gender\" type=\"radio\" id=\"male\" value=\"male\"> Male\r\n");
      out.write("                              <input name=\"user_gender\" type=\"radio\" id=\"female\" value=\"female\"> Female\r\n");
      out.write("\r\n");
      out.write("                            </td>\r\n");
      out.write("                          </tr>\r\n");
      out.write("                          <tr>\r\n");
      out.write("                            <td>About</td>\r\n");
      out.write("                            <td><textarea class=\"form-control\" rows=\"3\"\r\n");
      out.write("                                name=\"user_about\">");
      out.print(user.getAbout());
      out.write("</textarea></td>\r\n");
      out.write("                          </tr>\r\n");
      out.write("                           <tr>\r\n");
      out.write("                            <td>New Profile</td>\r\n");
      out.write("                            \r\n");
      out.write("      \r\n");
      out.write("                            <td><input type=\"file\"  name=\"image\" value=\"");
      out.print(s);
      out.write("\"></td>\r\n");
      out.write("                          </tr>\r\n");
      out.write("                        </table>\r\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-outline-primary\">save</button>\r\n");
      out.write("                      </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"modal-footer\">\r\n");
      out.write("                  <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Close</button>\r\n");
      out.write("                  <button id=\"edit-profile-button\" type=\"button\" class=\"btn btn-primary\">Edit</button>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          \r\n");
      out.write("		 <!-- Button trigger modal -->\r\n");
      out.write("\r\n");
      out.write("<!-- Modal -->\r\n");
      out.write("<div class=\"modal fade\" id=\"add-post-detail\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("  <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("    <div class=\"modal-content\">\r\n");
      out.write("      <div class=\"modal-header\">\r\n");
      out.write("        <h5 class=\"modal-title\" id=\"exampleModalLabel\">Provide Post Detail</h5>\r\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("          <span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("        </button>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"modal-body\">\r\n");
      out.write("        <form id=\"add-post-form\" >\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"form-group\">\r\n");
      out.write("        	<input name=\"pTitle\" type=\"text\" placeholder=\"Enter post Title\" class=\"form-control\">\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("         <div class=\"form-group\">\r\n");
      out.write("        	<select name=\"cId\" class=\"form-control\">\r\n");
      out.write("        		<option selected disabled>---select category---</option>\r\n");
      out.write("        		");

        			PostDao postd = new PostDao(ConnectionProvider.getConnection());
                    ArrayList<Category> list = postd.getAllCategories();
                    for(Category c:list){
        		
      out.write("\r\n");
      out.write("        		<option value=\"");
      out.print(c.getcId());
      out.write('"');
      out.write('>');
      out.print(c.getName() );
      out.write("</option>\r\n");
      out.write("        		");
} 
      out.write("\r\n");
      out.write("        	</select>	\r\n");
      out.write("         </div>\r\n");
      out.write("         <div class=\"form-group\">\r\n");
      out.write("        	<textarea name=\"pContent\" class=\"form-control\" style=\"height:200px;\" placeholder=\"Enter your blog here\"></textarea>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"form-group\">\r\n");
      out.write("        	<textarea name=\"pCode\" class=\"form-control\" style=\"height:200px;\" placeholder=\"Enter your code here if any\"></textarea>\r\n");
      out.write("        </div>\r\n");
      out.write("         <div class=\"form-group\">\r\n");
      out.write("         <label >Select your file</label><br>\r\n");
      out.write("        	<input name=\"pic\" type=\"file\" class =\"form-control\">	\r\n");
      out.write("        </div>\r\n");
      out.write("            <div class=\"container text-center\">\r\n");
      out.write("        		<button type =\"submit\" class=\"btn btn-outline-primary\">Post</button>\r\n");
      out.write("        	</div>\r\n");
      out.write("        </form>\r\n");
      out.write("\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("          <script src=\"https://code.jquery.com/jquery-3.6.3.min.js\"\r\n");
      out.write("            integrity=\"sha256-pvPw+upLPUjgMXY0G+8O0xUf+/Im1MZjXxxgOcBQBXU=\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("          <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js\"\r\n");
      out.write("            integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\"\r\n");
      out.write("            crossorigin=\"anonymous\"></script>\r\n");
      out.write("          <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js\"\r\n");
      out.write("            integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\"\r\n");
      out.write("            crossorigin=\"anonymous\"></script>\r\n");
      out.write("            <script src=\"https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js\"></script>\r\n");
      out.write("            \r\n");
      out.write("            <script type=\"text/javascript\">\r\n");
      out.write("            $(document).ready(function () {\r\n");
      out.write("              console.log(\"ready\");\r\n");
      out.write("\r\n");
      out.write("              let editStatus = false;\r\n");
      out.write("\r\n");
      out.write("              $('#edit-profile-button').click(function () {\r\n");
      out.write("                if (editStatus == false) {\r\n");
      out.write("                  $(\"#profile-details\").hide();\r\n");
      out.write("                  $(\"#profile-edit\").show();\r\n");
      out.write("                  $(this).text(\"Back\");\r\n");
      out.write("                  editStatus = true;\r\n");
      out.write("                } else {\r\n");
      out.write("                  $(\"#profile-details\").show();\r\n");
      out.write("                  $(\"#profile-edit\").hide();\r\n");
      out.write("                  $(this).text(\"Edit\");\r\n");
      out.write("                  editStatus = false;\r\n");
      out.write("                }\r\n");
      out.write("              })\r\n");
      out.write("            })\r\n");
      out.write("          </script>\r\n");
      out.write("          <script type=\"text/javascript\">\r\n");
      out.write("          $(document).ready(function(){\r\n");
      out.write("        		console.log(\"Post sevlet\")\r\n");
      out.write("        		$(\"#add-post-form\").on('submit' , function(event){\r\n");
      out.write("        			event.preventDefault();\r\n");
      out.write("        			console.log(\"Post submited\");\r\n");
      out.write("        			let form = new FormData(this);\r\n");
      out.write("        			//send data\r\n");
      out.write("        		    $.ajax({\r\n");
      out.write("        				url: \"AddPostServlet\",\r\n");
      out.write("        				type:'POST',\r\n");
      out.write("        				data: form,\r\n");
      out.write("        				success:function(data,textStatus,jqXHR){\r\n");
      out.write("        					if(data.trim()==\"done\"){\r\n");
      out.write("        						swal(\"Good Job\",\"sava successfully\",\"success\");\r\n");
      out.write("        					}else{\r\n");
      out.write("        						swal(\"Error!!\",\"Something went wrong try again...\",\"error\");\r\n");
      out.write("        					}\r\n");
      out.write("        				\r\n");
      out.write("        					\r\n");
      out.write("        					\r\n");
      out.write("        				},\r\n");
      out.write("        				error:function(jqXHR,textStatus,errorThrown){\r\n");
      out.write("        					swal(\"Error!!\",\"Something went wrong try again...\",\"error\");\r\n");
      out.write("        				},\r\n");
      out.write("        				processData :false,\r\n");
      out.write("        				contentType : false\r\n");
      out.write("        			\r\n");
      out.write("        			});\r\n");
      out.write("        		})\r\n");
      out.write("        	})\r\n");
      out.write("          </script>\r\n");
      out.write("          <script type=\"text/javascript\">\r\n");
      out.write("          function getPosts(catId,active){\r\n");
      out.write("        	    $(\"#loader\").show();\r\n");
      out.write("        	  //  $(\"#post-container\").hide();\r\n");
      out.write("        	    $('.c-link').removeClass('active');\r\n");
      out.write("				$.ajax({\r\n");
      out.write("    				url: \"post_load.jsp\",\r\n");
      out.write("    				data: {cId: catId},\r\n");
      out.write("  				success:function(data,textStatus,jqXHR){\r\n");
      out.write("  					$(\"#loader\").hide();\r\n");
      out.write("  					$(\"#post-container\").html(data);\r\n");
      out.write("  					$(active).addClass('active');\r\n");
      out.write("  				//	$(\"#post-container\").show();\r\n");
      out.write("  					\r\n");
      out.write("\r\n");
      out.write("  				},\r\n");
      out.write("  				error:function(jqXHR,textStatus,errorThrown){\r\n");
      out.write("  					swal(\"Error!!\",\"Something went wrong try again...\",\"error\");\r\n");
      out.write("  				}\r\n");
      out.write("    			})\r\n");
      out.write("			}\r\n");
      out.write("	\r\n");
      out.write("          		$(document).ready(function(e){\r\n");
      out.write("          			let allPostRef=$('.c-link')[0];\r\n");
      out.write("          			getPosts(0,allPostRef );\r\n");
      out.write("          		 })\r\n");
      out.write("          \r\n");
      out.write("          </script>\r\n");
      out.write("        </body>\r\n");
      out.write("\r\n");
      out.write("        </html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}