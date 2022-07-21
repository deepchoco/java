<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.net.URLEncoder"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="./form.css">

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
			<jsp:param name="subtitle" value="<%=URLEncoder.encode(\"mod007 : 자바빈즈\", \"UTF-8\") %>"/>
		</jsp:include>
	</div>
	<div id="content-wrapper">
	<h3>회원가입</h3>
	<form action="add_user.do" method="post">
		이름 : <input type="text" name="userName"/><br>
		회원아이디 : <input type="text" name="userId"/><br>
		비밀번호 : <input type="text" name="passwd"/><br>
		주민번호 : <input type="text" name="ssn"/><br>
		이메일1 : <input type="text" name="email1"/><br>
		이메일2 : <input type="text" name="email2"/><br>
		주소1 : <input type="text" name="addr1"/><br>
		주소2 : <input type="text" name="addr2"/><br>
	<input type="submit" value="확인">
	</form>
	</div>
	<div id="footer">
		<%@ include file="/incl/footer.jsp" %>
	</div>
</div>
</body>
</html>