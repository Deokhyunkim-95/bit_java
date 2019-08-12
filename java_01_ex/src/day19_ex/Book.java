package day19_ex;
//Book을 만든후 Bookmgr을 Collection 기반으로 바꾸엇 CURD가 되도록 만든다.


public class Book implements Comparable<Book> {
	private int isbn = 0;
	private String title;
	private int price;
	
	public Book() {
		
	}
	
	public Book(int isbn,String title,int price) {
		this.isbn=isbn;
		this.title=title;
		this.price=price;
	}
	
	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
		
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
	
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + isbn;
		result = prime * result + price;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (isbn != other.isbn)
			return false;
		if (price != other.price)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		return title.compareTo(o.title);
	}
}
