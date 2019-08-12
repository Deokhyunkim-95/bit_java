package ex;

public class Chapter03_3 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		// TODO Auto-generated method stub
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.printf("%2d * %d = %2d ",j,i,i*j);
			}
			System.out.println("");


		}
		long end = System.currentTimeMillis();
		
		System.out.println( "출력 완료  (" + ( end - start )/1000+"초 경과)" );

	}
}
