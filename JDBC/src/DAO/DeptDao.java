package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import VO.Dept;
import util.JDBCUtil;

public class DeptDao {
	
	//Dept 테이블의 모든 레코드 정보
	public List<Dept> getAllDeptRec() {
		String sql = "select * from dept order by deptno";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		List<Dept> list = new ArrayList<Dept>();

		try {
			System.out.println("********* con 할당 *********");
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			// ? 세팅
			
			//실행 및 결과값 핸들링
			rs = ps.executeQuery();
			while(rs.next()) {
				//low mapper작업
				list.add(new Dept(rs.getInt("deptno"),rs.getString("dname"),rs.getString("loc")));
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			JDBCUtil.close(con, ps, rs);
		}
		return list;
	}
	
	public int insertdept(Dept dept) {
		String sql = "insert into dept(deptno,dname,loc) values(?,?,?)";
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;

		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			// ? 세팅
			ps.setInt(1, dept.getDeptNo());
			ps.setString(2, dept.getDname());
			ps.setString(3, dept.getLoc());

			// 실행 및 결과값 핸들링
//			ps.executeQuery();
			result = ps.executeUpdate();

			System.out.println("dept테이블에 데이터 삽입 완료");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(con, ps, null);
		}
		return result;
	}

	public int updateDept(Dept dept) {
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
