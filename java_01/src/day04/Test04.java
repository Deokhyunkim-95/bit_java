package day04;

import java.util.Arrays;

public class Test04 {
	public static void main(String[] args) {
//Array : 서명 생성 초기화를 거쳐서 사용이된다.
		int[] scores;
		scores = new int[5];

		for (int i = 0; i < 5; i++) {
			System.out.print(scores[i] + " ");
		}
		System.out.println();

		String[] names = new String[5];

		for (int i = 0; i < 5; i++) {
			System.out.print(names[i] + " ");
		}
		System.out.println();
		System.out.println("==============================");

		scores[0] = 99;
		scores[1] = 100;
		scores[2] = 69;
		scores[3] = 79;
		scores[4] = 89;

		names[0] = "홍길동";
		names[1] = "고길동";
		names[2] = "박길동";
		names[3] = "김길동";
		names[4] = "강길동";

		double avg = 0.0;
		double sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		avg = sum / scores.length;
		
		
		System.out.println(Arrays.toString(scores)+sum+avg);
		System.out.println(Arrays.toString(names));
		for(int i = 0 ; i <scores.length ; i++ ) {
			System.out.println(names[i].charAt(0)+"**의 점수는"+scores[i]+(scores[i]>= avg?"    평균이상":"    평균미달"));
//			if(scores[i]<avg) {
//				System.out.println("평균 아래 점수입니다");
//			}
//			else if(scores[i]>avg)
//				System.out.println("평균 이상 점수입니다.");
//			else
//				System.out.println("평균 점수입니다.");
//			System.out.println("========================================");
		}
		
	}
}
