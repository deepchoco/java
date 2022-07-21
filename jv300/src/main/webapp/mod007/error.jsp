<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.net.URLDecoder"%>
<%@page import="java.util.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div id="wrapper">
	<div id="header">
		<jsp:include page="/incl/banner.jsp">
			<jsp:param name="subtitle" value="Java Beans and include"/>
		</jsp:include>
	</div>
	<div id="content-wrapper">
	<h3>정보를 알맞게 입력해주세요</h3>
	<ul>
		<%
			List<String> errorMsgs = (List<String>)request.getAttribute("errorMsgs");
			for (String errorMsg : errorMsgs) {
		%>
			<li><%=errorMsg %></li>
		<%
			}
		%>
	</ul>
	<jsp:useBean id="user" class="com.varxyz.jv300.mod007.User" scope="request"/>
	아이디 : <jsp:getProperty property="userId" name="user"/><br>
	이름 : <jsp:getProperty property="userName" name="user"/>
	</div>
	<div id="footer">
		<%@ include file="/incl/footer.jsp" %>
	</div>
</div>
</body>
</html>