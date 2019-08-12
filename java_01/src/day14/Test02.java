package day14;


import java.util.Arrays;

public class Test02 {
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		int[] num = {11,22,33,44,55};
		int[] num2 = num.clone(); //객체복제
		num2[2]=0;
		System.out.println(num);
		System.out.println(num2);
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(num2));
		System.out.println("=============================");
		
		Point p = new Point(5,5);
		Point p2 = p.clone() ; //객체를 복제하기 위해서는 clone()을 오버라이딩해야한다.
		Object obj;
		p.setX(0);
		System.out.println(p);
		System.out.println(p2);
		
	}

}
