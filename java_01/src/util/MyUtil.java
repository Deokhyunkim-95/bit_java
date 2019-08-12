package util;

public class MyUtil {
//method overoading
	public static long add(int a, int b) {
		return a + b;
	}

	public static double add(double a, double b) {
		return a + b;
	}

	// 가변인자, 제일 마지막 위치만 허용
	public static double add(double... nums) { // []처리

		double sum = 0;

		for (double data : nums) {
			sum += data;
		}

		return sum;
	}

//	public static double add(double[] a) { // []처리
//
//		double sum = 0;
//
//		for (double data : a) {
//			sum += data;
//		}
//
//		return sum;
//	}
	public String leftPad(String str, int size, char padChar) {
		/* 여기에 프로그램을 완성하십시오. */
		String sum = null;
		if (str.length() > size) {
			return str;
		}
//1.		else {
//			sum = padChar+str;
//			for(int i = 0 ; i< size-str.length()-1; i++) {
//				sum = padChar+sum;
//			}
//		}

//2.
		int count = size - str.length();
		for (int i = 0; i < count; i++) {
			str = padChar + str;
		}
		return str;
	}

	public static String RightPad(String str, int size, char padChar) {
		/* 여기에 프로그램을 완성하십시오. */
		String sum = null;
		if (str.length() > size) {
			return str;
		}
		int count = size - str.length();
		for (int i = 0; i < count; i++) {
			str = str + padChar;
		}
		return str;
	}

	public class Sort {

		public int[] sort(int[] nums) { //static method
			int[] nums1 = new int[nums.length] ;
			System.arraycopy(nums, 0, nums1, 0, nums.length);		
			
//			int[] nums1 = new int[nums.length];
//			for(int i = 0 ; i<nums.length;i++) {
//				nums1[i]=nums[i];
//			}
			
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
	}
	//숫자를 넘겨 받아 그중 가장 큰수를 리턴하는 함수
	public static int max(int ...a) {
		
		int max = Integer.MIN_VALUE;
		
		for(int data:a) {
			if(max<data)
			{
				max=data;
			}
		
		}
		return max;
	}
public static int min(int ...a) {
		
		int min = Integer.MAX_VALUE;
		
		for(int data:a) {
			if(min>data)
			{
				min=data;
			}
		
		}
		return min;
	}
}
