package ex;

import java.util.Arrays;

public class OOOOO {
	public static void main(String[] args) {
		int[] num = new int[6];

		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 6) + 1;

		}
		int j;
		int z;
		System.out.println("처음"+Arrays.toString(num));
		System.out.println();
		for (j = 0; j < num.length; j++) {
			for (z = 0; z < num.length; z++) {
				if (j != z) {
					
					if (num[j] == num[z]) {

						num[j] = (int) (Math.random() * 6) + 1;
						
						System.out.println("j의값"+j);
						z = -1;
						System.out.println("if문");
						System.out.println("z의값"+z);
						System.out.println(Arrays.toString(num));
					}

				}

			}

		}
	}
}
//		int c = 0;
//		int count = 0;
//		for (int a = 0; a < num.length - 1; a++) {
//
//			for (int b = a + 1; b < num.length; b++) {
//				if (num[a] > num[b]) {
//					c = num[b];
//					num[b] = num[a];
//					num[a] = c;
//					count++;
//					// System.out.println(Arrays.toString(num));
//
//				}
//			}
//		}
//		System.out.println(count);
//	}
