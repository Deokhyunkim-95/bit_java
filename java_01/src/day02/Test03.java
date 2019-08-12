package day02;

public class Test03 {
	
	public static int x=600;
	public static int y=700;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("x="+x+", y="+y);
		System.out.printf("x=%d, y=%d %n",x,y);
		System.out.println("swap");
		intswap(x,y);
		System.out.println("-------------------------------");
		
		double d1 = 99.15689,d2 = 77.34677;
		System.out.printf("d1=%f , d2=%f %n",d1,d2);
		System.out.printf("d1=%5.2f , d2=%5.2f %n",d1,d2);
		System.out.println("swap");
		swap(d1,d2);
		System.out.println("-------------------------------");
	}

	private static void intswap(int x,int y) {
		// TODO Auto-generated method stub
		int tmp;
		tmp = x;
		x = y;
		y = tmp;
		
		System.out.println("x="+x+", y="+y);
	}
	private static void swap(double x,double y) {
		// TODO Auto-generated method stub
		double tmp;
		tmp = x;
		x = y;
		y = tmp;
		
		System.out.println("x="+x+", y="+y);
	}
}
