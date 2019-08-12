package day07;

public class CalcTest {
	public static void main(String[] args) {
		
		Calc c1 = new Calc();
		System.out.println(c1.add(11, 99));
		Calc.sub(11,99);
		
		//static method사용
		System.out.println(Calc.sub(11, 99));
		System.out.println(Calc.mul(11, 99));
		System.out.println(Calc.div(11, 99));
		
	}
}
