package ex;

public class Chapter03_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = args[0];
		char b = a.charAt(0);
		
		
	//	char b = args.charAt(0);
		
		if(b>64&&b<91)
		{
			System.out.println("대문자");
		}
		else if(b>96&&b<123)
		{
			System.out.println("소문자");
		}
		else if(b>48&&b<58)
			
		System.out.println("숫자");
	}

}
