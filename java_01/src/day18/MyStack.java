package day18;

public class MyStack {
	int top ;
	int[] stack;
	int size;
	
	
	public MyStack() {	
		size = 10;
		stack = new int[size];
	}

	public MyStack(int i) {
		top = -1;
		stack = new int[i];
		this.size = i;
	}

	public boolean isEmpty() {
		return top==-1;
	}

	public void push(int i) {
		// TODO Auto-generated method stub
			stack[++top] = i;
//			System.out.println(stack[top]);
	}

	public boolean isFull() {
		// TODO Auto-generated method stub
		return (top==size-1);
	}

	public int top() {
		if(isEmpty()) {
			return -1;
		}
		// TODO Auto-generated method stub
		return stack[top];
	}

	public int pop() {
		if(isEmpty()) {
			return -1;
		}
		return stack[top--];
	}

}
