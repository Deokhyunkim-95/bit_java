package ex;

import java.util.Arrays;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[6];

		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 6 + 1);
			System.out.print(num[i]+" ");
			for (int j = 0; j < i; j++) {
				if (num[i] == num[j]) {
					i--;
					System.out.println("(중복 숫자)");
					break;
				}
			}
		}
		System.out.print("\n====================\n");
		for (int i = 0; i < num.length; i++) {
			System.out.print("[" + num[i] + "]");
		}
		System.out.println();
		Arrays.sort(num);
		System.out.print(Arrays.toString(num));
		System.out.println("\n=====================");
	}
}
