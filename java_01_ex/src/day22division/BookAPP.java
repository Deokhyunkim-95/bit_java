package day22division;

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
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import day22.Book;

public class BookAPP {

	public static void main(String[] args) throws FileNotFoundException {
		new Gui();
		
	}
}

class Gui extends JFrame {

	static int num = 0;
	MyFile mfile;
	BookMgr mgr;
	Autosave as;
	JButton add, list, delete, search, save, print, exit;
	TextField title, price, isbn;
	TextArea output;

	Gui() throws FileNotFoundException {
		mgr = new BookMgr();
		as = new Autosave();
		as.start();
		Panel p1 = new Panel();
		p1.add(add = new JButton("ADD"));
		p1.add(list = new JButton("List"));

		p1.add(delete = new JButton("삭제"));
		p1.add(search = new JButton("검색"));
		p1.add(exit = new JButton("종료"));
		add(p1, BorderLayout.SOUTH);

		Panel p2 = new Panel();
		p2.setLayout(new GridLayout(3, 2));
		p2.add(new JLabel("   ISBN   "));
		p2.add(isbn = new TextField(20));
		p2.add(new JLabel("  제    목  "));
		p2.add(title = new TextField(20));
		p2.add(new JLabel("  가   격  "));
		p2.add(price = new TextField(20));
		add(p2, BorderLayout.NORTH);

		add(output = new TextArea(15, 50));
//		output.setText(mgr.booklist().toString());
		output.setFont(new Font(null, 1, 20));

		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		add.addActionListener(e -> {
			int p = 0;
			int isbn1 = 0;
			try {
				if (isbn.getText().isEmpty()) {
					output.setText("isbn 입력은 필수입니다. \n");
					return;
				}

				isbn1 = Integer.parseInt(isbn.getText());
				p = Integer.parseInt(price.getText());

				if (mgr.isbncheck(isbn1) == true) {
					output.setText("Book 등록 실패 \n이미 존재하는 isbn입니다. isbn을 확인해주세요");
					return;
				}

			} catch (Exception e1) {
				output.setText(" Book 등록 실패 \n");
				output.append("가격에 문자가 포함되면 안됩니다.\n");
				return;
			}
			boolean b = mgr.add(new Book(isbn1, title.getText(), p));
			if (b) {
				output.setText("등록 성공");
			} else {
				output.setText("등록 실패");
			}
			mgr.save();
		});
		list.addActionListener(e -> {
			output.setText("*** Book List ***\n");
			mgr.getBookList().forEach(i -> output.append(i + "\n"));
		});
		delete.addActionListener((e) -> {
			// TODO Auto-generated method stub
			if (title.getText().isEmpty()) {
				output.setText("제목을 입력 안하셨습니다.");
			} else if (!title.getText().isEmpty()) {
				mgr.delete(title.getText());
			}
		});
		search.addActionListener((e) -> {

			output.setText("찾으신 책 입니다.\n");

			if (title.getText().isEmpty()) {
				output.setText("제목을 입력 안하셨습니다.");
			} else if (!(title.getText().isEmpty())) {
				mgr.search(title.getText()).forEach(i -> output.append(i + "\n"));
			}

		});
		exit.addActionListener(e -> {
			mgr.save();
			System.exit(0);
		});

	}

	class Autosave extends Thread {

		@Override
		public void run() {
			try {
				while(true) {
					Thread.sleep(5000);
					System.out.println("쓰레드");
					mgr.save();
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
	}
}
