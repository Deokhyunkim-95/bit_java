package day25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Test02 {
	public static void main(String[] args) {
		URL url = null;
		String address = "https://www.naver.com/index.html";
		String line = null;

		BufferedReader br = null;

		try {
			url = new URL(address);
			 br = new BufferedReader(new InputStreamReader(url.openStream())); //InputStreamReader 사용해서 char형으로 읽는다
			 
			 while((line = br.readLine()) !=null) {
				 System.out.println(line);
			 }
			 
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(br!=null)br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
