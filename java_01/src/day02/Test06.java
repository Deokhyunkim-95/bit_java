package day02;

public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 100;
		
		System.out.println(++num);
		System.out.println(num);
		
		System.out.println(6%4);
		
		int x= 100, y=100;
		System.out.println(x!=y);
		
		int score = 999999;
		//boolean result = (score>=0)&(score<=100);
		boolean result = (score>=0)&&(score<=100);
		System.out.println("score 유효성 검증 결과 : "+result);
	
		System.out.println( 3&4 );
		System.out.println( 3|4 );
		System.out.println( 4<<2 );
		System.out.println( 16>>2 );
	}

}
