package day07;

import java.util.Arrays;

import util.MyUtil;

public class MyMathTest {
	public static void main(String[] args) {
		System.out.println(MyUtil.add(33, 99));
		System.out.println(MyUtil.add(33.3, 99.4));
		System.out.println(MyUtil.add(33.3, 99.4, 90 ));
		System.out.println(MyUtil.add(33.3, 99.4, 90, 55.9 ));
		System.out.println(MyUtil.add(1,2,3,4,5,6,7,8,9,10 ));
		System.out.println(MyUtil.add(new double[] {1,2,3,4,5,6,7,8,9,10} ));
		double[] d  = new double[] {1,2,3,4,5,6,7,8,9,10};
	
		System.out.println(Arrays.toString(d));
		
		int i = 100;
		Integer ii = i 
				
				;
		i = ii;
		System.out.println(i+ " " + ii);
	}
}
