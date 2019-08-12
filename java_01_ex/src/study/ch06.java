package study;

import java.util.Scanner;

public class ch06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int a = input.nextInt();
		int i , sum = 0;
		for(i = 0 ; i <= a ; i++) {
			sum = sum + i;
		}
		factorial(i);
		
		System.out.println(sum);
		System.out.println(factorial(a));
	}
	public static int factorial (int i) {
		if( i == 1) {
			return 1;
		}
		else 
			return i*factorial(i-1);
		}

}
