package day05;

import java.util.Arrays;

public class Prob05 {
	public static void main(String[] args) {
		int[] num = null;
		num = new int[6];
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 45) + 1;
			for (int j = 0; j < i; j++) {
				if (num[i] == num[j]) {
					i--;
					break;
				}
			}
//			System.out.println(Arrays.toString(num));
		}
		System.out.println(Arrays.toString(num));
		int count = 0;

		for (int i = 0; i < num.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < num.length; j++) {
				if (num[min] > num[j]) {
					min = j;
				}
			}
			if (i != min) {
				int tmp = num[i];
				num[i] = num[min];
				num[min] = tmp;
				count++;
			}
		}

		System.out.println(count);
		System.out.println(Arrays.toString(num));
	}
}
