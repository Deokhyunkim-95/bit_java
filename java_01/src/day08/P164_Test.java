package day08;

public class P164_Test {
	public static void main(String[] args) {
		System.out.println(Count.count);
		Count c1 = new Count();
		Count c2 = new Count();
		Count c3 = new Count();
		Count c4 = new Count();
		System.out.println(Count.count);
		System.out.println(c2.c);
		System.out.println(c3.c);
		System.out.println(c4.c);
	}
}
class Count{
	int c;
	static int count;
	public Count() {
		c++;
		count++;
	}
}
