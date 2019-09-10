<%@ page language="java" contentType="text/json; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="util.JDBCUtil" %>

<%

int result = 0;
Connection con = null;
PreparedStatement ps = null;
ResultSet rs = null;

try {
	
	String id = request.getParameter("id");	
	String sql = " select id from users where id= ? ";	
	con = JDBCUtil.getConnection();
	ps = con.prepareStatement(sql);
		
	ps.setString(1, id);
	
	rs = ps.executeQuery();
	
	
	if(rs.next()){
		
		result = 1;
	}
	else
		result = 0 ;
	
	
} catch (Exception e) {
	e.printStackTrace();
} finally {
	JDBCUtil.close(con, ps, null);
}
%>

{
	"result":<%= result %>
}
