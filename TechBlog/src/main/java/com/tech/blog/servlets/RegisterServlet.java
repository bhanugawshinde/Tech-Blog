package com.tech.blog.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tech.blog.dao.UserDao;
import com.tech.blog.entities.User;
import com.tech.blog.helper.ConnectionProvider;

/**
 * Servlet implementation class RegisterServlet
 */
@SuppressWarnings("serial")
@MultipartConfig
public class RegisterServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		try {
			PrintWriter out = response.getWriter();
			String check = request.getParameter("check");
			if(check==null) {
				out.print("box not chcked");
			}else {
				// save data in data base
				String name = request.getParameter("user_name");
				String email = request.getParameter("user_email");
				String password = request.getParameter("user_password");
				String gender = request.getParameter("user_gender");
				String about = request.getParameter("about");
				
				User user = new User(name, email, password, gender, about);
				UserDao dao = new UserDao(ConnectionProvider.getConnection());
				if (dao.saveUser(user)) {
					//Save user
					out.print("done");
				}else {
					out.print("error");
				}
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
