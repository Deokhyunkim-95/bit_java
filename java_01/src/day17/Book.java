package day17;

public class Book<T,P> {
	T title;
	P price;
	public Book() {
		
	}
	public Book(T title, P price) {
		super();
		this.title = title;
		this.price = price;
	}
	public T getTitle() {
		return title;
	}
	public void setTitle(T title) {
		this.title = title;
	}
	public P getPrice() {
		return price;
	}
	public void setPrice(P price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((price == null) ? 0 : price.hashCode());
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
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
}
