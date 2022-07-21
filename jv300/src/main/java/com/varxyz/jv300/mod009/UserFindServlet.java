package com.varxyz.jv300.mod009;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mod009/userfindlist.do")
public class UserFindServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private UserService userService;

	public void init(ServletConfig config) throws ServletException {
		userService = new UserService();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId =	request.getParameter("userId");
		User user = userService.findUserByUserId(userId);
		
		request.setAttribute("user", user);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("user_info.jsp");
		dispatcher.forward(request, response);
	}


}
