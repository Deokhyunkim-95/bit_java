package day07;

public class P139 {
	public static int increase(int n) {
		++n;
		return n;
	}
	public static void main(String[] args) {
		int var1 = 100;
		
		int var2 = P139.increase(var1);
		
		System.out.println("var1 : " + var1 + ", var2 : "+ var2	);

	}

}
