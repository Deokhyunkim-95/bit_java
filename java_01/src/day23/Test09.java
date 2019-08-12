package day23;

public class Test09 {
	public static void main(String[] args) {
//		System.out.println(Thread.MAX_PRIORITY); //10
//		System.out.println(Thread.MIN_PRIORITY);//1
//		System.out.println(Thread.NORM_PRIORITY);//5 우선순위라고 생각하면 된다.
		
		System.out.println(" Main Start");
		
		System.out.print(Thread.currentThread()+"\n");  // Thread[main , 5 , main] main이라는 Thread이고 우선순위는 5 main에 있다.
		

		T1 t1 = new T1();
		T2 t2 = new T2();
		
		t1.start();
		
		t2.start();
//		job1.run();
//		job2.run();
//		t1.sleep(5000);
		System.out.println("홀수합 + 짝수합 = " +(t1.sum+t2.sum));
		System.out.println(" Main End ");
		
		
		
	}
}
class T1 extends Thread{
	int sum = 0; //홀수의 합을 계산할 변수
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 1; i<100;i=i+2) {
			sum+=i;
			System.out.print(Thread.currentThread()+"  ");
			System.out.println("1~"+i+"홉수합 : "+sum);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
class T2 extends Thread{
	int sum = 0; //짝수의 합을 계산할 변수
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i<100;i+=2) {
			sum+=i;
			System.out.print(Thread.currentThread()+"  ");
			System.out.println("0~"+i+"짝수합 : "+sum);
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	
}
