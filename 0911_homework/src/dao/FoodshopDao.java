package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import util.JDBCUtil;
import vo.FoodshopVO;

public class FoodshopDao {
	
	public int insertFoodshop(FoodshopVO vo) {
		System.out.println("가게등록 완료");
		String sql = "INSERT INTO foodshop(fname, latitude, longitude, mainfood, foodstyle, image, ttag, discount, holiday, otime, ctime, tel, park)"
				+ " VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?) ";
		
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);

			//? 세팅
			ps.setString(1, vo.getFname());
			ps.setString(2, vo.getLatitude());
			ps.setString(3, vo.getLongitude());
			ps.setString(4, vo.getMainfood());
			ps.setString(5, vo.getFoodstyle());
			ps.setString(6, vo.getImage());
			ps.setString(7, vo.getTtag());
			ps.setInt(8, vo.getDiscount());
			ps.setString(9, vo.getHoliday());
			ps.setInt(10, vo.getOtime());
			ps.setInt(11, vo.getCtime());
			ps.setString(12, vo.getTel());
			ps.setString(13, vo.getPark());
			
			//실행 및 결과값 핸들링
			result = ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(con, ps, null);
		}
		return result;
	}
	
	public int discountsearch(FoodshopVO vo) {
		String sql = "select * from foodshop where discount = ? ";
		System.out.println("search 완료");
		
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			//? 세팅
			ps.setInt(1, vo.getDiscount());
			
			//실행 및 결과값 핸들링
			result = ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(con, ps, null);
		}
		return result;
	}
	
	public int tagsearch(FoodshopVO vo) {
		String sql = "select * from foodshop where ttag = ? ";
		System.out.println("search 완료");
		
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			//? 세팅
			ps.setString(1, vo.getTtag());
			
			//실행 및 결과값 핸들링
			result = ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(con, ps, null);
		}
		return result;
	}
	
	//Delete(id값 과 password 값이 일치 할 때 삭제) =>FK,PK 값이기 때문에 삭제 잘 안됨. pass
	
	/*
	 * public List<FoodshopVO> getUsersRec(){ String sql = "select * from(" +
	 * "select rownum row#, id, password, name, role " +
	 * "from (select * from users order by rownum)) ";
	 * 
	 * 
	 * List <FoodshopVO> list = new ArrayList<FoodshopVO>();
	 * 
	 * Connection con = null; PreparedStatement ps = null; ResultSet rs = null;
	 * 
	 * try { con = JDBCUtil.getConnection(); ps = con.prepareStatement(sql); //? 세팅
	 * //ps.setInt(1, 1); //ps.setInt(2, 5);//row 5개씩 가져오겠다. //실행 및 결과값 핸들링 rs =
	 * ps.executeQuery(); while(rs.next()) { FoodshopVO vo = new FoodshopVO();
	 * vo.setId(rs.getString("id")); //MYbatis 에서는 Bookid와 bookid가 같으면 자동으로
	 * rowmapping을 해준다. vo.setPassword((rs.getString("password")));
	 * vo.setName(rs.getString("name")); vo.setRole(rs.getString("role"));
	 * 
	 * list.add(vo); }
	 * 
	 * } catch (Exception e) { e.printStackTrace(); } finally { JDBCUtil.close(con,
	 * ps, rs); } return list; }
	 * 
	 * //로그인 public FoodshopVO login(FoodshopVO vo) {
	 * 
	 * Connection con = null; PreparedStatement ps =null; //? 처리 O 관리 객체 ResultSet
	 * rs = null;
	 * 
	 * String sql = "select * from users where id = ? and password = ?";
	 * 
	 * FoodshopVO data = null;
	 * 
	 * try { con = JDBCUtil.getConnection(); ps = con.prepareStatement(sql);
	 * ps.setString(1, vo.getId()); ps.setString(2, vo.getPassword());
	 * 
	 * rs = ps.executeQuery();
	 * 
	 * if(rs.next()) { data = new FoodshopVO(); data.setId(rs.getString("id"));
	 * data.setPassword(rs.getString("password"));
	 * data.setName(rs.getString("name")); data.setRole(rs.getString("role"));
	 * 
	 * }else { System.out.println("로그인 실패"); } }catch (Exception e) {
	 * e.printStackTrace(); }finally { JDBCUtil.close(con, ps, rs); } return data; }
	 */

}
