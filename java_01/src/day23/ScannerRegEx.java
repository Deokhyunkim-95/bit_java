package day23;

import java.util.Scanner;

public class ScannerRegEx {
	public static void main(String[] args) {
		String str = "1 and 2 and animal and lion and tiger";
		Scanner scan = new Scanner(str);
		scan = scan.useDelimiter("\\s*and\\s*"); //useDelimiter를 사용하여 쪼개는 구분자를 만든다. \s는 공백
		int firstToken = scan.nextInt();
		int secondToken = scan.nextInt();
		String thirdToken = scan.next();
		String fourthToken = scan.next();
		String fifthToken = scan.next();
		System.out.printf("%d, %d, %s, %s, %s",firstToken,secondToken,thirdToken,fourthToken,fifthToken);
		scan.close();
	}
}
