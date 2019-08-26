package VO;

public class Book {
	int BookID;
	String BookName;
	String Publisher;
	int Price;
	
	public Book() {}
	
	public Book(String bookName) {
		BookName= bookName;
	}
	
	public Book( String bookName, String publisher, int price) {
		super();
		BookName = bookName;
		Publisher = publisher;
		Price = price;
	}
	
	public Book(int bookID, String bookName, String publisher, int price) {
		super();
		BookID = bookID;
		BookName = bookName;
		Publisher = publisher;
		Price = price;
	}
	public int getBookID() {
		return BookID;
	}
	public void setBookID(int bookID) {
		BookID = bookID;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public String getPublisher() {
		return Publisher;
	}
	public void setPublisher(String publisher) {
		Publisher = publisher;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + BookID;
		result = prime * result + ((BookName == null) ? 0 : BookName.hashCode());
		result = prime * result + Price;
		result = prime * result + ((Publisher == null) ? 0 : Publisher.hashCode());
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
		if (BookID != other.BookID)
			return false;
		if (BookName == null) {
			if (other.BookName != null)
				return false;
		} else if (!BookName.equals(other.BookName))
			return false;
		if (Price != other.Price)
			return false;
		if (Publisher == null) {
			if (other.Publisher != null)
				return false;
		} else if (!Publisher.equals(other.Publisher))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Book [BookID=" + BookID + ", BookName=" + BookName + ", Publisher=" + Publisher + ", Price=" + Price
				+ "]";
	}
	

}
