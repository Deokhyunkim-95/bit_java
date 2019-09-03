<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>process.jsp 입니다.</h3>
x:<%= request.getParameter("x") %><br>
y:<%= request.getParameter("y") %><br>
sum:<%= request.getParameter("sum")%><br>
z:<%= request.getParameter("z") == null %><br>
</body>
</html>