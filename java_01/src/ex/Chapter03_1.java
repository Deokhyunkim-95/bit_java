package ex;

import java.util.*;
public class Chapter03_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int age = 0;
			Scanner input = new Scanner(System.in);
			
			
			System.out.println("나이를 입력 : ");
			age = input.nextInt();
			
			if(age/10<1)
			{
				System.out.println("10대 미만입니다");
			}
			else if(age/10==1)
			{
				System.out.println("10대입니다.");
			}
			else if(age/10==2)
			{
				System.out.println("20대입니다.");
			}
			else if(age/10==3)
			{
				System.out.println("30대입니다.");
			}
			else if(age/10==4)
			{
				System.out.println("40대입니다.");
			}
			else if(age/10==5)
			{
				System.out.println("50대입니다.");
			}
			else if(age/10==6)
			{
				System.out.println("60대입니다.");
			}
			else if(age/10==7)
			{
				System.out.println("70대입니다.");
			}
			else if(age/10==8)
			{
				System.out.println("80대입니다.");
			}
			else if(age/10==9)
			{
				System.out.println("90대입니다.");
			}
			else
			{
				System.out.println("90대 이상입니다.");
			}
	}

}
