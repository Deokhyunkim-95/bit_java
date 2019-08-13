package day23;

public class Test08 {
	public static void main(String[] args) {
//		System.out.println(Thread.MAX_PRIORITY); //10
//		System.out.println(Thread.MIN_PRIORITY);//1
//		System.out.println(Thread.NORM_PRIORITY);//5 우선순위라고 생각하면 된다.

		System.out.println(" Main Start");
		Thread.yield();//무시
		System.out.print(Thread.currentThread() + "\n"); // Thread[main , 5 , main] main이라는 Thread이고 우선순위는 5 main에 있다.

		Job1 job1 = new Job1();
		Thread t1 = new Thread(job1, "job1");
		Job2 job2 = new Job2();
		Thread t2 = new Thread(job2, "job2");

		t1.start();
		t2.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		System.out.println("홀수합 + 짝수합 = " + (job1.sum + job2.sum));

		System.out.println(" Main End ");

	}
}

class Job1 implements Runnable {
	int sum = 0; // 홀수의 합을 계산할 변수

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i < 100; i = i + 2) {
			sum += i;
			System.out.print(Thread.currentThread() + "  ");
			System.out.println("1~" + i + "홉수합 : " + sum);
			Thread.yield(); //조건적인 양보
		}
	}

}

class Job2 implements Runnable {
	int sum = 0; // 짝수의 합을 계산할 변수

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i += 2) {
			sum += i;
			System.out.print(Thread.currentThread() + "  ");
			System.out.println("0~" + i + "짝수합 : " + sum);
			Thread.yield();
		}

	}

}
