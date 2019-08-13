package day25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class TcpIpClient {
	public static void main(String[] args) {
        //String serverIp = "127.0.0.1";
        String serverIp = "192.168.0.109";
        
        BufferedReader br = null;
        BufferedWriter bw = null;
        Socket socket = null;
        Scanner keyboard = null;
		try {
			System.out.println(serverIp+"  연결 시도 할께요..");
			socket =  new Socket(serverIp,7777); 
			System.out.println("서버와 연결이 되었습니다.");
			
			
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            keyboard = new Scanner(System.in);
            System.out.println("이름을 입력하세요");
            bw.write(keyboard.next()+"\n");
            bw.flush();
			System.out.println(br.readLine());
			
			while (true) {
				System.out.println("메세지입력하세요.. ");
				String msg = keyboard.nextLine();
				bw.write(msg+"\n");
				bw.flush();
				System.out.println(br.readLine());
				if(msg.equals("q")) break;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(socket != null) socket.close();
				if(br != null) br.close();
				if(bw != null) bw.close();
			} catch (Exception e2) {
                e2.printStackTrace();
			}
		}
	}
}





