package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import util.JDBCUtil;

public class Test08_delete {
	public static void main(String[] args) {
		Emp8 emp = new Emp8();
		int count = emp.deleteEmp(9999);
		System.out.println(count==1 ?"9999삭제":"삭제실패");
	}
}

class Emp8{
	public int deleteDept(int deptno) {
		String sql = "delete from dept where dpetno=?";
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		

		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			// ? 세팅
			
			//실행 및 결과값 핸들링
			result = ps.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			JDBCUtil.close(con, ps, null);
		}
		return result;
	}
	public int deleteEmp(int empno) {
		String sql = "delete from emp where empno=?";
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		

		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			// ? 세팅
			
			//실행 및 결과값 핸들링
			ps.setInt(1, empno);
			result = ps.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			JDBCUtil.close(con, ps, null);
		}
		return result;
	}
}