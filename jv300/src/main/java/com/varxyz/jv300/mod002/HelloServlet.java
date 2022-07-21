package com.varxyz.jv300.mod002;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HelloServlet extends HttpServlet {//서블릿은 객체를 만들지않고 상속받아서 사용해야한다.
	protected void doGet(HttpServletRequest request, HttpServletResponse response)//get방식으로 호출할때 사용하는 메서드 request - 요청정보 캡슐화, response - 응답정보 캡슐화
			throws ServletException, IOException {
		String pageTitle = "Hello World";
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>" + pageTitle + "</title></head>");
		out.println("<body>");
		out.println("<h3>Welcome to 서블릿 프로그래밍</h3>");
		out.println("</body></html>");
		out.close();
	}
}
