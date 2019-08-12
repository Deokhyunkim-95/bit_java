package util;

import java.util.Arrays;

import day07.P139;

public class Sort {

	public static int[] sort(int[] nums) { //static method
		int[] nums1 = new int[nums.length] ;
		System.arraycopy(nums, 0, nums1, 0, nums.length);		
		
//		int[] nums1 = new int[nums.length];
//		for(int i = 0 ; i<nums.length;i++) {
//			nums1[i]=nums[i];
//		}
		
		int min = 0;
		for (int i = 0; i <= nums1.length-1; i++) {
			min = i;
			for (int j = i + 1; j < nums1.length; j++) {
				if (nums1[min] > nums1[j]) {
					min = j;
				}
			}
			if (i != min) {
				int tmp;
				tmp = nums1[i];
				nums1[i] = nums1[min];
				nums1[min] = tmp;
			}
		}
		return nums1;
	}
//	public static void main(String[] args) {
//		System.out.println();
//	}
}
