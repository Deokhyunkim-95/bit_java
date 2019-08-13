package day19;

import java.util.*;

public class Test01 {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		for(int i=0;i<100;i++) {
			stack.push(""+i);
		}
		System.out.println(stack.pop());
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		for(int i = 0;i<100 ;i++) {
			queue.offer(i);
		}
		System.out.println(queue.poll());
	}
}
