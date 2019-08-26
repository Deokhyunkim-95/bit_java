package ex;

import DAO.BookDao;
import VO.Book;

public class Ex_BookDao {
	public static void main(String[] args) {
		BookDao dao = new BookDao();
		Book book = new Book();
		
//		dao.insertBook(new Book(4,"html","홍길동",31200));
//		
//		book.setBookName("자바");
//		book.setPrice(11111);
//		book.setPublisher("홍길동");
//		dao.updateBook(book);
//		
		
		book.setBookName("j");
//		dao.deleteBook(book);
		
		dao.searchBook(book);
		
		
		dao.getAllBookRec().forEach(i -> System.out.println(i));
	

	}
}