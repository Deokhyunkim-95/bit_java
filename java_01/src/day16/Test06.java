package day16;

import java.io.File.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" main start");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("c://lib//sasmple.txt"); // 파일 io는 경로를 잡아주는게 좋다.
			System.out.println("파일 준비 완료~~~");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println("sample.txt 파일을 확인해 주세요");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if ((fis != null)) {
					fis.close(); // 자원반납
					fis = null;
				}
				System.out.println("자원반납완료");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		System.out.println(" main end");

	}

}
