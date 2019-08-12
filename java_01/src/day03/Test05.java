package day03;

public class Test05 {
	public static void main(String[] args) {
		//1~100 합
		int sum=0;
		int sum4=0;
		for(int i =1 ; i<=100 ; i++) {
			sum=sum+i;
			if(i%4==0) {
				sum4=sum4+i;
			}
		}
		System.out.println("1~100 합 :"+sum);
		System.out.println("4의 배수 합 :"+sum4);
	}
}
