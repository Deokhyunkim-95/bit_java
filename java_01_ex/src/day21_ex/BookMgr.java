package day21_ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class BookMgr {

	List<Book> booklist = null;
	int count = 0;

	public BookMgr() {
		booklist = new ArrayList<Book>(); //LinekdList는 노드기반으로 실행 ,ArrayList는 배열기반
	}
	
	public BookMgr(List<Book> list) {
		this.booklist=list;
	}
	
	public List<Book> addBook(Book book) { // Book객체를 넘겨받는다
		booklist.add(book);
		System.out.println(booklist);
		return booklist;
	}

	
	@Override
	public String toString() {
		return "BookMgr [booklist=" + booklist + ", count=" + count + "]";
	}

	public void deleteBook(String title) {

		Iterator<Book> it = booklist.iterator();
		
		while (it.hasNext()) {
			Book data = it.next();
			if (data.getTitle().equals(title))
				System.out.println(data+"=> 삭제됩니다.");
				it.remove();
		}	
	}

	public void searchTitlebook(String title) {
		Iterator<Book> it = booklist.iterator();
		while (it.hasNext()) {
			Book data = it.next();
			if (data.getTitle().toUpperCase().contains(title.toUpperCase())) {
				System.out.println(data);
			}
		}
	}

	public List<Book> printBookList() {
		booklist.forEach(i->System.out.println(i));
		return booklist;
		

	}
}
