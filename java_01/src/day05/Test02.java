package day05;

import java.util.Arrays;

public class Test02 {
	public static void main(String[] args) {

		int[] scores = { 77, 99, 100, 85, 91 };

		int[] sc = new int[scores.length * 2];

		System.arraycopy(scores, 0, sc, 0, scores.length); // 배열의 크기 resizing object는 주
		System.out.println(Arrays.toString(scores));
		System.out.println(Arrays.toString(sc));

		String[] names = { "홍길동", "박길동", "고길동", "최길동" };
		String[] names1 = new String[names.length * 2];

		System.arraycopy(names, 0, names1, names1.length-names.length, names.length); // 배열의 크기 resizing object는 주
		System.out.println(Arrays.toString(names));
		System.out.println(Arrays.toString(names1));
//		names1 = Arrays.copyOfRange(names, 0, names.length);		
//		System.out.println(Arrays.toString(names1));
//		System.out.println(arrays.co);							
//		System.out.println(Arrays.toString(sc));

	}
}
