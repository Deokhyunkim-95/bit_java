package test;

import java.sql.Connection;
import java.sql.PreparedStatement;

import dao.DeptDao;
import util.JDBCUtil;
import vo.Dept;

public class Test09_update {
	public static void main(String[] args) {
		DeptDao ddo = new DeptDao();
		Dept dept = new Dept();
		dept.setDname("기술부");
		dept.setLoc("제주도");
		dept.setDeptNo(50);
		int count = ddo.updateDept(dept);
		System.out.println(count+":update");
		
		ddo.getDeptRec();
		
	}
}

class Emp9 {
	int updateDept(Dept dept) {
		String sql = "update dept set dname=?,loc=? where deptno=?";
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;

		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			// ? 세팅
			ps.setString(1, dept.getDname());
			ps.setString(2, dept.getLoc());
			ps.setInt(3, dept.getDeptNo());
			// 실행 및 결과값 핸들링
			result = ps.executeUpdate();
			
			System.out.println("업데이트 완료");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(con, ps, null);
		}
		return result;
	}
	
}