package day14;

public class Test01 {
	public static void main(String[] args) {
		Shape c1 = new Circle(new Point(4,4),3);
		Rectangle r1 = new Rectangle(new Point(11,11),3,7);
		
		Shape[] shapes = {c1,r1};
		
		
		for(Shape data:shapes) {
			System.out.println(data);
			System.out.println(data.area());
			data.move(1);
			data.draw();
			System.out.println(data);
		}
//		System.out.println(c1);
//		c1.move(1);
//		System.out.println(c1);
//		((Circle) c1).draw();//draw가 있는 함수로 캐스팅해줘야함
//		
//		System.out.println(r1);
//		r1.move(2);
//		System.out.println(r1);
//		r1.draw();
//		System.out.println(dm1[1]);
//		dm1[1].move(3);
//		System.out.println(dm1[1]);
//		dm1[1].draw();
//		
//		System.out.println(dm1[0]);
//		dm1[0].draw();		
//		System.out.println(dm1[0]);
//		dm1[0].move(3);		
	}
}
