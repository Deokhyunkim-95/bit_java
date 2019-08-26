package ex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import util.JDBCUtil;

public class Prob1 {
	public static void main(String[] args) {
		Emp.show(10);
		System.out.println("-----------------------------");
		Emp.show(20);
	}

}

class Emp {
	public static void show(int deptno) {
		String sql = " select round(avg(sal),2) as \"부서별 평균 급여\" from emp where deptno = ?";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1, deptno);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				System.out.println(deptno+"부서");
				System.out.println(rs.getString("부서별 평균 급여"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(con, ps, rs);
		}
	}
}
