package Teacher;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class TcpIpServer {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		//
		List<BufferedWriter> clientList = new ArrayList<BufferedWriter>();

		try {
			serverSocket = new ServerSocket(7777);
			System.out.println("서버가 준비 되었습니다.");
		} catch (Exception e) {
			System.out.println("33333333333333333333");
		}

		while (true) {

			try {
				System.out.println("Client 요청을 기다립니다.");
				Socket socket = serverSocket.accept(); // 기다리고 있는 구문
				new ServerThread(socket, clientList).start();

			} catch (Exception e) {
				System.out.println("11111111");
			} finally {

			}
		}

	}
}

class ServerThread extends Thread {
	BufferedReader br = null;
	BufferedWriter bw = null;
	Socket socket = null;
	String name = null;
	List<BufferedWriter> clientList = null;

	public ServerThread(Socket socket, List<BufferedWriter> clientList) {
		this.socket = socket;
		this.clientList = clientList;

		try {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			clientList.add(bw);

			name = br.readLine();
			broadcast("님이 입장하셨습니다.");

		} catch (IOException e) {
			System.out.println("2222222222222222222");
		} finally {

		}
	}

	@Override
	public void run() {
		String msg = null;
		try {
			while ((msg = br.readLine()) != null) {

				if (msg.equals("q")) {
					broadcast("님이 퇴장합니다.~~~~");
					bw.close();
					bw.flush();
				} else
					broadcast(msg);
			}
		} catch (IOException e) {
		} finally {
			try {
				if (br != null)
					br.close();
				if (bw != null) {
					clientList.remove(bw);
					bw.close();
				}
				if (socket != null)
					socket.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}

		}
	}

	private synchronized void broadcast(String msg) { // 동기화 문제가 발생가능, synchronized를 안하면 순서가 엉킬수 잇음
		clientList.forEach(bw -> {
			try {
				bw.write(name + " : " + msg + "\n");
				bw.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
	}

}