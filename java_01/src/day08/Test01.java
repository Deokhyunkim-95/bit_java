package day08;

import java.util.Arrays;
import java.util.Scanner;
import util.MyUtil;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("몇개를 입력하십니까?");
		Scanner input1 = new Scanner(System.in);
		int b = input1.nextInt();
		int[] a = new int[b];
		Scanner input = new Scanner(System.in);
		for(int i = 0 ; i <a.length ; i++) {
			a[i] = input.nextInt();
		}
		System.out.println(MyUtil.max(a));
		System.out.println(MyUtil.min(a));
	}

}
