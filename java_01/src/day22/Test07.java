package day22;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test07 {
	public static void main(String[] args) {
		BufferedReader br = null;
		FileReader fr = null;
		try {
			fr = new FileReader("C:\\lib\\dbinfo.txt");
			br = new BufferedReader(fr);
			String read;
			String id = null;
			String pw = null;
			while((read = br.readLine()) !=null) {
				String[] data = read.split("=");
				if(data[0].equals("user")) {
					id = data[1];
				}
				if(data[0].equals("pw")) {
					pw=data[1];
				}
			}
			System.out.println("로그인 시도 "+id+"/"+pw);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("파일이 없습니다.");;
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(br != null) {
					br.close();
					br = null;
				}
				if(fr != null) {
					fr.close();
					fr=null;
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
