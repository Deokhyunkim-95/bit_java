package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		System.out.println("main start");
		Scanner scanner = null;
		try {
			scanner = new Scanner(new File("c://lib//sample.txt"));
			while(scanner.hasNextLine()) {
				String[] data = scanner.nextLine().replace("_", "/").split("/");
				System.out.println(Arrays.toString(data));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println("sample.txt 파일을 확인해 주세요");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (scanner != null) {
				scanner.close();
			}
			scanner = null;
			System.out.println("자원 반납 수행");
		}
		System.out.println("main end");
	}

}
