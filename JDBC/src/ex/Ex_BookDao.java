package ex;

import java.util.Iterator;

import dao.BookDao;
import vo.BookVO;

public class Ex_BookDao {
	public static void main(String[] args) {
		BookDao dao = new BookDao();
		
//		dao.insertBook(new Book(4,"html","홍길동",31200));
//		
//		book.setBookName("자바");
//		book.setPrice(11111);
//		book.setPublisher("홍길동");
//		dao.updateBook(book);
//		
		
//		book.setBookName("j");
//		dao.deleteBook(book);
		
		
		
		dao.searchBook("h");
		
		dao.getBookRec().forEach(i -> System.out.println(i));
		
				
//		for(BookVO data : dao.getBookRec()) {
//			System.out.println(data);
//		}
		
	}
}