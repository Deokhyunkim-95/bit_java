package day03;

import java.util.*;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int jumsu;

		Scanner input = new Scanner(System.in);

		System.out.println("점수를 입력하시오:");
		jumsu = Integer.parseInt(input.nextLine());

		input.close();
		input = null;

		// input.nextLine();

		if (!(jumsu >= 0 && jumsu <= 100)) {
			System.out.println("유효하지 않은 점수 입니다.");
			return;
		}
		/*
		 * else if (jumsu < 80) System.out.println("No Pass"); else
		 * System.out.println("Pass");
		 */

		// 삼항연산처리
		String result = ((jumsu >= 80 ? "pass" : "No pass"));
		System.out.println("점수는 " + jumsu + "점 입니다." + result);

		// A,B,C,D,F등그처리
		String grade = "F";
		if (jumsu >= 90)
			grade = "A";
		else if (jumsu >= 80)
			grade = "B";
		else if (jumsu >= 70)
			grade = "C";
		else if (jumsu >= 60)
			grade = "D";

		System.out.println("점수 : " + jumsu + " : " + result + " : " + grade + "등급");
		System.out.printf("점수 : %d : %s : %s등급 %n", jumsu, result, grade);

		// 삼항연산자로처리
		System.out.println("-----------------------삼항---------------------------");
		String result1 = (jumsu >= 90 ? "A" : (jumsu >= 80 ? "B" : (jumsu >= 70 ? "C" : (jumsu >= 60 ? "D" : "F"))));
		System.out.printf("삼항 : %s %n", result1);

		// switch

		System.out.println("---------------------switch--------------------------");
		char c = ' ';

		switch (jumsu / 10) {
		case 10:
		case 9:
			c = 'A';
			break;
		case 8:
			c = 'B';
			break;

		case 7:
			c = 'C';
			break;

		case 6:
			c = 'D';
			break;

		default:
			c = 'F';
			break;
		}

		System.out.println("점수 : " + jumsu + " 등급 : " + c);
		return;

	}

}
