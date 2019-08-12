package day21_ex;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class inputBook extends JFrame {
	BookMgr mgr = new BookMgr();
	Book book = new Book();
	TextField msg;
	TextField msg1;
	static String data;
	static int data1;

	public inputBook(int num) {
		Button input1 = new Button("input");
		Panel p = new Panel();
		Panel p1 = new Panel();
		p.setLayout(new GridLayout(2, 2));
		p.add(new JLabel("책 이름"));
		p.add(msg = new TextField());
		p.add(new JLabel("책 가격"));
		p.add(msg1 = new TextField());
		p1.add(input1);
		add(p, BorderLayout.NORTH);
		add(p1, BorderLayout.SOUTH);
		setTitle("책 정보 입력창");
		setSize(300, 130);
		setVisible(true);
		
		input1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				data = msg.getText();
				data1 = Integer.parseInt(msg1.getText());

				mgr.addBook(new Book(num,data,data1));
				System.out.println(mgr.toString());
//	
				System.out.println("책 순번 : "+num);
				System.out.println("책 제목 : " + data);
				System.out.println("책 가격 : " + data1);

				setVisible(false);

			}
		});
	}
}
