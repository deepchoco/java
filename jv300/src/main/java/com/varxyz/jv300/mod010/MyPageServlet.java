package com.varxyz.jv300.mod010;

import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.varxyz.jv300.mod009.UserService;

@WebServlet("/mod010/mypage")
public class MyPageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private UserService userService;

	public void init() {
		userService = new UserService();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		String userId = (String) session.getAttribute("userId");
		if (userId == null) {
			request.getRequestDispatcher("login.jsp").forward(request, response);
			return;
		}
		Cookie[] cookies = request.getCookies();
		for(Cookie cookie : cookies) {
			System.out.println(cookie.getName() + " : " + cookie.getValue());
			if(cookie.getName().equals("lastAccessTime")) {
				request.setAttribute("lastAccessTime",
						URLDecoder.decode(cookie.getValue(), "UTF-8"));//특수문자 못쓰기때문에 디코더로 변환
			}
		}
		response.addCookie(lastAccessTime());

		request.getRequestDispatcher("mypage.jsp").forward(request, response);
	}
	
	private Cookie lastAccessTime() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateStr = format.format(new Date());
		
		Cookie cookie = null;
		try {
			cookie = new Cookie("lastAccessTime", URLEncoder.encode(dateStr, "UTF-8"));
		}catch(Exception e) {
			e.printStackTrace();
		}
		cookie.setMaxAge(60 * 60 * 24 * 30);//한달
		cookie.setPath("/");//어떤페이지던 간에 쿠키를 심겠다
		return cookie;
	}

}
