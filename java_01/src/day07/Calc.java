package day07;

public class Calc {
	//class변수
	static int data = 0;
	
	//class method
	public long add(int a, int b) {
		System.out.println(Calc.data);
		System.out.println(Math.random());
		return a + b;
	}

	public static long sub(int a, int b) {
		return a - b;
	}

	public static long mul(int a, int b) {
		return a * b;
	}

	public static long div(int a, int b) {
		if (b == 0) {
			System.out.println("0으로는 나눌수가 없습니다.");
			return 0;
		}
		return a / b;
	}
}
