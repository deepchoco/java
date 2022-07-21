package com.varxyz.jv300.mod005;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "HelloServlet2", urlPatterns = {"/mod005/hello.view"})
public class HelloServlet extends HttpServlet {
	private static final String DEFAULT_NAME = "world";
	

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)//get방식으로 호출할때 사용하는 메서드 request - 요청정보 캡슐화, response - 응답정보 캡슐화
			throws ServletException, IOException {
		String pageTitle = "Hello World";
		
		String name = request.getParameter("userName");
		if(name == null || name.length() == 0){
			name = DEFAULT_NAME;
		}
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>" + pageTitle + "</title></head>");
		out.println("<body>");
		out.println("<h3> Hello, " + name + "</h3>");
		out.println("</body></html>");
		out.close();
	}
}
