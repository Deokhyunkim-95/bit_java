package day07;

import java.util.Arrays;

public class P141 {
	public void increase(int[] n) {
		for(int i= 0 ; i <n.length; i++) {
			n[i]++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {100,800,1000};
		System.out.println(Arrays.toString(data));
		P141 p= new P141();
		p.increase(data);
		System.out.println(Arrays.toString(data));
//		for(int i = 0 ; i < data.length; i++) {
//			System.out.println(data[i]);
//		}
	}

}
