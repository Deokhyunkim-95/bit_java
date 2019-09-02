package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

import util.JDBCUtil;

public class Prob6 {
	public static void main(String[] args) {
		String sname = JOptionPane.showInputDialog("검색한 부서명을 입력하세요!");
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			String sql = " select * from dept where lower(dname) like ?";
			con = JDBCUtil.getConnection();
			
			ps = con.prepareStatement(sql);
			ps.setString(1,"%"+sname.toLowerCase()+"%");
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				System.out.print(rs.getString("dname")+" ");
				System.out.print(rs.getString("deptno")+" ");
				System.out.println(rs.getString("loc")+" ");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			JDBCUtil.close(con, ps, rs);
		}
	}
}
