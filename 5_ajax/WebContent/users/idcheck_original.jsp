<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="util.JDBC_util"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


	<%
		String id = request.getParameter("id");
	
		boolean result = false;
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select id from users where id = ?";
		try{
			con = JDBC_util.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1,id);
			rs = ps.executeQuery();
			if(rs.next()){
				result = true;
			}
		}catch(SQLException e){
			//e.printStackTrace();
		}finally{
			JDBC_util.close(con, ps, rs);
		}
		
	%>
	
{
	"result": <%= result %>
}
