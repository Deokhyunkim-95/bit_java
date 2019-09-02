package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import util.JDBCUtil;
import vo.BookVO;

//DB랑 연결되는 코드를 가진다.

public class BookDao {
	public List<BookVO> getBookRec() {
		
		return null;
	}
	
	public int insertBook(BookVO book) {
		
		return 0;
	}
	public int deleteBook(int bookid) {
		
		return 0;
	}
	public int updateBook(BookVO book) {
	
		return 0;
	}
	public List<BookVO> searchBook(String name) {
		
		return null;
	}
}
