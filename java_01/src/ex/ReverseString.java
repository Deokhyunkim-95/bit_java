package ex;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		String a ="Java Programming";
		String b = "";
		char c ; 
//		Scanner input = new Scanner(System.in);
//		System.out.println("문장을 입력하세요");
//		a = input.next();
		System.out.println("문장 거꾸로");
		int j = a.length()-1;
		for(int i = 0 ; i <a.length();i++) {
			c = a.charAt(j);
			j--;
			b = b+c;
		}
		System.out.print(b);
		
//		System.out.println(Arrays.toString(char(b));
		
		
		
	}
}
