package day17;

import day16.Book;

public class BookTest {
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.setTitle("java");
		try {
			b1.setPrice(-9000);
		} catch (PriceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		System.out.println(b1);
		System.out.println("--------------------------------------");
		Book b2 = null;
		try {
			b2 = new Book("jsp",99900);
		} catch (PriceException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		System.out.println(b2);
	}
}
