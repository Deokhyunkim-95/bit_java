<%@page import="service.*"%>
<%@page import="vo.UserVO"%>
<%@page import="dao.UserDao"%>
<%@page import="service.UserServiceImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>adduser.jsp</title>
</head>
<body>
<h3> 회 원 가 입 처 리</h3>

<!-- 자바코드가 들어가는 영역 -->
<% 
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String name = request.getParameter("name");
	String role = request.getParameter("role");

	UserDao dao = new UserDao();
	UserService service = new UserServiceImpl(dao);

	UserVO vo  = new UserVO();
	vo.setId(id);
	vo.setPassword(pw);
	vo.setName(name);
	vo.setRole(role);
	
	int c = service.addUser(vo);
	
%>
<!-- %=은 출력의미 -->

입력정보 : <%=id %>/<%=pw %>/<%=name %>/<%=role %>/


<% if(c == 0){ %> <h4>회원가입실패</h4><% } else {%> 회원가입성공 <%}%>
<p>
<a href=" main.html">home으로</a>
</p>
</body>
</html>