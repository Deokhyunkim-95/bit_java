package day07;

import java.util.Arrays;


import util.Sort;

public class SortTest {
	public static void main(String[] args) {
		int[] src= {4,3,2,1,5,6,7,8};
		
		int[] result = Sort.sort(src);
		
		System.out.println(Arrays.toString(src));
		System.out.println(Arrays.toString(result));
		
	}
}
