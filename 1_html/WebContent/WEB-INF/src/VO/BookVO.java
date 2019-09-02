package VO;

public class BookVO {
	int bookid;  //NUMBER(2) PRIMARY KEY
	String bookname; //VARCHAR2(40)
	String publisher; //VARCHAR2(40)
	int price;	//NUMBER(8)
	
	public BookVO() {}
	
	public BookVO(int bookID, String bookName, String publisher, int price) {
		super();
		this.bookid = bookID;
		this.bookname = bookName;
		this.publisher = publisher;
		this.price = price;
	}
	public int getBookID() {
		return bookid;
	}
	public void setBookID(int bookID) {
		bookid = bookID;
	}
	public String getBookName() {
		return bookname;
	}
	public void setBookName(String bookName) {
		bookname = bookName;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bookid;
		result = prime * result + ((bookname == null) ? 0 : bookname.hashCode());
		result = prime * result + price;
		result = prime * result + ((publisher == null) ? 0 : publisher.hashCode());
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
		BookVO other = (BookVO) obj;
		if (bookid != other.bookid)
			return false;
		if (bookname == null) {
			if (other.bookname != null)
				return false;
		} else if (!bookname.equals(other.bookname))
			return false;
		if (price != other.price)
			return false;
		if (publisher == null) {
			if (other.publisher != null)
				return false;
		} else if (!publisher.equals(other.publisher))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Book [BookID=" + bookid + ", BookName=" + bookname + ", Publisher=" + publisher + ", Price=" + price
				+ "]";
	}
	

}
