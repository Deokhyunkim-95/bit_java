package day25;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;

public class Test01 {
	public static void main(String[] args) {
		InetAddress ip = null;
		
		try {
			ip = InetAddress.getLocalHost();
			ip = InetAddress.getByName("www.naver.com");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(""+ip.getHostName());
		System.out.println(""+ip.getHostAddress());
		System.out.println(""+ip.toString());
		
		System.out.println("==========================");
		
	}
}
