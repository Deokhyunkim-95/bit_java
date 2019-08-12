package day02;

public class Test02 {
	public static void main(String[] args) {
		int num = 99;
		System.out.println(num);
		
		int a = 'a';
		
		System.out.println(a);
		
		double b = 1./2.;
		System.out.println(b);
		
		String c = 1+1+1+"1";
		System.out.println(c+" "+a);
		
		String name="홍길동";
		System.out.println(name.charAt(0)+"**");
		
		String address = new String("비트교육센터");
		System.out.println(address+":"+address.length());
		
		long number = 999999999999999999L;
		System.out.println(number);
		
		System.out.println('A'+":"+(int)'A');
		System.out.println('Z'+":"+(int)'Z');
		System.out.println('a'+":"+(int)'a'); 
		System.out.println('z'+":"+(int)'z'); 
		System.out.println('0'+":"+(int)'0'); 
		System.out.println('9'+":"+(int)'9');
	}
}
