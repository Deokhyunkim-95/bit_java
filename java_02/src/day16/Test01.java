package day16;

public class Test01 {
	public static void main(String[] args) {
		System.out.println("main start");
		
		int a = 10, b = 0 ;
		try {
			System.out.println(1);
			System.out.println(a/b);// throw new ArithemticException() 예외발생
			System.out.println(2);
		} catch (ArithmeticException e) {
			System.out.println("예외 발생 : "+e.getMessage());
			e.printStackTrace(); //예외가 발생했을떄 예외 정보만을 찍어주는 메소드
			System.out.println(3);
			// TODO: handle exception
		}
		finally {
			System.out.println("finally {} 항상수행");
		}

		System.out.println("main end");
	}
}
