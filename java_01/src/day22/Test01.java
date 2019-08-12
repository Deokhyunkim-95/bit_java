package day22;

import java.io.File;
import java.util.Arrays;
import java.util.Date;

public class Test01 {
	public static void main(String[] args) {
		File dir = new File("c:\\");
		String[] list = dir.list();
		System.out.println(Arrays.toString(list));
		System.out.println("=============================");
		File file = null;
		Date date = null;
		
		for(String data:list) {
			file = new File(dir,data);
			System.out.print(file.getName()+"\t");
			System.out.print(file.length()+"\t");
			date = new Date(file.lastModified());
			System.out.print(date+"\t");
			
			if(file.isDirectory()) System.out.println("<dir>");
			System.out.println();
			
		}
		
	}
}
