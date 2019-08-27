package service;

import java.util.List;

import DAO.BookDao;
import VO.BookVO;

public class BookServiceImpl implements BookService{

	BookDao dao;
		
	public BookServiceImpl() {}

	public BookServiceImpl(BookDao dao) {
		super();
		this.dao = dao;
	}
	public BookDao getDao() {
		return dao;
	}

	public void setDao(BookDao dao) {
		this.dao = dao;
	}

	@Override
	public List<BookVO> booklist() {
		// TODO Auto-generated method stub
		
		return dao.getBookRec();
	}

	@Override
	public int addBook(BookVO vo) {
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

	@Override
	public List<BookVO> search(String name) {
		// TODO Auto-generated method stub
		return dao.searchBook(name);
		
	}

}
