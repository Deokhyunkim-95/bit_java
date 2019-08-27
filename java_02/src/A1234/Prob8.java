package A1234;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Prob8 {
	public static void main(String[] args) {
		List<User> list = new ArrayList<User>();
		list.add(new User("홍길동","user01","1234","user"));
		list.add(new User("관리자","admin","admin","admin"));
	
		Collections.sort(list);
		
		Iterator<User> it = list.iterator();
		
		while(it.hasNext()) {
			User data = it.next();
			System.out.println(data);
		}
		
//		for(User data : list) {
//			System.out.println(data);
//		}
		
	}
}
class User extends Object implements Comparable<User>,Serializable{
	String name;
	String id;
	String pw;
	String role;
	public User() {
		
	}
	
	public User(String name, String id, String pw, String role) {
		super();
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.role = role;
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + ", pw=" + pw + ", role=" + role + "]";
	}

	@Override
	public int compareTo(User o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
}
