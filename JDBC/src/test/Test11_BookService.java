package test;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import DAO.BookDao;
import VO.BookVO;
import service.BookService;
import service.BookServiceImpl;

public class Test11_BookService {

	BookService service=null;
	@Before
	public void setUp() {
		System.out.println("setup() 수행");
		
		BookDao dao = new BookDao(); 
		service = new BookServiceImpl(dao); //BookServiceImpl()은  DAO가 필수
	}
	
	@After
	public void tearDown() {
		service = null;
		System.out.println("============tearDown() 호출===========");
	}
	
	@Test
	public void list() {
		System.out.println("================== Book List =====================");
		
		service.booklist().forEach(i -> System.out.println(i));
		
		System.out.println("==================================================");
	}
//	@Test
//	public void insert() {
//		BookVO vo = new BookVO();
//		vo.setBookID(6);
//		vo.setBookName("~~~~");
//		vo.setPrice(900);
//		vo.setPublisher("영진출판사");
//		int num = 0;
//		try {
//			num = service.addBook(vo);
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		
//		if(num>0) System.out.println("등록성공");
//		else System.out.println("등록 실패");
//	}
//	@Test
//	public void update() {
//		BookVO vo = new BookVO();
//		vo.setBookID(6);
//		vo.setPrice(3300);
//		vo.setPublisher("영진출판사");
//		service.updateBook(vo);
//	}
	@Test
	public void delete() {
		service.deleteBook(6);
	}
	@Test
	public void search() {
		service.search("j");
	}
}
