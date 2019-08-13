package day25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpIpServer {
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = null;
		Socket socket = null;

		try {
			serverSocket = new ServerSocket(7777);
			System.out.println("서버가 준비 되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}

		while (true) {
			System.out.println("Client 요청을 기다립니다.");
			socket = serverSocket.accept();
			Thread t1 = new Multi(socket);
			t1.start();
		}

	}
}

class Multi extends Thread {
	BufferedReader br = null;
	BufferedWriter bw = null;
	Socket socket = null;
	Multi(Socket socket){
		this.socket=socket;
	}
	@Override
	public void run() {
		
		while (true) {
			try {

				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

				String name = br.readLine();
				System.out.println("Hello ~~~" + name + "님 \n");

				bw.write("Hello ~~~" + name + "님 \n");
				bw.flush();

				String msg = null;
				while ((msg = br.readLine()) != null) {
					bw.write(name + " : " + msg + "\n");
					bw.flush();
				}

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if (socket != null)
						socket.close();
					if (br != null)
						br.close();
					if (bw != null)
						bw.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		}
	}
}
