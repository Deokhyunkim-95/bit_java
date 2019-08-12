package day25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.URL;

public class Test03 {
	public static void main(String[] args) {
		String filename = "naver.html";
		URL url = null;
		String address = "https://www.naver.com/index.html";
		String line = null;

		BufferedReader br = null;
		BufferedWriter bw = null;
		FileWriter fw = null;
		
		
		
		try {
			url = new URL(address);
			 br = new BufferedReader(new InputStreamReader(url.openStream())); //InputStreamReader 사용해서 char형으로 읽는다
			 fw = new FileWriter(filename);
			 bw = new BufferedWriter(fw);
			 while((line = br.readLine()) !=null) {
				 System.out.println(line);
					bw.write(line+"\r\n");
			 }
			 bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(br!=null)br.close();
				if(bw!=null)bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
