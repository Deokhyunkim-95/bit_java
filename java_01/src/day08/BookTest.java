package day08;

import java.util.Arrays;
import java.util.Scanner;

import day09.Book;
import day09.BookMgr;

public class BookTest {

	public static void main(String[] args) {
		
		BookMgr mgr = new BookMgr(5);
		
		mgr.addBook(new Book("Java Program",29000));
		mgr.addBook(new Book("Jsp Program",19000));
		mgr.addBook(new Book("SQL Program",9000));
		mgr.addBook(new Book("JDBC Program",1700));
		mgr.addBook(new Book("EJB Program",42000));
		mgr.addBook(new Book("EJB Program",42000));
		
		//System.out.println(Arrays.toString(mgr.getBooklist()));
		
//		Book[] b = mgr.getBooklist();
//		for(int i = 0 ; i <b.length ;i++) {
//			b[i].print();
//		}
		
		
		
		System.out.println("===== 책목록 =======");
		
		mgr.printBookList();
		
		System.out.println("가격 총 합계 : "+mgr.bookTotalPrice());
	}

}
