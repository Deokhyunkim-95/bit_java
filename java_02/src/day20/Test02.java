package day20;

import java.util.Iterator;
import java.util.Properties;

public class Test02 {
	public static void main(String[] args) {
		Properties p = new Properties(); //Properties는 Map구조를 상속 받음
		p.setProperty("java01","1214"); //String,String을 다룬다
		p.setProperty("java02","1244"); //String,String을 다룬다
		p.setProperty("java03","1734"); //String,String을 다룬다
		p.setProperty("java07","7234"); //String,String을 다룬다
		p.setProperty("java09","6234"); //String,String을 다룬다
		
		System.out.println(p.getProperty("java01"));
		Iterator<Object> it = p.keySet().iterator();
		
		while(it.hasNext()) {
			String key = (String)it.next();
			System.out.println(key + " : "+p.getProperty(key));
		}
	}
}
