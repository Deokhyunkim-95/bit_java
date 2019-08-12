package day23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test01 {
	public static void main(String[] args) {
//		System.in
		InputStreamReader ir = new InputStreamReader(System.in); // 키보드로 들어오는것을 char으로 바꾼다.
		BufferedReader br = new BufferedReader(ir);

		String s = null;
		try {
			while ((s = br.readLine()) != null) {
				System.out.println("keyboard input data =>" + s);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (br != null)
				try {
					br.close();
					if (ir != null)
						ir.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

	}
}
