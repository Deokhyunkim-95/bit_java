<%@page import="json_jdbc.JsonDB"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	//String data = JsonDept.getAllJsonDept();
	String deptno = request.getParameter("deptno");
	String data = JsonDB.getJsonDept(deptno);
%>
	
<%= data%>