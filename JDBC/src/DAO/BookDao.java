package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import VO.Book;
import util.JDBCUtil;

public class BookDao {
	public List<Book> getAllBookRec() {
		String sql = "select * from book";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		List<Book> list = new ArrayList<Book>();

		try {
			System.out.println("********* con 할당 *********");
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			// ? 세팅

			// 실행 및 결과값 핸들링
			rs = ps.executeQuery();
			while (rs.next()) {
				// low mapper작업
				list.add(new Book(rs.getInt("BookID"), rs.getString("BookName"), rs.getString("Publisher"),rs.getInt("Price")));
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			JDBCUtil.close(con, ps, rs);
		}
		return list;
	}

	public int insertBook(Book book) {
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

	public int updateBook(Book book) {
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
	public int deleteBook(Book book) {
		String sql = "delete from book where bookname = ? ";
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;

		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			// ? 세팅
			ps.setString(1, book.getBookName());
		
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
	public void searchBook(Book book) {
		String sql = "select * from book where lower(bookname) like ?";
		Connection con = null;
		ResultSet rs = null;
		PreparedStatement ps = null;


		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			
			// ? 세팅
			ps.setString(1, "%"+book.getBookName().toLowerCase()+"%");
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				System.out.print(rs.getInt("bookid")+" ");
				System.out.print(rs.getString("bookname")+" ");
				System.out.print(rs.getString("publisher")+" ");		
				System.out.print(rs.getInt("price")+" ");
				System.out.println();
			}
			// 실행 및 결과값 핸들링

			System.out.println("검색 완료");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(con, ps, null);
		}
	}
}
