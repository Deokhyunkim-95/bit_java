package day09;

import java.util.Arrays;
import java.util.Scanner;

public class BookMgr {

	private Book[] booklist;
	int count = 0;

	public BookMgr() {
		this(10);
	}

	public BookMgr(int size) {
		booklist = new Book[size];
	}

//	public Book[] getBooklist() {
//		return booklist;
//	}

	public void setBooklist(Book[] booklist) {

		this.booklist = booklist;
	}

	public void addBook(Book book) { // Book객체를 넘겨받는다

		if (count == booklist.length) {
			Book[] copy = new Book[booklist.length * 2];
			System.arraycopy(booklist, 0, copy, 0, booklist.length);
			booklist = copy;
		}
		booklist[count] = book;
		count++; // Booklist의 위치를 관리하는 변수

	}

	public void deleteBook() {

		Scanner input = new Scanner(System.in);
		String bookname = null;

		if (count == 0) {
			System.out.println("가지고 있는 책이 없습니다.");
		} else {
			System.out.println("가지고 있는 책");
			for (int i = 0; i < count; i++) {
				booklist[i].print();
			}
			System.out.println("삭제하고 싶은 책의 이름을 선택해 주세요");
			bookname = input.nextLine();
			
			for (int i = 0; i < count; i++) {
				if (booklist[i].getTitle().equals(bookname)) {
					for (int j = i; j < count - 1; j++) {
						booklist[j] = booklist[j + 1];
					}
					count--;
				}
			}
		}
	}

	public void deleteBook1(String title) {

		for (int i = 0; i < count; i++) {
			if (booklist[i].getTitle().equals(title)) {
					System.arraycopy(booklist, i+1, booklist, i, count-i-1);
					count--;
					System.out.println(title+"삭제되었습니다.");
					return;
			}
		}
		System.out.println(title+"도서가 없습니다.");
	}

	public void lookbook() {

		Scanner input = new Scanner(System.in);
		String bookname = null;

		System.out.println("찾고자 하는 책이름 :");
		bookname = input.nextLine(); // 찾을 책의 이름

		for (int i = 0; i < count; i++) {
			if (booklist[i].getTitle().toLowerCase().contains(bookname.toLowerCase())) {
				System.out.println(
						bookname + "이 들어가 있는 책 정보 제목: " + booklist[i].getTitle() + "   가격:" + booklist[i].getPrice());
			}
		}

	}

	public void searchTitlebook(String title) {
				
		for(Book data:booklist) {
			if(data == null) return;
			if (data !=null && data.getTitle().toLowerCase().contains(title.toLowerCase())) {
				System.out.println(
						title + "이 들어가 있는 책 정보 제목: " + data.getTitle() + "   가격:" + data.getPrice());
			
			}
		}
		
	}
	
	public void printBookList() {
		System.out.println("================Book List========================");
		for (int i = 0; i < count; i++) {
			booklist[i].print();

		}
		System.out.println("총" + count + "권");
		System.out.println("=================================================");
	}

	public int bookTotalPrice() {
		int sum = 0; // 책의 총 가격

		for (int i = 0; i < count; i++) {

			sum = sum + booklist[i].getPrice();
		}
		return sum;
	}
}
