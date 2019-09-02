<%@page import="service.UserService"%>
<%@page import="vo.UserVO"%>
<%@page import="dao.UserDao"%>
<%@page import="service.UserServiceImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login.jsp</title>
</head>
<body>
<h3> login 처리</h3>

<!-- 자바코드가 들어가는 영역 -->
<% 
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");

	UserDao dao = new UserDao();
	UserService service = new UserServiceImpl(dao);

	UserVO vo  = new UserVO();
	vo.setId(id);
	vo.setPassword(pw);
	
	UserVO data = service.login(vo);
	
%>
<!-- %=은 출력의미 -->

로그인 정보 : <%= data %>

<p>
<a href=" index.html">home으로</a>
</p>
</body>
</html>