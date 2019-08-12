package ex;

public class Prob3 {

	public static void main(String[] args) {
		String sourceString = "everyday we have is one more than we deserve";
		String encodedString = "";
		char a;

		for (int i = 0; i <= sourceString.length() - 1; i++) {
			a = sourceString.charAt(i);
			
			if (a >= 'a' && a <= 'w') {
				encodedString = encodedString + (char) (a + 3);
			} else if (a >= 'x' && a <= 'z') {
//				encodedString = encodedString+(char)((a-97+3)%26+97);
				encodedString = encodedString + (char) (a - 23);
			} else if ( a == ' ') {
				encodedString = encodedString + a;
			}
			// 프로그램을 구현부 시작.
			// 참고 : 문자 'a'의 정수값은 97이며, 'z'는 122입니다.

			// 프로그램 구현부 끝.
		}
		System.out.println("암호화할 문자열 : " + sourceString);
		System.out.println("암호화된 문자열 : " + encodedString);
		System.out.println("=============================================");

		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++) {
				sum = sum + j;
				System.out.print(j);
//				for(int k=1 ; j<=k ; k++) {
//					System.out.print("+");
//				}
			}
			System.out.println();
		}
		System.out.println(sum);
//		int sum=0,sum1=0;
//		for(int i =0;i<=10;i++) {
//			sum=sum+i;
//			sum1=sum1+sum;
//		}
//		System.out.println(sum1);
//		
//	}

	}
}
