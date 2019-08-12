package day13;

public class Test02 {
	public static void main(String[] args) {
		Point p = new Point(3,3);
		System.out.println(p);
		
		
		Circle2 c1 = new Circle2();
		c1.setP(p);
		System.out.println(c1);
		
		Circle2 c2 = new Circle2(new Point(7,7),5);
		System.out.println(c2);
	}
}
