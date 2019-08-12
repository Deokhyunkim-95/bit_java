package day17;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test04 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();//String 타입만들어가게 만듬
		list.add("hello");
		list.add("java"); 
		
//		list.add(new Date());
		
		for(String data : list) {
			System.out.println(data.toUpperCase());
		}
		
	}
}
