package day24;

public class Test02 {
	public static void main(String[] args) {
		System.out.println("main start");
		
		MyStack stack = new MyStack();
		Push job1 = new Push(stack);
		Pop job2 = new Pop(stack);
		Thread push = new Thread(job1,"push");
		Thread pop = new Thread(job2,"pop");
		
		push.start();
		pop.start();
		
		
		System.out.println("main end");
	}
}

class Push implements Runnable {
	MyStack stack;

	public Push() {	}

	public Push(MyStack stack) {
		this.stack = stack;
	}

	@Override
	public void run() {
		for(int i = 0 ; i<10;i++) {
			stack.push(i);
			try {
				Thread.sleep((int)Math.random()*100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
class Pop implements Runnable {
	MyStack stack;

	public Pop() {}

	public Pop(MyStack stack) {
		this.stack = stack;
	}

	@Override
	public void run() {
		for(int i = 0 ; i<10;i++) {
			stack.pop();
			try {
				Thread.sleep((int)Math.random()*100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

