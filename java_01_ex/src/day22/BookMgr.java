package day22;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class BookMgr {
	FileInputStream fis = null;
	FileOutputStream fos = null;
	ObjectInputStream ois = null;
	ObjectOutputStream oos = null;

	List<Book> list = null;
	List<Book> list1 = null;
	int count = 0;

	
	
	public BookMgr() throws FileNotFoundException {
		list = new ArrayList<Book>(); // LinekdList는 노드기반으로 실행 ,ArrayList는 배열기반
		fos = new FileOutputStream("\\\\192.168.0.124\\bitcamp_7class\\1_java\\과제\\08_07\\김덕현\\Book.txt");
	}

	public BookMgr(List<Book> list) {
		this.list = list;
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
	
	public boolean addBook(Book book) { // Book객체를 넘겨받는다
		return list.add(book);
	}

	public void deleteBook(String title) {

		Iterator<Book> it = list.iterator();

		while (it.hasNext()) {
			Book data = it.next();
			if (data.getTitle().equals(title)) {
				System.out.println(data + "=> 삭제됩니다.");
				it.remove();

			}
		}
	}

	public List<Book> searchTitlebook(String title) {
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

	public void saveBook() {
		try {
			fos = new FileOutputStream("\\\\192.168.0.124\\bitcamp_7class\\1_java\\과제\\08_07\\김덕현\\Book.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(booklist());
			oos.flush();
			System.out.println("Book에 저장완료");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	public List<Book> load(){
		try {
			fis = new FileInputStream("\\\\192.168.0.124\\bitcamp_7class\\1_java\\과제\\08_07\\김덕현\\Book.txt");
			ois = new ObjectInputStream(fis);
			list = (List<Book>) ois.readObject();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {
			System.out.println("저장된 내용이 없습니다.");
		} 
		catch (Exception e) {
			e.printStackTrace();
		} 
		return list;
	}

	public List<Book> booklist() {
		return list;

	}
}
