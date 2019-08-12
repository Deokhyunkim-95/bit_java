package day15_ex;

import util.MyUtil;
import static util.MyUtil.RightPad;;

public class Test01 {
	
	public static void main(String[] args) {
		MyUtil u = new MyUtil();
		String s = u.leftPad("ejb", 15, '^');
		System.out.println(s);
		System.out.println(util.MyUtil.RightPad("Java",10,'#'));
		System.out.println(RightPad("Java",10,'#'));
		System.out.println(MyUtil.add(4,5,6,7,8));

	}
};
