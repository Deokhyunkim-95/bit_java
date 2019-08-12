package day10;

import java.util.Arrays;

public class Test02 {
	public static void main(String[] args) {
		char[] c= "ABCEDF".toCharArray();
		int count = 6; 
		int d = 0; //삭제되는 배열의 위치
		System.out.println(Arrays.toString(c));
	
		System.arraycopy(c, d+1, c, d, count-d-1);
		c[--count]=' ';
		
		System.out.println(Arrays.toString(c));

	
	
	
	
	}
}
