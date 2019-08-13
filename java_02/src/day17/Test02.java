package day17;

public class Test02 {
	public static void main(String[] args) {
		Book b1 = new Book("java", 900); // 생략하면 object,object

		if (b1.getTitle() instanceof String)
			System.out.println(((String) b1.title).charAt(0));

		Book<String, Integer> b2 = new Book<String, Integer>("SQL", 400);
		System.out.println(b2.getTitle().charAt(0));

		Book<?, Integer> b3 = new Book<String, Integer>("Spring", 400);
		System.out.println(b3.getTitle()); // ?->object
		
		Book<String, ? extends Number> b4 = new Book<String, Integer>("SQL", 400);
		System.out.println(b4.getPrice()); // ? -> Number type
		
		Book<String, ? super Number> b5 = new Book<String, Object>("SQL", 400);
		System.out.println(b5.getPrice()); // ? ->Object
	}
}
