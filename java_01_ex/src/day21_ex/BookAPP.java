package day21_ex;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class BookAPP {
	

	public static void main(String[] args) {
		new BookUI().createUI();
		// TODO Auto-generated method stub
	}
}

class BookUI extends JFrame implements ActionListener {
	BookMgr mgr = new BookMgr();
	Book book = new Book();
	JButton insert,delete,print,looking,quit;
	TextField msg;
	TextArea output;
	Panel p1, p2;
	int num = 0;

	void createUI() {
//				f1 = new Frame("awt UI Test ~~");
		super.setTitle("Book");
		p1 = new Panel();
		p1.add(insert = new JButton("insert"));
		p1.add(delete = new JButton("delete"));
		p1.add(print = new JButton("print"));
		p1.add(looking = new JButton("looking"));
		p1.add(quit = new JButton("quit"));
		add(p1, BorderLayout.SOUTH);

		p2 = new Panel();
		p2.setLayout(new GridLayout(1, 3));
		p2.add(new JLabel("책 제목"));
		p2.add(msg = new TextField());
		add(p2, BorderLayout.NORTH);
		add(output = new TextArea(15, 40));
		System.out.println(msg.getText());
		output.setFont(new Font("Serif", 1, 24));

		setSize(500,300);
		setVisible(true);

		insert.addActionListener(this);
		delete.addActionListener(this);
		print.addActionListener(this);
		looking.addActionListener(this);
		quit.addActionListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		msg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				output.append(msg.getText() + "\n");
				msg.setText("");
				System.out.println(output.getText());
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String msg = e.getActionCommand();
		switch (msg) {
		case "insert":
//			++num;
			new inputBook(++num);
//			mgr.addBook(new Book(++num,input.data,input.));
			break;
		case "delete":
//			output
//			mgr.deleteBook(msg);
			break;
		case "print":
			mgr.printBookList();
			break;
		case "looking":
//			mgr.searchTitlebook(title);
			break;
		case "quit":
			System.exit(0);
			return;
		default:
			break;
		}


//			// i = inputnumber.nextInt();
//			cmd = scanner.nextLine().trim();
//
//			switch (cmd.trim()) {
//			case "insert":
//				System.out.println("insert 작업을 수행하는 기능 호출.");
//				System.out.println("Book title을 입력하세요");
//				String title = scanner.nextLine();
//				System.out.println("Book 가격 입력하세요");
//				int price = scanner.nextInt();
//				scanner.nextLine();
//				mgr.addBook(new Book(++num, title,price));
//				break;
//
//			case "delete":
//				System.out.println("delete 작업을 수행하는 기능 호출.");
//				System.out.println("Book title을 입력하세요");
//				title = scanner.nextLine();
//				mgr.deleteBook(title);
//				break;
//
//			case "print":
//				System.out.println("몰록출력 작업을 수행하는 기능 호출.");
//				mgr.printBookList();
//				break;
//			
//			case "looking":
//				System.out.println("도서검색 하는 기능 호출.");
//				System.out.println("Book title을 입력하세요");
//				title = scanner.nextLine();
//				mgr.searchTitlebook(title);
//				break;
//				
//			case "quit":
//				System.exit(0); // App종료
//			default:
//				System.out.println("없는 명령입니다..");
//				break;
//			}
	}
}
