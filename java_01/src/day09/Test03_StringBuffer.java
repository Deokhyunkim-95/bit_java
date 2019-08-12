package day09;

import java.util.Date;

public class Test03_StringBuffer {
	public static void main(String[] args) {
		String msg = "";

		msg = msg + "hello " + new java.util.Date() + " java" + " test" + 'a' + 89; // x
		System.out.println(msg);

		String msg2 = "";

		StringBuilder sb = new StringBuilder(); // o
		sb.append("hello ");
		sb.append(new Date());
		sb.append(" java");
		sb.append(" test");
		sb.append('a');
		sb.append(89);

		// msg2 = sb.toString();
		msg2 = new String(sb);
		System.out.println(msg2);

	}
}
