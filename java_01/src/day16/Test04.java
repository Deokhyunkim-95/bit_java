package day16;

import java.io.IOException;

public class Test04 {

	public static void main(String[] args) {
		System.out.println(" main start ");
		int jumsu = 90;
//		throw new RuntimeException(" ~~~~~~~ 문제 발생 ~~~~~~~ "); //unchecked exception

		try {
			if (!(jumsu >= 0 && jumsu <= 100))
				throw new IOException("jumsu가 유효하지 않습니다."); // checked exception , 예외발생
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		} catch (Exception e) {
			// TODO: handle exception
		} finally {

		}

		System.out.println(" main end ");
	}

}
