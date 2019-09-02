package ex;

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

import DAO.BookDao;
import VO.BookVO;
import service.BookServiceImpl;

public class BookAPP {

	public static void main(String[] args) throws FileNotFoundException {
		new Gui();
	}
}

class Gui extends JFrame {
	
	static int num = 0;
	BookDao book = new BookDao();
	BookServiceImpl service = new BookServiceImpl(book);
	JButton add, list, delete, search, save, print, exit;
	TextField title, price, isbn,publisher;
	TextArea output;

	Gui() throws FileNotFoundException {
		Panel p1 = new Panel();
		p1.add(add = new JButton("ADD"));
		p1.add(list = new JButton("List"));
		
		p1.add(delete = new JButton("삭제"));
		p1.add(search = new JButton("검색"));
		p1.add(exit = new JButton("종료"));
		add(p1, BorderLayout.SOUTH);

		Panel p2 = new Panel();
		p2.setLayout(new GridLayout(4, 2));
		p2.add(new JLabel("   ISBN   "));
		p2.add(isbn = new TextField(20));
		p2.add(new JLabel("  제    목  "));
		p2.add(title = new TextField(20));
		p2.add(new JLabel(" 출 판 사 "));
		p2.add(publisher = new TextField(20));
		p2.add(new JLabel("  가   격  "));
		p2.add(price = new TextField(20));
		add(p2, BorderLayout.NORTH);

		add(output = new TextArea(15, 50));
//		output.setText(mgr.booklist().toString());
		output.setFont(new Font(null, 1, 20));

		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		try {
			service.booklist();
		} catch (Exception e) {
			output.setText("저장되어 있는 정보가 없습니다.");
		}

		list.addActionListener(e -> {
			output.setText("*** Book List ***\n");
			service.booklist().forEach(i -> output.append(i + "\n"));
		});
		add.addActionListener(e -> {	
			BookVO book  = new BookVO();
			
			if(isbn.getText().isEmpty() || title.getText().isEmpty() || publisher.getText().isEmpty() || price.getText().isEmpty()) {
				output.setText("정보가 입력이 안됬습니다.");
				return ;
			}
				
			book.setBookID(Integer.parseInt(isbn.getText()));
			book.setBookName(title.getText());	
			book.setPublisher(publisher.getText());
			book.setPrice(Integer.parseInt(price.getText()));
			service.addBook(book);
			
			title.setText("");
			isbn.setText("");
			publisher.setText("");
			price.setText("");
			
		});
		delete.addActionListener((e) -> {
			int i = service.deleteBook(Integer.parseInt(isbn.getText()));
			output.setText(i+"개의 도서삭제 \n");
			title.setText("");
			isbn.setText("");
			publisher.setText("");
			price.setText("");
			
		});
		search.addActionListener((e) -> {

			output.setText("찾으신 책 입니다.\n");
			service.search(title.getText()).forEach(i->output.append(i+"\n"));
		});
		exit.addActionListener(e -> System.exit(0));

	}
}