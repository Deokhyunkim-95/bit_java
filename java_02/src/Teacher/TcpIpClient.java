package Teacher;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;


public class TcpIpClient {
	public static void main(String[] args) {
        //String serverIp = "127.0.0.1";
        String serverIp = "192.168.0.109";
        
        BufferedReader br = null;
        BufferedWriter bw = null;
        Socket socket = null;
        Scanner keyboard = null;
//        new ChatUI();
		try {
			System.out.println(serverIp+"  연결 시도 할께요..");
			socket =  new Socket(serverIp,7777); 
			System.out.println("서버와 연결이 되었습니다.");
			
			
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            
            new ClientThread(br).start();
            
            keyboard = new Scanner(System.in);
            
            System.out.println("이름을 입력하세요");
            bw.write(keyboard.next()+"\n");
            bw.flush();
//			System.out.println(br.readLine());
			
			while (true) {
				System.out.println("메세지입력하세요.. ");
				String msg = keyboard.nextLine();
				bw.write(msg+"\n");
				bw.flush();
//				System.out.println(br.readLine());
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

class ClientThread extends Thread{
	BufferedReader br = null;
	
	
	
	public ClientThread(BufferedReader br) {
		this.br = br;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String msg = null;
		
		try {
			while(( msg = br.readLine())!=null) {
				System.out.println(msg);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

class ChatUI extends JFrame{
	JButton submit;
	TextField chat;
	TextArea output;
	BufferedReader br = null;
    BufferedWriter bw = null;
    String msg;

	public ChatUI(String msg)  {
		this.msg = msg;
	}

	ChatUI() {
		Panel p1 = new Panel();
		p1.add(chat = new TextField(40));
		p1.add(submit = new JButton("확인"));
		add(p1, BorderLayout.SOUTH);

		add(output = new TextArea(15, 50));
//		output.setText(mgr.booklist().toString());
		output.setFont(new Font(null, 1, 20));

		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		submit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String a = chat.getText();
				
				output.append(a);
				
			}
		});
	

	}

}





