<%@ page import="json_jdbc.JsonDB" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	
String id = request.getParameter("id");
String data = JsonDB.idCheck(id);
%>
<%=data%>