package day13;

import java.util.Calendar;
import java.util.Formatter;

public class Test01 {
	public static void main(String[] args) throws Exception{
		
		Calendar c = Calendar.getInstance();
		System.out.println(c);
//		System.out.println("2019년 "+Calendar.DAY_OF_YEAR+"일째");
		String data = String.format("현재시간은 %tk 시: %tM 분 : %tS초 %n", c,c,c);
		System.out.println(data);
		
		System.out.printf("%f",Math.PI);
		String f = String.format("%f",Math.PI);
		System.out.println("========================================================================");
		
		StringBuffer sb = new StringBuffer();
//		Formatter fm= new Formatter(sb);
		Formatter fm= new Formatter("sss.txt");
		fm.format("현재시간은 %tk 시: %tM 분 : %tS초 %n", c,c,c);//내용을 유지하면서 파일에 기록하고 싶을때
		fm.format("%f %n",Math.PI);//로그파일 만들떄 formatter를 이용해서 만들수 있다.
		System.out.println(sb);//formatter는 한번에 모아서 출력하기 때문에 부담이 좀 덜하다
		fm.flush();
		
		System.out.println("main end");
	}
}
