package day08;

import java.util.Scanner;

public class BookMgr {

	private Book[] booklist;
	int count = 0 ;
	
	public BookMgr() {
		this(10);
	}
	public BookMgr(int size) {
		booklist= new Book[size];
	}
	
//	public Book[] getBooklist() {
//		return booklist;
//	}

	public void setBooklist(Book[] booklist) {

		this.booklist = booklist;
	}
	
	public void addBook(Book book) { //Book객체를 넘겨받는다
	
		if(count==booklist.length) {
			Book[] copy = new Book[booklist.length*2];
			System.arraycopy(booklist, 0, copy, 0, booklist.length);
			booklist=copy;
		}
		booklist[count] = book;
		count++; // Booklist의 위치를 관리하는 변수

	}

	public void printBookList() {
		for (int i = 0; i < count; i++) {
			booklist[i].print();
		}

	}

	public int bookTotalPrice() {
		int sum = 0; // 책의 총 가격

		for (int i = 0; i < count; i++) {

			sum = sum + booklist[i].getPrice();
		}
		return sum;
	}
}


