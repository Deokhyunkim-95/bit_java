package service;

import java.util.List;

import dao.BookDAO;
import vo.BookVO;

public class BookServiceImpl implements BookService {
    
	BookDAO dao;
	
	public BookServiceImpl() {}
	public BookServiceImpl(BookDAO dao) {
		this.dao = dao;
	}
	
	public BookDAO getDao() {
		return dao;
	}
	public void setDao(BookDAO dao) {
		this.dao = dao;
	}
	
	@Override
	public List<BookVO> bookList() {
		return dao.getBookRec();
	}

	@Override
	public int addBook(BookVO vo) throws Exception {
		// TODO Auto-generated method stub
		return dao.insertBook(vo);
	}

	@Override
	public int deleteBook(int bookid) {
		// TODO Auto-generated method stub
		return dao.deleteBook(bookid);
	}

	@Override
	public int updateBook(BookVO vo) {
		// TODO Auto-generated method stub
		return dao.updateBook(vo);
	}

}
