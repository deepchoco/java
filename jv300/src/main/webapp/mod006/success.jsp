<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>정보가 올바르게 입력되었습니다.</h3>
getParameter()입력 값 : <%=(String)request.getParameter("userName")%><br>
getAttribute()입력 값 : <%=(String)request.getAttribute("userName")%>
</body>
</html>