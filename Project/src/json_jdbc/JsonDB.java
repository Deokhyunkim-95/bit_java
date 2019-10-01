package json_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import util.JDBCUtil;

public class JsonDB {
	
	public static void main(String[] args) {
		System.out.println(getJsonDeptno("20"));
		System.out.println("=========================");
		System.out.println(getALLJsonDeptno());
	}
	
	public static String getJsonDeptno(String deptno) {
		
		String sql = " select * from dept where deptno = ?";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Map<String, String> map = new HashMap();
		
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, deptno);
			
			rs = ps.executeQuery();
			//결과값 핸들링
			
			while(rs.next()) {
				map.put("deptno", rs.getString("deptno"));
				map.put("dname", rs.getString("dname"));
				map.put("loc", rs.getString("loc"));
			}
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			JDBCUtil.close(con, ps, rs);
		}
		return JSONObject.toJSONString(map);
	}
public static String getALLJsonDeptno() {
		
		String sql = " select * from dept";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		JSONArray array = new JSONArray();
		
		Map<String, String> map = new HashMap();
		
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			
			rs = ps.executeQuery();
			//결과값 핸들링
			
			while(rs.next()) {
				map.put("deptno", rs.getString("deptno"));
				map.put("dname", rs.getString("dname"));
				map.put("loc", rs.getString("loc"));
				
				JSONObject obj = new JSONObject(map);
				array.add(obj);
				
			}
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			JDBCUtil.close(con, ps, rs);
		}
		
		return JSONObject.toJSONString(map);
	}
	//workbean
public static String idCheck(String id) {
	
	String sql = " select * from users where id = ?";
	
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	Map<String, String> map = new HashMap<String, String>();
	try {
		con = JDBCUtil.getConnection();
		ps = con.prepareStatement(sql);
		ps.setString(1, id);
		
		rs = ps.executeQuery();
		//결과값 핸들링
		
		while(rs.next()) {
			map.put("id", rs.getString("id"));
		}
		
		
	} catch (Exception e) {
		System.out.println(e);
	} finally {
		JDBCUtil.close(con, ps, rs);
	}
	return JSONObject.toJSONString(map);
	
}

	public static String jsonfoodshop(String fname) {
		
		String sql = " select * from foodshop where fname = ?";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Map<String, String> map = new HashMap<String, String>();
		
		
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, fname);
			
			rs = ps.executeQuery();
			//결과값 핸들링
			
			while(rs.next()) {
				map.put("latitude", rs.getString("latitude"));
				map.put("longitude", rs.getString("longitude"));
				map.put("fname", rs.getString("fname"));
			}
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			JDBCUtil.close(con, ps, rs);
		}
		return JSONObject.toJSONString(map);
	}
}
