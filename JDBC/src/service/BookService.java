package service;

import java.util.List;
import VO.BookVO;

public interface BookService {

	List<BookVO> booklist();
	int addBook(BookVO vo);
	int deleteBook(int bookid);
	int updateBook(BookVO vo);
	List<BookVO> search(String name);
	
}
