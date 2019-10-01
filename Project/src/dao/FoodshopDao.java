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

		String sql = "INSERT INTO foodshop(fid, fname , address, latitude, longitude, foodstyle, image, loc, discount, holiday, octime, tel) "
				+ " VALUES((select nvl(max(FID),0)+1 from foodshop),?,?,?,?,?,?,?,?,?,?,?) ";

		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;

		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);

			// ? 세팅
			ps.setString(1, vo.getFname());
			ps.setString(2, vo.getAddress());
			ps.setString(3, vo.getLatitude());
			ps.setString(4, vo.getLongitude());
			ps.setString(5, vo.getFoodstyle());
			ps.setString(6, vo.getImage());
			ps.setString(7, vo.getLoc());
			ps.setInt(8, vo.getDiscount());
			ps.setString(9, vo.getHoliday());
			ps.setString(10, vo.getOctime());
			ps.setString(11, vo.getTel());

			// 실행 및 결과값 핸들링
			result = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(con, ps, null);
		}
		return result;
	}

	//가게 이름별 search 
		public List<FoodshopVO> fnamesearch(String fname){
			
			String sql = "select*from (select rownum row#, fid, fname, address, latitude, longitude, foodstyle, image, loc, discount, holiday, octime, tel\r\n" + 
					"			  from (select * from foodshop where fname like '%'||?||'%' order by fid))\r\n" + 
					"			  where row# between ? and ? ";
			System.out.println("search 완료");

			Connection con = null;
			PreparedStatement ps = null;
			ResultSet rs = null;
			List<FoodshopVO> list = new ArrayList<FoodshopVO>();

			try {
				con = JDBCUtil.getConnection();
				ps = con.prepareStatement(sql);
				// ? 세팅
				ps.setString(1, fname);
				ps.setInt(2, 1);
				ps.setInt(3, 5);

				// 실행 및 결과값 핸들링
				rs = ps.executeQuery();

				while (rs.next()) {
					list.add(new FoodshopVO(rs.getInt("fid"), rs.getString("fname"), rs.getString("address"),
							rs.getString("latitude"), rs.getString("longitude"), rs.getString("foodstyle"),
							rs.getString("image"), rs.getString("loc"), rs.getInt("discount"),
							rs.getString("holiday"), rs.getString("octime"), rs.getString("tel")));
				}

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				JDBCUtil.close(con, ps, rs);
			}
			return list;
		
			
		}
	
	
	
	//음식종류별 search 
	public List<FoodshopVO> foodstylesearch(String foodstyle){
		
		String sql = "select * from foodshop where foodstyle = ? ";
		System.out.println("search 완료");

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<FoodshopVO> list = new ArrayList<FoodshopVO>();

		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			// ? 세팅
			ps.setString(1, foodstyle);

			// 실행 및 결과값 핸들링
			rs = ps.executeQuery();

			while (rs.next()) {
				list.add(new FoodshopVO(rs.getInt("fid"), rs.getString("fname"), rs.getString("address"),
						rs.getString("latitude"), rs.getString("longitude"), rs.getString("foodstyle"),
						rs.getString("image"), rs.getString("loc"), rs.getInt("discount"),
						rs.getString("holiday"), rs.getString("octime"), rs.getString("tel")));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(con, ps, rs);
		}
		return list;
	
		
	}

	
	//Eat Deal List
	public List<FoodshopVO> discountsearch(String discount) {
		String sql = "select * from foodshop where discount = ? ";
		System.out.println("search 완료");

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<FoodshopVO> list = new ArrayList<FoodshopVO>();

		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			// ? 세팅
			ps.setString(1, discount);

			// 실행 및 결과값 핸들링
			rs = ps.executeQuery();

			while (rs.next()) {
				list.add(new FoodshopVO(rs.getInt("fid"), rs.getString("fname"), rs.getString("address"),
						rs.getString("latitude"), rs.getString("longitude"), rs.getString("foodstyle"),
						rs.getString("image"), rs.getString("loc"), rs.getInt("discount"),
						rs.getString("holiday"), rs.getString("octime"), rs.getString("tel")));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(con, ps, rs);
		}
		return list;
	}

	
	//지역별 list - page 처리했어..!
	public List<FoodshopVO> locsearch(String loc) {

		String sql = "select*from (select rownum row#, fid, fname, address, latitude, longitude, foodstyle, image, loc, discount, holiday, octime, tel\r\n" + 
				"			  from (select * from foodshop where loc = ? order by fid))" + 
				"			  where row# between ? and ?";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<FoodshopVO> list = new ArrayList<FoodshopVO>();
		
		try {
			
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			// ? setting
			ps.setString(1, loc);
			ps.setInt(2, 1);
			ps.setInt(3, 5);
			
			rs = ps.executeQuery();

			while (rs.next()) {
				list.add(new FoodshopVO(rs.getInt("fid"), rs.getString("fname"), rs.getString("address"),
						rs.getString("latitude"), rs.getString("longitude"), rs.getString("foodstyle"),
						rs.getString("image"), rs.getString("loc"), rs.getInt("discount"),
						rs.getString("holiday"), rs.getString("octime"), rs.getString("tel")));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(con, ps, rs);
		}
		return list;
	}

public List<FoodshopVO> showfoodshop(String fname) {
		
		String sql = "select * from foodshop where fname = ?";
		
		List<FoodshopVO> list = new ArrayList<FoodshopVO>();
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			ResultSet rs = null;
			//? 세팅
			
			ps.setString(1, fname);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				FoodshopVO vo = new FoodshopVO();
				vo.setFid(rs.getInt("fid"));
				vo.setFname(rs.getString("fname"));
				vo.setAddress(rs.getString("address"));
				vo.setLatitude(rs.getString("latitude"));
				vo.setLongitude(rs.getString("longitude"));
				vo.setFoodstyle(rs.getString("foodstyle"));
				vo.setImage(rs.getString("image"));
				vo.setLoc(rs.getString("loc"));
				vo.setDiscount(rs.getInt("discount"));
				vo.setHoliday(rs.getString("holiday"));
				vo.setOctime(rs.getString("octime"));
				vo.setTel(rs.getString("tel"));
				list.add(vo);
				
			}
			
			//실행 및 결과값 핸들링
			rs= ps.executeQuery();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(con, ps, null);
		}
		return list;
		
	}
}


/*
 * 나중에 page 처리 할꺼면 이걸 써......
 * 
 * 		String sql = "select*from( " +
	             "select rownum row#, fid, fname, address, latitude, longitude, foodstyle, image, image_menu, loc, discount, holiday, octime, tel " +
			     "from (select * from foodshop order by fid)) " + 
	             "where row# between ? and ?";
	
		int start = n*(page-1) +1;
		int end = start + (n-1);
 */

