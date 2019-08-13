package day22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Test04 {
	public static void main(String[] args) {
		String src = "c://lib/Ben.mp3";
		FileInputStream fis = null;
		FileOutputStream fos = null;
		System.out.println("파일 복사 시작합니다.");
		try {
			fis = new FileInputStream(src);
			fos = new FileOutputStream("c://lib//copy4.mp3",false); //false overwrite모드 true append모드

			byte[] buffer = new byte[1024*1024]; //굳이 파일의 사이즈 만큼 잡지 않고 적당한 사이즈로 잡으면 된다. 이럴경우 엉뚱한 내용이 포함이 되서 복사가 될수 있다
			
			int read = 0;
			int count = 0;
			while ((read = fis.read(buffer)) != -1) {
				System.out.println("read :"+read);
				fos.write(buffer,0,read); //fos에 버퍼에서 read한만큼의 크기를 write한다.
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
