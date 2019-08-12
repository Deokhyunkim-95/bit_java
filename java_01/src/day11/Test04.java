package day11;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg1 = "hello";
		String msg2 = "hello";
		
		System.out.println(msg1.toString());
		System.out.println(msg2.toString());
		
		Book b1 = new Book("Java",700);
		Book b2 = new Book("Java",700);
		
		System.out.println(b1);
		System.out.println(b2);
	}

}

class Book extends Object{
	String title;
	int price;
	public Book() {	}
	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}
	@Override
	public String toString() {
		return "[제목:"+title+"/가격:"+price+"]";
	}
		
}