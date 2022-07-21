package com.varxyz.jv300.mod004;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mod004/hello.do")
public class AddUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String DEFAULT_NAME = "World";


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("userName");
		String userId = request.getParameter("userId");
		String passwd = request.getParameter("passwd");
		String ssn = request.getParameter("ssn");
		String email1 = request.getParameter("email1");
		String email2 = request.getParameter("email2");
		if(name == null || name.length() == 0) {
			name = DEFAULT_NAME;
		}
		String pageTitle = "Hello World";
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>" + pageTitle + "</title></head>");
		out.println("<body>");
		out.println("<ul>");
		out.println("<li><h3> 고객님의 성함은 " + name + " 입니다.</h3></li>");
		out.println("<li><h3> 고객님의 아이디는 " + userId + " 입니다.</h3></li>");
		out.println("<li><h3> 고객님의 비밀번호는 " + passwd + " 입니다.</h3></li>");
		out.println("<li><h3> 고객님의 주민등록번호는 " + ssn + " 입니다.</h3></li>");
		out.println("<li><h3> 고객님의 이메일은 " + email1 + " 입니다.</h3></li>");
		out.println("<li><h3> 고객님의 메일도메인은 " + email2 + " 입니다.</h3></li>");
		out.println("</ul>");
		out.println("</body></html>");
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
