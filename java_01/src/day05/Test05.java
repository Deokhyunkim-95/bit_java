package day05;

public class Test05 {
	public static void main(String[] args) {
			int[][] t1 = new int[3][2];
			
			t1[0][0] = 1;
			t1[0][1] = 2;
			t1[1][0] = 3;
			t1[1][1] = 4;
			t1[2][0] = 5;
			t1[2][1] = 6;
			
			System.out.println(t1[0][0]+","+t1[0][1]);
			System.out.println(t1[1][0]+","+t1[1][1]);
			System.out.println(t1[2][0]+","+t1[2][1]);
			
			int[][] t2 = {{1,2},{3,4},{5,6}};
			System.out.println(t2[0][0]+","+t2[0][1]);
			System.out.println(t2[1][0]+","+t2[1][1]);
			System.out.println(t2[2][0]+","+t2[2][1]);
		}
}
