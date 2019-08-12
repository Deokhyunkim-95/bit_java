package day22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Test03 {
	public static void main(String[] args) {
		String src = "c://lib/Ben.mp3";
		FileInputStream fis = null;
		FileOutputStream fos = null;
		System.out.println("파일 복사 시작합니다.");
		try {
			fis = new FileInputStream(src);
			fos = new FileOutputStream("c://lib//copy3.mp3",false); //false overwrite모드 true append모드

			byte[] buffer = new byte[fis.available()];
			
			int read = 0;
			int count = 0;
			while ((read = fis.read(buffer)) != -1) {
				fos.write(buffer);
				count++;
			}
			System.out.println("I/O 횟수 : " + count);
			System.out.println(" 파일 복사 완료");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(src + "파일(복사원본) 확인해 주세요");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null)
					fis.close();
				if (fos != null)
					fos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("main end");
		}

	}
}
