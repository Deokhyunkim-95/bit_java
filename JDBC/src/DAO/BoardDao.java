package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;

import VO.BoardVO;
import util.JDBCUtil;

public class BoardDao {

	public int insertUser(BoardVO board) {
		SimpleDateFormat format = new SimpleDateFormat ( "yyyy-MM-dd");
		String sql = "insert into boards(seq,title,content,regdate,cnt,id) "
				+ "values((select nvl(max(seq),0)+1 from board)  ,?,?,?,?,?)";
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;


		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);

			ps.setString(1,board.getTitle());
			ps.setString(2,board.getContent());
			ps.setString(3,format.format(System.currentTimeMillis()));
			ps.setString(4, board.getCnt());
			ps.setString(5, board.getId());
			
			result = ps.executeUpdate();

			System.out.println("user테이블에 데이터 삽입 완료");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(con, ps, null);
		}
		return result;
	}
//	public int UpdateUser(BoardVO board) {
//		String sql = "update users set name=? where id = ?";
//		Connection con = null;
//		PreparedStatement ps = null;
//		int result = 0;
//
//		try {
//			con = JDBCUtil.getConnection();
//			ps = con.prepareStatement(sql);
//
//			ps.setString(1, user.getName());
//			ps.setString(2, user.getId());
//
//			result = ps.executeUpdate();
//
//			System.out.println("user테이블에 데이터 업데이트 완료");
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			JDBCUtil.close(con, ps, null);
//		}
//		return result;
//	}
//	public boolean LoginUser(BoardVO board) {
//		String sql = "select * from users where id = ? and password = ?";
//		Connection con = null;
//		PreparedStatement ps = null;
//		ResultSet rs = null;
//		int result = 0; 
//		boolean a = false;
//
//		try {
//			con = JDBCUtil.getConnection();
//			ps = con.prepareStatement(sql);
//
//			ps.setString(1, user.getId());
//			ps.setString(2, user.getPassword());
//
//			rs = ps.executeQuery();
//			if(rs.next()) {
//				return true;
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			JDBCUtil.close(con, ps, rs);
//		}
//		return a;
//	}
}
