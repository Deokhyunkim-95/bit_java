package day21_teacher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class BookMgr {

	List<Book> list = null;
	int count = 0;

	public BookMgr() {
		list = new ArrayList<Book>(); //LinekdList는 노드기반으로 실행 ,ArrayList는 배열기반
	}
	
	public BookMgr(List<Book> list) {
		this.list=list;
	}
	
	public boolean addBook(Book book) { // Book객체를 넘겨받는다
		return list.add(book);
	}

	public void deleteBook(String title) {

		Iterator<Book> it = list.iterator();
		
		while (it.hasNext()) {
			Book data = it.next();
			if (data.getTitle().equals(title)) {
				System.out.println(data+"=> 삭제됩니다.");
				it.remove();

			}
		}	
	}

	public String searchTitlebook(String title) {
		Iterator<Book> it = list.iterator();
		List<Book> slist = new ArrayList<Book>();
		while (it.hasNext()) {
			Book data = it.next();
			if (data.getTitle().toUpperCase().contains(title.toUpperCase())) {
				slist.add(data);
			}
		}
		return slist.toString();
	}

	public List<Book> booklist() {
		//list.forEach(i->System.out.println(i));
		return list;
		
//		Iterator<Book> it = list.iterator();
//
//		while (it.hasNext()) {
//			Book data = it.next();
//			System.out.println("isbn:"+data.getIsbn()+"/Title:"+data.getTitle()+"/Price:"+data.getPrice());
//		}

	}
}
