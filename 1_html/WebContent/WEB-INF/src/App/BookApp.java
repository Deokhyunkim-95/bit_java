package App;

import service.BookService;

public class BookApp {
	public static void main(String[] args) {
	BookService service = null;
	
	service.booklist().forEach(i -> System.out.println(i));
	
	}
	
}
