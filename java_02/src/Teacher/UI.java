package Teacher;

import java.awt.BorderLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;

public class UI extends JFrame {
	JButton con = new JButton("접속");
	JButton stop = new JButton("종료");
	TextField id= new TextField("",15);
	TextField ip= new TextField("127.0.0.1",22);
	TextField msg = new TextField("",40);
	TextArea output = new TextArea(40,30);
	
	Socket socket = null;
	BufferedReader br = null;
	PrintWriter pw = null;
	
	UI(){
		Panel p1 = new Panel();
		p1.add(new Label("ID"));
		p1.add(id);
		p1.add(new Label("Server ip"));
		p1.add(ip);
		p1.add(con);
		p1.add(stop);
		add(BorderLayout.NORTH,p1);
		add(output);
		add(BorderLayout.SOUTH,msg);
		setSize(700,800);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		con.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					socket = new Socket(ip.getText(), 7777);
					pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
					InputStream in = socket.getInputStream();
					br = new BufferedReader(new InputStreamReader(in));
					
					pw.println(id.getText());
					pw.flush();
					
					ClientThread it = new ClientThread(br);
					it.start();
				} catch (UnknownHostException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		msg.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				pw.println(msg.getText());
				pw.flush();
				msg.setText("");
			}
		});
        stop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pw.println("q");
				if(pw != null) pw.close();
				try {
					if(br != null)	br.close();
				} catch (IOException e1) {	}
				try {
					if(socket != null)	socket.close();
				} catch (IOException e1) {	}
				
			}
		});
		
	}

	
	class ClientThread extends Thread{
		private BufferedReader br;

		public ClientThread(BufferedReader br) {
			this.br = br;
		}
		public void run(){
			try{
	           String msg = null;
	           while((msg = br.readLine()) != null){
	        	   output.append(msg+"\n");
	           }
			}catch (Exception e) {
			}finally{
				try {
					if(br != null)	br.close();
				} catch (IOException e) {	}
				try {
					if(socket != null)	socket.close();
				} catch (IOException e) {	}
			}
		}

	}

	public static void main(String[] args) {
		new UI();
	}
}