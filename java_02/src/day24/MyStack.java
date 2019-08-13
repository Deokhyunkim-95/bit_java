package day24;

public class MyStack {
	int top = 0;
	int[] stack;
	int size;

	public MyStack() {
		size = 10;
		stack = new int[size];
	}

	public MyStack(int i) {
		if(size<0) {
			stack = new int[10];
		}
		stack = new int[size];
//		top = -1;
//		stack = new int[i];
//		this.size = i;
	}

	public synchronized boolean isEmpty() {
		return top== 0 ? true : false;
	}

	public synchronized void push(int i) {
		// TODO Auto-generated method stub
		if(isFull()) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		stack[top] = i;
		top++;
		System.out.println("push => "+i);
		
		notifyAll();
	
	}

	public synchronized boolean isFull() {
		// TODO Auto-generated method stub
		return top == stack.length ? true : false;
	}

	public synchronized int top() {
		if (isEmpty()) {
			return -1;
		}
		// TODO Auto-generated method stub
		return stack[top-1];
	}

	public synchronized int pop() {
		if (isEmpty()) {
//			return -1;
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		int data= stack[--top];
		System.out.println("                  pop =>"+data);
		notify();
		return data;
	}

}
