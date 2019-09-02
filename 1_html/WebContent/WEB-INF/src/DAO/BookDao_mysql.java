package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import VO.BookVO;
import util.JDBCUtil;

//DB랑 연결되는 코드를 가진다.

public class BookDao_mysql extends BookDao{
	public List<BookVO> getBookRec() {
		System.out.println("BookDAO_MySQL getBookRec");
		List<BookVO> list = new ArrayList<BookVO>();
		return list;
	}
	
	public int insertBook(BookVO book) {
		System.out.println("BookDAO_MySQL insertBook");
		return 0;
	}

	public int updateBook(BookVO book) {
		System.out.println("BookDAO_MySQL updateBook");
		return 0;
	}
	public int deleteBook(int bookid) {
		System.out.println("BookDAO_MySQL deleteBook");
		return 0;
	}
	public List<BookVO> searchBook(String name) {
		System.out.println("BookDAO_MySQL searchBook");
		List<BookVO> list = new ArrayList<BookVO>();
		return list;
	}
}
