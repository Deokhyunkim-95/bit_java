package day05;

import java.util.Arrays;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.println((int)(Math.random()*10));

		if (args.length == 0) {
			System.out.println("배열의 사이즈 정보를 실행 매개변수로 넘겨주세요..");
			System.out.println("실행_예 ) java day05.Test04 5");
			return;

		}

		int[] nums = new int[Integer.parseInt(args[0])];
		System.out.println("숫자 배열");
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 10) + 1;
		}
		System.out.println(Arrays.toString(nums));
		System.out.println("오름차순정렬");

		int count = 0;
//		System.out.println((int) nums.length);

		for (int i = 0; i < nums.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < nums.length; j++) {
				if ((nums[min]) > (nums[j])) {
					min = j;
				}
			}
			System.out.println("변경전 : " +Arrays.toString(nums));
			if (nums[min] != nums[i]) {
				int tmp;
				tmp = nums[i];
				nums[i] = nums[min];
				nums[min] = tmp;
				count++;
				System.out.println("변경후 : "+Arrays.toString(nums));
			}
		}

		System.out.println("==================================");
		System.out.println(Arrays.toString(nums) + "count:" + count);

//		System.out.println("내림차순정렬");
//		for (int i = 0; i < nums.length - 1; i++) {
//			int max = i;
//			for (int j = i + 1; j < nums.length; j++) {
//				if (nums[max] < nums[j]) {
//					max = j;
//				}
//			}
//			if ((nums[i]) != nums[max]) {
//				int tmp;
//				tmp = nums[i];
//				nums[i] = nums[max];
//				nums[max] = tmp;
//				count++;
//				System.out.println(Arrays.toString(nums));
//			}
//		}
//		System.out.println(Arrays.toString(nums) + "count:" + count);
//		System.out.println(Arrays.toString(nums));

		// Arrays.parallelSort(nums);

		// System.out.println(Arrays.toString(nums));
	}
}