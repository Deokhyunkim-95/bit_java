package day15;

import day14.Point;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer.Inner i = new Outer().new Inner();
		i.print();
	}

}
class Outer{
	Point p = new Point(3,3);
	
	class Inner{
		void print() {
			System.out.println(p);
		}
	}
	
}