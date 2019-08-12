package day12_abstract;

public class Book {
	private String title;
	private int price;

	public String getTitle() {
		return title;
	}

	public Book() {
	}

	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}

	public Book(int price, String title) {
		super();
		this.title = title;

		this.price = price;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Book 정보 title:");
		sb.append(title);
		sb.append("price:");
		sb.append(price);

//		return new String(sb);
		return sb.toString();

	}

	@Override
	public boolean equals(Object obj) {
		// 타입비교
//		boolean a = false;
//		Book book = (Book) obj;
//		if ( this.title.equals(book.title) && this.price == book.price) {
//			a = true;
//		}
//		else return false;
//		
//		return a;

		boolean flag = false;
		
		if (obj == null || !(obj instanceof Book)) {
			return false;
		}
		Book data = (Book) obj;// 다운캐스팅
		if (this.title.equals(data.title) && this.price == data.price) {
			return true;
		}
		return flag;
	}

	@Override
	protected void finalize() throws Throwable {
		// 객체가 소멸되기 직전에 호출되는 메소드 이지만 자바에서는 사용안하고 별도의 자원반납 기능을 만들어 사용한다.
		// 별도의 자원반납 기능을 만들어 사용한다.  ex) close()
		System.out.println("자원 반납 코드");
	}
	
	public void close() {
		System.out.println("close()  자원 반납코드");
	}
}
