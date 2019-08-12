package day22;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Test05 {
	public static void main(String[] args) {
		String src = "c://lib/Ben.mp3";
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		System.out.println("파일 복사 시작합니다.");
		try {
			fis = new FileInputStream(src);
			fos = new FileOutputStream("c://lib//copy5.mp3",false); 
			
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);

			int read = 0;
			int count = 0;

			while((read=bis.read())!=-1) {
				bos.write(read);
				count++;
			} //buffer는 용량이 차면 자동으로 disk로 옮겨진다. 옮겨진 뒤 남겨진 데이터는 옮겨지지 않는다. 용량이 줄어듬
			bos.flush(); //버퍼는 읽어들이고 
			
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
