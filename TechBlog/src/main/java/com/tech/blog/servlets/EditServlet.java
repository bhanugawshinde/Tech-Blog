package com.tech.blog.servlets;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.mysql.cj.protocol.Message;
import com.tech.blog.dao.UserDao;
import com.tech.blog.entities.User;
import com.tech.blog.helper.ConnectionProvider;
import com.tech.blog.helper.Helper;

/**
 * Servlet implementation class EditServlet
 */
@MultipartConfig
@WebServlet("/EditServlet")
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		try {
			String userEmail = request.getParameter("user_email");
			String userName = request.getParameter("user_name");
			String userPassword = request.getParameter("user_password");
			String userAbout = request.getParameter("user_about");
			
			Part part = request.getPart("image");
			String imageName = part.getSubmittedFileName();
			//get the user form the session 
			HttpSession s = request.getSession();
			User user = (User) s.getAttribute("currentUser");
			user.setEmail(userEmail);
			user.setName(userName);
			user.setPassword(userPassword);
			user.setAbout(userAbout);
			String oldFilePath = user.getProfile();
			if(part.getSize()<=0) imageName = user.getProfile() ;
			
			user.setProfile(imageName);
			
			//Update database
			
			UserDao userDao = new UserDao(ConnectionProvider.getConnection());
			boolean ans = userDao.updateUser(user);
			PrintWriter out=response.getWriter();
			if(ans) {
				if(part.getSize()>0) {
					String oldPath = request.getRealPath("/")+"pics"+File.separator+oldFilePath;
					String path = request.getRealPath("/")+"pics"+File.separator+user.getProfile();
					if(! oldFilePath.equals("default.png"))	Helper.deleteFile(oldFilePath);
					if(Helper.saveFile(part.getInputStream(), path)) {
						com.tech.blog.entities.Message msg = new com.tech.blog.entities.Message("Profile details Updated", "success", "alert-success");
						s.setAttribute("msg" , msg);
					}else {
						com.tech.blog.entities.Message msg = new com.tech.blog.entities.Message("Something went wrong !", "success", "alert-danger");
						s.setAttribute("msg" , msg);
						response.sendRedirect("profile.jsp");
						return;
					}
				}
				com.tech.blog.entities.Message msg = new com.tech.blog.entities.Message("Profile details Updated", "success", "alert-success");
				s.setAttribute("msg" , msg);
			}
			else {
				com.tech.blog.entities.Message msg = new com.tech.blog.entities.Message("Something went wrong !", "success", "alert-danger");
				s.setAttribute("msg" , msg);
			}
			response.sendRedirect("profile.jsp");
			
		} catch (Exception e) {
			e.printStackTrace();		
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
