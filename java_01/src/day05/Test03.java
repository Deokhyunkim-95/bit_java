package day05;

import java.util.Arrays;

public class Test03 {
	public static void main(String[] args) {
		String msg = "hello Java ~~~";
		String msg2 = "hi ~~~ SQL";
//		char[] c = {};
		char[] c = new char[msg.length()];
		for (int i = 0; i < msg.length(); i++) {
			c[i] = msg.charAt(i);
		}
		char[] cc = msg.toCharArray();
//		char[] cc2 = msg2.toCharArray();
		cc[0] = 'Q';
		String ne = new String(cc);
		System.out.println(msg);
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(cc));
		System.out.println((ne));
//		System.out.println(Arrays.toString(cc2));

	}
}
