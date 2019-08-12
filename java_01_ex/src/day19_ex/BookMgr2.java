package day19_ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiConsumer;

public class BookMgr2 {

	Map<Integer, Book> booklist = null;
	int count = 0;

	public BookMgr2() {
		booklist = new HashMap<Integer, Book>(); // LinekdList는 노드기반으로 실행 ,ArrayList는 배열기반
	}

	public void addBook(Book book) { // Book객체를 넘겨받는다
		booklist.put(book.getIsbn(), book);
	}

	public void deleteBook(String title) {

		Iterator<Integer> it = booklist.keySet().iterator();
		while (it.hasNext()) {
			Integer isbn = it.next();
			Book data = booklist.get(isbn);
			if (data.getTitle().equals(title)) {
				System.out.println(data + "삭제됩니다.");
				it.remove();
			}
		}
	}

	public void searchTitlebook(String title) {

		Iterator<Integer> it = booklist.keySet().iterator();
		while (it.hasNext()) {
			Integer isbn = it.next();
			Book data = booklist.get(isbn);
			if (data.getTitle().toUpperCase().contains(title.toUpperCase())) {
				System.out.println(data);
			}
		}
	}

	public void printBookList() {
//		booklist.forEach(i->System.out.println(i));
		System.out.println("=== Book List foreach 기반 ===");
		booklist.forEach((k, v) -> System.out.println(v));

//		Iterator<Integer> it = booklist.keySet().iterator();
//
//		while (it.hasNext()) {
//			Integer isbn = it.next();
//			Book data = booklist.get(isbn);
//			System.out.println(data);
//		}
	}

}
