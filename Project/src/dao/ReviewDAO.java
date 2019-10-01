package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import util.JDBCUtil;
import vo.ReviewVO;

public class ReviewDAO{

	public List<ReviewVO> getReviewRec(int fid){
		
		String sql = "select * from review where fid = ? ";
		
		List<ReviewVO> list = new ArrayList<ReviewVO>();
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			
			ps.setInt(1, fid); //2에 가게 번호를 넘겨 받게한다.
			
			System.out.println("daofid"+fid);
			
			rs = ps.executeQuery();
			
			
			while (rs.next()) {
				
				ReviewVO vo = new ReviewVO();
				vo.setRid(rs.getInt("rid"));
				vo.setUserid(rs.getString("userid"));
				vo.setFid(rs.getInt("fid"));
				vo.setImage(rs.getString("image"));
				vo.setText(rs.getString("text"));
				vo.setEval(rs.getString("eval"));
				vo.setPubdate(rs.getDate("pubdate"));
			
				list.add(vo);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public int insertReview(ReviewVO vo) throws Exception{
		String sql = "insert into review (rid, userid, fid, image, text, eval, pubdate ) " + 
				"      values( (select nvl(max(rid),0)+1 from review ) , ?, ?, ?, ?, ?, sysdate) ";
		
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			// ?세팅
			
			ps.setString(1, vo.getUserid());  //로그인 되어 있는 세션의 아이디 받기
			ps.setInt(2, vo.getFid()); //클릭한 가게의 번호 받기
			ps.setString(3, vo.getImage());
			ps.setString(4, vo.getText());
			ps.setString(5, vo.getEval());
			
			System.out.println(vo.getFid());
			
			// 실행 및 결과값 핸들링
			result = ps.executeUpdate();
			
		} catch (Exception e) {
//			e.printStackTrace();
			throw e;
			
		} finally {
			JDBCUtil.close(con, ps, null);
		}
		
		return result;
	}
	
	
}
