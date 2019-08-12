package ex;

import java.util.Arrays;

public class Homework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[6];

		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 45) + 1;
			System.out.print(num[i]+" ");
			for(int j = 1 ; j<i ;j++) {
				if(num[i]==num[j]) {
					i--;
					break;
				}
				
			}
		}
		System.out.println();
		System.out.println(Arrays.toString(num));
	}

}
