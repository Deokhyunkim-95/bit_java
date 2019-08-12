package day22division;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import day22.Book;



public class BookMgr {
	// Book[] 관리
	List<Book> list = new ArrayList<Book>();
	String fileName;

	BookMgr() {
		this("book.data");
	}

	BookMgr(String fileName) {
		this.fileName = fileName;
			list = (List<Book>) MyFile.load(fileName);
			if(list == null) {
				list = new ArrayList<Book>();
			}
	}

	public boolean isbncheck(int i) {
		Iterator<Book> it = list.iterator();

		while (it.hasNext()) {
			Book data = it.next();
			if (data.getIsbn()==i) {
				return true;
			}
		}
		return false;
	} 
	public boolean add(Book data) {
		return list.add(data);
	}

	public List<Book> getBookList() {
		return list;
	}
	public void save() {
		MyFile.savebook(fileName, list);
	}
	public void delete(String title) {
		Iterator<Book> it = list.iterator();

		while (it.hasNext()) {
			Book data = it.next();
			if (data.getTitle().equals(title)) {
				System.out.println(data + "=> 삭제됩니다.");
				it.remove();

			}
		}
	}
	public List<Book> search(String title) {
		Iterator<Book> it = list.iterator();
		List<Book> slist = new ArrayList<Book>();
		while (it.hasNext()) {
			Book data = it.next();
			if ((data.getTitle().toUpperCase().contains(title.toUpperCase()))) {
				slist.add(data);
			}
			
		}
		return slist;
	}
	public void load() throws FileNotFoundException {
		MyFile.load(fileName);
	}
}
