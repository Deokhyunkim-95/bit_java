package day22;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

public class Test08 {
	public static void main(String[] args) {
		FileReader fr = null;
		Properties prop = new Properties();
		try {
			fr = new FileReader("C:\\lib\\dbinfo.txt");
			prop.load(fr);
			
			String id = prop.getProperty("user");
			String pw = prop.getProperty("pw");
			
			System.out.println("로그인 시도 "+id+"/"+pw);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("파일이 없습니다.");;
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
		
		}
	}
}
