package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import util.JDBCUtil;

public class Test06 {
	public static void main(String[] args) {

//		String sql = "";
//		Connection con = null;
//		PreparedStatement ps = null;
//		ResultSet rs = null;
//		int result = 0;
//
//		try {
//			con = JDBCUtil.getConnection();
//			ps = con.prepareStatement(sql);
//			// ? 세팅
//			
//			//실행 및 결과값 핸들링
//			ps.executeQuery();
//			ps.executeUpdate();
//			
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//		} finally {
//			JDBCUtil.close(con, ps, rs);
//		}
		Emp6.searchEname("S");
		System.out.println("------------------------------------");
		Emp6.searchEname("s");
	}
}
class Emp6{
	public static void searchEname(String ename){
//		String sql = "select * from emp where lower(ename) like lower('%'||?||'%')";
		String sql = "select * from emp where lower(ename) like ?";
		//% 대소문자 처리
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int result = 0;

		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
//			ps.setString(1, ename.toLowerCase());
			ps.setString(1, "%"+ename.toLowerCase()+"%");
			// ? 세팅
			
			//실행 및 결과값 핸들링
			rs = ps.executeQuery();
//			ps.executeUpdate();
			
			while(rs.next()) {
				System.out.print(rs.getInt("empno")+" ");
				System.out.print(rs.getString("ename")+" ");
				System.out.print(rs.getString("job")+" ");		
				System.out.print(rs.getInt("sal")+" ");
				System.out.print(rs.getInt("comm")+" ");
				System.out.print(rs.getDate("hiredate")+" ");
				System.out.print(rs.getInt("deptno")+" ");
				System.out.println();
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			JDBCUtil.close(con, ps, rs);
		}
	}
}
