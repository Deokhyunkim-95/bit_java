package day123;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookMgr mgr = new BookMgr();
//		mgr.add(new Book("java", 900));
//		mgr.add(new Book("jsp", 2900));
//		mgr.add(new Book("dbp", 200));

//		mgr.save();
		
		mgr.getBookList().forEach(i -> System.out.println(i));
		
//		mgr.add(new Book("~~~",0));
//		mgr.save();
	}

}
