package day04;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("알파벳 아스키 코드 값 확인");

		char a = 'a';
		char A = 'A';
		for (int i = 0; i < 26; i++) {
			System.out.println(a + " : " + ((int) a++) + "\t" + A + ":" + (int) A++);
		}

		System.out.println("문자열을 입력하세요");
		String msg = input.nextLine();

		for (int i = 0; i < msg.length(); i++) {
			char ch = msg.charAt(i);
			char s = ((ch >= 'A' && ch <= 'Z') ? (char) (ch + 32) : (ch < 'z' && ch >= 'a') ? (char) (ch - 32) : ch);
			System.out.print(s);
			// 소문자 => 대문자
			// 다문자 => 소문자
		}
		input.close();
		input = null;
	}
}
