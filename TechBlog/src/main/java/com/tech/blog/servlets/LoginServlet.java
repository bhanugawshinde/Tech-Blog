package com.tech.blog.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.cj.protocol.Message;
import com.tech.blog.dao.UserDao;
import com.tech.blog.entities.User;
import com.tech.blog.helper.ConnectionProvider;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// login fatch userEmail and password from request
		response.setContentType("text/html");
		
		try {
			PrintWriter out = response.getWriter();
			String userEmail = request.getParameter("email");
			String userPassword = request.getParameter("password");
			
			UserDao dao = new UserDao(ConnectionProvider.getConnection());
			User u = dao.getUserByEmailAndPassword(userEmail, userPassword);
			
			if(u==null) {
				//Login 
				com.tech.blog.entities.Message msg = new com.tech.blog.entities.Message("Invalid Details ! try with another", "error", "alert-danger");
				HttpSession s = request.getSession();
				s.setAttribute("msg",msg);
				response.sendRedirect("login_page.jsp");
			}else {
				//login success
				HttpSession s = request.getSession();
				s.setAttribute("currentUser", u);
				response.sendRedirect("profile.jsp");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
