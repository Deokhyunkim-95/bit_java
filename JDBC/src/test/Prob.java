package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import util.JDBCUtil;

public class Prob {

	private static void show(int DEPARTMENT_ID) {

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql = " select avg(e.salary) from departments d,employees e where d.department_id = e.department_id and d.department_id= ?";
		
		
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql); //성능이 더 좋다.
			ps.setInt(1, DEPARTMENT_ID);
		
			rs = ps.executeQuery();
			
			if(rs.next()) {
				System.out.println(rs.getString("avg(e.salary)"));
			}
			else {
				System.out.println("없는 부서입니다.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(con, ps, rs);

		}

	}
		
	public static void main(String[] args) {
		show(10);
		System.out.println("============================");
		show(50);
	}
}