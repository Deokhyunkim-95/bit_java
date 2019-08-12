package day03;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1,j=10;
		
		for(i = 1 ; i <10 ; i ++)
		{
			System.out.println("Hello Java "+i);
		}
		System.out.println(i);
		
		while(j>0) {
			System.out.println("while"+j);
			j--;
		}
		
		boolean flag = true;
		while(flag) {
			j++;
			System.out.println("~~~~~~~~~~~"+j);
			if(j==5) flag = !flag;
		}
		while(j<5) {
			System.out.println("do while");//동작x
		}
		do {
			System.out.println("do while");
			
		}while(j<5);
	}
}
