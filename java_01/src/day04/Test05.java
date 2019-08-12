package day04;

import java.util.Arrays;

public class Test05 {
	public static void main(String[] args) {
		// 배열 선언, 생성, 초기화
		int[] scores = { 88, 99, 100, 22, 56, 88, 99 };
		String[] names = { "홍길순", "김길홍", "고길수", "박길후", "최길김", "이길박"};

		System.out.println(Arrays.toString(scores));
		System.out.println(Arrays.toString(names));

		if (names.length > 6) {
			System.out.println(names[6]);
		}
		System.out.println("=======================================");
		
		for( String data :names) {
			System.out.print(data.charAt(0)+"*"+data.charAt(data.length()-1)+" ");
		}
		System.out.println();
		double sum = 0;
		
		for( int data : scores) {
			sum += data;
		}
		System.out.printf("평균 %.2f",sum/scores.length);
	}
}
