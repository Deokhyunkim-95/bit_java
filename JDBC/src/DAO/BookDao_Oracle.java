package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import VO.BookVO;
import util.JDBCUtil;

//DB랑 연결되는 코드를 가진다.

public class BookDao_Oracle extends BookDao{
	public List<BookVO> getBookRec() {
		List<BookVO> list = new ArrayList<BookVO>();
		String sql = 
//				"select * from( "+
				"select rownum as row#, bookid , bookname ,publisher, price "+ 
				"from( select * from book order by bookid) ";
//				") where row# between ? and ?";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;


		try {
//			System.out.println("********* con 할당 *********");
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			// ? 세팅
//			ps.setInt(1, 1);
//			ps.setInt(2, 7);
			// 실행 및 결과값 핸들링
			rs = ps.executeQuery();
			while (rs.next()) {
				// low mapper작업
				list.add(new BookVO(rs.getInt("BookID"), rs.getString("BookName"), rs.getString("Publisher"),rs.getInt("Price")));
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			JDBCUtil.close(con, ps, rs);
		}
		
//		for(Book data : list) {
//			System.out.println(data);
//		}
		return list;
	}
	
	public int insertBook(BookVO book) {
		String sql = "insert into book(bookid,bookname,publisher,price) values(?,?,?,?)";
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;

		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			// ? 세팅
			ps.setInt(1, book.getBookID());
			ps.setString(2, book.getBookName());
			ps.setString(3, book.getPublisher());
			ps.setInt(4, book.getPrice());

			// 실행 및 결과값 핸들링
//			ps.executeQuery();
			result = ps.executeUpdate();

			System.out.println("book테이블에 데이터 삽입 완료");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(con, ps, null);
		}
		return result;
	}

	public int updateBook(BookVO book) {
		String sql = "update book set bookname=?,price=? where publisher=?";
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;

		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			// ? 세팅
			ps.setString(1, book.getBookName());
			ps.setInt(2, book.getPrice());
			ps.setString(3, book.getPublisher());
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
	public int deleteBook(int bookid) {
		String sql = "delete from book where bookid = ? ";
		Connection con = null;
		PreparedStatement ps = null;

		int result = 0;

		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			// ? 세팅
			ps.setInt(1,bookid);
		
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
	public List<BookVO> searchBook(String name) {
		String sql = "select * from book where lower(bookname) like lower('%'||?||'%')";
		Connection con = null;
		ResultSet rs = null;
		PreparedStatement ps = null;
		String a= null;
		List<BookVO> list = new ArrayList<BookVO>();

		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			
			// ? 세팅
			ps.setString(1,name);
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
//				System.out.print(rs.getInt("bookid")+" ");
//				System.out.print(rs.getString("bookname")+" ");
//				System.out.print(rs.getString("publisher")+" ");		
//				System.out.print(rs.getInt("price")+" ");
//				System.out.println();
				
				list.add(new BookVO(rs.getInt("bookid"),rs.getString("bookname"),rs.getString("publisher"),rs.getInt("price")));
			}
			// 실행 및 결과값 핸들링
			System.out.println("검색 완료");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(con, ps, null);
		}
		return list;
	}
}
