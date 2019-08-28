package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import VO.BoardVO;
import util.JDBCUtil;
public class BoardDao {

	public int insertBoard(BoardVO board) {
		SimpleDateFormat format = new SimpleDateFormat ( "yyyy-MM-dd");
		String sql = "insert into board(seq,title,content,regdate,cnt,id) "
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
	public int UpdateBoard(BoardVO board) {
		String sql = "update board set content=? where title = ?";
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;

		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);

			ps.setString(1, board.getContent());
			ps.setString(2, board.getTitle());

			result = ps.executeUpdate();
			

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(con, ps, null);
		}
		return result;
	}
	public int DeleteBoard(BoardVO board) {
		String sql = "delete from board where title=?";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int result = 0; 
		boolean a = false;

		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);

			ps.setString(1, board.getTitle());

			rs = ps.executeQuery();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(con, ps, rs);
		}
		return result;
	}
	public List<BoardVO> SearchBoard(String title) {
		String sql = "select * from board where title = ?";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<BoardVO> list = new ArrayList<BoardVO>();

		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);

			ps.setString(1,title);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				list.add(new BoardVO(rs.getString("seq"),rs.getString("title"),rs.getString("content"),rs.getDate("regdate"),rs.getString("cnt"),rs.getString("id")));
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(con, ps, rs);
		}
		return list;
	}
}
